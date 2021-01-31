//USE proje3;
package veritabaniprojesi;


public class Problem1 extends javax.swing.JFrame {
    
    float alis_maliyeti = 0;
    float kargo_maliyet = 0;

    public Problem1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ButtonAnaMenuyeDon = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("Ürün satın ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setText("Alınacak ürün");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setText("Alınacak ürünün");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setText("alınacak tedarikçi");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel5.setText("Adedi");

        ButtonAnaMenuyeDon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ButtonAnaMenuyeDon.setForeground(new java.awt.Color(0, 102, 102));
        ButtonAnaMenuyeDon.setText("Ana Menüye Geri Dön");
        ButtonAnaMenuyeDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAnaMenuyeDonActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 255));
        jButton1.setText("Onayla");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ürün Bilgisi");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("alınanhammadde");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("tedarikcibilgi");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("tedariikcihammadde");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("hammaddebilgi");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton8.setText("Alış Maliyetlri Hesapla");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel8.setText("tarih");

        jButton7.setText("onay");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(9, 9, 9)
                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jButton2)
                                                    .addComponent(jLabel1))))
                                        .addGap(3, 3, 3)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(56, 56, 56)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel2)
                                                        .addGap(86, 86, 86)
                                                        .addComponent(jLabel5))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(159, 159, 159)
                                                        .addComponent(jLabel3))))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(55, 55, 55)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(10, 10, 10))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton1)
                                            .addComponent(jButton8)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton6)))
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ButtonAnaMenuyeDon))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(ButtonAnaMenuyeDon))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonAnaMenuyeDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAnaMenuyeDonActionPerformed
         this.hide();
    }//GEN-LAST:event_ButtonAnaMenuyeDonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        VeritabaniProjesi nesne = new VeritabaniProjesi();
        nesne.product_query();       
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String a = jTextField1.getText();
        String b = jTextField2.getText();
        String c = jTextField3.getText();
       
        int c1 = Integer.parseInt(c);
        
        VeritabaniProjesi nesne = new VeritabaniProjesi();
        
        
        String d = nesne.query2("SELECT tFirmaID FROM tedarikcibilgi " +
                "WHERE tFirmaAdi = '"+a+"' "
                ,"tedarikcibilgi");
        
        String e = nesne.query2("SELECT tHammaddeID FROM tedarikcihammaddebilgi "+
                "WHERE tHammaddeAdi = '"+b+"' "
                ,"tedarikcihammaddebilgi");
        
        String f = nesne.query2("SELECT tMiktar FROM tedarikcihammadde "+
                "WHERE tFirmaID = '"+d+"' "+
                "AND tHammaddeID = '"+e+"' "
                ,"tedarikcihammadde");
        
        String l = nesne.query3("SELECT tSatisFiyati FROM tedarikcihammadde "+
            "WHERE tFirmaID = '"+d+"' "+
            "AND tHammaddeID = '"+e+"' "
            ,"tedarikcihammadde");
        
        

        
        int f1 = Integer.parseInt(f);
        int s1 = f1-c1;
        

        
        
        if(s1 <= 0){
            c1 = f1;
            jLabel7.setText(""+f1+"tane alındı");
            nesne.deleteFromTable("DELETE FROM tedarikcihammadde "+
                "WHERE tFirmaID = '"+d+"' "+
                "AND tHammaddeID = '"+e+"' ");
        }
        else{
            nesne.update("UPDATE tedarikcihammadde SET "+
                "tMiktar = '"+s1+"' " +
                "WHERE tFirmaID = '"+d+"' "+
                "AND tHammaddeID = '"+e+"' ");
        }
        
        
        int flag = nesne.stok("SELECT uHammaddeID FROM ureticialinanhammadde ","ureticialinanhammadde",e);
            

        String g ;
        String h = null;
            
        if(flag == 0){
            float l1 = Float.parseFloat(l);
            float alis = l1*c1;
            nesne.ınsertData("INSERT INTO ureticialinanhammadde (uFirmaID,uHammaddeID,uMiktar,uStok,uAlisMaliyeti) VALUES ('1','"+e+"','"+c+"','"+c+"','"+alis+"')");
        }
        else{
            g = nesne.query2("SELECT uMiktar FROM ureticialinanhammadde "+
                "WHERE uHammaddeID = '"+e+"' "
                ,"ureticialinanhammadde");
            
            h = nesne.query3("SELECT uStok FROM ureticialinanhammadde "+
                "WHERE uHammaddeID = '"+e+"' "
                ,"ureticialinanhammadde");
            

        
            float g1 = Float.parseFloat(g);
            float h1 = Float.parseFloat(h);
        
            float s2 = c1+h1;
            float s3 = g1+c1;
        

        
               
            String k = nesne.query4("SELECT uAlisMaliyeti FROM ureticialinanhammadde "+
                "WHERE uHammaddeID = '"+e+"' "
                ,"ureticialinanhammadde");
       
        

       
            float k1 = Float.parseFloat(k);
            float l1 = Float.parseFloat(l);
        

            float yeni_maliyet = kargo_maliyet + l1*c1 + k1;
        

        
            nesne.update("UPDATE ureticialinanhammadde SET "+
                "uMiktar = '"+s3+"', " +
                "uStok = '"+s2+"', " +
                "uAlisMaliyeti = '"+yeni_maliyet+"' " +
                "WHERE uHammaddeID = '"+e+"' ");
        }
                
        
        
        
       

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        VeritabaniProjesi nesne = new VeritabaniProjesi();
        nesne.ureticialinanhammadde();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        VeritabaniProjesi nesne = new VeritabaniProjesi();
        nesne.tedarikcibilgi();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       VeritabaniProjesi nesne = new VeritabaniProjesi();
        nesne.tedarikcihammadde();     
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       VeritabaniProjesi nesne = new VeritabaniProjesi();
        nesne.tedarikcihammaddebilgi(); 
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
        VeritabaniProjesi nesne = new VeritabaniProjesi();

        String a = jTextField2.getText();
        String h = jTextField1.getText();
        String j = jTextField3.getText();

        String b = nesne.query2("SELECT tFirmaID FROM tedarikcibilgi " +
            "WHERE tFirmaAdi = '"+h+"' "
            ,"tedarikcibilgi");
        String c = nesne.query2("SELECT tHammaddeID FROM tedarikcihammaddebilgi "+
            "WHERE tHammaddeAdi = '"+a+"' "
            ,"tedarikcihammaddebilgi");
        String d = nesne.query3("SELECT tSatisFiyati FROM tedarikcihammadde "+
            "WHERE tFirmaID = '"+b+"' "+
            "AND tHammaddeID = '"+c+"' "
            ,"tedarikcihammadde");
        String e = nesne.query3("SELECT tUlkeAdi FROM tedarikcibilgi " +
            "WHERE tFirmaAdi = '"+h+"' "
            ,"tedarikcibilgi");
        String f = nesne.query4("SELECT tSehirMerkezi FROM tedarikcibilgi " +
            "WHERE tFirmaAdi = '"+h+"' "
            ,"tedarikcibilgi");
        String g = nesne.query2("SELECT mesafe FROM mesafebilgi "+
            "WHERE tFirmaID = '"+b+"' "
            ,"mesafebilgi");
        int g1 = Integer.parseInt(g);
        int d1 = Integer.parseInt(d);
        int j1 = Integer.parseInt(j);

        if(e.equals("TURKIYE")){
            kargo_maliyet = g1/2;
            alis_maliyeti = kargo_maliyet + d1*j1;
        }
        if(e.equals("TURKIYE") == false){
            kargo_maliyet = g1;
            alis_maliyeti = kargo_maliyet + d1*j1;
        }
        
         jLabel6.setText(""+alis_maliyeti);  
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        VeritabaniProjesi nesne = new VeritabaniProjesi();
        String tarih = jTextField4.getText();
        int tarih1 = Integer.parseInt(tarih);      
        int flag1 = nesne.tarih("SELECT * FROM tedarikcihammadde ","tedarikcihammadde",tarih1);
    }//GEN-LAST:event_jButton7ActionPerformed


    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Problem1().setVisible(true);
            }     
        });
        
            
     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAnaMenuyeDon;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
