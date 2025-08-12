/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Formularios;

import Clases.WebServiceClient;
import com.github.lgooddatepicker.components.DatePicker;
import com.mycompany.soapclient.Cancha;
import com.mycompany.soapclient.ReservaPendiente;
import java.util.List;
import javax.swing.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anderson
 */

public class Alumno_Solicitudes extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public Alumno_Solicitudes() {
        initComponents();
        txtMotivo.setLineWrap(true);  // Habilita el ajuste de texto
        txtMotivo.setWrapStyleWord(true);
        cargarComboBox();
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                cargarTablaSolicitudes();
            }
        });

    }

    WebServiceClient obj1 = new WebServiceClient();

    private void cargarComboBox() {
        // TODO add your handling code here:
        List<Cancha> canchas = obj1.obtenerCanchas(null, null, null, null);  // Método que obtiene la lista de canchas desde el servicio

        // Verificar si la lista de canchas no está vacía
        if (canchas != null && !canchas.isEmpty()) {
            // Llenar el ComboBox con los nombres de las canchas
            for (Cancha cancha : canchas) {
                // Supongamos que 'getNombre()' devuelve el nombre de la cancha
                cboCancha.addItem(cancha.getNombre().getValue());  // Añadimos cada nombre de cancha al ComboBox
            }
        } else {
            // Si no se encontraron canchas, añadir un valor por defecto
            cboCancha.addItem("No hay canchas disponibles");
        }
    }

    public String convertirAFormatoLargo(String fecha) {
        // Convertir el String a LocalDate (suponiendo que la fecha venga en formato "yyyy-MM-dd'T'HH:mm:ss")
        LocalDate localDate = LocalDate.parse(fecha.split("T")[0]);

        // Crear un DateTimeFormatter con el formato deseado (día de mes de mes de año)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy");

        // Formatear la fecha a formato largo (por ejemplo: "30 de noviembre de 2024")
        return localDate.format(formatter);
    }

    private String convertirFecha(DatePicker datePicker1) {
        // Obtener la fecha seleccionada del DatePicker
        LocalDate fechaSeleccionada = datePicker1.getDate(); // Obtienes LocalDate

        if (fechaSeleccionada != null) {
            // Convertir la fecha seleccionada a LocalDateTime con la hora por defecto (00:00)
            LocalDateTime fechaFormateada = fechaSeleccionada.atStartOfDay(); // Convertir a LocalDateTime con hora 00:00

            // Si deseas formatearla a un String con el formato "yyyy-MM-dd", por ejemplo:
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            String fechaString = fechaFormateada.format(formatter);

            // Mostrar la fecha formateada
            return fechaString;

        } else {
            // En caso de que no se haya seleccionado ninguna fecha
            return "";
        }

    }

    private String convertirHoraInicial() {
        LocalTime horaSeleccionada = timePicker2.getTime();

        // Verificar si la hora es nula (si el usuario no ha seleccionado ninguna hora)
        if (horaSeleccionada != null) {
            // Convertir la hora al formato de 24 horas (HH:mm:ss)
            DateTimeFormatter formato24Horas = DateTimeFormatter.ofPattern("HH:mm:ss");
            // Retornar la hora formateada como String
            return horaSeleccionada.format(formato24Horas);
        } else {
            return ""; // Retornar una cadena vacía si no se ha seleccionado una hora
        }
    }

    private String convertirHoraFinal() {
        LocalTime horaSeleccionada = timePicker1.getTime();

        // Verificar si la hora es nula (si el usuario no ha seleccionado ninguna hora)
        if (horaSeleccionada != null) {
            // Convertir la hora al formato de 24 horas (HH:mm:ss)
            DateTimeFormatter formato24Horas = DateTimeFormatter.ofPattern("HH:mm:ss");
            // Retornar la hora formateada como String
            return horaSeleccionada.format(formato24Horas);
        } else {
            return ""; // Retornar una cadena vacía si no se ha seleccionado una hora
        }
    }

    private void obtenerReservaSeleccionada(int filaSeleccionada) {
        // Obtener los valores de la fila seleccionada

        cboCancha.setSelectedItem(jTable1.getValueAt(filaSeleccionada, 1).toString());
        String fechaL = jTable1.getValueAt(filaSeleccionada, 2).toString();
        datePicker1.setText(convertirAFormatoLargo(fechaL));
        timePicker2.setText(jTable1.getValueAt(filaSeleccionada, 3).toString());
        timePicker1.setText(jTable1.getValueAt(filaSeleccionada, 4).toString());
        txtID.setText(jTable1.getValueAt(filaSeleccionada, 0).toString());
        txtMotivo.setText(jTable1.getValueAt(filaSeleccionada, 5).toString());
        txtEstado.setText(jTable1.getValueAt(filaSeleccionada, 6).toString());
    }

    private void cargarTablaSolicitudes() {
        jTable1.setDefaultEditor(Object.class, null);
        // Obtener las solicitudes pendientes usando el correo actual
        List<ReservaPendiente> reservasPendientes = obj1.obtenerSolicitudes(obj1.Correo);  // Aquí se filtran las solicitudes por correo
        // Definir las columnas de la tabla
        String[] columnas = {"ID", "Cancha", "Fecha Solicitada", "Hora Solicitada", "Hora finalizacion", "Motivo", "Estado"};

        // Crear el modelo de la tabla con las columnas
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

        // Verificar si la lista de solicitudes pendientes no está vacía
        if (reservasPendientes != null && !reservasPendientes.isEmpty()) {
            // Llenar el modelo con las solicitudes
            for (ReservaPendiente reserva : reservasPendientes) {
                // Obtener los valores de cada solicitud pendiente

                Object[] fila = {
                    reserva.getIdReservaPendiente() != null ? reserva.getIdReservaPendiente() : "No disponible",
                    reserva.getCancha() != null ? reserva.getCancha().getValue() : "No disponible", // Verifica que 'cancha' no sea nulo // Verifica que 'fechaSolicitud' no sea nulo
                    reserva.getFechaSolicitada() != null ? reserva.getFechaSolicitada().toString() : "No disponible", // Verifica que 'fechaSolicitada' no sea nulo
                    reserva.getHoraSolicitada() != null ? formatDuration(reserva.getHoraSolicitada()) : "No disponible",
                    reserva.getHoraFinalizacion() != null ? formatDuration(reserva.getHoraFinalizacion()) : "No disponible",// Hora formateada 
                    reserva.getMotivo() != null ? reserva.getMotivo().getValue() : "No disponible", // Verifica que 'motivo' no sea nulo
                    reserva.getEstado() != null ? reserva.getEstado().getValue() : "No disponible" // Verifica que 'estado' no sea nulo
                };

                // Imprimir los valores de la fila antes de agregarla
                modelo.addRow(fila);  // Añadir la fila al modelo
            }
        } else {
            // Si no se encontraron solicitudes, mostrar un mensaje de advertencia en la tabla
            Object[] fila = {"No hay solicitudes disponibles", "", "", "", "", "", "", ""};
            modelo.addRow(fila);  // Añadir una fila vacía para mostrar el mensaje
        }

        // Asignar el modelo de datos a la tabla
        jTable1.setModel(modelo);
        jTable1.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {  // Para evitar la llamada cuando la selección cambia interactivamente
                int filaSeleccionada = jTable1.getSelectedRow();  // Obtiene la fila seleccionada
                if (filaSeleccionada != -1) {
                    obtenerReservaSeleccionada(filaSeleccionada);
                    // Llama a la función para mostrar el cuadro de confirmación
                }
            }
        });
    }

    private String formatDuration(javax.xml.datatype.Duration duration) {
        // Obtener las horas de la duración
        long hours = duration.getHours();

        // Obtener los minutos de la duración
        long minutes = duration.getMinutes();

        // Formatear las horas y minutos a "HH:mm"
        return String.format("%02d:%02d", hours, minutes);
    }

    private void Limpiar() {
        txtMotivo.setText("");
        timePicker2.setText("");
        timePicker1.setText("");
        datePicker1.setText("");
        txtID.setText("");
        txtEstado.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtMotivo = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cboCancha = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        timePicker1 = new com.github.lgooddatepicker.components.TimePicker();
        timePicker2 = new com.github.lgooddatepicker.components.TimePicker();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(750, 460));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(750, 460));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMotivo.setColumns(20);
        txtMotivo.setRows(5);
        jScrollPane3.setViewportView(txtMotivo);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 220, 100));

        jLabel5.setText("Motivo");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel4.setText("Fecha");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        cboCancha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCanchaActionPerformed(evt);
            }
        });
        jPanel3.add(cboCancha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 220, -1));

        jLabel3.setText("Seleccione la cancha");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jButton1.setText("Enviar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 90, -1));
        jPanel3.add(timePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));
        jPanel3.add(timePicker2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel1.setText("Hora");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel2.setText("A");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 10, -1));
        jPanel3.add(datePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 220, -1));

        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 90, -1));

        jButton3.setText("Limpiar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 90, -1));

        jButton4.setText("Borrar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 90, -1));

        txtID.setEditable(false);
        jPanel3.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 70, -1));

        jLabel6.setText("ID");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        txtEstado.setEditable(false);
        jPanel3.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 70, -1));

        jLabel7.setText("Estado");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 240, 440));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(jTable1);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 460, 440));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        String canchaSeleccionada = cboCancha.getSelectedItem().toString();
        int Id = 0;

        if (convertirFecha(datePicker1).equals("") || convertirHoraInicial().equals("") || convertirHoraFinal().equals("")) {
            JOptionPane.showMessageDialog(null, "Algo salio mal con la fecha o las horas");
        } else {
            // Aquí va el código para enviar la solicitud si todo es correcto

            List<Cancha> canchas = obj1.obtenerCanchas(null, canchaSeleccionada, null, null);
            if (canchas != null && !canchas.isEmpty()) {
                // Llenar el modelo con las canchas
                for (Cancha cancha : canchas) {
                    Id = cancha.getIdCancha();

                }
            }
            obj1.InsertarSolicitud(obj1.nombre, obj1.apellido, obj1.Correo, canchaSeleccionada, convertirFecha(datePicker1), convertirHoraInicial(), convertirHoraFinal(), txtMotivo.getText(), "Pendiente", obj1.ID, Id);
            //System.out.println(obj1.nombre+ obj1.apellido+ obj1.Correo+ canchaSeleccionada+ convertirFecha(datePicker1)+ convertirHoraInicial()+ convertirHoraFinal()+ txtMotivo.getText()+ "Pendiente"+ obj1.ID+ Id);
            JOptionPane.showMessageDialog(null, "Solicitud enviada correctamente");
            cargarTablaSolicitudes();
            Limpiar();
        }
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cboCanchaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCanchaActionPerformed

    }//GEN-LAST:event_cboCanchaActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Limpiar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if (txtID.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Selecciona a una solicitud");
        } else {
            obj1.eliminarSolicitud(Integer.parseInt(txtID.getText()));
            cargarTablaSolicitudes();
            JOptionPane.showMessageDialog(null, "Solicitud eliminada correctamente");
            Limpiar();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        String canchaSeleccionada = cboCancha.getSelectedItem().toString();
        int Id = 0;

        if (convertirFecha(datePicker1).equals("") || convertirHoraInicial().equals("") || convertirHoraFinal().equals("") || txtID.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Algo salio mal con la fecha o las horas o el ID");
        } else {
            List<Cancha> canchas = obj1.obtenerCanchas(null, canchaSeleccionada, null, null);
            if (canchas != null && !canchas.isEmpty()) {
                // Llenar el modelo con las canchas
                for (Cancha cancha : canchas) {
                    Id = cancha.getIdCancha();

                }
            }
            if (txtEstado.getText().equals("Pendiente")) {
                obj1.modificarSolicitud(Integer.parseInt(txtID.getText()), obj1.nombre, obj1.apellido, obj1.Correo, canchaSeleccionada, convertirFecha(datePicker1), convertirHoraInicial(), convertirHoraFinal(), txtMotivo.getText(), "Pendiente", obj1.ID, Id);
                //System.out.println(obj1.nombre+ obj1.apellido+ obj1.Correo+ canchaSeleccionada+ convertirFecha(datePicker1)+ convertirHoraInicial()+ convertirHoraFinal()+ txtMotivo.getText()+ "Pendiente"+ obj1.ID+ Id);
                JOptionPane.showMessageDialog(null, "Solicitud modificada correctamente");
                cargarTablaSolicitudes();
                Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "No se puede modificar una solicitud aprobada o rechazada");
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboCancha;
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private com.github.lgooddatepicker.components.TimePicker timePicker1;
    private com.github.lgooddatepicker.components.TimePicker timePicker2;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextArea txtMotivo;
    // End of variables declaration//GEN-END:variables
}
