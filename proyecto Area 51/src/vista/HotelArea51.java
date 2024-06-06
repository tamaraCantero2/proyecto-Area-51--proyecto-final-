package vista;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class HotelArea51 extends javax.swing.JFrame {
    ImageIcon icon= new ImageIcon(getClass().getResource("/imagenes/fondoMenuPrincipal.gif"));
    Image img=icon.getImage();
    public HotelArea51() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jDesktopPane1 = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(img,0,0,getWidth(),getHeight(),this);
            }
        };
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jmListaReserva = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        MItemRHuesped = new javax.swing.JMenuItem();
        MItemLHuesped = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        resgitrarHabitacionMenu = new javax.swing.JMenuItem();
        busquedasHabitacionesMenu = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmAdministracionCategoria = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOTEL AREA 51 Administración");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagen_mas_pequeña-removebg-preview.png"))); // NOI18N

        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(383, 383, 383)
                .addComponent(jLabel2)
                .addContainerGap(552, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(290, Short.MAX_VALUE))
        );

        jMenuBar1.setMaximumSize(new java.awt.Dimension(300, 32768));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(250, 50));

        jMenu3.setText("Reservas");

        jMenuItem3.setText("Hacer Reserva");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jmListaReserva.setText("Lista de Reservas");
        jmListaReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmListaReservaActionPerformed(evt);
            }
        });
        jMenu3.add(jmListaReserva);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("Huesped");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        MItemRHuesped.setText("RegistrarHuesped");
        MItemRHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MItemRHuespedActionPerformed(evt);
            }
        });
        jMenu1.add(MItemRHuesped);

        MItemLHuesped.setText("ListaHuesped");
        MItemLHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MItemLHuespedActionPerformed(evt);
            }
        });
        jMenu1.add(MItemLHuesped);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Habitaciones");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        resgitrarHabitacionMenu.setText("Registrar Habitacion");
        resgitrarHabitacionMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                resgitrarHabitacionMenuMouseClicked(evt);
            }
        });
        resgitrarHabitacionMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resgitrarHabitacionMenuActionPerformed(evt);
            }
        });
        jMenu2.add(resgitrarHabitacionMenu);

        busquedasHabitacionesMenu.setText("Busqueda de Habitaciones");
        busquedasHabitacionesMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                busquedasHabitacionesMenuMouseClicked(evt);
            }
        });
        busquedasHabitacionesMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busquedasHabitacionesMenuActionPerformed(evt);
            }
        });
        jMenu2.add(busquedasHabitacionesMenu);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Categoria");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jmAdministracionCategoria.setText("Administracion de Categoria");
        jmAdministracionCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAdministracionCategoriaActionPerformed(evt);
            }
        });
        jMenu4.add(jmAdministracionCategoria);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MItemRHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MItemRHuespedActionPerformed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        RegistrarHuesped registrarHuesped = new RegistrarHuesped();
        registrarHuesped.setVisible(true);
        jDesktopPane1.add(registrarHuesped);
        jDesktopPane1.moveToFront(registrarHuesped);

    }//GEN-LAST:event_MItemRHuespedActionPerformed

    private void MItemLHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MItemLHuespedActionPerformed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        ListaHuesped listahuesped = new ListaHuesped();
        listahuesped.setVisible(true);
        jDesktopPane1.add(listahuesped);
        jDesktopPane1.moveToFront(listahuesped);
    }//GEN-LAST:event_MItemLHuespedActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
//        jDesktopPane1.removeAll();
//        jDesktopPane1.repaint();
//        ListaHuesped listahuesped = new ListaHuesped();
//        listahuesped.setVisible(true);
//        jDesktopPane1.add(listahuesped);
//        jDesktopPane1.moveToFront(listahuesped);
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        HacerReserva hacerreserva = new HacerReserva();
        hacerreserva.setVisible(true);
        jDesktopPane1.add(hacerreserva);
        jDesktopPane1.moveToFront(hacerreserva);


    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void resgitrarHabitacionMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_resgitrarHabitacionMenuMouseClicked

    }//GEN-LAST:event_resgitrarHabitacionMenuMouseClicked

    private void resgitrarHabitacionMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resgitrarHabitacionMenuActionPerformed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        RegistrarHabitacion rh = new RegistrarHabitacion();
        rh.setVisible(true);
        jDesktopPane1.add(rh);
        jDesktopPane1.moveToFront(rh);

    }//GEN-LAST:event_resgitrarHabitacionMenuActionPerformed

    private void busquedasHabitacionesMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_busquedasHabitacionesMenuMouseClicked

    }//GEN-LAST:event_busquedasHabitacionesMenuMouseClicked

    private void busquedasHabitacionesMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busquedasHabitacionesMenuActionPerformed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        BuscarHabitacion rh = new BuscarHabitacion();
        rh.setVisible(true);
        jDesktopPane1.add(rh);
        jDesktopPane1.moveToFront(rh);
    }//GEN-LAST:event_busquedasHabitacionesMenuActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jmAdministracionCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAdministracionCategoriaActionPerformed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        AdministracionCategoria rh = new AdministracionCategoria();
        rh.setVisible(true);
        jDesktopPane1.add(rh);
        jDesktopPane1.moveToFront(rh);

        
    }//GEN-LAST:event_jmAdministracionCategoriaActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jmListaReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmListaReservaActionPerformed
        jDesktopPane1.removeAll();;
        jDesktopPane1.repaint();
        ListadeReservas lr = new ListadeReservas();
        lr.setVisible(true);
        jDesktopPane1.add(lr);

    }//GEN-LAST:event_jmListaReservaActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HotelArea51.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HotelArea51.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HotelArea51.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HotelArea51.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HotelArea51().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MItemLHuesped;
    private javax.swing.JMenuItem MItemRHuesped;
    private javax.swing.JMenuItem busquedasHabitacionesMenu;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jmAdministracionCategoria;
    private javax.swing.JMenuItem jmListaReserva;
    private javax.swing.JMenuItem resgitrarHabitacionMenu;
    // End of variables declaration//GEN-END:variables

}
