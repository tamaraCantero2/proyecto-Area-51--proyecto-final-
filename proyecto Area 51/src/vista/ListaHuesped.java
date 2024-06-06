package vista;

import controlador.HuespedData;
import java.util.ArrayList;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import modelo.Huesped;

public class ListaHuesped extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public ListaHuesped() {
        initComponents();
        tabla.setModel(modelo);
        agregarCabeceraTabla();
        agregarFilas(HuespedData.listaCompletaHuespedes());

        jButton1.setEnabled(false);
        btnEditar.setEnabled(false);

        // Agregar un ListSelectionListener a la tabla
        tabla.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    // Verificar si alguna fila está seleccionada en la tabla
                    if (tabla.getSelectedRow() != -1) {
                        jButton1.setEnabled(true); // Habilitar el botón jButton1
                        btnEditar.setEnabled(true); // Habilitar el botón btnEditar
                    } else {
                        jButton1.setEnabled(false); // Deshabilitar jButton1 si no hay selección
                        btnEditar.setEnabled(false); // Deshabilitar btnEditar si no hay selección
                    }
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        ListarInactivos = new javax.swing.JButton();
        ListarActivos = new javax.swing.JButton();
        btnRegistrarHuesped = new javax.swing.JButton();
        imput_buscar = new javax.swing.JTextField();
        comboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        jCheckBox2 = new javax.swing.JCheckBox();

