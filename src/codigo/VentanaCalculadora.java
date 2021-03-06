/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package codigo;

/**
 *
 * @author Pepe
 */
public class VentanaCalculadora extends javax.swing.JFrame {

    public float primernumero;
    public float segundonumero;
    public String operador;
    
    public VentanaCalculadora() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pantalla = new javax.swing.JLabel();
        BotonDividir = new javax.swing.JButton();
        botonMultiplicar = new javax.swing.JButton();
        BotonMenos = new javax.swing.JButton();
        BotonBorrar = new javax.swing.JButton();
        Boton07 = new javax.swing.JButton();
        Boton09 = new javax.swing.JButton();
        Boton08 = new javax.swing.JButton();
        Boton05 = new javax.swing.JButton();
        Boton06 = new javax.swing.JButton();
        BotonMas = new javax.swing.JButton();
        Boton01 = new javax.swing.JButton();
        Boton03 = new javax.swing.JButton();
        BotonIgual = new javax.swing.JButton();
        Boton00 = new javax.swing.JButton();
        Boton04 = new javax.swing.JButton();
        Boton02 = new javax.swing.JButton();
        BotonPunto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pantalla.setBackground(new java.awt.Color(0, 0, 0));
        pantalla.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        pantalla.setForeground(new java.awt.Color(255, 255, 0));
        pantalla.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pantalla.setToolTipText("");
        pantalla.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        pantalla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pantalla.setOpaque(true);

        BotonDividir.setText("/");

        botonMultiplicar.setText("*");
        botonMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMultiplicarActionPerformed(evt);
            }
        });

        BotonMenos.setText("-");
        BotonMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMenosActionPerformed(evt);
            }
        });

        BotonBorrar.setText("C");
        BotonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBorrarActionPerformed(evt);
            }
        });

        Boton07.setText("7");
        Boton07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton07ActionPerformed(evt);
            }
        });

        Boton09.setText("9");
        Boton09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton09ActionPerformed(evt);
            }
        });

        Boton08.setText("8");
        Boton08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton08ActionPerformed(evt);
            }
        });

        Boton05.setText("5");
        Boton05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton05ActionPerformed(evt);
            }
        });

        Boton06.setText("6");
        Boton06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton06ActionPerformed(evt);
            }
        });

        BotonMas.setText("+");
        BotonMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMasActionPerformed(evt);
            }
        });

        Boton01.setText("1");
        Boton01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton01ActionPerformed(evt);
            }
        });

        Boton03.setText("3");
        Boton03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton03ActionPerformed(evt);
            }
        });

        BotonIgual.setText("=");
        BotonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIgualActionPerformed(evt);
            }
        });

        Boton00.setText("0");
        Boton00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton00ActionPerformed(evt);
            }
        });

        Boton04.setText("4");
        Boton04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton04ActionPerformed(evt);
            }
        });

        Boton02.setText("2");
        Boton02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton02ActionPerformed(evt);
            }
        });

        BotonPunto.setText(".");
        BotonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonPuntoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pantalla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotonDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonMenos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Boton00, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Boton01, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(Boton02, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Boton03, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Boton04, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Boton05, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Boton07, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Boton08, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Boton09, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton06, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonMas, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonMenos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Boton07, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton08, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton09, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Boton05, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton06, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton04, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(BotonMas, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Boton01, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton03, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Boton02, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Boton00, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(BotonIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Boton08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton08ActionPerformed
        String auxiliar = pantalla.getText();
        if (auxiliar.equals("0")){
            pantalla.setText("8");
        }
        else{
        pantalla.setText(auxiliar + "8");
        }
    }//GEN-LAST:event_Boton08ActionPerformed

    private void botonMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMultiplicarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonMultiplicarActionPerformed

    private void BotonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBorrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonBorrarActionPerformed

    private void Boton05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton05ActionPerformed
        String auxiliar = pantalla.getText();
        if (auxiliar.equals("0")){
            pantalla.setText("5");
        }
        else{
        pantalla.setText(auxiliar + "5");
        }
    }//GEN-LAST:event_Boton05ActionPerformed

    private void Boton06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton06ActionPerformed
        String auxiliar = pantalla.getText();
        if (auxiliar.equals("0")){
            pantalla.setText("6");
        }
        else{
        pantalla.setText(auxiliar + "6");
        }
    }//GEN-LAST:event_Boton06ActionPerformed

    private void BotonMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMasActionPerformed
    this.primernumero=Float.parseFloat(this.pantalla.getText());
        this.operador="+";
        this.pantalla.setText("");
    }//GEN-LAST:event_BotonMasActionPerformed

    private void Boton01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton01ActionPerformed
        String auxiliar = pantalla.getText();
        if (auxiliar.equals("0")){
            pantalla.setText("1");
        }
        else{
        pantalla.setText(auxiliar + "1");
        }
    }//GEN-LAST:event_Boton01ActionPerformed

    private void Boton03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton03ActionPerformed
        String auxiliar = pantalla.getText();
        if (auxiliar.equals("0")){
            pantalla.setText("3");
        }
        else{
        pantalla.setText(auxiliar + "3");
        }
    }//GEN-LAST:event_Boton03ActionPerformed

    private void BotonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIgualActionPerformed
    this.segundonumero=Float.parseFloat(this.pantalla.getText());
    }//GEN-LAST:event_BotonIgualActionPerformed

    private void Boton00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton00ActionPerformed
        this.pantalla.setText(this.pantalla.getText()+"0");
    }//GEN-LAST:event_Boton00ActionPerformed

    private void Boton04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton04ActionPerformed
        String auxiliar = pantalla.getText();
        if (auxiliar.equals("0")){
            pantalla.setText("4");
        }
        else{
        pantalla.setText(auxiliar + "4");
        }
    }//GEN-LAST:event_Boton04ActionPerformed

    private void Boton02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton02ActionPerformed
        String auxiliar = pantalla.getText();
        if (auxiliar.equals("0")){
            pantalla.setText("2");
        }
        else{
        pantalla.setText(auxiliar + "2");
        }
    }//GEN-LAST:event_Boton02ActionPerformed

    private void BotonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonPuntoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonPuntoActionPerformed

    private void BotonMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMenosActionPerformed
       System.out.println("OLA K ASE");
    }//GEN-LAST:event_BotonMenosActionPerformed

    private void Boton07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton07ActionPerformed
        String auxiliar = pantalla.getText();
        if (auxiliar.equals("0")){
            pantalla.setText("7");
        }
        else{
        pantalla.setText(auxiliar + "7");
        }
    }//GEN-LAST:event_Boton07ActionPerformed

    private void Boton09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton09ActionPerformed
        this.pantalla.setText(this.pantalla.getText()+"9");
    }//GEN-LAST:event_Boton09ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton00;
    private javax.swing.JButton Boton01;
    private javax.swing.JButton Boton02;
    private javax.swing.JButton Boton03;
    private javax.swing.JButton Boton04;
    private javax.swing.JButton Boton05;
    private javax.swing.JButton Boton06;
    private javax.swing.JButton Boton07;
    private javax.swing.JButton Boton08;
    private javax.swing.JButton Boton09;
    private javax.swing.JButton BotonBorrar;
    private javax.swing.JButton BotonDividir;
    private javax.swing.JButton BotonIgual;
    private javax.swing.JButton BotonMas;
    private javax.swing.JButton BotonMenos;
    private javax.swing.JButton BotonPunto;
    private javax.swing.JButton botonMultiplicar;
    private javax.swing.JLabel pantalla;
    // End of variables declaration//GEN-END:variables
}
