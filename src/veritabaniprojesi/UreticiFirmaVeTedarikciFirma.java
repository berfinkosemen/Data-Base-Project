
package veritabaniprojesi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class UreticiFirmaVeTedarikciFirma extends javax.swing.JFrame {
  
    public UreticiFirmaVeTedarikciFirma() {
        initComponents();
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonAnaMenuyeDon = new javax.swing.JButton();
        problem3 = new javax.swing.JButton();
        problem4 = new javax.swing.JButton();
        problem1 = new javax.swing.JButton();
        problem2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ButtonAnaMenuyeDon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ButtonAnaMenuyeDon.setForeground(new java.awt.Color(0, 102, 102));
        ButtonAnaMenuyeDon.setText("Ana Menüye Geri Dön");
        ButtonAnaMenuyeDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAnaMenuyeDonActionPerformed(evt);
            }
        });

        problem3.setBackground(new java.awt.Color(204, 255, 255));
        problem3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        problem3.setForeground(new java.awt.Color(0, 153, 102));
        problem3.setText("Problem 3");
        problem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                problem3ActionPerformed(evt);
            }
        });

        problem4.setBackground(new java.awt.Color(204, 255, 255));
        problem4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        problem4.setForeground(new java.awt.Color(0, 153, 102));
        problem4.setText("Problem 4");
        problem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                problem4ActionPerformed(evt);
            }
        });

        problem1.setBackground(new java.awt.Color(204, 255, 255));
        problem1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        problem1.setForeground(new java.awt.Color(0, 153, 102));
        problem1.setText("Problem 1");
        problem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                problem1ActionPerformed(evt);
            }
        });

        problem2.setBackground(new java.awt.Color(204, 255, 255));
        problem2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        problem2.setForeground(new java.awt.Color(0, 153, 102));
        problem2.setText("Problem 2");
        problem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                problem2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonAnaMenuyeDon)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(problem3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(problem4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(problem1)
                        .addGap(63, 63, 63)
                        .addComponent(problem2)))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(ButtonAnaMenuyeDon)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(problem1)
                    .addComponent(problem2))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(problem3)
                    .addComponent(problem4))
                .addContainerGap(157, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonAnaMenuyeDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAnaMenuyeDonActionPerformed
        // TODO add your handling code here:
        this.hide();
        //  ArayuzGirisEkrani frm = new ArayuzGirisEkrani();
        //  frm.setVisible(true);
    }//GEN-LAST:event_ButtonAnaMenuyeDonActionPerformed

    private void problem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_problem1ActionPerformed
        // TODO add your handling code here:
        String[] args = {" "};
        Problem1.main(args);
    }//GEN-LAST:event_problem1ActionPerformed

    private void problem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_problem2ActionPerformed
        // TODO add your handling code here:
        String[] args = {" "};
        Problem2.main(args);
    }//GEN-LAST:event_problem2ActionPerformed

    private void problem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_problem3ActionPerformed
        // TODO add your handling code here:
        String[] args = {" "};
        Problem3.main(args);
    }//GEN-LAST:event_problem3ActionPerformed

    private void problem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_problem4ActionPerformed
        // TODO add your handling code here:
        String[] args = {" "};
        Problem4.main(args);
    }//GEN-LAST:event_problem4ActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UreticiFirmaVeTedarikciFirma().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAnaMenuyeDon;
    private javax.swing.JButton problem1;
    private javax.swing.JButton problem2;
    private javax.swing.JButton problem3;
    private javax.swing.JButton problem4;
    // End of variables declaration//GEN-END:variables
}
