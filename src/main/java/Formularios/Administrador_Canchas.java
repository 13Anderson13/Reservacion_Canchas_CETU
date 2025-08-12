/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Formularios;

import Clases.WebServiceClient;
import com.mycompany.soapclient.Cancha;
import com.mycompany.soapclient.Tipo;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Anderson
 */
public class Administrador_Canchas extends javax.swing.JPanel {

    /**
     * Creates new form Administrador_Canchas
     */
    public Administrador_Canchas() {
        initComponents();
        cargarComboBox();
        cargarTablaCanchas();
    }

    WebServiceClient obj1 = new WebServiceClient();

    private void cargarComboBox() {
        // Obtener los tipos desde el servicio
        List<Tipo> tipos = obj1.mostrarTipos();  // Llamamos al método para obtener la lista de tipos

        // Verificar si la lista de tipos no está vacía
        if (tipos != null && !tipos.isEmpty()) {
            // Llenar el ComboBox con los nombres de los tipos
            for (Tipo tipo : tipos) {
                // Supongamos que 'getNombre()' devuelve el nombre del tipo
                cboCancha.addItem(tipo.getNombre().getValue());  // Añadimos el nombre de cada tipo al ComboBox
            }
        } else {
            // Si no se encontraron tipos, añadir un valor por defecto
            cboCancha.addItem("No hay tipos disponibles");
        }
    }

    private void cargarTablaCanchas() {
        jPanel3.setVisible(false);
        jTable1.setDefaultEditor(Object.class, null);
        List<Cancha> canchas;

        canchas = obj1.obtenerCanchas(null, null, null, null);

        // Definir las columnas de la tabla
        String[] columnas = {"ID", "Tipo", "Nombre", "Ubicacion", "Número de Cancha", "Estado"};

        // Crear el modelo de la tabla con las columnas
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

        // Verificar si la lista de canchas no está vacía
        if (canchas != null && !canchas.isEmpty()) {
            // Llenar el modelo con las canchas
            for (Cancha cancha : canchas) {
                // Obtener los valores de cada cancha
                Object[] fila = {
                    cancha.getIdCancha() != null ? cancha.getIdCancha() : "No disponible",
                    cancha.getTipo() != null ? cancha.getTipo().getValue() : "No disponible", // Verifica que 'tipo' no sea nulo
                    cancha.getNombre() != null ? cancha.getNombre().getValue() : "No disponible", // Verifica que 'nombre' no sea nulo
                    cancha.getDireccion() != null ? cancha.getDireccion().getValue() : "No disponible",
                    cancha.getNumeroCancha() > 0 ? cancha.getNumeroCancha().byteValue() : "No disponible", // Verifica que el 'numeroCancha' sea válido
                    cancha.getEstado() == 1 ? "Activo" : "Inactivo"// Convierte el estado booleano a texto
                };
                modelo.addRow(fila);  // Añadir la fila al modelo
            }
        } else {
            // Si no se encontraron canchas, mostrar un mensaje de advertencia en la tabla
            Object[] fila = {"No hay canchas disponibles", "", "", ""};
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

    private void obtenerReservaSeleccionada(int filaSeleccionada) {
        // Obtener los valores de la fila seleccionada
        txtID.setText(jTable1.getValueAt(filaSeleccionada, 0).toString());
        cboCancha.setSelectedItem(jTable1.getValueAt(filaSeleccionada, 1).toString());
        txtNombre.setText(jTable1.getValueAt(filaSeleccionada, 2).toString());
        txtUbicacion.setText(jTable1.getValueAt(filaSeleccionada, 3).toString());
        txtNCancha.setText(jTable1.getValueAt(filaSeleccionada, 4).toString());
        if ((jTable1.getValueAt(filaSeleccionada, 5).toString()).equals("Activo")) {
            cboEstado.setSelectedItem("Activo");
        } else {
            cboEstado.setSelectedItem("Inactivo");
        }

    }

    private void obtenerReservaSeleccionada2(int filaSeleccionada) {
        // Obtener los valores de la fila seleccionada
        txtIDT.setText(jTable2.getValueAt(filaSeleccionada, 0).toString());
        txtNombreT.setText(jTable2.getValueAt(filaSeleccionada, 1).toString());

    }

    private void CargarTipos() {
        jTable2.setDefaultEditor(Object.class, null);
        List<Tipo> tipos = obj1.mostrarTipos();
        String[] columnas = {"ID", "Nombre"};
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
        if (tipos != null && !tipos.isEmpty()) {
            // Llenar el ComboBox con los nombres de los tipos
            for (Tipo tipo : tipos) {
                Object[] fila = {
                    tipo.getID() != null ? tipo.getID() : "No disponible",
                    tipo.getNombre() != null ? tipo.getNombre().getValue() : "No disponible",};
                modelo.addRow(fila);
            }
        } else {
            // Si no se encontraron tipos, añadir un valor por defecto
            Object[] fila = {"No hay canchas disponibles", "", "", ""};
            modelo.addRow(fila);
        }
        jTable2.setModel(modelo);
        jTable2.getSelectionModel().addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {  // Para evitar la llamada cuando la selección cambia interactivamente
                int filaSeleccionada = jTable2.getSelectedRow();  // Obtiene la fila seleccionada
                if (filaSeleccionada != -1) {
                    obtenerReservaSeleccionada2(filaSeleccionada);
                    // Llama a la función para mostrar el cuadro de confirmación
                }
            }
        });

    }

