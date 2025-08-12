/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import com.mycompany.soapclient.ArrayOfCancha;
import com.mycompany.soapclient.ArrayOfHistorialReserva;
import com.mycompany.soapclient.ArrayOfHorario;
import com.mycompany.soapclient.ArrayOfReserva;
import com.mycompany.soapclient.ArrayOfReservaPendiente;
import com.mycompany.soapclient.ArrayOfUsuario;
import com.mycompany.soapclient.IService;
import com.mycompany.soapclient.Service;
import com.mycompany.soapclient.Usuario;
import com.mycompany.soapclient.ArrayOfSesion;
import com.mycompany.soapclient.ArrayOfTipo;
import com.mycompany.soapclient.Cancha;
import com.mycompany.soapclient.HistorialReserva;
import com.mycompany.soapclient.Horario;
import com.mycompany.soapclient.Reserva;
import com.mycompany.soapclient.ReservaPendiente;
import com.mycompany.soapclient.Sesion;
import com.mycompany.soapclient.Tipo;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Anderson
 */
public class WebServiceClient {

    public static int Privilegio;
    public static String nombre;
    public static String apellido;
    public static String Correo;
    public static int ID;

    public List<Sesion> Logear(String Login, String Password) {
        List<Sesion> sesiones = new ArrayList<>();
        try {
            // Crear el servicio WCF
            Service service = new Service();

            // Obtener el puerto del servicio
            IService servicePort = service.getBasicHttpBindingIService();

            // Invocar el servicio para validar el usuario
            ArrayOfSesion result = servicePort.validarUsuario(Login, Password);

            // Obtener la lista de usuarios del resultado
            sesiones = result.getSesion();  // Este es el tipo generado que contiene la lista de 'Usuario'

            // Verificar si la lista está vacía o no
            /*if (sesiones == null || sesiones.isEmpty()) {
                //System.out.println("No se encontraron usuarios.");
            } else {
                // Mostrar los datos de los usuarios
                for (Sesion sesion : sesiones) {
                    // Imprime los datos de cada usuario utilizando el método toString() de Usuario
                    //System.out.println(sesion);
                }
            }*/
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al intentar loguear: " + e.getMessage());
        }
        return sesiones;

    }

    public String InsertarUsuario(String login, String password, String email, Short estado, int idPrivilegio, String nombre, String apellido, String telefono) {
        try {
            // Crear el servicio y el puerto
            Service service = new Service();
            IService servicePort = service.getBasicHttpBindingIService();

            // Llamar al método InsertarUsuario
            String result = servicePort.insertarUsuario(login, password, email, estado, idPrivilegio, nombre, apellido, telefono);

            //Retornar el resultado (mensaje de éxito o error)
            return result;
        } catch (Exception e) {
            return "";
        }
    }

    public String EliminarUsuario(int IdUsuario) {
        try {
            Service service = new Service();
            IService servicePort = service.getBasicHttpBindingIService();

            String result = servicePort.eliminarUsuario(IdUsuario);

            return result;
        } catch (Exception x) {
            return ""+x;
        }
    }

    public String ActualizarUsuario(int IdUsuarios, String nombre, String apellido, String login, String email,String telefono, Short estado, int idPrivilegio) {
        try {
            Service service = new Service();
            IService servicePort = service.getBasicHttpBindingIService();

            String result = servicePort.actualizarUsuario(IdUsuarios, login, nombre, apellido, email,telefono, estado, idPrivilegio);

            return result;
        } catch (Exception x) {
            return "";
        }

    }

