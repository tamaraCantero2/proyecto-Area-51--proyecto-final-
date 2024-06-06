package vista;

import controlador.CategoriaData;
import java.util.ArrayList;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import modelo.Categoria;

public class AdministrarCategoriaTabla extends javax.swing.JInternalFrame {

    DefaultTableModel model = new DefaultTableModel() {

        @Override
        public boolean isCellEditable(int f, int c) {
            return false;
        }
    };

    public AdministrarCategoriaTabla() {
        initComponents();
        tabla.setModel(model);
        agregarCabeceraTabla();

        btnEliminar.setEnabled(false);
        btnEditar.setEnabled(false);

        // Agregar un ListSelectionListener a la tabla
        tabla.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {

                    if (tabla.getSelectedRow() != -1) {
                        btnEliminar.setEnabled(true);
                        btnEditar.setEnabled(true);
                    } else {
                        btnEliminar.setEnabled(false);
                        btnEditar.setEnabled(false);
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
        jComboBox1 = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        btnBuscarTodas = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();

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
        jScrollPane1.setViewportView(tabla);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "Nombre", "TipoDeCamas", "CantidadDePersonas", "PrecioNoche" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnBuscarTodas.setText("Listar Todo");
        btnBuscarTodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarTodasActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel3.setText("Buscar por");

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)
                        .addGap(113, 113, 113))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar))
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnBuscarTodas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(btnEditar)
                        .addGap(35, 35, 35)
                        .addComponent(btnEliminar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarTodas)
                    .addComponent(btnVolver))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnBuscarTodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTodasActionPerformed
        ArrayList<Categoria> listaCategoria = CategoriaData.listarTodasLasCategorias();
        cargarTabla(listaCategoria);
    }//GEN-LAST:event_btnBuscarTodasActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String seleccionado = (String) jComboBox1.getSelectedItem();
        ArrayList<Categoria> listaCompleta = CategoriaData.listarTodasLasCategorias();
        ArrayList<Categoria> listaAMostrar = new ArrayList<>();
        //ID, Nombre, TipoDeCamas, CantidadDePersonas, PrecioNoche
        switch (seleccionado) {
            case "ID":
                vaciarTabla();
                if (!jTextField1.getText().isEmpty()) {
                    if (verificadorSoloNumeros(jTextField1.getText())) {
                        Categoria cate = CategoriaData.obtenerCategoriaXId(Integer.parseInt(jTextField1.getText()));
                        if (cate.getPrecioNoche() != 0.0) {
                            agregarFila(cate);
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "ID no encontrado en ninguna Categoria ");
                        }
                    } else {
                        jTextField1.setText("");
                        JOptionPane.showMessageDialog(rootPane, "Solo numeros enteros");
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Ingrese un ID ");
                }
                break;

            case "Nombre":
                if (!jTextField1.getText().isEmpty()) {
                    if (verificarSoloLetrasYEspacios(jTextField1.getText())) {
                        vaciarTabla();
                        listaAMostrar = new ArrayList<>();
                        for (Categoria categoria : listaCompleta) {
                            if (categoria.getNombre().startsWith(jTextField1.getText())) {
                                listaAMostrar.add(categoria);
                            }
                        }
                        cargarTabla(listaAMostrar);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Caracter invalido, la busqueda permite solo caracter de texto");

                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Ingrese un nombre");
                }

                break;
            /*
        model.addColumn("CantidadPersonas");
        model.addColumn("PrecioNoche");*/
            case "CantidadDeCamas":
                if (!jTextField1.getText().isEmpty()) {
                    try {
                        if (verificadorSoloNumeros(jTextField1.getText())) {
                            vaciarTabla();
                            listaAMostrar = new ArrayList<>();
                            for (Categoria categoria : listaCompleta) {
                                if (categoria.getCantidadCamas() == Integer.parseInt(jTextField1.getText())) {
                                    listaAMostrar.add(categoria);
                                }
                            }
                            cargarTabla(listaAMostrar);
                        } else {
                            jTextField1.setText("");
                            JOptionPane.showMessageDialog(rootPane, "Solo numeros enteros");
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(this, "Por favor solo ingrese numeros");
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Ingrese una cantidad de camas");
                }

                break;
            case "TipoDeCamas":
                if (!jTextField1.getText().isEmpty()) {
                    if (verificarSoloLetrasYEspacios(jTextField1.getText())) {
                        vaciarTabla();
                        listaAMostrar = new ArrayList<>();
                        for (Categoria categoria : listaCompleta) {
                            if (categoria.getTipoDeCamas().startsWith(jTextField1.getText())) {
                                listaAMostrar.add(categoria);
                            }
                        }
                        cargarTabla(listaAMostrar);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Caracter invalido, la busqueda permite solo caracter de texto");

                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Ingrese un tipo de camas");
                }

                break;
            case "CantidadDePersonas":
                if (!jTextField1.getText().isEmpty()) {
                    try {
                        if (verificadorSoloNumeros(jTextField1.getText())) {
                            vaciarTabla();
                            listaAMostrar = new ArrayList<>();
                            for (Categoria categoria : listaCompleta) {
                                if (categoria.getCantidadCamas() == Integer.parseInt(jTextField1.getText())) {
                                    listaAMostrar.add(categoria);
                                }
                            }
                            cargarTabla(listaAMostrar);
                        } else {
                            jTextField1.setText("");
                            JOptionPane.showMessageDialog(rootPane, "Solo numeros enteros");
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(this, "Por favor solo ingrese numeros");
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Ingrese una cantidad de personas");
                }

                break;
            case "PrecioNoche":
                if (!jTextField1.getText().isEmpty()) {
                    if (verificadorNumerosEnterosYDecimales(jTextField1.getText())) {
                        vaciarTabla();
                        listaAMostrar = new ArrayList<>();
                        for (Categoria categoria : listaCompleta) {
                            if (categoria.getPrecioNoche() <= (Double.parseDouble(jTextField1.getText()))) {
                                listaAMostrar.add(categoria);
                            }
                        }
                        cargarTabla(listaAMostrar);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Solo se permiten valores numericos");
                    }
                    break;
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Ingrese un precio x noche maximo");
                }
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int row = tabla.getSelectedRow();
        int id = (int) model.getValueAt(row, 0);

        AdministracionCategoria ac = new AdministracionCategoria(id);

        JDesktopPane desktop = getDesktopPane();
        desktop.add(ac);
        ac.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int row = tabla.getSelectedRow();
        int id = (int) model.getValueAt(row, 0);

        AdministracionCategoria ac = new AdministracionCategoria(id);

        JDesktopPane desktop = getDesktopPane();
        desktop.add(ac);
        ac.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        AdministracionCategoria ac = new AdministracionCategoria();

        JDesktopPane desktop = getDesktopPane();
        desktop.add(ac);
        ac.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnVolverActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscarTodas;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

    public void agregarCabeceraTabla() {
        model.addColumn("idCategoria");
        model.addColumn("Nombre");
        model.addColumn("CantidadDeCamas");
        model.addColumn("TipoDeCamas");
        model.addColumn("CantidadPersonas");
        model.addColumn("PrecioNoche");
    }

    public void agregarFila(Categoria categoria) {
        model.addRow(new Object[]{categoria.getIdCategoria(), categoria.getNombre(), categoria.getCantidadCamas(), categoria.getTipoDeCamas(), categoria.getCantidadPersonas(), categoria.getPrecioNoche()});
    }

    public void cargarTabla(ArrayList<Categoria> listaCategoria) {
        vaciarTabla();
        for (Categoria categoria : listaCategoria) {
            agregarFila(categoria);
        }

    }

    public void vaciarTabla() {
        int cantidadFilas = model.getRowCount();
        for (int i = cantidadFilas - 1; i >= 0; i--) {
            model.removeRow(i);
        }
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


    /*
        1	idCategoria 
	2	nombre		
	3	tipoDeCamas	
	4	cantidadCamas	
	5	cantidadPersonas	
	6	precioNoche
    
     */
}