    private void Limpiar() {
        txtID.setText("");
        txtNombre.setText("");
        // Establecer el valor del JSnipper en 10
        txtNCancha.setText("");
        txtUbicacion.setText("");
        txtIDT.setText("");
        txtNombreT.setText("");
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        cboCancha = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNCancha = new javax.swing.JTextField();
        cboEstado = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtUbicacion = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtIDT = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtNombreT = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(720, 460));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, -1));

        jLabel2.setText("Numero de cancha");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 140, -1));

        jLabel3.setText("ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        txtID.setEditable(false);
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 140, -1));

        cboCancha.setActionCommand("");
        jPanel1.add(cboCancha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 80, -1));

        jLabel4.setText("Tipo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel5.setText("Ubicacion");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));
        jPanel1.add(txtNCancha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 140, -1));

        cboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        cboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEstadoActionPerformed(evt);
            }
        });
        jPanel1.add(cboEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 140, -1));

        jLabel6.setText("Estado");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 110, -1));

        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 110, -1));

        jButton3.setText("Borrar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 110, -1));

        jButton4.setText("Limpiar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 110, -1));

        txtUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUbicacionActionPerformed(evt);
            }
        });
        jPanel1.add(txtUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 140, -1));

        jPanel2.setBackground(new java.awt.Color(153, 0, 0));
        jPanel2.setForeground(new java.awt.Color(153, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 540, 420));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 560, 440));

        jPanel3.setBackground(new java.awt.Color(153, 0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tipos de canchas");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        txtIDT.setEditable(false);
        jPanel3.add(txtIDT, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 90, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nombre");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, -1, -1));

        jButton6.setText("Agregar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 90, -1));

        jButton7.setText("Eliminar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 90, -1));

        jButton8.setText("Editar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 90, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ID");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));
        jPanel3.add(txtNombreT, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 90, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 180, 200));

        jButton9.setText("-");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 40, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 370, 220));

        jButton5.setText("+");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 50, -1));

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

    private void cboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboEstadoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // TODO add your handling code here:
        Short canchaestado;

        try {
            // Convertir el texto a un número entero
            int numerocancha = Integer.parseInt(txtNCancha.getText());

            // Verificar que el número ingresado sea mayor a 0
            if (numerocancha > 0) {
                if (cboEstado.getSelectedItem().toString().equals("Activo")) {
                    canchaestado = 1;
                } else {
                    canchaestado = 0;
                }

                // Llamar al método de inserción
                obj1.insertarCancha(txtNombre.getText(), cboCancha.getSelectedItem().toString(), txtUbicacion.getText(), numerocancha, canchaestado);
                JOptionPane.showMessageDialog(null, "Cancha registrada correctamente");
                Limpiar();
                cargarTablaCanchas();
            } else {
                // Si el número no es mayor a 0, mostrar mensaje
                JOptionPane.showMessageDialog(null, "Por favor inserta números mayores a 0");
            }
        } catch (NumberFormatException e) {
            // Si el valor ingresado no es un número, mostrar mensaje
            JOptionPane.showMessageDialog(null, "Por favor inserta un número entero válido");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Limpiar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUbicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUbicacionActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int respuesta = JOptionPane.showConfirmDialog(
                this,
                "¿Modificar esta cancha?",
                "Modificar", // Título de la ventana
                JOptionPane.YES_NO_OPTION
        );
        Short canchaestado;

        try {
            // Convertir el texto a un número entero
            int numerocancha = Integer.parseInt(txtNCancha.getText());

            // Verificar que el número ingresado sea mayor a 0
            if (numerocancha > 0) {
                if (cboEstado.getSelectedItem().toString().equals("Activo")) {
                    canchaestado = 1;
                } else {
                    canchaestado = 0;
                }
                // Verificar la respuesta
                if (respuesta == JOptionPane.YES_OPTION) {
                    // El usuario ha confirmado la solicitud

                    obj1.modificarCancha(Integer.parseInt(txtID.getText()), txtNombre.getText(), cboCancha.getSelectedItem().toString(), txtUbicacion.getText(), numerocancha, canchaestado);
                    JOptionPane.showMessageDialog(null, "Cancha modificada:");
                    cargarTablaCanchas();
                    Limpiar();
                } else if (respuesta == JOptionPane.NO_OPTION) {// El usuario ha rechazado la solicitud

                    JOptionPane.showMessageDialog(null, "Operacion cancelada");
                }
            } else {
                // Si el número no es mayor a 0, mostrar mensaje
                JOptionPane.showMessageDialog(null, "Por favor inserta números mayores a 0");
            }
        } catch (NumberFormatException e) {
            // Si el valor ingresado no es un número, mostrar mensaje
            JOptionPane.showMessageDialog(null, "Por favor inserta un número entero válido");

            // Aquí puedes realizar alguna acción, como guardar los datos, hacer una actualización, etc.
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int respuesta = JOptionPane.showConfirmDialog(
                this,
                "¿Borrar esta cancha?",
                "Borrar", // Título de la ventana
                JOptionPane.YES_NO_OPTION
        );

        // Verificar la respuesta
        if (respuesta == JOptionPane.YES_OPTION) {
            // El usuario ha confirmado la solicitud

            obj1.eliminarCancha(Integer.parseInt(txtID.getText()));
            JOptionPane.showMessageDialog(null, "Cancha eliminada:");
            cargarTablaCanchas();
            Limpiar();
        } else if (respuesta == JOptionPane.NO_OPTION) {// El usuario ha rechazado la solicitud

            JOptionPane.showMessageDialog(null, "Operacion cancelada");
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        jPanel3.setVisible(true);
        jPanel2.setVisible(false);
        CargarTipos();

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        cboCancha.removeAllItems();
        if (txtIDT.getText().trim().isEmpty() || txtNombreT.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llena el ID y nombre por favor");
        } else {
            obj1.modificarTipo(Integer.parseInt(txtIDT.getText()),txtNombreT.getText());
            JOptionPane.showMessageDialog(null, "modificado correctamente");
            CargarTipos();
            cargarComboBox();
            Limpiar();
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        cboCancha.removeAllItems();
        if (txtNombreT.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llena el campo nombre por favor");
        } else {
            obj1.insertarTipo(txtNombreT.getText());
            JOptionPane.showMessageDialog(null, "Añadido correctamente");
            CargarTipos();
            cargarComboBox();
            Limpiar();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        cboCancha.removeAllItems();
        if (txtIDT.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Llena el ID por favor");
        } else {
            obj1.eliminarTipo(Integer.parseInt(txtIDT.getText()));
            JOptionPane.showMessageDialog(null, "Eliminado correctamente");
            CargarTipos();
            cargarComboBox();
            Limpiar();
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        cargarTablaCanchas();
        jPanel2.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboCancha;
    private javax.swing.JComboBox<String> cboEstado;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIDT;
    private javax.swing.JTextField txtNCancha;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreT;
    private javax.swing.JTextField txtUbicacion;
    // End of variables declaration//GEN-END:variables
}
