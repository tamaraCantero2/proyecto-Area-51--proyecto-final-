package vista;

import controlador.HuespedData;
import controlador.ReservaData;
import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Huesped;
import modelo.Reserva;

public class ListadeReservas extends javax.swing.JInternalFrame {

    DefaultTableModel modelo = new DefaultTableModel(){
        
        @Override
        public boolean isCellEditable(int f, int col){
        return false;
        }
    
    };

    public ListadeReservas() {
        initComponents();
        Tabla.setModel(modelo);
        agregarCabeceraTabla();
        cargarComboBox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jrTodasReservas = new javax.swing.JRadioButton();
        jrReservasActivas = new javax.swing.JRadioButton();
        jrReservasNoActivas = new javax.swing.JRadioButton();
        jbBuscarReserva = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jcOpcionBusqueda = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jbCancelarReserva = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        BuscarFecha = new com.toedter.calendar.JDateChooser();

        setClosable(true);

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Tabla);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setText("Lista de Reservas");

        jrTodasReservas.setText("Todas las reservas");
        jrTodasReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrTodasReservasActionPerformed(evt);
            }
        });

        jrReservasActivas.setText("Reservas activas");
        jrReservasActivas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrReservasActivasActionPerformed(evt);
            }
        });

        jrReservasNoActivas.setText("Reservas no activas");
        jrReservasNoActivas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrReservasNoActivasActionPerformed(evt);
            }
        });

        jbBuscarReserva.setText("Buscar");
        jbBuscarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarReservaActionPerformed(evt);
            }
        });

        jLabel2.setText("Buscar Reserva x Huesped:");

        jcOpcionBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Seleccione un Dato-", "nombre", "apellido", "dni" }));

        jbCancelarReserva.setText("Cancelar Reserva");
        jbCancelarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarReservaActionPerformed(evt);
            }
        });

        jLabel3.setText("Buscar Reserva x Fecha:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(356, 356, 356)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jrTodasReservas)
                        .addGap(79, 79, 79)
                        .addComponent(jrReservasActivas)
                        .addGap(91, 91, 91)
                        .addComponent(jrReservasNoActivas))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jcOpcionBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jbBuscarReserva)
                                .addGap(118, 118, 118)
                                .addComponent(jbCancelarReserva))
                            .addComponent(BuscarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrTodasReservas)
                    .addComponent(jrReservasActivas)
                    .addComponent(jrReservasNoActivas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelarReserva)
                    .addComponent(jLabel2)
                    .addComponent(jcOpcionBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscarReserva))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(BuscarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrTodasReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrTodasReservasActionPerformed
       if (jrTodasReservas.isSelected()) {
            borrarFilasTabla();
            jrReservasActivas.setSelected(false);
            jrReservasNoActivas.setSelected(false);
            agregarFilas(ReservaData.listarTodasLasReservas());
            
        } else {
            borrarFilasTabla();
            
        }
    
    }//GEN-LAST:event_jrTodasReservasActionPerformed

    private void jrReservasActivasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrReservasActivasActionPerformed
        if (jrReservasActivas.isSelected()) {
            borrarFilasTabla();
            jrTodasReservas.setSelected(false);
            jrReservasNoActivas.setSelected(false);
            agregarFilas(ReservaData.listarReservasActivas());
            
        } else {
            borrarFilasTabla();
            
        }
    }//GEN-LAST:event_jrReservasActivasActionPerformed

    private void jrReservasNoActivasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrReservasNoActivasActionPerformed
          if (jrReservasNoActivas.isSelected()) {
            borrarFilasTabla();
            jrTodasReservas.setSelected(false);
            jrReservasActivas.setSelected(false);
            agregarFilas(ReservaData.listarReservasBajas());
            
        } else {
            borrarFilasTabla();
            
        }
    }//GEN-LAST:event_jrReservasNoActivasActionPerformed

    private void jbCancelarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarReservaActionPerformed
        Huesped h = HuespedData.obtenerHuespedXid((int)modelo.getValueAt(Tabla.getSelectedRow(), 1));
        int id=(int)modelo.getValueAt(Tabla.getSelectedRow(), 1);
        ReservaData.finReserva(h,id);
        vaciarTabla();
        jrTodasReservas.setSelected(false);
        jrReservasActivas.setSelected(false);
         jrReservasNoActivas.setSelected(false);
    }//GEN-LAST:event_jbCancelarReservaActionPerformed

    private void jbBuscarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarReservaActionPerformed
             jrReservasNoActivas.setSelected(false);
        jrReservasActivas.setSelected(false);
        jrTodasReservas.setSelected(false);
        ArrayList<Reserva> listareservas = ReservaData.listarTodasLasReservas();
        vaciarTabla();
        if (BuscarFecha.getDate()== null) {
            
        switch ((String) jcOpcionBusqueda.getSelectedItem()) {
            case "idHuesped":
                if (verificadorSoloNumerosER(jTextField1.getText())) {
                    int id = Integer.parseInt(jTextField1.getText());
                    agregarFila(ReservaData.buscarReservaPorHuesped(id));
                } else {
                 JOptionPane.showMessageDialog(rootPane, "Solo puede ingresar valores numericos como ID");
                    jTextField1.setText("");
                }

                break;
            case "nombre":
                if (verificarSoloLetrasYEspaciosER(jTextField1.getText())) {
                    for (Reserva reserva : listareservas) {
                        if (reserva.getHuesped().getNombre().toLowerCase().startsWith(jTextField1.getText().toLowerCase())) {
                            agregarFila(reserva);
                        }
                    }
                } else {
                  JOptionPane.showMessageDialog(rootPane, "Caracter Invalido");
                        jTextField1.setText("");
                }
                break;
            case "DNI":
                if (verificadorSoloNumerosER(jTextField1.getText())) {
                    for (Reserva reserva : listareservas) {
                        if ((reserva.getHuesped().getDNI() + " ").startsWith(jTextField1.getText())) {
                            agregarFila(reserva);
                        }
                    }}else{
                   JOptionPane.showMessageDialog(rootPane, "Caracter Invalido, revise que su DNI no tenga puntos ni valores no numericos");
                            jTextField1.setText("");
                        }
                

                break;
                
        }
        }else {
            LocalDate fechaEntrada = BuscarFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            agregarFilas(ReservaData.buscarReservaPorFechaDeInicio(fechaEntrada));
            BuscarFecha.setDate(null);
        } 
    }//GEN-LAST:event_jbBuscarReservaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser BuscarFecha;
    private javax.swing.JTable Tabla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbBuscarReserva;
    private javax.swing.JButton jbCancelarReserva;
    private javax.swing.JComboBox<String> jcOpcionBusqueda;
    private javax.swing.JRadioButton jrReservasActivas;
    private javax.swing.JRadioButton jrReservasNoActivas;
    private javax.swing.JRadioButton jrTodasReservas;
    // End of variables declaration//GEN-END:variables

    private void agregarCabeceraTabla() {
        modelo.addColumn("ID Reserva");
        modelo.addColumn("ID ");
           modelo.addColumn("Nombre");
              modelo.addColumn("Apellido");
         modelo.addColumn("DNI ");
        modelo.addColumn("ID Habitación");
        modelo.addColumn("Fecha de entrada");
        modelo.addColumn("Fecha de salida");
        modelo.addColumn("Cant. de personas");
        modelo.addColumn("Monto a pagar");
        modelo.addColumn("Estado");

    }


    private void agregarFila(Reserva reserva) {
        modelo.addRow( new Object[]{reserva.getIdReserva(), reserva.getHuesped().getIdHuesped(),reserva.getHuesped().getNombre(),reserva.getHuesped().getApellido(),reserva.getHuesped().getDNI(),reserva.getHabitacion().getIdHabitacion(), reserva.getFechaIngreso(), reserva.getFechaEgreso(), reserva.getCantPersonas(), reserva.getPrecioTotal(),reserva.isEstado()});
               
    }
    public void vaciarTabla() {
        int cantidadFilas = modelo.getRowCount();
        for (int i = cantidadFilas - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }

    }
     public void agregarFilas(ArrayList<Reserva> lista) {
         borrarFilasTabla();
         
         try {
             for (Reserva reserva : lista) {
                 if (reserva.getIdReserva() != 0) {
                     agregarFila(reserva);
                 }
             }
         } catch (Exception e) {
             System.out.println("");
         }
     }
     
     //esto es para pasar al proyecto original
     private void borrarFilasTabla() {
         for (int f = modelo.getRowCount() - 1; f > -1; f--) {
            modelo.removeRow(f);
        }
     }
    
    private void cargarComboBox() {
        jcOpcionBusqueda.addItem("idHuesped");
        jcOpcionBusqueda.addItem("nombre");
        jcOpcionBusqueda.addItem("DNI");
    }

    /*---------------------------------------------------------------*/
    public boolean verificadorSoloNumerosER(String texto) {
        /*Expresión regular*/
        if (texto.matches("\\d+")) {
            int numeroEntero = Integer.parseInt(texto);
            return true;

        } else {
            return false;
        }
    }

    public boolean verificarSoloLetrasER(String texto) {
        /*Expresion regular*/
        if (texto.matches("[a-zA-Z]+")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verificarSoloLetrasYEspaciosER(String texto) {
        /*Expresion regular*/
        if (texto.matches("[a-zA-Z ]+")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verificadorNumerosEnterosYDecimalesER(String texto) {
        /* Expresión regular que permite números enteros o decimales */
        if (texto.matches("\\d+|\\d*\\.\\d+")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verificarLetrasNumeroYEspacios(String texto) {
        if (texto.matches("[a-zA-Z0-9 ]+")) {
            return true;
        } else {
            return false;
        }
    }
}
