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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anderson
 */
public class Alumnos_Horarios extends javax.swing.JPanel {

    /**
     * Creates new form Alumnos_Horarios
     */
    public Alumnos_Horarios() {
        initComponents();
        cargarTablaHorarios();
        cargarComboBox();
    }

    WebServiceClient obj1 = new WebServiceClient();  // Cliente del servicio web

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

    private void cargarTablaHorarios() {
        // Obtener la lista de horarios desde el WebService
        jTable1.setDefaultEditor(Object.class, null);
        String nombre;
        String fecha;
        String hora;
        if (cboNombre.getSelectedItem().toString().equals("--Seleccione--")) {
            nombre = null;
        } else {
            nombre = cboNombre.getSelectedItem().toString();
        }

        if (convertirFecha(datePicker1).equals("")) {
            fecha = null;
        } else {
            fecha = convertirFecha(datePicker1);
        }

        if (convertirHoraInicial().equals("")) {
            hora = null;
        } else {
            hora = convertirHoraInicial();
        }

        List<Horario> horarios = obj1.obtenerHorarios(fecha, nombre, hora, null);  // Aquí puedes agregar los parámetros que desees

        // Definir las columnas de la tabla
        String[] columnas = { "Cancha", "Día", "Hora Inicial", "Hora Final"};

        // Crear el modelo de la tabla con las columnas
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

        // Verificar si la lista de horarios no está vacía
        if (horarios != null && !horarios.isEmpty()) {
            // Llenar el modelo con los horarios
            for (Horario horario : horarios) {
                // Obtener los valores de cada horario
                Object[] fila = {
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

    private void cargarComboBox() {
        // TODO add your handling code here:
        List<Cancha> canchas = obj1.obtenerCanchas(null, null, null, null);  // Método que obtiene la lista de canchas desde el servicio

        // Verificar si la lista de canchas no está vacía
        if (canchas != null && !canchas.isEmpty()) {
            // Llenar el ComboBox con los nombres de las canchas
            for (Cancha cancha : canchas) {
                // Supongamos que 'getNombre()' devuelve el nombre de la cancha
                cboNombre.addItem(cancha.getNombre().getValue());  // Añadimos cada nombre de cancha al ComboBox
            }
        } else {
            // Si no se encontraron canchas, añadir un valor por defecto
            cboNombre.addItem("No hay canchas disponibles");
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
        cboNombre = new javax.swing.JComboBox<>();
        timePicker1 = new com.github.lgooddatepicker.components.TimePicker();
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(710, 460));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(730, 460));
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 680, 380));

        cboNombre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Seleccione--" }));
        cboNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNombreActionPerformed(evt);
            }
        });
        jPanel1.add(cboNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));
        jPanel1.add(timePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, -1, -1));
        jPanel1.add(datePicker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, -1, -1));

        jButton2.setText("Limpiar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 30, -1, -1));

        jLabel1.setText("Cancha");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel2.setText("Hora:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jLabel3.setText("Dia:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        cargarTablaHorarios();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        cboNombre.setSelectedItem("--Seleccione--");
        datePicker1.setText("");
        timePicker1.setText("");
        cargarTablaHorarios();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cboNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNombreActionPerformed
        // TODO add your handling code here:
        cargarTablaHorarios();
    }//GEN-LAST:event_cboNombreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboNombre;
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private com.github.lgooddatepicker.components.TimePicker timePicker1;
    // End of variables declaration//GEN-END:variables
}
