
package veritabaniprojesi;

public class Problem4 extends javax.swing.JFrame {

    public Problem4() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonAnaMenuyeDon = new javax.swing.JButton();
        ButtonYeniMusteriEkle = new javax.swing.JButton();
        ButtonYeniTedarikciEkle = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ButtonAnaMenuyeDon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ButtonAnaMenuyeDon.setForeground(new java.awt.Color(0, 102, 102));
        ButtonAnaMenuyeDon.setText("Ana Menüye Geri Dön");
        ButtonAnaMenuyeDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAnaMenuyeDonActionPerformed(evt);
            }
        });

        ButtonYeniMusteriEkle.setBackground(new java.awt.Color(255, 204, 204));
        ButtonYeniMusteriEkle.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        ButtonYeniMusteriEkle.setForeground(new java.awt.Color(102, 102, 0));
        ButtonYeniMusteriEkle.setText("Yeni Tedarikçi Ekle ");
        ButtonYeniMusteriEkle.setMargin(new java.awt.Insets(8, 16, 8, 16));
        ButtonYeniMusteriEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonYeniMusteriEkleActionPerformed(evt);
            }
        });

        ButtonYeniTedarikciEkle.setBackground(new java.awt.Color(255, 204, 204));
        ButtonYeniTedarikciEkle.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        ButtonYeniTedarikciEkle.setForeground(new java.awt.Color(102, 102, 0));
        ButtonYeniTedarikciEkle.setText("Yeni Müşteri Ekle");
        ButtonYeniTedarikciEkle.setMargin(new java.awt.Insets(8, 16, 8, 16));
        ButtonYeniTedarikciEkle.setMaximumSize(new java.awt.Dimension(167, 39));
        ButtonYeniTedarikciEkle.setMinimumSize(new java.awt.Dimension(167, 39));
        ButtonYeniTedarikciEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonYeniTedarikciEkleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonAnaMenuyeDon)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonYeniMusteriEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(140, 140, 140))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ButtonYeniTedarikciEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(ButtonAnaMenuyeDon)
                .addGap(88, 88, 88)
                .addComponent(ButtonYeniMusteriEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ButtonYeniTedarikciEkle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonAnaMenuyeDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAnaMenuyeDonActionPerformed
        this.hide();
    }//GEN-LAST:event_ButtonAnaMenuyeDonActionPerformed

    private void ButtonYeniTedarikciEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonYeniTedarikciEkleActionPerformed
        String[] args = {" "};
        Problem4TedarikciEkle.main(args);
    }//GEN-LAST:event_ButtonYeniTedarikciEkleActionPerformed

    private void ButtonYeniMusteriEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonYeniMusteriEkleActionPerformed
        String[] args = {" "};
        Problem4MusteriEkle.main(args);
    }//GEN-LAST:event_ButtonYeniMusteriEkleActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Problem4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAnaMenuyeDon;
    private javax.swing.JButton ButtonYeniMusteriEkle;
    private javax.swing.JButton ButtonYeniTedarikciEkle;
    // End of variables declaration//GEN-END:variables
}
