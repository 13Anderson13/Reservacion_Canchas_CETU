/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Formularios;

import Clases.WebServiceClient;
import com.github.lgooddatepicker.components.DatePicker;
import com.mycompany.soapclient.Cancha;
import com.mycompany.soapclient.Horario;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anderson
 */
public class Encargado_Horarios extends javax.swing.JPanel {

    /**
     * Creates new form Encargado_Horarios
     */
    public Encargado_Horarios() {
        initComponents();
        cargarTablaHorarios();
        cargarComboBox();
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

    private void cargarTablaHorarios() {
        jTable1.setDefaultEditor(Object.class, null);
        // Obtener la lista de horarios desde el WebService
        List<Horario> horarios = obj1.obtenerHorarios(null, null, null, null);  // Aquí puedes agregar los parámetros que desees

        // Definir las columnas de la tabla
        String[] columnas = {"ID Horario", "Cancha", "Día", "Hora Inicial", "Hora Final"};

        // Crear el modelo de la tabla con las columnas
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

        // Verificar si la lista de horarios no está vacía
        if (horarios != null && !horarios.isEmpty()) {
            // Llenar el modelo con los horarios
            for (Horario horario : horarios) {
                // Obtener los valores de cada horario
                Object[] fila = {
                    horario.getIdHorario() != null ? horario.getIdHorario() : "No disponible",
                    horario.getCancha() != null ? horario.getCancha().getValue() : "No disponible",
                    horario.getDia() != null ? horario.getDia().toString() : "No disponible",
                    horario.getHoraInicial() != null ? formatDuration(horario.getHoraInicial()) : "No disponible", // Hora formateada
                    horario.getHoraFinal() != null ? formatDuration(horario.getHoraFinal()) : "No disponible" // Hora formateada
                };
                modelo.addRow(fila);  // Añadir la fila al modelo

            }
        } else {
            // Si no se encontraron horarios, mostrar un mensaje de advertencia en la tabla
            Object[] fila = {"No hay horarios disponibles", "", "", "", ""};
            modelo.addRow(fila);  // Añadir una fila vacía para mostrar el mensaje
        }

        // Asignar el modelo de datos a la tabla
        jTable1.setModel(modelo);
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

    private void obtenerReservaSeleccionada(int filaSeleccionada) {
        // Obtener los valores de la fila seleccionada

        cboCancha.setSelectedItem(jTable1.getValueAt(filaSeleccionada, 1).toString());
        String fechaL = jTable1.getValueAt(filaSeleccionada, 2).toString();
        datePicker1.setText(convertirAFormatoLargo(fechaL));
        timePicker1.setText(jTable1.getValueAt(filaSeleccionada, 3).toString());
        timePicker2.setText(jTable1.getValueAt(filaSeleccionada, 4).toString());
        txtIdReservacion.setText(jTable1.getValueAt(filaSeleccionada, 0).toString());
    }

    public String convertirAFormatoLargo(String fecha) {
        // Convertir el String a LocalDate (suponiendo que la fecha venga en formato "yyyy-MM-dd'T'HH:mm:ss")
        LocalDate localDate = LocalDate.parse(fecha.split("T")[0]);

        // Crear un DateTimeFormatter con el formato deseado (día de mes de mes de año)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d 'de' MMMM 'de' yyyy");

        // Formatear la fecha a formato largo (por ejemplo: "30 de noviembre de 2024")
        return localDate.format(formatter);
    }

    private String formatDuration(jakarta.xml.bind.JAXBElement<javax.xml.datatype.Duration> durationElement) {
        // Verificamos que el JAXBElement no sea null
        if (durationElement != null && durationElement.getValue() != null) {
            javax.xml.datatype.Duration duration = durationElement.getValue();

            // Obtener las horas de la duración
            long hours = duration.getHours();

            // Obtener los minutos de la duración
            long minutes = duration.getMinutes();

            // Formatear las horas y minutos a "HH:mm"
            return String.format("%02d:%02d", hours, minutes);
        } else {
            return "No disponible";  // En caso de que la duración sea null
        }
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

    private String convertirHoraFinal() {
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

    public void Limpiar() {
        datePicker1.setText("");
        timePicker1.setText("");
        timePicker2.setText("");
        txtIdReservacion.setText("");
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cboCancha = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        timePicker1 = new com.github.lgooddatepicker.components.TimePicker();
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker();
        timePicker2 = new com.github.lgooddatepicker.components.TimePicker();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtIdReservacion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(730, 460));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(715, 460));
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 27, 460, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Horarios Existentes");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Dia");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel3.setText("Hora");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, 20));

        jPanel2.add(cboCancha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 210, -1));

        jLabel4.setText("Cancha");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 100, -1));
        jPanel2.add(timePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));
        jPanel2.add(datePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 210, -1));
        jPanel2.add(timePicker2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 100, -1));

        jLabel5.setText("ID de reservacion");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        txtIdReservacion.setEditable(false);
        jPanel2.add(txtIdReservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 210, -1));

        jLabel6.setText("A");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 10, -1));

        jButton4.setText("Editar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 100, -1));

        jButton3.setText("Limpiar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 100, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 230, 380));

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
        String canchaSeleccionada = cboCancha.getSelectedItem().toString();
        int Id = 0;

        if (convertirFecha(datePicker1).equals("") || convertirHoraFinal().equals("") || convertirHoraInicial().equals("")) {
            JOptionPane.showMessageDialog(null, "Algo salio mal con la fecha o las horas");
        } else {
            List<Cancha> canchas = obj1.obtenerCanchas(null, canchaSeleccionada, null, null);
            if (canchas != null && !canchas.isEmpty()) {
                // Llenar el modelo con las canchas
                for (Cancha cancha : canchas) {
                    Id = cancha.getIdCancha();
                }
            }
            obj1.insertarHorario(Id, canchaSeleccionada, convertirFecha(datePicker1), convertirHoraInicial(), convertirHoraFinal());
            cargarTablaHorarios();
            JOptionPane.showMessageDialog(null, "Horario enviado correctamente");
            Limpiar();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String canchaSeleccionada = cboCancha.getSelectedItem().toString();
        int Id = 0;

        if (convertirFecha(datePicker1).equals("") || convertirHoraFinal().equals("") || convertirHoraInicial().equals("") || txtIdReservacion.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Algo salio mal con la fecha o las horas o el id");
        } else {
            List<Cancha> canchas = obj1.obtenerCanchas(null, canchaSeleccionada, null, null);
            if (canchas != null && !canchas.isEmpty()) {
                // Llenar el modelo con las canchas
                for (Cancha cancha : canchas) {
                    Id = cancha.getIdCancha();
                }
            }
            obj1.modificarHorario(Integer.parseInt(txtIdReservacion.getText()), Id, canchaSeleccionada, convertirFecha(datePicker1), convertirHoraInicial(), convertirHoraFinal());
            cargarTablaHorarios();
            JOptionPane.showMessageDialog(null, "Horario enviado correctamente");
            Limpiar();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Limpiar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (txtIdReservacion.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Selecciona a un horario");
        } else {
            obj1.eliminarHorario(Integer.parseInt(txtIdReservacion.getText()));
            cargarTablaHorarios();
            JOptionPane.showMessageDialog(null, "Horario eliminado correctamente");
            Limpiar();
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private com.github.lgooddatepicker.components.TimePicker timePicker1;
    private com.github.lgooddatepicker.components.TimePicker timePicker2;
    private javax.swing.JTextField txtIdReservacion;
    // End of variables declaration//GEN-END:variables
}
