package vista;

import controlador.*;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import modelo.Categoria;
import modelo.Habitacion;

public class RegistrarHabitacion extends javax.swing.JInternalFrame {

    public RegistrarHabitacion() {
        initComponents();
        llenarComboCategorias();
        textoAyuda.setBackground(Color.WHITE);
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
        idField.setEditable(true);
        btnRegistrar.setEnabled(true);

    }

    public RegistrarHabitacion(ArrayList<String> datos) {
        initComponents();
        llenarComboCategorias();
        textoAyuda.setBackground(Color.WHITE);

        btnRegistrar.setEnabled(true);
        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
        idField.setEditable(true);

        if (!datos.isEmpty()) {
            btnEditar.setEnabled(true);
            btnEliminar.setEnabled(true);
            btnRegistrar.setEnabled(false);
            idField.setEditable(false);
            idField.setText(datos.get(0));
            pisoField.setText(datos.get(2));
            estadoRadioButtom.setSelected(datos.get(3).equals("Habilitada"));
            categoriasComboBox.setSelectedItem(datos.get(1));

            /*TIP: PASAR UNA CADENA CON PALABRAS O FRASES SEPARADAS POR UN CARACTER A UNA LIST
            List<String> id= Arrays.asList(c.split("-"));
            pisoField.setText(datos.get(2));*/
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pisoJLabel = new javax.swing.JLabel();
        categoriaJLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        idJLabel = new javax.swing.JLabel();
        estadoJLabel = new javax.swing.JLabel();
        tituloVistaJLabel = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        pisoField = new javax.swing.JTextField();
        estadoRadioButtom = new javax.swing.JRadioButton();
        btnEliminar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnLimpiarValores = new javax.swing.JButton();
        textoAyuda = new javax.swing.JTextArea();
        categoriasComboBox = new javax.swing.JComboBox<>();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(698, 431));

        pisoJLabel.setText("Piso:");

        categoriaJLabel.setText("Categoria:");

        idJLabel.setText("Numero de Habitacion:");

        estadoJLabel.setText("Habilitada para su uso:");

        tituloVistaJLabel.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        tituloVistaJLabel.setText("HABILITAR ALOJAMIENTO PARA HUMANO(CREAR HABITACION)");

        idField.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                idFieldInputMethodTextChanged(evt);
            }
        });
        idField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idFieldActionPerformed(evt);
            }
        });
        idField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                idFieldKeyReleased(evt);
            }
        });

        btnEliminar.setText("Eliminar Habitacion");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar Habitaciones");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnLimpiarValores.setText("Limpiar Valores");
        btnLimpiarValores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarValoresActionPerformed(evt);
            }
        });

        textoAyuda.setEditable(false);
        textoAyuda.setColumns(20);
        textoAyuda.setRows(3);
        textoAyuda.setText("Para REGISTRAR una habitacion ingrese los datos, NO INGRESE EL NRO. DE HABITACION.\nPara EDITAR o ELIMINAR puede ingresar TODOS los datos o buscar la habitacion\n\nPara buscar presione 'Buscar Habitaciones'");
        textoAyuda.setAutoscrolls(false);
        textoAyuda.setFocusable(false);
        textoAyuda.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(tituloVistaJLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(idJLabel)
                        .addGap(6, 6, 6)
                        .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnLimpiarValores))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(pisoJLabel)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pisoField, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addComponent(jLabel4))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(categoriaJLabel)
                        .addGap(6, 6, 6)
                        .addComponent(categoriasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(estadoJLabel)
                        .addGap(10, 10, 10)
                        .addComponent(estadoRadioButtom))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(btnRegistrar)
                        .addGap(10, 10, 10)
                        .addComponent(btnEditar)
                        .addGap(4, 4, 4)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(btnBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(textoAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(tituloVistaJLabel)
                .addGap(18, 18, 18)
                .addComponent(textoAyuda, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiarValores))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(pisoJLabel))
                    .addComponent(pisoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(categoriaJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(categoriasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(estadoJLabel)
                    .addComponent(estadoRadioButtom))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrar)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar)
                    .addComponent(btnBuscar)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        if (!idField.getText().isEmpty()) {

            if (verificadorSoloNumeros(idField.getText())) {

                int seguro = JOptionPane.showConfirmDialog(rootPane, "¿Seguro que desea eliminar?");
                if (seguro == 0) {
                    int idHabitacion = Integer.parseInt(idField.getText());
                    Habitacion h = HabitacionDataBORRADOR.obtenerHabitacionXId(idHabitacion);
                    if (h.getIdHabitacion() == 0) {
                        JOptionPane.showMessageDialog(this, "No se ha encontrado la habitacion con ese numero, verifique he intente de nuevo");
                    } else {
                        HabitacionDataBORRADOR.bajarHabitacion(idHabitacion);
                        limpiarFields();
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "El ID No debe contener letras");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Para poder dar de baja una habitacion debe escribir su id, en caso de no conocerlo busuqelo con el boton buscar habitaciones");
        }


    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try {
            if (pisoField.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Le ha faltado colocar algun dato, verifique he intentelo de nuevo");
            } else if (!verificadorSoloNumeros(pisoField.getText().trim())) {
                JOptionPane.showMessageDialog(this, "El piso posee algun caracter no numerico, no debe tener letras, puntos, ni cualquier otro signo, verifique y presione editar nuevamente");
            } else if (pisoField.getText().trim().length() > 3) {
                JOptionPane.showMessageDialog(this, "El piso solo puede tener hasta 3 digitos");
            } else if (pisoField.getText().trim().length() > 1 && pisoField.getText().substring(0, 1).equals("0")) {
                JOptionPane.showMessageDialog(this, "El piso no puede comenzar con 0 (cero)");
            } else if (categoriasComboBox.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Asegurese de seleccionar alguna categoria");
            } else {
                int piso = Integer.parseInt(pisoField.getText());
                int idcategoria = getIdCategoriaCombo(categoriasComboBox.getSelectedItem().toString());
                int estado = estadoRadioButtom.isSelected() ? 1 : 0;
                int condicion = 1;

                if (estado == 0) {
                    condicion = JOptionPane.showConfirmDialog(this, "El estado esta en inactivo, ¿desea subir la habitacion como inhabilitada?");
                } else {
                    condicion = 0;
                }

                if (condicion == 0) {
                    Habitacion h = new Habitacion(idcategoria, piso, estado);

                    HabitacionDataBORRADOR.subirHabitacion(h);
                    limpiarFields();
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Error en el boton registrar");
            System.out.println("error en el metodo actionPerformed btnRegistrarActionPerformed(). por favor, verifique. ");
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (idField.getText().isEmpty() || pisoField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Le ha faltado colocar algun dato, verifique he intentelo de nuevo");
        } else if (!verificadorSoloNumeros(pisoField.getText().trim())) {
            JOptionPane.showMessageDialog(this, "El piso posee algun caracter no numerico, no debe tener letras, puntos, ni cualquier otro signo, verifique y presione editar nuevamente");
        } else if (pisoField.getText().trim().length() > 3) {
            JOptionPane.showMessageDialog(this, "El piso solo puede tener hasta 3 digitos");
        } else if (pisoField.getText().trim().length() > 1 && pisoField.getText().substring(0, 1).equals("0")) {
            JOptionPane.showMessageDialog(this, "El piso no puede comenzar con 0 (cero)");
        } else if (categoriasComboBox.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Asegurese de seleccionar alguna categoria");
        } else {

            int piso = Integer.parseInt(pisoField.getText());
            int id = Integer.parseInt(idField.getText());
            int idcategoria = getIdCategoriaCombo(categoriasComboBox.getSelectedItem().toString());
            boolean estado = estadoRadioButtom.isSelected();
            int condicion = 1;

            if (!estado) {
                condicion = JOptionPane.showConfirmDialog(this, "El estado esta en inactivo, ¿el dato es correcto?");
            } else {
                condicion = 0;
            }

            if (condicion == 0) {
                Habitacion h = HabitacionDataBORRADOR.obtenerHabitacionXId(id);

                if (h.getIdHabitacion() == 0) {
                    JOptionPane.showMessageDialog(this, "No se ha encontrado la habitacion con ese numero, verifique he intente de nuevo");
                } else {
                    HabitacionDataBORRADOR.actualizarHabitacion(new Habitacion(id, idcategoria, piso, (estadoRadioButtom.isSelected()) ? 1 : 0), true);
                    limpiarFields();
                }
            } else {
                JOptionPane.showMessageDialog(this, "no se subira la habitacion");
            }

        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnLimpiarValoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarValoresActionPerformed
        limpiarFields();
    }//GEN-LAST:event_btnLimpiarValoresActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        BuscarHabitacion bh = new BuscarHabitacion();
        bh.setVisible(true);
        this.setVisible(false);
        JDesktopPane desktop = getDesktopPane();
        desktop.add(bh);
        desktop.moveToFront(bh);
        this.dispose();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void idFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idFieldKeyReleased
        try {
            int prueba = Integer.parseInt(idField.getText());
            if ((!btnEliminar.isEnabled()) && (!btnEditar.isEnabled())) {
                btnEliminar.setEnabled(true);
                btnEditar.setEnabled(true);
                btnRegistrar.setEnabled(false);
            }
        } catch (NumberFormatException e) {
            //System.out.println("e message:"+e.getMessage());
            if (e.getMessage().equals("For input string: \"\"")) {
                btnRegistrar.setEnabled(true);
                btnEliminar.setEnabled(false);
                btnEditar.setEnabled(false);
            }else{
            //    btnRegistrar.setEnabled(false);
                btnEliminar.setEnabled(false);
                btnEditar.setEnabled(false);
                
            }
        }

    }//GEN-LAST:event_idFieldKeyReleased

    private void idFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idFieldActionPerformed


    }//GEN-LAST:event_idFieldActionPerformed

    private void idFieldInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_idFieldInputMethodTextChanged

    }//GEN-LAST:event_idFieldInputMethodTextChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiarValores;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel categoriaJLabel;
    private javax.swing.JComboBox<String> categoriasComboBox;
    private javax.swing.JLabel estadoJLabel;
    private javax.swing.JRadioButton estadoRadioButtom;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel idJLabel;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField pisoField;
    private javax.swing.JLabel pisoJLabel;
    private javax.swing.JTextArea textoAyuda;
    private javax.swing.JLabel tituloVistaJLabel;
    // End of variables declaration//GEN-END:variables

    public void limpiarFields() {
        idField.setText("");
        pisoField.setText("");
        estadoRadioButtom.setSelected(false);
        categoriasComboBox.setSelectedIndex(0);

        btnEditar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnRegistrar.setEnabled(true);
        idField.setEditable(true);

    }

    public boolean verificadorSoloNumeros(String cadena) {
        char[] letras = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm'};

        for (char letra : letras) {
            if (cadena.toLowerCase().contains(letra + "")) {
                return false;
            } else if (idField.getText().contains(letra + "")) {
                return false;
            }
        }
        return true;
    }

//    public boolean verificarSoloLetras(String nombre) {
//        //SE CREAN LOS ARRAYLIST
//        String[] abc ={" ","q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "a", "s", "d", "f", "g", "h", "j", "k", "l", "z", "x", "c", "v", "b", "n", "m","ñ"};
//    
//        ArrayList<String> letras = new ArrayList<>();
//
//        for (String l : abc) {
//            letras.add(l);
//        }
//        
//        //SE EMPIEZAN LAS VERIFICACIONES
//        for (int i = 0; i < nombre.length(); i++) {
//            if (!letras.contains(nombre.toLowerCase().substring(i, i + 1))) {
//                return false;
//            } 
//        }
//        
//        return true;
//
//    }
    public void llenarComboCategorias() {
        categoriasComboBox.addItem((String) "SELECCIONE UNA CATEGORIA");
        String texto;
        for (Categoria c : CategoriaData.listarTodasLasCategorias()) {
            texto = c.getIdCategoria() + "_ " + c.getNombre();
            categoriasComboBox.addItem((String) texto);
        }
    }

    public int getIdCategoriaCombo(String c) {
        int idC = 0;

        try {

            if (c.substring(0, 2).contains("_")) {
                idC = Integer.parseInt(c.substring(0, 1).trim());
            } else if (c.substring(0, 3).contains("_")) {
                idC = Integer.parseInt(c.substring(0, 2));
            } else {
                idC = Integer.parseInt(c.substring(0, 3));
            }

        } catch (NumberFormatException e) {
        }
        return idC;
    }
}
