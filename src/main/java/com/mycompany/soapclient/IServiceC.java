/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.soapclient;

import java.util.Scanner;

/**
 *
 * @author Anderson
 */
public class IServiceC {

    public static void Juego() {
        Scanner leer = new Scanner(System.in);
        char resp2 = 's';

        while (resp2 == 's') {
            String[][] tab = new String[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    tab[i][j] = ".";
                }
            }

            // Mostrar reglas y preguntar si desea jugar
            if (!mostrarReglas(leer)) {
                System.out.println("Suerte!");
                break;
            }

            // Tablero numerado
            int[][] numero = new int[3][3];
            inicializarTablero(numero);

            // Variables del juego
            int turno = 1;
            int ganador = 0;

            // Iniciar el juego
            while (ganador == 0) {
                mostrarTablero(tab, numero);
                turno = (turno == 1) ? 2 : 1;  // Cambiar de jugador
                if (!realizarMovimiento(leer, tab, numero, turno)) {
                    continue;
                }

                ganador = verificarGanador(tab);
            }

            // Mostrar el resultado
            mostrarTablero(tab, numero);
            mostrarResultado(ganador);

            // Preguntar si desean jugar de nuevo
            System.out.println("Desean jugar de nuevo? (s/n): ");
            resp2 = leer.next().toLowerCase().charAt(0);
        }

        leer.close();
    }

    // Mostrar reglas
    public static boolean mostrarReglas(Scanner leer) {
        char resp;
        do {
            
                System.out.println("\n¿Desean escuchar las reglas?");
                System.out.println("1. Ingresa 's' para leer las instrucciones");
                System.out.println("2. Ingresa 'n' para jugar directamente");
                resp = leer.next().toLowerCase().charAt(0);

                if (resp == 's') {
                    System.out.println("\nReglas:");
                    System.out.println("1. El jugador 1 será 'X' y el jugador 2 será 'O'");
                    System.out.println("2. Ingresen posiciones de 1 a 9 para marcar su turno.");
                    System.out.println("3. El juego finalizará cuando uno gane o haya empate.");
                    return true;
                } else if (resp == 'n') {
                    return true;
                } else {
                    System.out.println("Opción no válida. Ingresa 's' o 'n'.");
                }
            
        } while (true);
    }

    // Inicializar el tablero numérico
    public static void inicializarTablero(int[][] numero) {
        int cont = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                numero[i][j] = cont++;
            }
        }
    }

    // Mostrar el tablero
    public static void mostrarTablero(String[][] tab, int[][] numero) {
        System.out.println("\nTablero de juego:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("|" + tab[i][j] + "| ");
            }
            System.out.println();
        }
    }

    // Realizar el movimiento
    public static boolean realizarMovimiento(Scanner leer, String[][] tab, int[][] numero, int jugador) {
        int pos = 0;
        boolean validMove = false;

        // Pedir al jugador que ingrese una posición válida
        while (!validMove) {
            System.out.println("Turno del jugador " + jugador + " (Ingresa un número de 1 a 9): ");
            try {
                pos = leer.nextInt();
                if (pos < 1 || pos > 9) {
                    System.out.println("Número fuera de rango. Debes ingresar un número entre 1 y 9.");
                } else {
                    validMove = marcaPosicion(tab, numero, jugador, pos);
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida, por favor ingresa un número.");
                leer.next(); // Limpiar el buffer
            }
        }

        return validMove;
    }

    // Marca una posición en el tablero
    public static boolean marcaPosicion(String[][] tab, int[][] numero, int jugador, int pos) {
        int fila = (pos - 1) / 3;
        int col = (pos - 1) % 3;

        if (tab[fila][col].equals(".")) {
            tab[fila][col] = (jugador == 1) ? "X" : "O";
            return true;
        } else {
            System.out.println("¡Esa posición ya está ocupada!");
            return false;
        }
    }

    // Verificar si hay un ganador
    public static int verificarGanador(String[][] tab) {
        // Revisar filas, columnas y diagonales
        for (int i = 0; i < 3; i++) {
            if (tab[i][0].equals(tab[i][1]) && tab[i][1].equals(tab[i][2]) && !tab[i][0].equals(".")) {
                return (tab[i][0].equals("X")) ? 1 : 2;
            }
            if (tab[0][i].equals(tab[1][i]) && tab[1][i].equals(tab[2][i]) && !tab[0][i].equals(".")) {
                return (tab[0][i].equals("X")) ? 1 : 2;
            }
        }
        // Revisar diagonales
        if (tab[0][0].equals(tab[1][1]) && tab[1][1].equals(tab[2][2]) && !tab[0][0].equals(".")) {
            return (tab[0][0].equals("X")) ? 1 : 2;
        }
        if (tab[0][2].equals(tab[1][1]) && tab[1][1].equals(tab[2][0]) && !tab[0][2].equals(".")) {
            return (tab[0][2].equals("X")) ? 1 : 2;
        }

        // Verificar empate
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tab[i][j].equals(".")) {
                    return 0; // Juego en curso
                }
            }
        }
        return 3; // Empate
    }

    // Mostrar el resultado del juego
    public static void mostrarResultado(int ganador) {
        if (ganador == 1) {
            System.out.println("¡Felicidades Jugador 1 (X), has ganado!");
        } else if (ganador == 2) {
            System.out.println("¡Felicidades Jugador 2 (O), has ganado!");
        } else {
            System.out.println("¡Empate! Nadie ganó.");
        }
    }
}
