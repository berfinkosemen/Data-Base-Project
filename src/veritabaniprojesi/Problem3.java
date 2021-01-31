
package veritabaniprojesi;

public class Problem3 extends javax.swing.JFrame {

    int stok31;
        int ystok3;
        float ialismaliyeti3 ;
        float oran3;
        float son3 = 0;
        float yenimali3=0;
        
    public Problem3() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        ButtonAnaMenuyeDon = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(535, 378));

        ButtonAnaMenuyeDon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ButtonAnaMenuyeDon.setForeground(new java.awt.Color(0, 102, 102));
        ButtonAnaMenuyeDon.setText("Ana Menüye Geri Dön");
        ButtonAnaMenuyeDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAnaMenuyeDonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText(" YENİ KİMYASAL ÜRÜN ÜRET");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setText("Yeni üretilebilecek kimyasal ürünü giriniz");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 153, 255));
        jButton1.setText("Onayla");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Birinci madde");

        jLabel4.setText("ikinci bileşen");

        jLabel5.setText("üçüncü bileşen");

        jLabel6.setText("miktar");

        jLabel7.setText("miktar");

        jLabel8.setText("miktar");

        jButton2.setText("kimyasalurun");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("kubilgileri");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("uretilenurunler");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("alınanhammadde");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel9.setText("Kar oranı");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel10.setText("kaç tane");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ButtonAnaMenuyeDon)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)
                        .addGap(39, 39, 39)
                        .addComponent(jButton3)
                        .addGap(39, 39, 39)
                        .addComponent(jButton4)
                        .addGap(50, 50, 50)
                        .addComponent(jButton5))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addGap(19, 19, 19)
                                            .addComponent(jLabel6)
                                            .addGap(93, 93, 93)
                                            .addComponent(jLabel7)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel8))
                                        .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField3)
                                    .addComponent(jTextField6))
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField4)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(jLabel9))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(55, 55, 55)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ButtonAnaMenuyeDon)
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonAnaMenuyeDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAnaMenuyeDonActionPerformed
        this.hide();
    }//GEN-LAST:event_ButtonAnaMenuyeDonActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        VeritabaniProjesi nesne = new VeritabaniProjesi();
        int rows = nesne.getrows("select* from kimyasalurun");
        int newrows = rows+1;
        String b = jTextField2.getText();
        nesne.ınsertData("INSERT INTO kimyasalurun (uKimyasalUrunID,uKimyasalUrun) VALUES ('"+newrows+"', '"+b+"')");
        
        
        String a = jTextField1.getText();
        String e = jTextField5.getText();
        String g = nesne.query2("SELECT tHammaddeID FROM tedarikcihammaddebilgi "+
                "WHERE tHammaddeAdi = '"+a+"' "
                ,"tedarikcihammaddebilgi");
        nesne.ınsertData("INSERT INTO kubilgileri (uFirmaID,uKimyasalUrunID,uBilesenID,uBilesenMiktar) VALUES ('1', '"+newrows+"','"+g+"', '"+e+"')");
        
        
        String c = jTextField3.getText();
        String f = jTextField6.getText();
        String g2 = nesne.query2("SELECT tHammaddeID FROM tedarikcihammaddebilgi "+
                "WHERE tHammaddeAdi = '"+c+"' "
                ,"tedarikcihammaddebilgi");
        nesne.ınsertData("INSERT INTO kubilgileri (uFirmaID,uKimyasalUrunID,uBilesenID,uBilesenMiktar) VALUES ('1', '"+newrows+"', '"+g2+"', '"+f+"')");
        
        
        String d = jTextField4.getText();
        String h = jTextField7.getText();
        if(d.equals("") == false){
            String g3 = nesne.query2("SELECT tHammaddeID FROM tedarikcihammaddebilgi "+
                "WHERE tHammaddeAdi = '"+d+"' "
                ,"tedarikcihammaddebilgi");
            nesne.ınsertData("INSERT INTO kubilgileri (uFirmaID,uKimyasalUrunID,uBilesenID,uBilesenMiktar) VALUES ('1', '"+newrows+"', '"+g3+"', '"+h+"')");
        }
        
        String kar = jTextField8.getText();
        int kar1 = Integer.parseInt(kar);
        
        float stok31;
        float ystok3;
        
        int e1 = Integer.parseInt(e);
        int f1 = Integer.parseInt(f);
        
        
        String a2 = nesne.query2("SELECT tHammaddeID FROM tedarikcihammaddebilgi " +
                "WHERE tHammaddeAdi = '"+a+"' "
                ,"tedarikcihammaddebilgi");
        
        String b2 = nesne.query2("SELECT tHammaddeID FROM tedarikcihammaddebilgi " +
                "WHERE tHammaddeAdi = '"+c+"' "
                ,"tedarikcihammaddebilgi");
        
        if(d.equals("") != true){
            int h1 = Integer.parseInt(h);
            
            String c2 = nesne.query2("SELECT tHammaddeID FROM tedarikcihammaddebilgi " +
                "WHERE tHammaddeAdi = '"+d+"' "
                ,"tedarikcihammaddebilgi");
            
            String stok3 = nesne.query3("SELECT uStok FROM ureticialinanhammadde "+
                "WHERE uHammaddeID = '"+c2+"' "
                ,"ureticialinanhammadde");
            
            stok31 = Float.parseFloat(stok3);
            ystok3 = stok31-h1;
            
            String alismaliyeti3 = nesne.query4("SELECT uAlisMaliyeti FROM ureticialinanhammadde "+
                "WHERE uHammaddeID = '"+c2+"' "
                ,"ureticialinanhammadde");
            
            nesne.update("UPDATE ureticialinanhammadde SET "+
                "uStok = '"+ystok3+"' " +
                "WHERE uHammaddeID = '"+c2+"' ");
            
            ialismaliyeti3 = Float.parseFloat(alismaliyeti3);
            oran3 = ialismaliyeti3/stok31;
            son3 = oran3*f1;
            yenimali3 = ialismaliyeti3-oran3*f1;
            
            nesne.update("UPDATE ureticialinanhammadde SET "+
                "uAlisMaliyeti = '"+yenimali3+"' " +
                "WHERE uHammaddeID = '"+c2+"' ");
        }
         
        String stok1 = nesne.query3("SELECT uStok FROM ureticialinanhammadde "+
                "WHERE uHammaddeID = '"+a2+"' "
                ,"ureticialinanhammadde");
        
        String stok2 = nesne.query3("SELECT uStok FROM ureticialinanhammadde "+
                "WHERE uHammaddeID = '"+b2+"' "
                ,"ureticialinanhammadde");
        
        Float stok11 = Float.parseFloat(stok1);
        Float stok21 = Float.parseFloat(stok2);
        
        Float ystok1 = stok11 - e1;
        Float ystok2 = stok21 - f1;
        
         String urunadi = nesne.query2("SELECT uKimyasalUrunID FROM kimyasalurun " +
                "WHERE uKimyasalUrun = '"+b+"' "
                ,"kimyasalurun");
        
        String alismaliyeti1 = nesne.query4("SELECT uAlisMaliyeti FROM ureticialinanhammadde "+
                "WHERE uHammaddeID = '"+a2+"' "
                ,"ureticialinanhammadde");
        
        String alismaliyeti2 = nesne.query4("SELECT uAlisMaliyeti FROM ureticialinanhammadde "+
                "WHERE uHammaddeID = '"+b2+"' "
                ,"ureticialinanhammadde");
        
        nesne.update("UPDATE ureticialinanhammadde SET "+
                "uStok = '"+ystok1+"' " +
                "WHERE uHammaddeID = '"+a2+"' ");
        
        nesne.update("UPDATE ureticialinanhammadde SET "+
                "uStok = '"+ystok2+"' " +
                "WHERE uHammaddeID = '"+b2+"' ");
        
        
        String miktars = jTextField9.getText();
        int miktar = Integer.parseInt(miktars);
      /*  if(b.equals("NH3")){
            miktar = e1;
        }
        if(b.equals("CO2")){
            miktar = e1;
        }
        if(b.equals("SO2")){
            miktar = e1;
        }
        if(b.equals("C6H12O6")){
            miktar = e1/6;
        }
        if(b.equals("HCL")){
            miktar = e1;
        }*/
        
        

        
        
        
        float ialismaliyeti1 = Float.parseFloat(alismaliyeti1);
        float ialismaliyeti2 = Float.parseFloat(alismaliyeti2);
        
        float oran1 = ialismaliyeti1/stok11;
        float son1 = oran1*e1;
        float oran2 = ialismaliyeti2/stok21;
        float son2 = oran2*f1;
        float yenimali1 = ialismaliyeti1-oran1*e1;
        float yenimali2 = ialismaliyeti2-oran2*f1;

        //int imiktar = Integer.parseInt(miktar);
        int IscilikMaliyeti = miktar*1;
        float toplamMaliyet;
        
        if(c.equals("") != true){
            toplamMaliyet = son1+ son2 +son3+ IscilikMaliyeti;
        }else{
            toplamMaliyet = son1+ son2+ IscilikMaliyeti;
        }

        float satisFiyati = toplamMaliyet + toplamMaliyet*kar1/100;
        
        
        if(urunadi.equals(null) == false){
             nesne.update("UPDATE ureticialinanhammadde SET "+
                "uAlisMaliyeti = '"+yenimali1+"' " +
                "WHERE uHammaddeID = '"+a2+"' ");
            nesne.update("UPDATE ureticialinanhammadde SET "+
                "uAlisMaliyeti = '"+yenimali2+"' " +
                "WHERE uHammaddeID = '"+b2+"' ");
        
            nesne.ınsertData("INSERT INTO uretilenurunler (uFirmaID,uKimyasalUrunID,uUretimTarihi,uUrunMiktari,uRafOmru,uUrunSatisFiyati,uTumIscilikMaliyeti,uToplamMaliyet)"+
                " VALUES ('1', '"+newrows+"','1234','"+miktar+"','1','"+satisFiyati+"','"+IscilikMaliyeti+"','"+toplamMaliyet+"')");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        VeritabaniProjesi nesne = new VeritabaniProjesi();
        nesne.kimyasalurun();  
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        VeritabaniProjesi nesne = new VeritabaniProjesi();
        nesne.kubilgileri();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        VeritabaniProjesi nesne = new VeritabaniProjesi();
        nesne.uretilenurunler();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        VeritabaniProjesi nesne = new VeritabaniProjesi();
        nesne.ureticialinanhammadde();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Problem3().setVisible(true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
