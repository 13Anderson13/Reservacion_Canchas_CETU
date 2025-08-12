/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Formularios;

import Clases.WebServiceClient;
import com.mycompany.soapclient.Usuario;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
//Import javax.swing.JOptionPane;

/**
 *
 * @author Atermiter-X99
 */
public class Administrador_Usuarios extends javax.swing.JPanel {

    /**
     * Creates new form Administrador_Usuarios
     */
    WebServiceClient obj1 = new WebServiceClient();

    public Administrador_Usuarios() {
        initComponents();
        cbPrivilegio.addItem("Administrador");
        cbPrivilegio.addItem("Coordinador");
        cbPrivilegio.addItem("Alumno");
        cargarTablaUsuarios();
    }

    public void Limpiar() {
        txtID.setText("");
        TxtNombres.setText("");
        TxtApellidos.setText("");
        txtEmail.setText("");

        txtTelefono.setText("");

        txtUser.setText("");

    }

    private void cargarTablaUsuarios() {
tbAlumnos.setDefaultEditor(Object.class, null);
        tbAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbAlumnosMouseClicked(evt);
            }
        });

        // Obtener la lista de usuarios desde el WebService
        // Asegúrate de que tienes una instancia del WebServiceClient
        List<Usuario> usuarios = obj1.obtenerUsuarios();  // Método que obtiene la lista de usuarios desde el servicio

        // Definir las columnas de la tabla
        String[] columnas = {"ID", "Login", "Nombre", "Apellido", "Email", "Estado", "Privilegio", "Telefono"};

        // Crear el modelo de la tabla con las columnas
        DefaultTableModel modelo = new DefaultTableModel(columnas, 0);

        // Verificar si la lista de usuarios no está vacía
        if (usuarios != null && !usuarios.isEmpty()) {
            // Llenar el modelo con los usuarios
            for (Usuario usuario : usuarios) {
                // Obtener los valores de cada usuario
                Object[] fila = {
                    usuario.getIdUsuarios(),
                    usuario.getLogin() != null ? usuario.getLogin().getValue() : "No disponible", // Uso de getValue() si es un JAXBElement
                    usuario.getNombre() != null ? usuario.getNombre().getValue() : "No disponible", // Uso de getValue() si es un JAXBElement
                    usuario.getApellido() != null ? usuario.getApellido().getValue() : "No disponible", // Uso de getValue() si es un JAXBElement
                    usuario.getEmail() != null ? usuario.getEmail().getValue() : "No disponible", // Uso de getValue() si es un JAXBElement
                    usuario.getEstado() == 1 ? "Activo" : "Inactivo", // Verifica que estado no sea nulo
                    usuario.getIdPrivilegio() != null ? usuario.getIdPrivilegio() : "No disponible", //  //Si idPrivilegio es nulo, muestra "No disponible"
                    usuario.getTelefono() != null ? usuario.getTelefono().getValue() : "No disponible" // Uso de getValue() si es un JAXBElement
                };
                modelo.addRow(fila);  // Añadir la fila al modelo
            }
        } else {
            // Si no se encontraron usuarios, mostrar un mensaje de advertencia en la tabla
            Object[] fila = {"No hay usuarios disponibles", "", "", "", ""};
            modelo.addRow(fila);  // Añadir una fila vacía para mostrar el mensaje
        }

        // Asignar el modelo de datos a la tabla
        tbAlumnos.setModel(modelo);
    }

    private void tbAlumnosMouseClicked(java.awt.event.MouseEvent evt) {
        int filaSeleccionada = tbAlumnos.getSelectedRow(); // Obtén la fila seleccionada
        if (filaSeleccionada != -1) { // Verifica que haya una fila seleccionada
            txtID.setText(tbAlumnos.getValueAt(filaSeleccionada, 0).toString());
            txtUser.setText(tbAlumnos.getValueAt(filaSeleccionada, 1).toString());
            TxtNombres.setText(tbAlumnos.getValueAt(filaSeleccionada, 2).toString());
            TxtApellidos.setText(tbAlumnos.getValueAt(filaSeleccionada, 3).toString());
            txtTelefono.setText(tbAlumnos.getValueAt(filaSeleccionada, 7).toString());
            txtEmail.setText(tbAlumnos.getValueAt(filaSeleccionada, 4).toString());
            String estados = (tbAlumnos.getValueAt(filaSeleccionada, 5).toString());
            System.out.println(estados);
            if (estados.equals("Activo")) {
                cboEstado.setSelectedItem("Activo");
            } else {
                cboEstado.setSelectedItem("Inactivo");
            }

            

            // Obtener el valor del privilegio (columna 6, según tu código)
            Object privilegio = tbAlumnos.getValueAt(filaSeleccionada, 6);

            // Establecer el índice del ComboBox según el valor del privilegio
            if (privilegio != null) {
                int idPrivilegio = Integer.parseInt(privilegio.toString());

                // Establecer el ítem en el ComboBox según el id de privilegio
                switch (idPrivilegio) {
                    case 1: // Administrador
                        cbPrivilegio.setSelectedIndex(0);
                        break;
                    case 2: // Coordinador
                        cbPrivilegio.setSelectedIndex(1);
                        break;
                    case 3: // Alumno
                        cbPrivilegio.setSelectedIndex(2);
                        break;
                    default:
                        cbPrivilegio.setSelectedIndex(-1); // Si no coincide con ninguno
                        break;
                }
            }
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
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        TxtApellidos = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TxtNombres = new javax.swing.JTextField();
        cbPrivilegio = new javax.swing.JComboBox<>();
        cboEstado = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAlumnos = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();

        setLayout(new java.awt.GridLayout(1, 0));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setText("Apellidos");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));
        jPanel4.add(TxtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 210, -1));

        jLabel6.setText("ID");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        txtID.setEditable(false);
        jPanel4.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 210, -1));

        jLabel4.setText("Correo");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));
        jPanel4.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 210, -1));

        jLabel2.setText("Usuario");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel5.setText("Telefono");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));
        jPanel4.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 110, -1));
        jPanel4.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 210, -1));

        jLabel7.setText("Nombres");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));
        jPanel4.add(TxtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 210, -1));

        cbPrivilegio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPrivilegioActionPerformed(evt);
            }
        });
        jPanel4.add(cbPrivilegio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 90, -1));

        cboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo" }));
        jPanel4.add(cboEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 210, -1));

        jLabel8.setText("Estado");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, -1, -1));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tbAlumnos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tbAlumnos);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnAgregar)
                        .addGap(48, 48, 48)
                        .addComponent(btnEditar)
                        .addGap(39, 39, 39)
                        .addComponent(btnEliminar)
                        .addGap(44, 44, 44)
                        .addComponent(btnLimpiar)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar)
                            .addComponent(btnEditar)
                            .addComponent(btnEliminar)
                            .addComponent(btnLimpiar))))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        add(jPanel1);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        /* try {

            //int id = Integer.parseInt(txtID.getText().trim());
            Short estado = 1;
            if (txtTelefono.getText().isEmpty() || txtEmail.getText().isEmpty() || txtPassword.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Llena los campos necesarios");
            } else {
                String respuesta = obj1.InsertarUsuario(txtUser.getText(), txtPassword.getText(), txtEmail.getText(), estado, 1, TxtNombres.getText() ,TxtApellidos.getText(), txtTelefono.getText());
                JOptionPane.showMessageDialog(null, "Usuario añadido correctamente");
                Limpiar();
                cargarTablaUsuarios();
            }
        } catch (Exception x) {
            JOptionPane.showMessageDialog(null, "Algo salio mal");
        }*/
        Short estado;
        try {
            if (cboEstado.getSelectedItem().toString().equals("Activo")) {
                estado = 1;
            } else {
                estado = 0;
            }

            // Verificar si los campos obligatorios están llenos
            if (txtTelefono.getText().isEmpty() || txtEmail.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Llena los campos necesarios");
            } else {
                // Mostrar cuadro de confirmación
                int confirmacion = JOptionPane.showConfirmDialog(
                        null,
                        "¿Desea agregar este usuario?",
                        "Confirmación",
                        JOptionPane.YES_NO_OPTION
                );

                if (confirmacion == JOptionPane.YES_OPTION) {
                    // Obtener el valor seleccionado del ComboBox
                    int idPrivilegio = cbPrivilegio.getSelectedIndex() + 1; // El índice comienza desde 0, pero los privilegios son 1, 2, 3...

                    // Llamar al método para insertar el usuario con el privilegio seleccionado
                    String respuesta = obj1.InsertarUsuario(
                            txtUser.getText(),
                            txtUser.getText(),
                            txtEmail.getText(),
                            estado,
                            idPrivilegio, // Pasar el id del privilegio seleccionado
                            TxtNombres.getText(),
                            TxtApellidos.getText(),
                            txtTelefono.getText()
                    );

                    JOptionPane.showMessageDialog(null, "Usuario añadido correctamente");

                    // Limpiar los campos
                    Limpiar();
                    cargarTablaUsuarios();

                } else {
                    JOptionPane.showMessageDialog(null, "Operación cancelada");
                }
            }
        } catch (Exception x) {
            JOptionPane.showMessageDialog(null, "Algo salió mal");
        }


    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        try {
            // Obtener los valores de los campos de texto
            int id = Integer.parseInt(txtID.getText().trim()); // Obtener ID del usuario
            String login = txtUser.getText().trim(); // Obtener el login
            String nombre = TxtNombres.getText().trim(); // Obtener el nombre
            String apellido = TxtApellidos.getText().trim(); // Obtener el apellido
            

            String email = txtEmail.getText().trim(); // Obtener el correo electrónico
            short estado;
            if (cboEstado.getSelectedItem().toString().equals("Activo")) {
                estado = 1;
            } else {
                estado = 0;
            }

            // Obtener el privilegio desde el JComboBox (o el valor que tengas en tu interfaz)
            int idPrivilegio = cbPrivilegio.getSelectedIndex() + 1; // Asume que el índice 0 es para Administrador, 1 para Coordinador, etc.

            // Validar si los campos obligatorios están llenos
            if (login.isEmpty() || email.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Llena los campos necesarios.");
            } else {
                // Preguntar si realmente desea modificar el usuario
                int confirm = JOptionPane.showConfirmDialog(
                        null,
                        "¿Estás seguro de que deseas modificar este usuario?",
                        "Confirmar Modificación",
                        JOptionPane.YES_NO_OPTION
                );

                // Si el usuario confirma la modificación
                if (confirm == JOptionPane.YES_OPTION) {
                    // Llamar al método para actualizar el usuario
                    String respuesta = obj1.ActualizarUsuario(id, nombre, apellido, login, email,txtTelefono.getText(), estado, idPrivilegio);

                    // Mostrar respuesta del servicio
                    JOptionPane.showMessageDialog(null, respuesta); // Muestra un mensaje con el resultado (éxito o error)

                    // Limpiar los campos y actualizar la tabla de usuarios
                    Limpiar();
                    cargarTablaUsuarios();

                } else {
                    // Si el usuario cancela la modificación
                    JOptionPane.showMessageDialog(null, "Modificación cancelada.");
                }
            }
        } catch (NumberFormatException e) {
            // En caso de que la conversión de ID falle
            JOptionPane.showMessageDialog(null, "El ID debe ser un número válido.");
        } catch (Exception x) {
            // Captura cualquier otra excepción
            JOptionPane.showMessageDialog(null, "Algo salió mal: " + x.getMessage());
        }

    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        /* try {
            int id = Integer.parseInt(txtID.getText().trim());

            String respuestas = obj1.EliminarUsuario(id);
            JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente");
            Limpiar();
            cargarTablaUsuarios();

        } catch (Exception x) {
            JOptionPane.showMessageDialog(null, "Algo salio mal");
        }*/
        // TODO add your handling code here:
        try {
            int id = Integer.parseInt(txtID.getText());

            // Mostrar un cuadro de confirmación antes de eliminar
            int opcion = JOptionPane.showConfirmDialog(null,
                    "¿Estás seguro de que deseas eliminar este usuario?",
                    "Confirmar Eliminación",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE);

            // Si el usuario selecciona "Sí", proceder con la eliminación
            if (opcion == JOptionPane.YES_OPTION) {
                obj1.EliminarUsuario(id);
                JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente");
                Limpiar();
                cargarTablaUsuarios();
            }

        } catch (Exception x) {
            JOptionPane.showMessageDialog(null, "Algo salió mal");
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void cbPrivilegioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPrivilegioActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        // Obtener el rol seleccionado del JComboBox
        String rolSeleccionado = cbPrivilegio.getSelectedItem().toString();

        // Asignar el valor correspondiente a cada rol
        int idPrivilegio;
        switch (rolSeleccionado) {
            case "Administrador":
                idPrivilegio = 1; // Administrador = 1
                break;
            case "Coordinador":
                idPrivilegio = 2; // Coordinador = 2
                break;
            case "Alumno":
                idPrivilegio = 3; // Alumno = 3
                break;
            default:
                idPrivilegio = 0; // Valor por defecto en caso de error
                break;
        }
    }//GEN-LAST:event_cbPrivilegioActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        txtID.setText("");
        TxtNombres.setText("");
        TxtApellidos.setText("");
        txtEmail.setText("");
        cboEstado.setSelectedItem("Activo");
        cbPrivilegio.setSelectedItem("Activo");
        txtTelefono.setText("");
        txtUser.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtApellidos;
    private javax.swing.JTextField TxtNombres;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cbPrivilegio;
    private javax.swing.JComboBox<String> cboEstado;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbAlumnos;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
