/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Formularios;

import Clases.WebServiceClient;
import com.mycompany.soapclient.ReservaPendiente;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anderson
 */
public class Encargado_Solicitudes extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public Encargado_Solicitudes() {
        initComponents();
        cargarTablaSolicitudes();
    }

    WebServiceClient obj1 = new WebServiceClient();

    //Convierte la hora a un formato visible para la tabla
    private String formatDuration(javax.xml.datatype.Duration duration) {
        // Obtener las horas de la duración
        long hours = duration.getHours();

        // Obtener los minutos de la duración
        long minutes = duration.getMinutes();

        // Formatear las horas y minutos a "HH:mm"
        return String.format("%02d:%02d", hours, minutes);
    }

    private void cargarTablaSolicitudes2() {
        jTable1.setDefaultEditor(Object.class, null);
        // Obtener las solicitudes pendientes usando el correo actual
        List<ReservaPendiente> reservasPendientes = obj1.obtenerSolicitudes(null);  // Aquí se filtran las solicitudes por correo

        // Definir las columnas de la tabla
        String[] columnas = {"ID", "Nombre", "Apellido", "Correo", "Cancha", "Fecha Solicitud", "Fecha Solicitada", "Hora Solicitada", "Hora Finalización", "Motivo", "Estado", "ID Usuario", "ID Cancha"};

        // Crear el modelo de la tabla con las columnas
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

        // Verificar si la lista de solicitudes pendientes no está vacía
        if (reservasPendientes != null && !reservasPendientes.isEmpty()) {
            // Llenar el modelo con las solicitudes
            for (ReservaPendiente reserva : reservasPendientes) {
                // Obtener los valores de cada solicitud pendiente
                Object[] fila = {
                    reserva.getIdReservaPendiente() != null ? reserva.getIdReservaPendiente() : "No disponible",
                    reserva.getNombre() != null ? reserva.getNombre().getValue() : "No disponible",
                    reserva.getApellido() != null ? reserva.getApellido().getValue() : "No disponible",
                    reserva.getCorreo() != null ? reserva.getCorreo().getValue() : "No disponible",
                    reserva.getCancha() != null ? reserva.getCancha().getValue() : "No disponible",
                    reserva.getFechaSolicitud() != null ? reserva.getFechaSolicitud().toString() : "No disponible",
                    reserva.getFechaSolicitada() != null ? reserva.getFechaSolicitada().toString() : "No disponible",
                    reserva.getHoraSolicitada() != null ? formatDuration(reserva.getHoraSolicitada()) : "No disponible", // Hora formateada
                    reserva.getHoraFinalizacion() != null ? formatDuration(reserva.getHoraFinalizacion()) : "No disponible", // Hora formateada
                    reserva.getMotivo() != null ? reserva.getMotivo().getValue() : "No disponible",
                    reserva.getEstado() != null ? reserva.getEstado().getValue() : "No disponible",
                    reserva.getIdUsuario() != null ? reserva.getIdUsuario() : "No disponible",
                    reserva.getIdCancha() != null ? reserva.getIdCancha() : "No disponible"
                };
                modelo.addRow(fila);
            }
        } else {
            // Si no se encontraron solicitudes, mostrar un mensaje de advertencia en la tabla
            Object[] fila = {"No hay solicitudes disponibles", "", "", "", "", "", "", ""};
            modelo.addRow(fila);  // Añadir una fila vacía para mostrar el mensaje
        }
         jTable1.setModel(modelo);
    }

    private void cargarTablaSolicitudes() {
        jTable1.setDefaultEditor(Object.class, null);
        // Obtener las solicitudes pendientes usando el correo actual
        List<ReservaPendiente> reservasPendientes = obj1.obtenerSolicitudes(null);  // Aquí se filtran las solicitudes por correo

        // Definir las columnas de la tabla
        String[] columnas = {"ID", "Nombre", "Apellido", "Correo", "Cancha", "Fecha Solicitud", "Fecha Solicitada", "Hora Solicitada", "Hora Finalización", "Motivo", "Estado", "ID Usuario", "ID Cancha"};

        // Crear el modelo de la tabla con las columnas
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

        // Verificar si la lista de solicitudes pendientes no está vacía
        if (reservasPendientes != null && !reservasPendientes.isEmpty()) {
            // Llenar el modelo con las solicitudes
            for (ReservaPendiente reserva : reservasPendientes) {
                // Obtener los valores de cada solicitud pendiente
                Object[] fila = {
                    reserva.getIdReservaPendiente() != null ? reserva.getIdReservaPendiente() : "No disponible",
                    reserva.getNombre() != null ? reserva.getNombre().getValue() : "No disponible",
                    reserva.getApellido() != null ? reserva.getApellido().getValue() : "No disponible",
                    reserva.getCorreo() != null ? reserva.getCorreo().getValue() : "No disponible",
                    reserva.getCancha() != null ? reserva.getCancha().getValue() : "No disponible",
                    reserva.getFechaSolicitud() != null ? reserva.getFechaSolicitud().toString() : "No disponible",
                    reserva.getFechaSolicitada() != null ? reserva.getFechaSolicitada().toString() : "No disponible",
                    reserva.getHoraSolicitada() != null ? formatDuration(reserva.getHoraSolicitada()) : "No disponible", // Hora formateada
                    reserva.getHoraFinalizacion() != null ? formatDuration(reserva.getHoraFinalizacion()) : "No disponible", // Hora formateada
                    reserva.getMotivo() != null ? reserva.getMotivo().getValue() : "No disponible",
                    reserva.getEstado() != null ? reserva.getEstado().getValue() : "No disponible",
                    reserva.getIdUsuario() != null ? reserva.getIdUsuario() : "No disponible",
                    reserva.getIdCancha() != null ? reserva.getIdCancha() : "No disponible"
                };
                modelo.addRow(fila);
            }
        } else {
            // Si no se encontraron solicitudes, mostrar un mensaje de advertencia en la tabla
            Object[] fila = {"No hay solicitudes disponibles", "", "", "", "", "", "", ""};
            modelo.addRow(fila);  // Añadir una fila vacía para mostrar el mensaje
        }

        // Asignar el modelo de datos a la tabla
        jTable1.setModel(modelo);

        // Agregar un ListSelectionListener al JTable para escuchar la selección de filas
        jTable1.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {  // Para evitar la llamada cuando la selección cambia interactivamente
                int filaSeleccionada = jTable1.getSelectedRow();  // Obtiene la fila seleccionada
                if (filaSeleccionada != -1) {
                    obtenerReservaSeleccionada(filaSeleccionada);
                    mostrarConfirmacion(); // Llama a la función para mostrar el cuadro de confirmación
                }
            }
        });
    }

    int idReservaPendiente;
    String nombre;
    String apellido;
    String correo;
    String cancha;
    String fechaSolicitada;
    String horaSolicitada;
    String horaFinalizacion;
    String motivo;
    int idUsuario;
    int idCancha;

    private void obtenerReservaSeleccionada(int filaSeleccionada) {
        // Obtener los valores de la fila seleccionada
        idReservaPendiente = Integer.parseInt(jTable1.getValueAt(filaSeleccionada, 0).toString());
        nombre = jTable1.getValueAt(filaSeleccionada, 1).toString();
        apellido = jTable1.getValueAt(filaSeleccionada, 2).toString();
        correo = jTable1.getValueAt(filaSeleccionada, 3).toString();
        cancha = jTable1.getValueAt(filaSeleccionada, 4).toString();
        fechaSolicitada = jTable1.getValueAt(filaSeleccionada, 6).toString();
        horaSolicitada = jTable1.getValueAt(filaSeleccionada, 7).toString();
        horaFinalizacion = jTable1.getValueAt(filaSeleccionada, 8).toString();
        motivo = jTable1.getValueAt(filaSeleccionada, 9).toString();
        idUsuario = Integer.parseInt(jTable1.getValueAt(filaSeleccionada, 11).toString());
        idCancha = Integer.parseInt(jTable1.getValueAt(filaSeleccionada, 12).toString());
    }

    private void mostrarConfirmacion() {
        // Mostrar el cuadro de confirmación
        int respuesta = JOptionPane.showConfirmDialog(
                this,
                "¿Confirmas esta solicitud?",
                "Confirmación", // Título de la ventana
                JOptionPane.YES_NO_OPTION
        );

        // Verificar la respuesta
        if (respuesta == JOptionPane.YES_OPTION) {
            // El usuario ha confirmado la solicitud

            obj1.DecidirReserva(idReservaPendiente, nombre, apellido, correo, cancha, fechaSolicitada, horaSolicitada, horaFinalizacion, motivo, "Confirmada", idUsuario, idCancha);
            JOptionPane.showConfirmDialog(null, "Solicitud Confirmada:");
            cargarTablaSolicitudes2();

            // Aquí puedes realizar alguna acción, como guardar los datos, hacer una actualización, etc.
        } else if (respuesta == JOptionPane.NO_OPTION) {
            // El usuario ha rechazado la solicitud
            obj1.DecidirReserva(idReservaPendiente, nombre, apellido, correo, cancha, fechaSolicitada, horaSolicitada, horaFinalizacion, motivo, "Rechazada", idUsuario, idCancha);
            JOptionPane.showConfirmDialog(null, "Solicitud Rechazada.");
            cargarTablaSolicitudes2();
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(730, 460));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 67, 700, 370));

        jButton1.setText("Refrescar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        cargarTablaSolicitudes2();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
