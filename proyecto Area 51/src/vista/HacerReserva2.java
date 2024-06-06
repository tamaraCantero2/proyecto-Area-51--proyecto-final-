package vista;

import controlador.CategoriaData;
import controlador.HabitacionDataBORRADOR;
import controlador.ReservaData;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Categoria;
import modelo.Habitacion;

public class HacerReserva2 extends javax.swing.JInternalFrame {

    private int cantidadPersonas;
    private LocalDate diaEntrada;
    private LocalDate diaSalida;
    private int precioTotal;
    DefaultTableModel modelo = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int f, int c){
        return false;
        }
    };

    public HacerReserva2(int cantidadPersonas, LocalDate diaEntrada, LocalDate diaSalida) {
        initComponents();
        tabla.setModel(modelo);
        agregarCabeceraTabla();

        this.diaEntrada = diaEntrada;
        this.diaSalida = diaSalida;
        this.cantidadPersonas = cantidadPersonas;

        //habitacionesSegunCantidadPersonas();
        llenarcbCategorias();
    }


    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jcCategorias = new javax.swing.JComboBox<>();
        jTextArea2 = new javax.swing.JTextArea();
        btn_reservar = new javax.swing.JButton();
        btn_volver = new javax.swing.JButton();
        jlPrecioTotal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setClosable(true);

        jLabel1.setText("Seleccione una opción de la tabla:");

        jcCategorias.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        jcCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcCategoriasActionPerformed(evt);
            }
        });

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jTextArea2.setRows(5);
        jTextArea2.setText("*Busquen las habitaciones por la categorias de habitacion y luego selecione una \nhabitación de la tabla. Abajo a la derecha de la tabla saldra el precio.\n\nSí el huesped aun no se ha hospedado antes seleccione \"Registrar Huesped\",\nsino seleccione \"Reservar\".");

        btn_reservar.setText("Reservar");
        btn_reservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reservarActionPerformed(evt);
            }
        });

        btn_volver.setText("Volver");
        btn_volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_volverActionPerformed(evt);
            }
        });

        jlPrecioTotal.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jlPrecioTotal.setText("$0.0");

        jLabel3.setText("Precio total:");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setText("Selección de Habitación");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(92, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(353, 353, 353)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlPrecioTotal)
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btn_volver)
                                .addGap(323, 323, 323)
                                .addComponent(btn_reservar)))
                        .addGap(319, 319, 319))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextArea2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 717, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextArea2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jcCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPrecioTotal)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_reservar)
                    .addComponent(btn_volver))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_reservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reservarActionPerformed
        int row =tabla.getSelectedRow(); 
        if(row !=-1){
        int idHabitacion=(int) modelo.getValueAt(row, 0);
        HacerReserva3 hacerreserva = new HacerReserva3(idHabitacion,cantidadPersonas, diaEntrada, diaSalida,precioTotal);

        JDesktopPane desktop = getDesktopPane();
        desktop.add(hacerreserva);
        hacerreserva.setVisible(true);
        dispose();}else{
        JOptionPane.showMessageDialog(this,"Debe seleccionar una habitación");
        
        }
    }//GEN-LAST:event_btn_reservarActionPerformed

    private void btn_volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_volverActionPerformed
        HacerReserva hacerreserva = new HacerReserva(diaEntrada,diaSalida,cantidadPersonas);

        JDesktopPane desktop = getDesktopPane();
        desktop.add(hacerreserva);
        hacerreserva.setVisible(true);
        dispose();

    }//GEN-LAST:event_btn_volverActionPerformed

    private void jcCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcCategoriasActionPerformed
        if (jcCategorias.getSelectedIndex() != 0) {
            borrarFilasTabla();
            String nombreCategoria = (String) jcCategorias.getSelectedItem();
            ArrayList<Habitacion> habitaciones = HabitacionDataBORRADOR.buscarHabitacionesXCategoria2(nombreCategoria);
            for (Habitacion h : habitaciones) {
                for (Habitacion h1 : habitacionesSegunCantidadPersonas2()) {
                    if (h.getIdCategoria() == h1.getIdCategoria()) {
                        agregarFilaTabla(h1);
                    }
                }
            }
        }else{
            borrarFilasTabla();
            habitacionesSegunCantidadPersonas();
        }
    }//GEN-LAST:event_jcCategoriasActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int selectedRow=tabla.getSelectedRow();
        
        double precio=Double.parseDouble(String.valueOf(tabla.getValueAt(selectedRow, 6)));
        Long cantDias=ChronoUnit.DAYS.between(diaEntrada, diaSalida);
        if(cantDias==0l){
            cantDias=1l;}
        
        //System.out.println("dias: "+cantDias);
        jlPrecioTotal.setText((precio*cantDias)+"");
        precioTotal = (int) (precio*cantDias);
     
    }//GEN-LAST:event_tablaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_reservar;
    private javax.swing.JButton btn_volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JComboBox<String> jcCategorias;
    private javax.swing.JLabel jlPrecioTotal;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

    private void agregarCabeceraTabla() {
        modelo.addColumn("Nro. Habit.");
        modelo.addColumn("Piso");
        modelo.addColumn("Categ.");
        modelo.addColumn("Tipo Camas");
        modelo.addColumn("Cant. de Personas");
        modelo.addColumn("Cant. de Camas");
        modelo.addColumn("Precio Noche");

        tabla.getColumn("Piso").setPreferredWidth(tabla.getColumn("Piso").getWidth() - 70);
        tabla.getColumn("Nro. Habit.").setPreferredWidth(tabla.getColumn("Nro. Habit.").getWidth() - 30);
        tabla.getColumn("Cant. de Personas").setPreferredWidth(tabla.getColumn("Cant. de Personas").getWidth()+20);
    }

    private void agregarFilaTabla(Habitacion habitacion) {
        Categoria categoria = CategoriaData.obtenerCategoriaXId(habitacion.getIdCategoria());
        modelo.addRow(new Object[]{habitacion.getIdHabitacion(), habitacion.getPiso(), categoria.getNombre(), categoria.getTipoDeCamas(), categoria.getCantidadPersonas(), categoria.getCantidadCamas(), categoria.getPrecioNoche()});
    }

    private void borrarFilasTabla() {

        for (int f = modelo.getRowCount() - 1; f > -1; f--) {
            modelo.removeRow(f);
        }
    }

    public void habitacionesSegunCantidadPersonas() {
        Categoria c;
        for (Habitacion habitacion : HabitacionDataBORRADOR.listarHabitacionesLibres()) {
            c = CategoriaData.obtenerCategoriaXId(habitacion.getIdCategoria());
            if (c.getCantidadPersonas() == cantidadPersonas&&habitacion.getEstado()==1) {
                agregarFilaTabla(habitacion);
                System.out.println(habitacion.getIdCategoria());
            }
        }

    }

    public ArrayList<Habitacion> habitacionesSegunCantidadPersonas2() {
        borrarFilasTabla();
        Categoria c;
        ArrayList<Habitacion> hs = new ArrayList<>();
        for (Habitacion habitacion : HabitacionDataBORRADOR.listarHabitacionesLibres()) {
            c = CategoriaData.obtenerCategoriaXId(habitacion.getIdCategoria());
            if (c.getCantidadPersonas() == cantidadPersonas) {
                hs.add(habitacion);
            }
        }

        return hs;
    }

    public void llenarcbCategorias() {
        jcCategorias.addItem("-CATEGORIAS-");
        for (Categoria categoria : CategoriaData.listarTodasLasCategorias()) {
            if (categoria.getCantidadPersonas() == cantidadPersonas) {
                jcCategorias.addItem(categoria.getNombre());
            }
        }

    }

}
