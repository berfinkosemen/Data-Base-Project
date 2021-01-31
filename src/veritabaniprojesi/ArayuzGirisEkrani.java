
package veritabaniprojesi;

public class ArayuzGirisEkrani extends javax.swing.JFrame {

    public ArayuzGirisEkrani() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ureticitedarikci = new javax.swing.JButton();
        ureticimusteri = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ureticitedarikci.setBackground(new java.awt.Color(204, 255, 204));
        ureticitedarikci.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        ureticitedarikci.setForeground(new java.awt.Color(102, 0, 0));
        ureticitedarikci.setText("Üretici Firma - Tedarikçi Firma");
        ureticitedarikci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ureticitedarikciActionPerformed(evt);
            }
        });

        ureticimusteri.setBackground(new java.awt.Color(204, 255, 204));
        ureticimusteri.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        ureticimusteri.setForeground(new java.awt.Color(102, 0, 0));
        ureticimusteri.setText("Üretici Firma - Müşteri");
        ureticimusteri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ureticimusteriActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ureticitedarikci, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ureticimusteri, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(128, Short.MAX_VALUE)
                .addComponent(ureticitedarikci, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(ureticimusteri, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ureticitedarikciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ureticitedarikciActionPerformed
        String[] args = {" "};
        UreticiFirmaVeTedarikciFirma.main(args);
    }//GEN-LAST:event_ureticitedarikciActionPerformed

    private void ureticimusteriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ureticimusteriActionPerformed
        String[] args = {" "};
        UreticiFirmaVeMusteri.main(args);
    }//GEN-LAST:event_ureticimusteriActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ArayuzGirisEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ureticimusteri;
    private javax.swing.JButton ureticitedarikci;
    // End of variables declaration//GEN-END:variables
}
