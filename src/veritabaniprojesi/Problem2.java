//USE proje3;
package veritabaniprojesi;

public class Problem2 extends javax.swing.JFrame {

    public Problem2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonAnaMenuyeDon = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ButtonAnaMenuyeDon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ButtonAnaMenuyeDon.setForeground(new java.awt.Color(0, 102, 102));
        ButtonAnaMenuyeDon.setText("Ana Menüye Geri Dön");
        ButtonAnaMenuyeDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAnaMenuyeDonActionPerformed(evt);
            }
        });

        jLabel1.setText("Kimyasal Ürün Üret");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Birinci Bileşen");

        jLabel3.setText("İkinci Bileşen");

        jLabel4.setText("Üçüncü Bileşen");

        jLabel5.setText("miktarı");

        jLabel6.setText("miktarı");

        jLabel7.setText("miktar");

        jButton1.setText("oluştur");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Alınan Hammadde");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setText("kar oranı");

        jButton3.setText("Uretilen Ürünler");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(65, 65, 65)
                        .addComponent(jButton3)
                        .addGap(274, 274, 274))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(70, 70, 70)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(30, 30, 30)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(46, 46, 46)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton1)
                                        .addComponent(jLabel8)
                                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(164, 164, 164))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(105, 105, 105)
                                    .addComponent(ButtonAnaMenuyeDon)
                                    .addGap(130, 130, 130)))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel5)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(74, 74, 74)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ButtonAnaMenuyeDon)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(1, 1, 1)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonAnaMenuyeDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAnaMenuyeDonActionPerformed
        this.hide();       
    }//GEN-LAST:event_ButtonAnaMenuyeDonActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed

    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        float stok31;
        float ystok3;
        float ialismaliyeti3 ;
        float oran3;
        float son3 = 0;
        float yenimali3=0;
        
        String a = jTextField1.getText();
        String b = jTextField2.getText();
        String c = jTextField3.getText();
        String d = jTextField4.getText();
        String e = jTextField5.getText();
        String f = jTextField6.getText();
        String g = jTextField7.getText();
        String kar = jTextField8.getText();
        
        int d1 = Integer.parseInt(d);
        int e1 = Integer.parseInt(e);
        int kar1 = Integer.parseInt(kar);
        

        
        VeritabaniProjesi nesne = new VeritabaniProjesi();
      
        
        String a2 = nesne.query2("SELECT tHammaddeID FROM tedarikcihammaddebilgi " +
                "WHERE tHammaddeAdi = '"+a+"' "
                ,"tedarikcihammaddebilgi");
        
        String b2 = nesne.query2("SELECT tHammaddeID FROM tedarikcihammaddebilgi " +
                "WHERE tHammaddeAdi = '"+b+"' "
                ,"tedarikcihammaddebilgi");
        
        if(c.equals("") != true){
            int f1 = Integer.parseInt(f);
            
            String c2 = nesne.query2("SELECT tHammaddeID FROM tedarikcihammaddebilgi " +
                "WHERE tHammaddeAdi = '"+c+"' "
                ,"tedarikcihammaddebilgi");
            
            String stok3 = nesne.query3("SELECT uStok FROM ureticialinanhammadde "+
                "WHERE uHammaddeID = '"+c2+"' "
                ,"ureticialinanhammadde");
            
            stok31 = Float.parseFloat(stok3);
            ystok3 = stok31-f1;
            
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
        
        float stok11 = Float.parseFloat(stok1);
        float stok21 = Float.parseFloat(stok2);
        
        float ystok1 = stok11 - d1;
        float ystok2 = stok21 - e1;
        
        //fiyatlar
        String urunadi = nesne.query2("SELECT uKimyasalUrunID FROM kimyasalurun " +
                "WHERE uKimyasalUrun = '"+g+"' "
                ,"kimyasalurun");
        
        /*String miktar = nesne.query2("SELECT uUrunMiktari FROM uretilenUrunler " +
                "WHERE uKimyasalUrunID = '"+urunadi+"' "
                ,"tedarikcihammaddebilgi");*/
        
        String alismaliyeti1 = nesne.query4("SELECT uAlisMaliyeti FROM ureticialinanhammadde "+
                "WHERE uHammaddeID = '"+a2+"' "
                ,"ureticialinanhammadde");
        
        String alismaliyeti2 = nesne.query4("SELECT uAlisMaliyeti FROM ureticialinanhammadde "+
                "WHERE uHammaddeID = '"+b2+"' "
                ,"ureticialinanhammadde");

        //fiyatlarbitiş
        
        nesne.update("UPDATE ureticialinanhammadde SET "+
                "uStok = '"+ystok1+"' " +
                "WHERE uHammaddeID = '"+a2+"' ");
        
        nesne.update("UPDATE ureticialinanhammadde SET "+
                "uStok = '"+ystok2+"' " +
                "WHERE uHammaddeID = '"+b2+"' ");
        
        
        
        int miktar = 0;
        if(g.equals("NH3")){
            miktar = d1;
        }
        if(g.equals("CO2")){
            miktar = d1;
        }
        if(g.equals("SO2")){
            miktar = d1;
        }
        if(g.equals("C6H12O6")){
            miktar = d1/6;
        }
        if(g.equals("HCL")){
            miktar = d1;
        }
        
        

        
        
        
        float ialismaliyeti1 = Float.parseFloat(alismaliyeti1);
        float ialismaliyeti2 = Float.parseFloat(alismaliyeti2);
        
        float oran1 = ialismaliyeti1/stok11;
        float son1 = oran1*d1;
        float oran2 = ialismaliyeti2/stok21;
        float son2 = oran2*e1;
        float yenimali1 = ialismaliyeti1-oran1*d1;
        float yenimali2 = ialismaliyeti2-oran2*e1;

        //int imiktar = Integer.parseInt(miktar);
        int IscilikMaliyeti = miktar*1;
        float toplamMaliyet;
        
        if(c.equals("") != true){
            toplamMaliyet = son1+ son2 +son3+ IscilikMaliyeti;
        }else{
            toplamMaliyet = son1+ son2+ IscilikMaliyeti;
        }

        
        if(urunadi.equals(null) == false){
            String ıd = nesne.query4("SELECT uAlisMaliyeti FROM ureticialinanhammadde "+
                "WHERE uHammaddeID = '"+urunadi+"' "
                ,"ureticialinanhammadde");
            String esliMaliyet = nesne.query3("SELECT uToplamMaliyet FROM uretilenurunler "+
                "WHERE uKimyasalUrunID = '"+urunadi+"' "
                ,"uretilenurunler");
            String eskiIscilik = nesne.query4("SELECT uTumIscilikMaliyeti FROM uretilenurunler "+
                "WHERE uKimyasalUrunID = '"+urunadi+"' "
                ,"uretilenurunler");
            String eskiuretimTarihi = nesne.query5("SELECT uUretimTarihi FROM uretilenurunler "+
                "WHERE uKimyasalUrunID = '"+urunadi+"' "
                ,"uretilenurunler");
            String eskiRafOmru = nesne.query6("SELECT uRafOmru FROM uretilenurunler "+
                "WHERE uKimyasalUrunID = '"+urunadi+"' "
                ,"uretilenurunler");
            String eskiMiktar = nesne.query2("SELECT uUrunMiktari FROM uretilenurunler "+
                "WHERE uKimyasalUrunID = '"+urunadi+"' "
                ,"uretilenurunler");
            
            float eskiIscilik1 = Float.parseFloat(eskiIscilik);
            float eskiMaliyet1 = Float.parseFloat(esliMaliyet);
            float eskimiktar1 = Float.parseFloat(eskiMiktar);
            
            float soniscilik = eskiIscilik1+IscilikMaliyeti;
            float sonmaliyet = eskiMaliyet1+toplamMaliyet;
            float sonmiktar = eskimiktar1+miktar;
            
            float satisFiyati = sonmaliyet + sonmaliyet*kar1/100;
            

            
            nesne.update("UPDATE uretilenurunler SET "+
                "uUretimTarihi = '12519', " +
                "uUrunMiktari = '"+sonmiktar+"', "+
                "uFirmaID = '1', "+
                "uRafOmru = '1', "+
                "uTumIscilikMaliyeti = '"+soniscilik+"', "+
                "uToplamMaliyet = '"+sonmaliyet+"', "+
                "uUrunSatisFiyati = '"+satisFiyati+"' "+
                "WHERE uKimyasalUrunID = '"+urunadi+"' ");
            
            nesne.update("UPDATE ureticialinanhammadde SET "+
                "uAlisMaliyeti = '"+yenimali1+"' " +
                "WHERE uHammaddeID = '"+a2+"' ");
            nesne.update("UPDATE ureticialinanhammadde SET "+
                "uAlisMaliyeti = '"+yenimali2+"' " +
                "WHERE uHammaddeID = '"+b2+"' ");
 
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         VeritabaniProjesi nesne = new VeritabaniProjesi();
         nesne.ureticialinanhammadde();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        VeritabaniProjesi nesne = new VeritabaniProjesi();
         nesne.uretilenurunler();
    }//GEN-LAST:event_jButton3ActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Problem2().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAnaMenuyeDon;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
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
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