    public List<Usuario> obtenerUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        try {
            // Crear el servicio WCF
            Service service = new Service();  // Esta clase es generada por wsimport
            IService servicePort = service.getBasicHttpBindingIService(); // Obtienes el puerto del servicio

            // Invocar el servicio para obtener los datos
            ArrayOfUsuario result = servicePort.mostrarDatos();  // 'mostrarDatos' es el método que expusiste en el servicio WCF

            usuarios = result.getUsuario();  // Este es el tipo generado que contiene la lista de 'Usuario'

            // Verificar si la lista está vacía o no
            /*if (usuarios == null || usuarios.isEmpty()) {
                //System.out.println("No se encontraron usuarios.");
            } else {
                // Mostrar los datos de los usuarios
                for (Usuario usuario : usuarios) {
                    // Imprime los datos de cada usuario utilizando el método toString() de Usuario
                    //System.out.println(usuarios);
                }
            }*/
        } catch (Exception e) {
            //e.printStackTrace();
            //("Error al intentar obtener los usuarios: " + e.getMessage());
        }
        return usuarios;  // Devolvemos la lista de usuarios obtenidos
    }

    public List<Cancha> obtenerCanchas(String tipo, String nombre, String numeroCancha, String estado) {
        List<Cancha> canchas = new ArrayList<>();

        try {
            // Crear el servicio WCF (esto es generado por wsimport)
            Service service = new Service();
            IService servicePort = service.getBasicHttpBindingIService();  // Obtiene el puerto del servicio

            // Invocar el servicio para obtener las canchas
            ArrayOfCancha result = servicePort.mostrarCanchas(tipo, nombre, numeroCancha, estado);  // 'mostrarCanchas' es el método del servicio WCF

            // Obtener la lista de canchas
            canchas = result.getCancha();  // Esto es la lista de objetos Cancha devuelta por el servicio

            // Verificar si la lista está vacía
            /*if (canchas == null || canchas.isEmpty()) {
                //System.out.println("No se encontraron canchas.");
            } else {
                // Mostrar los datos de las canchas si es necesario
                for (Cancha cancha : canchas) {
                    // Aquí puedes imprimir o procesar los datos de cada cancha
                    //   System.out.println(cancha);  // Si la clase Cancha tiene un método toString() bien implementado
                }
            }*/
        } catch (Exception e) {
            //e.printStackTrace();
            //System.out.println("Error al intentar obtener las canchas: " + e.getMessage());
        }
        return canchas;
        // Devolvemos la lista de canchas obtenidas
    }

    public String insertarCancha(String Nombre, String Tipo, String Ubicacion, int NumeroCancha, short estado) {
        try {
            Service service = new Service();
            IService servicePort = service.getBasicHttpBindingIService();
            String result = servicePort.insertarCancha(Nombre, Tipo, Ubicacion, NumeroCancha, estado);

            return result;
        } catch (Exception x) {
            return "";
        }

    }

    public String modificarCancha(int ID, String Nombre, String Tipo, String Ubicacion, int NumeroCancha, short estado) {
        try {
            Service service = new Service();
            IService servicePort = service.getBasicHttpBindingIService();
            String result = servicePort.actualizarCancha(ID, Nombre, Tipo, Ubicacion, NumeroCancha, estado);

            return result;
        } catch (Exception x) {
            return "";
        }
    }

    public String eliminarCancha(int ID) {
        try {
            Service service = new Service();
            IService servicePort = service.getBasicHttpBindingIService();
            String result = servicePort.eliminarCancha(ID);
            return result;
        } catch (Exception x) {
            return "";
        }
    }

    public String InsertarSolicitud(String nombres, String apellidos, String correo, String cancha, String fechaSolicitada, String horaSolicitada, String horaFinalizacion, String motivo, String estado, int idUsuario, int idCancha) {
        try {
            // Crear el servicio y el puerto
            Service service = new Service();  // Esta clase es generada por wsimport
            IService servicePort = service.getBasicHttpBindingIService(); // Obtienes el puerto del servicio

            // Llamar al método InsertarSolicitud del servicio
            String result = servicePort.insertarSolicitud(nombres, apellidos, correo, cancha, fechaSolicitada, horaSolicitada, horaFinalizacion, motivo, estado, idUsuario, idCancha);

            // Retornar el resultado (mensaje de éxito o error)
            return result;
        } catch (Exception e) {
            return "";
        }
    }

    public String modificarSolicitud(int IdS, String nombres, String apellidos, String correo, String cancha, String fechaSolicitada, String horaSolicitada, String horaFinalizacion, String motivo, String estado, int idUsuario, int idCancha) {
        try {
            Service service = new Service();  // Esta clase es generada por wsimport
            IService servicePort = service.getBasicHttpBindingIService();
            String result = servicePort.actualizarSolicitud(IdS, nombres, apellidos, correo, cancha, fechaSolicitada, horaSolicitada, horaFinalizacion, motivo, estado, idUsuario, idCancha);
            return result;
        } catch (Exception x) {
            return "";
        }
    }

    public String eliminarSolicitud(int Ids) {
        try {
            Service service = new Service();  // Esta clase es generada por wsimport
            IService servicePort = service.getBasicHttpBindingIService();
            String result = servicePort.eliminarSolicitud(Ids);
            return result;
        } catch (Exception x) {
            return "";
        }
    }

    public List<ReservaPendiente> obtenerSolicitudes(String correo) {
        List<ReservaPendiente> solicitudes = new ArrayList<>();

        try {
            // Crear el servicio WCF (esto es generado por wsimport)
            Service service = new Service();  // Asegúrate de tener la referencia al servicio WCF correctamente configurada
            IService servicePort = service.getBasicHttpBindingIService();  // Obtiene el puerto del servicio

            // Invocar el servicio para obtener las solicitudes
            ArrayOfReservaPendiente result = servicePort.mostrarSolicitudes(correo);  // 'mostrarSolicitudes' es el método del servicio WCF

            // Obtener la lista de solicitudes
            solicitudes = result.getReservaPendiente();  // Esto es la lista de objetos ReservaPendiente devuelta por el servicio

            // Verificar si la lista está vacía
            if (solicitudes == null || solicitudes.isEmpty()) {
                //System.out.println("No se encontraron solicitudes.");
                /*} else {
                // Mostrar los datos de las solicitudes si es necesario
                for (ReservaPendiente solicitud : solicitudes) {
                    // Aquí puedes imprimir o procesar los datos de cada solicitud
                    //System.out.println(solicitud);  // Si la clase ReservaPendiente tiene un método toString() bien implementado
                }*/
            }

        } catch (Exception e) {
            //e.printStackTrace();
            //System.out.println("Error al intentar obtener las solicitudes: " + e.getMessage());
        }

        return solicitudes;  // Devolvemos la lista de solicitudes obtenidas
    }

    public String insertarHorario(int idCancha, String cancha, String fechaStr, String horaInicialStr, String horaFinalStr) {
        try {
            // Crear el servicio WCF (esto es generado por wsimport)
            Service service = new Service();
            IService servicePort = service.getBasicHttpBindingIService();  // Obtiene el puerto del servicio

            // Llamar al método InsertarHorario del servicio
            String result = servicePort.insertarHorario(idCancha, cancha, fechaStr, horaInicialStr, horaFinalStr);

            // Retornar el resultado (mensaje de éxito o error)
            return result;

        } catch (Exception e) {
            //e.printStackTrace();
            return "";
        }
    }

    public String modificarHorario(int idHorario, int idCancha, String cancha, String fechaStr, String horaInicialStr, String horaFinalStr) {
        try {
            Service service = new Service();
            IService servicePort = service.getBasicHttpBindingIService();
            String result = servicePort.actualizarHorario(idHorario, idCancha, cancha, fechaStr, horaInicialStr, horaFinalStr);
            return result;
        } catch (Exception x) {
            return "";
        }
    }

    public String eliminarHorario(int idHorario) {
        try {
            Service service = new Service();
            IService servicePort = service.getBasicHttpBindingIService();
            String result = servicePort.eliminarHorario(idHorario);
            return result;
        } catch (Exception x) {
            return "";
        }

    }

    public List<Horario> obtenerHorarios(String dia, String cancha, String horaInicial, String horaFinal) {
        List<Horario> horarios = new ArrayList<>();

        try {
            // Crear el servicio WCF (esto es generado por wsimport)
            Service service = new Service();
            IService servicePort = service.getBasicHttpBindingIService();  // Obtiene el puerto del servicio

            // Invocar el servicio para obtener los horarios
            ArrayOfHorario result = servicePort.mostrarHorarios(dia, cancha, horaInicial, horaFinal);  // 'mostrarHorarios' es el método del servicio WCF

            // Obtener la lista de horarios
            horarios = result.getHorario();  // Esto es la lista de objetos Horario devuelta por el servicio

            // Verificar si la lista está vacía
            /*if (horarios == null || horarios.isEmpty()) {
                //System.out.println("No se encontraron horarios.");
            }*/
        } catch (Exception e) {
            //e.printStackTrace();
            //System.out.println("Error al intentar obtener los horarios: " + e.getMessage());
        }

        return horarios;  // Devolver la lista de horarios obtenidos
    }

    public List<Reserva> obtenerReserva() {
        List<Reserva> reservaciones = new ArrayList<>();
        try {
            Service service = new Service();
            IService servicePort = service.getBasicHttpBindingIService();

            ArrayOfReserva result = servicePort.mostrarReservas();
            reservaciones = result.getReserva();

        } catch (Exception e) {

        }
        return reservaciones;
    }

    public List<HistorialReserva> obtenerHistorial(String Estado) {
        List<HistorialReserva> Hreserva = new ArrayList<>();
        try {
            Service service = new Service();
            IService servicePort = service.getBasicHttpBindingIService();

            ArrayOfHistorialReserva result = servicePort.mostrarHistorialReservas(Estado);
            Hreserva = result.getHistorialReserva();

        } catch (Exception x) {

        }

        return Hreserva;
    }

    public String DecidirReserva(int idReservaPendiente, String nombres, String apellidos, String correo,
            String cancha, String fechaSolicitadaStr, String horaSolicitadaStr, String horaFinalizacionStr,
            String motivo, String estado, int idUsuario, int idCancha) {
        try {
            Service service = new Service();
            IService servicePort = service.getBasicHttpBindingIService();

            String result = servicePort.actualizarSolicitud(idReservaPendiente, nombres, apellidos, correo, cancha, fechaSolicitadaStr, horaSolicitadaStr, horaFinalizacionStr, motivo, estado, idUsuario, idCancha);

            return result;
        } catch (Exception x) {
            return "";
        }

    }

    public String CambiarPassword(String Log, String Email, String Password) {
        try {
            Service service = new Service();
            IService servicePort = service.getBasicHttpBindingIService();

            String result = servicePort.actualizarContrasena(Log, Email, Password);

            return result;
        } catch (Exception x) {
            return "";
        }
    }

    public List<Tipo> mostrarTipos() {
        List<Tipo> tipos = new ArrayList<>();
        try {
            Service service = new Service();
            IService servicePort = service.getBasicHttpBindingIService();

            ArrayOfTipo result = servicePort.mostrarTipos();
            tipos = result.getTipo();

        } catch (Exception e) {

        }
        return tipos;
    }

    public String insertarTipo(String tipo) {
        try {
            Service service = new Service();
            IService servicePort = service.getBasicHttpBindingIService();
            String result = servicePort.insertarTipo(tipo);
            return result;
        } catch (Exception e) {
            return "";
        }

    }

    public String modificarTipo(int IDT, String Tipo) {
        try {
            Service service = new Service();
            IService servicePort = service.getBasicHttpBindingIService();
            String result = servicePort.actualizarTipo(IDT, Tipo);
            return result;
        } catch (Exception e) {
            return "";
        }
    }

    public String eliminarTipo(int IDT) {
        try {
            Service service = new Service();
            IService servicePort = service.getBasicHttpBindingIService();
            String result = servicePort.eliminarTipo(IDT);
            return result;
        } catch (Exception x) {
            return "";
        }
    }
}