        setClosable(true);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        ListarInactivos.setText("Listar Inactivos");
        ListarInactivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarInactivosActionPerformed(evt);
            }
        });

        ListarActivos.setText("Listar Activos");
        ListarActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListarActivosActionPerformed(evt);
            }
        });

        btnRegistrarHuesped.setText("Ir al Registro de Huespedes");
        btnRegistrarHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarHuespedActionPerformed(evt);
            }
        });

        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "nombre", "apellido", "DNI" }));
        comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxActionPerformed(evt);
            }
        });

        jLabel1.setText("Buscar por");

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jCheckBox2.setText("LISTAR TODOS");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ListarInactivos)
                .addGap(41, 41, 41)
                .addComponent(ListarActivos)
                .addGap(28, 28, 28)
                .addComponent(btnRegistrarHuesped)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(imput_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_buscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(32, 32, 32)
                                .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jCheckBox2)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addComponent(btnEditar))))))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(imput_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jCheckBox2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jButton1)
                        .addGap(28, 28, 28)
                        .addComponent(btnEditar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ListarInactivos)
                    .addComponent(ListarActivos)
                    .addComponent(btnRegistrarHuesped))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarHuespedActionPerformed
        RegistrarHuesped registrarhuesped = new RegistrarHuesped();

        JDesktopPane desktop = getDesktopPane();
        desktop.add(registrarhuesped);
        registrarhuesped.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnRegistrarHuespedActionPerformed

    private void ListarActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarActivosActionPerformed
        jCheckBox2.setSelected(false);
        borrarFilasTabla();
        agregarFilas(HuespedData.listadeHuespedActivos());

    }//GEN-LAST:event_ListarActivosActionPerformed

    private void ListarInactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListarInactivosActionPerformed
        jCheckBox2.setSelected(false);
        borrarFilasTabla();
        agregarFilas(HuespedData.listadeHuespedNoActivos());
    }//GEN-LAST:event_ListarInactivosActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        jCheckBox2.setSelected(false);

        borrarFilasTabla();
        String seleccion = (String) comboBox.getSelectedItem();
        if (!imput_buscar.getText().isEmpty()) {
            if (seleccion.equals("ID")) {
                if (verificadorSoloNumeros(imput_buscar.getText())) {
                    int id = Integer.parseInt(imput_buscar.getText());
                    Huesped h1 = HuespedData.obtenerHuespedXid(id);

                    if (Integer.parseInt(h1.getDNI() + "") != 0) {
                        agregarFila(h1.getIdHuesped(), h1.getNombre(), h1.getApellido(), h1.getDNI(), h1.isEstado());
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "ID no encontrado");
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Solo se puede ingresar numeros como ID");
                    imput_buscar.setText("");
                }

            } else if (seleccion.equals("nombre")) {
                if (verificarSoloLetrasYEspacios(imput_buscar.getText())) {
                    String nombre = imput_buscar.getText();
                    agregarFilas(listaPorNombre(nombre));
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Caracter invalido para un nombre");
                    imput_buscar.setText("");
                }

            } else if (seleccion.equals("apellido")) {
                if (verificarSoloLetrasYEspacios(imput_buscar.getText())) {
                    String apellido = imput_buscar.getText();
                    agregarFilas(buscarPorApellidoTipeado(apellido));
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Caracter invalido para un apellido");
                    imput_buscar.setText("");
                }
            } else if (seleccion.equals("DNI")) {
                if (verificadorNumerosEnterosYDecimales(imput_buscar.getText())) {
                    try {
                        int DNI = Integer.parseInt(imput_buscar.getText());
                        Huesped h1 = HuespedData.obtenerHuespedXDni(DNI);
                        agregarFila(h1.getIdHuesped(), h1.getNombre(), h1.getApellido(), h1.getDNI(), h1.isEstado());
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(this, "error en buscar por dni,numero muy largo, error: "+e.getMessage());
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Solo se puede ingresar numeros como DNI");
                    imput_buscar.setText("");
                }

            }
        } else {
            JOptionPane.showInternalMessageDialog(rootPane, "Ingrese la información que desea buscar");
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxActionPerformed
    }//GEN-LAST:event_comboBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jCheckBox2.setSelected(false);

        int row = tabla.getSelectedRow();
        int id = (int) modelo.getValueAt(row, 0);

        RegistrarHuesped registrarhuesped = new RegistrarHuesped(id);

        JDesktopPane desktop = getDesktopPane();
        desktop.add(registrarhuesped);
        registrarhuesped.setVisible(true);
        dispose();


    }//GEN-LAST:event_jButton1ActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked

    }//GEN-LAST:event_tablaMouseClicked

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        jCheckBox2.setSelected(false);

        int row = tabla.getSelectedRow();
        int id = (int) modelo.getValueAt(row, 0);

        RegistrarHuesped registrarhuesped = new RegistrarHuesped(id);

        JDesktopPane desktop = getDesktopPane();
        desktop.add(registrarhuesped);
        registrarhuesped.setVisible(true);
        dispose();


    }//GEN-LAST:event_btnEditarActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        borrarFilasTabla();
        agregarFilas(HuespedData.listaCompletaHuespedes());


    }//GEN-LAST:event_jCheckBox2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ListarActivos;
    private javax.swing.JButton ListarInactivos;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnRegistrarHuesped;
    private javax.swing.JButton btn_buscar;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JTextField imput_buscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

    public void agregarCabeceraTabla() {
        modelo.addColumn("id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Dni");
        modelo.addColumn("Estado");
    }

    public void agregarFila(int id, String nombre, String apellido, int dni, boolean estado) {
        String estad = (estado) ? "activa/o" : "inactiva/o";
        modelo.addRow(new Object[]{id, nombre, apellido, dni, estad});
    }

    public void agregarFilas(ArrayList<Huesped> lista) {

        for (Huesped huesped : lista) {
            agregarFila(huesped.getIdHuesped(), huesped.getNombre(), huesped.getApellido(), huesped.getDNI(), huesped.isEstado());
        }
    }

    private void borrarFilasTabla() {

        for (int f = modelo.getRowCount() - 1; f > -1; f--) {
            modelo.removeRow(f);
        }
    }

    private ArrayList<Huesped> listaPorNombre(String nombreHuesped) {
        ArrayList<Huesped> listaCompleta = HuespedData.listaCompletaHuespedes();
        ArrayList<Huesped> listaMismoNombre = new ArrayList<>();

        for (Huesped huesped : listaCompleta) {
            //FUE EN ESTE IF
            if (huesped.getNombre().toLowerCase().startsWith(nombreHuesped.toLowerCase())) {
                listaMismoNombre.add(huesped);
            }
        }
        return listaMismoNombre;
    }

    private ArrayList<Huesped> listaPorApellido(String apellido) {
        ArrayList<Huesped> listaCompleta = HuespedData.listaCompletaHuespedes();
        ArrayList<Huesped> listaMismoApellido = new ArrayList<>();

        for (Huesped huesped : listaCompleta) {
            //FUE EN ESTE IF
            if (huesped.getNombre().toLowerCase().startsWith(apellido.toLowerCase())) {
                listaMismoApellido.add(huesped);
            }
        }
        return listaMismoApellido;

    }

    public ArrayList<Huesped> buscarPorApellidoTipeado(String apellido) {
        borrarFilasTabla();
        ArrayList<Huesped> listCompleta = HuespedData.listaCompletaHuespedes();
        ArrayList<Huesped> listaNombrados = new ArrayList<>();
        for (Huesped huesped : listCompleta) {
            if (huesped.getApellido().startsWith(apellido)) {
                listaNombrados.add(huesped);
            }

        }
        return listaNombrados;
    }

    public boolean verificadorSoloNumeros(String texto) {
        /*Expresión regular*/
        if (texto.matches("\\d+")) {
            int numeroEntero = Integer.parseInt(texto);
            return true;

        } else {
            return false;
        }
    }

    public boolean verificarSoloLetras(String texto) {
        /*Expresion regular*/
        if (texto.matches("[a-zA-Z]+")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verificarSoloLetrasYEspacios(String texto) {
        /*Expresion regular*/
        if (texto.matches("[a-zA-Z ]+")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verificadorNumerosEnterosYDecimales(String texto) {
        /* Expresión regular que permite números enteros o decimales */
        if (texto.matches("\\d+|\\d*\\.\\d+")) {
            return true;
        } else {
            return false;
        }
    }

}
