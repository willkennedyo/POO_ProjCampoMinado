package view;

import javax.swing.JButton;

/**
 *
 * @author willian
 */
public class ViewMain extends javax.swing.JFrame {

    public ViewMain() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPref = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        pnlInit = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btn12x12 = new javax.swing.JButton();
        btn8x8 = new javax.swing.JButton();
        btn16x16 = new javax.swing.JButton();
        btnPref = new javax.swing.JButton();

        pnlPref.setPreferredSize(new java.awt.Dimension(381, 274));

        jTextField1.setText("jTextField1");

        javax.swing.GroupLayout pnlPrefLayout = new javax.swing.GroupLayout(pnlPref);
        pnlPref.setLayout(pnlPrefLayout);
        pnlPrefLayout.setHorizontalGroup(
            pnlPrefLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrefLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(182, Short.MAX_VALUE))
        );
        pnlPrefLayout.setVerticalGroup(
            pnlPrefLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrefLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(176, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projeto Campo Minado");
        setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        setMaximumSize(new java.awt.Dimension(380, 320));
        setMinimumSize(new java.awt.Dimension(380, 320));
        setName("MainFrame"); // NOI18N
        setResizable(false);

        pnlInit.setName(""); // NOI18N

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setText("Escolha o Tabuleiro:");

        btn12x12.setText("<html><h3 style=\"text-align: center;\"><strong>12 x 12</strong></h3> <p style=\"text-align: center;\"><strong>23</strong> Minas</p></html>");
        btn12x12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn12x12.setFocusable(false);
        btn12x12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12x12ActionPerformed(evt);
            }
        });

        btn8x8.setText("<html><h3 style=\"text-align: center;\"><strong>8 x 8</strong></h3> <p style=\"text-align: center;\"><strong>10</strong> Minas</p></html>");
        btn8x8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn8x8.setFocusable(false);

        btn16x16.setText("<html><h3 style=\"text-align: center;\"><strong>16 x 16</strong></h3> <p style=\"text-align: center;\"><strong>40</strong> Minas</p></html>");
        btn16x16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn16x16.setFocusable(false);

        btnPref.setText("<html><h3 style=\"text-align: center;\"><strong>Sobre</strong></h3> <p style=\"text-align: center;\"> Detalhes do desenvolvimento</p></html>");
        btnPref.setActionCommand("");
        btnPref.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnPref.setFocusable(false);

        javax.swing.GroupLayout pnlInitLayout = new javax.swing.GroupLayout(pnlInit);
        pnlInit.setLayout(pnlInitLayout);
        pnlInitLayout.setHorizontalGroup(
            pnlInitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInitLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlInitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInitLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lblTitulo))
                    .addGroup(pnlInitLayout.createSequentialGroup()
                        .addGroup(pnlInitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn8x8, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn16x16, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlInitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnPref, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(btn12x12, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))))
                .addGap(79, 79, 79))
        );
        pnlInitLayout.setVerticalGroup(
            pnlInitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInitLayout.createSequentialGroup()
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addGroup(pnlInitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn8x8, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                    .addComponent(btn12x12, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnlInitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPref, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn16x16, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(pnlInit, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlInit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn12x12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12x12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn12x12ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn12x12;
    private javax.swing.JButton btn16x16;
    private javax.swing.JButton btn8x8;
    private javax.swing.JButton btnPref;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlInit;
    private javax.swing.JPanel pnlPref;
    // End of variables declaration//GEN-END:variables


    //Get e Set

    public JButton getBtn16x16() {
        return btn16x16;
    }

    public void setBtn16x16(JButton btn16x16) {
        this.btn16x16 = btn16x16;
    }

    public JButton getBtn12x12() {
        return btn12x12;
    }

    public void setBtn12x12(JButton btn12x12) {
        this.btn12x12 = btn12x12;
    }

    public JButton getBtn8x8() {
        return btn8x8;
    }

    public void setBtn8x8(JButton btn8x8) {
        this.btn8x8 = btn8x8;
    }

    public JButton getBtnPref() {
        return btnPref;
    }

    public void setBtnPref(JButton btnPref) {
        this.btnPref = btnPref;
    }
    
    
}
