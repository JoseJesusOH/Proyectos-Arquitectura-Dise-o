package jugador;

import javax.swing.JButton;

/**
 *
 * @author J.Fernando <josefer.hernandez@hotmail.com>
 */
public class Main extends javax.swing.JFrame {

    private Cliente cliente;
    private JButton[][] botones = new JButton[3][3];

    /**
     * Creates new form Main
     */
    public Main() {
        try {
            initComponents();
            botones[0][0] = M11;
            botones[0][1] = M12;
            botones[0][2] = M13;
            botones[1][0] = M21;
            botones[1][1] = M22;
            botones[1][2] = M23;
            botones[2][0] = M31;
            botones[2][1] = M32;
            botones[2][2] = M33;

            cliente = new Cliente(this);
            Thread hilo = new Thread(cliente);
            hilo.start();
        } catch (Exception ex) {
            ex.printStackTrace();
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

        btnReiniciar = new javax.swing.JButton();
        lblTurno = new javax.swing.JLabel();
        M11 = new javax.swing.JButton();
        M12 = new javax.swing.JButton();
        M13 = new javax.swing.JButton();
        M21 = new javax.swing.JButton();
        M22 = new javax.swing.JButton();
        M23 = new javax.swing.JButton();
        M31 = new javax.swing.JButton();
        M32 = new javax.swing.JButton();
        M33 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnReiniciar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        lblTurno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        M11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M11ActionPerformed(evt);
            }
        });

        M12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M12ActionPerformed(evt);
            }
        });

        M13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M13ActionPerformed(evt);
            }
        });

        M21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M21ActionPerformed(evt);
            }
        });

        M22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M22ActionPerformed(evt);
            }
        });

        M23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M23ActionPerformed(evt);
            }
        });

        M31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M31ActionPerformed(evt);
            }
        });

        M32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M32ActionPerformed(evt);
            }
        });

        M33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                M33ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(lblTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 191, Short.MAX_VALUE)
                .addComponent(btnReiniciar)
                .addGap(50, 50, 50))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(M11, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(M21, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(M31, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(41, 41, 41)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(M12, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(M22, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(M32, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(M23, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(M33, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(M13, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(35, 35, 35)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReiniciar)
                .addGap(15, 15, 15))
            .addGroup(layout.createSequentialGroup()
                .addGap(492, 492, 492)
                .addComponent(lblTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(68, 68, 68)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(M12, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(M13, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(M11, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(33, 33, 33)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(M21, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(M22, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(M23, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(34, 34, 34)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(M31, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(M32, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(M33, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(68, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        new Main().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void M11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M11ActionPerformed
        enviarTurno(0, 0);
    }//GEN-LAST:event_M11ActionPerformed

    private void M12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M12ActionPerformed
        enviarTurno(0, 1);
    }//GEN-LAST:event_M12ActionPerformed

    private void M13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M13ActionPerformed
        enviarTurno(0, 2);
    }//GEN-LAST:event_M13ActionPerformed

    private void M21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M21ActionPerformed
        enviarTurno(1, 0);
    }//GEN-LAST:event_M21ActionPerformed

    private void M22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M22ActionPerformed
        enviarTurno(1, 1);
    }//GEN-LAST:event_M22ActionPerformed

    private void M23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M23ActionPerformed
        enviarTurno(1, 2);
    }//GEN-LAST:event_M23ActionPerformed

    private void M31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M31ActionPerformed
        enviarTurno(2, 0);
    }//GEN-LAST:event_M31ActionPerformed

    private void M32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M32ActionPerformed
        enviarTurno(2, 1);
    }//GEN-LAST:event_M32ActionPerformed

    private void M33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_M33ActionPerformed
        enviarTurno(2, 2);
    }//GEN-LAST:event_M33ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton M11;
    private javax.swing.JButton M12;
    private javax.swing.JButton M13;
    private javax.swing.JButton M21;
    private javax.swing.JButton M22;
    private javax.swing.JButton M23;
    private javax.swing.JButton M31;
    private javax.swing.JButton M32;
    private javax.swing.JButton M33;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JLabel lblTurno;
    // End of variables declaration//GEN-END:variables

    public void cambioTexto(String cad) {
        lblTurno.setText(cad);
    }

    public JButton[][] getBotones() {
        return botones;
    }

    //Cuando se preciona un boton enviamos los datos de la jugada al servidor (fila y columna del boton precionado)
    public void enviarTurno(int f, int c) {
        cliente.enviarTurno(f, c);
    }
}
