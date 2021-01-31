
package veritabaniprojesi;

public class Problem5 extends javax.swing.JFrame {

    public Problem5() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonAnaMenuyeDon = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ButtonAnaMenuyeDon.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ButtonAnaMenuyeDon.setForeground(new java.awt.Color(0, 102, 102));
        ButtonAnaMenuyeDon.setText("Ana Menüye Geri Dön");
        ButtonAnaMenuyeDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAnaMenuyeDonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("Sipariş etmek istediğiniz kimyasal ürünün adını giriniz");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setText("Sipariş etmek istediğiniz ürün miktarını giriniz");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setText("Üreticinin kar oranı");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
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

        jButton2.setText("Tedarikçi Hammadde");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Alınan Hammadde");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Üretilen Ürünler");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jLabel1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(30, 30, 30)
                                .addComponent(jButton3))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)))
                        .addGap(28, 28, 28)
                        .addComponent(jButton4)))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ButtonAnaMenuyeDon)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(ButtonAnaMenuyeDon)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(53, 53, 53)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonAnaMenuyeDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAnaMenuyeDonActionPerformed
        this.hide();
    }//GEN-LAST:event_ButtonAnaMenuyeDonActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String a = jTextField1.getText();
        String b = jTextField2.getText();
        int b1 = Integer.parseInt(b);
        
        String miktar;
        
        VeritabaniProjesi nesne = new VeritabaniProjesi();
        
        String urunıd = nesne.query2("SELECT uKimyasalUrunID FROM kimyasalurun " +
            "WHERE uKimyasalUrun = '"+a+"' "
            ,"kimyasalurun");
        
        int flag = nesne.urunler8("SELECT uKimyasalUrunID FROM uretilenurunler ","uretilenurunler",urunıd);
        
        if(flag == 0){
            miktar = "0";
        }
        else{
            miktar = nesne.query2("SELECT uUrunMiktari FROM uretilenurunler "+
                    "WHERE uKimyasalUrunID = '"+urunıd+"' "
                    ,"uretilenurunler");
        }
        
        
        float miktari = Float.parseFloat(miktar);
        float s = miktari- b1;       
        String bir_bilesen = null;
        String iki_bilesen = null;
        String uc_bilesen = null;

        float sayi1=0;
        float sayi2=0;
        float sayi3=0;       
        
        if(s <0){
            if(a.equals("NH3")){
               sayi1 = 1*s*(-1);
               sayi2 = 3*s*(-1);
            }
            if(a.equals("CO2")){
               sayi1 = 1*s*(-1);
               sayi2 = 2*s*(-1);
            }
            if(a.equals("SO2")){
                sayi1 = 1*s*(-1);
                sayi2 = 2*s*(-1);
            }
            if(a.equals("C6H12O6")){
                sayi1 = 6*s*(-1);
                sayi2 = 12*s*(-1);
                sayi3 = 6*s*(-1);
            }
            if(a.equals("HCL")){
                sayi1 = 1*s*(-1);
                sayi2 = 1*s*(-1);
            }
            
            
            if(a.equals("NH3")){
                bir_bilesen = nesne.query2("SELECT tHammaddeID FROM tedarikcihammaddebilgi " +
                    "WHERE tHammaddeAdi = 'N' "
                    ,"tedarikcihammaddebilgi");
                iki_bilesen  = nesne.query2("SELECT tHammaddeID FROM tedarikcihammaddebilgi " +
                    "WHERE tHammaddeAdi = 'H' "
                    ,"tedarikcihammaddebilgi");
            }
            
            if(a.equals("CO2")){
                bir_bilesen = nesne.query2("SELECT tHammaddeID FROM tedarikcihammaddebilgi " +
                    "WHERE tHammaddeAdi = 'C' "
                    ,"tedarikcihammaddebilgi");
                iki_bilesen  = nesne.query2("SELECT tHammaddeID FROM tedarikcihammaddebilgi " +
                    "WHERE tHammaddeAdi = 'O' "
                    ,"tedarikcihammaddebilgi");
            }

            if(a.equals("SO2")){
                bir_bilesen = nesne.query2("SELECT tHammaddeID FROM tedarikcihammaddebilgi " +
                    "WHERE tHammaddeAdi = 'S' "
                    ,"tedarikcihammaddebilgi");
                iki_bilesen  = nesne.query2("SELECT tHammaddeID FROM tedarikcihammaddebilgi " +
                    "WHERE tHammaddeAdi = 'O' "
                    ,"tedarikcihammaddebilgi");
            }

            if(a.equals("C6H12O6")){
                bir_bilesen = nesne.query2("SELECT tHammaddeID FROM tedarikcihammaddebilgi " +
                    "WHERE tHammaddeAdi = 'C' "
                    ,"tedarikcihammaddebilgi");
                iki_bilesen  = nesne.query2("SELECT tHammaddeID FROM tedarikcihammaddebilgi " +
                    "WHERE tHammaddeAdi = 'H' "
                    ,"tedarikcihammaddebilgi");
                uc_bilesen = nesne.query2("SELECT tHammaddeID FROM tedarikcihammaddebilgi " +
                    "WHERE tHammaddeAdi = 'O' "
                    ,"tedarikcihammaddebilgi");
            }

            if(a.equals("HCL")){
                bir_bilesen = nesne.query2("SELECT tHammaddeID FROM tedarikcihammaddebilgi " +
                    "WHERE tHammaddeAdi = 'H' "
                    ,"tedarikcihammaddebilgi");
                iki_bilesen  = nesne.query2("SELECT tHammaddeID FROM tedarikcihammaddebilgi " +
                    "WHERE tHammaddeAdi = 'CL' "
                    ,"tedarikcihammaddebilgi");
            }

            
            float stok31;
            float ystok3;
            float ialismaliyeti3 ;
            float oran3;
            float son3 = 0;
            float yenimali3=0;
        
            if(sayi3 != 0){
                int flag3 = nesne.stok("SELECT uHammaddeID FROM ureticialinanhammadde ","ureticialinanhammadde",uc_bilesen);
            
                String stok3 ;
            
                if(flag3 == 0){
                    stok3 = "0";
                }
                else{
                     stok3 = nesne.query3("SELECT uStok FROM ureticialinanhammadde "+
                        "WHERE uHammaddeID = '"+uc_bilesen+"' "
                        ,"ureticialinanhammadde");
                }               
                
            stok31 = Float.parseFloat(stok3);
            ystok3 = stok31-sayi3;
            float kargo_maliyet3=0;
            float satis_fiyat31=0;            
  
            if(ystok3 <0){
                String[] dizi ={"ANK1","ESK1", "GAZ1","IST1" ,"IST2", "IST3" ,"LON1", "BER1", "BER2","SB1"};
                float [] alis_maliyeti_dizi3 = new float[10];
                int i=0;
                while(i<10){
                    
                    int flag333 = nesne.firma3("SELECT * FROM tedarikcibilgi ","tedarikcibilgi",dizi[i]);            
                    
                    String firmaıd3;
            
                    if(flag333 == 0){
                        i++;
                        continue;
                    }
                    else{
                         firmaıd3 = nesne.query2("SELECT tFirmaID FROM tedarikcibilgi " +
                            "WHERE tFirmaAdi = '"+dizi[i]+"' "
                            ,"tedarikcibilgi");
                    }
                    
                    int flag33 = nesne.stok2("SELECT * FROM tedarikcihammadde ","tedarikcihammadde",uc_bilesen,firmaıd3);            
                    
                    String satis_fiyat3;
            
                    if(flag33 == 0){
                        satis_fiyat3 = "0";
                    }
                    else{
                        satis_fiyat3 = nesne.query3("SELECT tSatisFiyati FROM tedarikcihammadde "+
                            "WHERE tFirmaID = '"+firmaıd3+"' "+
                            "AND tHammaddeID = '"+uc_bilesen+"' "
                            ,"tedarikcihammadde");
                    }
                    
                    
                    String ulke_ad3 = nesne.query3("SELECT tUlkeAdi FROM tedarikcibilgi " +
                    "WHERE tFirmaID = '"+firmaıd3+"' "
                    ,"tedarikcibilgi");

                    String sehir_ad3 = nesne.query4("SELECT tSehirMerkezi FROM tedarikcibilgi " +
                    "WHERE tFirmaID = '"+firmaıd3+"' "
                    ,"tedarikcibilgi");

                    String mesafe3 = nesne.query2("SELECT mesafe FROM mesafebilgi "+
                    "WHERE tFirmaID = '"+firmaıd3+"' "
                    ,"mesafebilgi");
                    
                    if(satis_fiyat3.equals("0") == false){
                        int mesafe31 = Integer.parseInt(mesafe3);
                        satis_fiyat31 = Float.parseFloat(satis_fiyat3);
                        float alis_maliyeti3 = 0;

                        if(ulke_ad3.equals("TURKIYE")){
                            kargo_maliyet3 = mesafe31/2;
                            alis_maliyeti3 = kargo_maliyet3 + satis_fiyat31*sayi3;
                        }
                        if(ulke_ad3.equals("TURKIYE") == false){
                            kargo_maliyet3 = mesafe31;
                            alis_maliyeti3 = kargo_maliyet3 + satis_fiyat31*sayi3;
                        }
                        alis_maliyeti_dizi3[i] = alis_maliyeti3;
                    }
                    i++;
                }                
                
                                                                
               float min = alis_maliyeti_dizi3[0];
               int i1=0;
               if(alis_maliyeti_dizi3[0] == 0){
                   min = alis_maliyeti_dizi3[1];
                   i1=1;
                   if(alis_maliyeti_dizi3[1] == 0){
                       min = alis_maliyeti_dizi3[2];
                       i1=2;
                       if(alis_maliyeti_dizi3[2] == 0){
                           min = alis_maliyeti_dizi3[3];
                           i1=3;
                           if(alis_maliyeti_dizi3[3] == 0){
                               min = alis_maliyeti_dizi3[4];
                               i1=4;
                               if(alis_maliyeti_dizi3[4] == 0){
                                   min = alis_maliyeti_dizi3[5];
                                   i1=5;
                                   if(alis_maliyeti_dizi3[5] == 0){
                                       min = alis_maliyeti_dizi3[6];
                                       i1=6;
                                       if(alis_maliyeti_dizi3[6] == 0){
                                           min = alis_maliyeti_dizi3[7];
                                           i1=7;
                                           if(alis_maliyeti_dizi3[7] == 0){
                                               min = alis_maliyeti_dizi3[8];
                                               i1=8;
                                               if(alis_maliyeti_dizi3[8] == 0){
                                                   min = alis_maliyeti_dizi3[9];
                                                   i1=9;
                                                   if(alis_maliyeti_dizi3[9] == 0){
                                                       min = alis_maliyeti_dizi3[10];
                                                       i1=10;
                                                   }
                                               }
                                           }
                                       }
                                   }
                               }
                           }
                       }
                   }
               }
                for(i=i1+1;i<10;i++){
                    if(min > alis_maliyeti_dizi3[i] && alis_maliyeti_dizi3[i] != 0){
                        min = alis_maliyeti_dizi3[i];
                        i1 = i;
                    }
                }
                i1++;
                
                
                String miktar3 = nesne.query2("SELECT tMiktar FROM tedarikcihammadde " +
                    "WHERE tFirmaID = '"+i1+"' "+
                    "AND tHammaddeID = '"+uc_bilesen+"' "
                    ,"tedarikcihammadde");
                
                float miktar31 = Float.parseFloat(miktar3);
                float s1 = miktar31-sayi3;               
                
                if(s1 <= 0){
                    nesne.deleteFromTable("DELETE FROM tedarikcihammadde "+
                    "WHERE tFirmaID = '"+i1+"' "+
                    "AND tHammaddeID = '"+uc_bilesen+"' ");
                }
                else{
                    nesne.update("UPDATE tedarikcihammadde SET "+
                        "tMiktar = '"+s1+"' " +
                         "WHERE tFirmaID = '"+i1+"' "+
                        "AND tHammaddeID = '"+uc_bilesen+"' ");
                }                
                
                ystok3 = stok31+sayi3;
                
                String miktaru3;
                String uAlisMaliyeti3;
                if(stok31 == 0){
                    miktaru3 ="0";
                    uAlisMaliyeti3="0";                    
                }
                else{
                    miktaru3 = nesne.query2("SELECT uMiktar FROM ureticialinanhammadde "+
                    "WHERE uHammaddeID = '"+uc_bilesen+"' "
                    ,"ureticialinanhammadde");
                    
                    uAlisMaliyeti3 = nesne.query4("SELECT uAlisMaliyeti FROM ureticialinanhammadde "+
                    "WHERE uHammaddeID = '"+uc_bilesen+"' "
                    ,"ureticialinanhammadde");
                }                
                
                float miktaru31 = Float.parseFloat(miktaru3);
                float ymiktaru3 = miktaru31 + sayi3;
                
                float uAlisMaliyeti31 = Float.parseFloat(uAlisMaliyeti3);
                
                float yeni_maliyet3 = kargo_maliyet3 + uAlisMaliyeti31 + satis_fiyat31*sayi3;
                
                nesne.update("UPDATE ureticialinanhammadde SET "+
                    "uMiktar = '"+ymiktaru3+"', " +
                    "uStok = '"+ystok3+"', " +
                    "uAlisMaliyeti = '"+yeni_maliyet3+"' " +
                    "WHERE uHammaddeID = '"+uc_bilesen+"' ");  
                
                nesne.deleteFromTable("DELETE FROM ureticialinanhammadde "+
                    "WHERE uHammaddeID = '"+uc_bilesen+"' ");

            }else{
            
            String alismaliyeti3 = nesne.query4("SELECT uAlisMaliyeti FROM ureticialinanhammadde "+
                "WHERE uHammaddeID = '"+uc_bilesen+"' "
                ,"ureticialinanhammadde");
            
            nesne.update("UPDATE ureticialinanhammadde SET "+
                "uStok = '"+ystok3+"' " +
                "WHERE uHammaddeID = '"+uc_bilesen+"' ");
                        
            ialismaliyeti3 = Float.parseFloat(alismaliyeti3);
            oran3 = ialismaliyeti3/stok31;
            son3 = oran3*sayi3;
            yenimali3 = ialismaliyeti3-oran3*sayi3;
            
            
            
            nesne.update("UPDATE ureticialinanhammadde SET "+
                "uAlisMaliyeti = '"+yenimali3+"' " +
                "WHERE uHammaddeID = '"+uc_bilesen+"' ");
            if(ystok3 == 0){
                nesne.deleteFromTable("DELETE FROM ureticialinanhammadde "+
                "WHERE uHammaddeID = '"+uc_bilesen+"' ");
            }
        }
            }
            
            
            
            int flag1 = nesne.stok("SELECT uHammaddeID FROM ureticialinanhammadde ","ureticialinanhammadde",bir_bilesen);
            
               String stok1 ;
            
                if(flag1 == 0){
                    stok1 = "0";
                }
                else{
                     stok1 = nesne.query3("SELECT uStok FROM ureticialinanhammadde "+
                        "WHERE uHammaddeID = '"+bir_bilesen+"' "
                        ,"ureticialinanhammadde");
                }
                        

                
            float stok11 = Float.parseFloat(stok1);
            float ystok1 = stok11-sayi1;
            
            float kargo_maliyet1 = 0;
            float satis_fiyat11 = 0;
  
            if(ystok1 <0){
                String[] dizi ={"ANK1"," ESK1", "GAZ1"," IST1" ,"IST2", "IST3" ,"LON1", "BER1", "BER2","SB1"};
                float [] alis_maliyeti_dizi1 = new float[10];
                int i=0;
                while(i<10){
                    
                    int flag111 = nesne.firma3("SELECT * FROM tedarikcibilgi ","tedarikcibilgi",dizi[i]);                    
                    String firmaıd1;
            
                    if(flag111 == 0){
                        i++;
                        continue;
                    }
                    else{
                         firmaıd1 = nesne.query2("SELECT tFirmaID FROM tedarikcibilgi " +
                            "WHERE tFirmaAdi = '"+dizi[i]+"' "
                            ,"tedarikcibilgi");
                    }
                    
                    int flag11 = nesne.stok2("SELECT * FROM tedarikcihammadde ","tedarikcihammadde",bir_bilesen,firmaıd1);
                    
                    String satis_fiyat1;
            
                    if(flag11 == 0){
                        satis_fiyat1 = "0";
                    }
                    else{
                        satis_fiyat1 = nesne.query3("SELECT tSatisFiyati FROM tedarikcihammadde "+
                            "WHERE tFirmaID = '"+firmaıd1+"' "+
                            "AND tHammaddeID = '"+bir_bilesen+"' "
                            ,"tedarikcihammadde");
                    }                    
                    
                    String ulke_ad1 = nesne.query3("SELECT tUlkeAdi FROM tedarikcibilgi " +
                    "WHERE tFirmaID = '"+firmaıd1+"' "
                    ,"tedarikcibilgi");

                    String sehir_ad1 = nesne.query4("SELECT tSehirMerkezi FROM tedarikcibilgi " +
                    "WHERE tFirmaID = '"+firmaıd1+"' "
                    ,"tedarikcibilgi");

                    String mesafe1 = nesne.query2("SELECT mesafe FROM mesafebilgi "+
                    "WHERE tFirmaID = '"+firmaıd1+"' "
                    ,"mesafebilgi");
                    
                    if(satis_fiyat1.equals("0") == false){
                        int mesafe11 = Integer.parseInt(mesafe1);
                        satis_fiyat11 = Float.parseFloat(satis_fiyat1);
                        float alis_maliyeti1 = 0;

                        if(ulke_ad1.equals("TURKIYE")){
                            kargo_maliyet1 = mesafe11/2;
                            alis_maliyeti1 = kargo_maliyet1 + satis_fiyat11*sayi1;
                        }
                        if(ulke_ad1.equals("TURKIYE") == false){
                            kargo_maliyet1 = mesafe11;
                            alis_maliyeti1 = kargo_maliyet1 + satis_fiyat11*sayi1;
                        }
                        alis_maliyeti_dizi1[i] = alis_maliyeti1;
                    }
                    i++;
                }
                
                
                
                
               float min = alis_maliyeti_dizi1[0];
               int i1=0;
               if(alis_maliyeti_dizi1[0] == 0){
                   min = alis_maliyeti_dizi1[1];
                   i1=1;
                   if(alis_maliyeti_dizi1[1] == 0){
                       min = alis_maliyeti_dizi1[2];
                       i1=2;
                       if(alis_maliyeti_dizi1[2] == 0){
                           min = alis_maliyeti_dizi1[3];
                           i1=3;
                           if(alis_maliyeti_dizi1[3] == 0){
                               min = alis_maliyeti_dizi1[4];
                               i1=4;
                               if(alis_maliyeti_dizi1[4] == 0){
                                   min = alis_maliyeti_dizi1[5];
                                   i1=5;
                                   if(alis_maliyeti_dizi1[5] == 0){
                                       min = alis_maliyeti_dizi1[6];
                                       i1=6;
                                       if(alis_maliyeti_dizi1[6] == 0){
                                           min = alis_maliyeti_dizi1[7];
                                           i1=7;
                                           if(alis_maliyeti_dizi1[7] == 0){
                                               min = alis_maliyeti_dizi1[8];
                                               i1=8;
                                               if(alis_maliyeti_dizi1[8] == 0){
                                                   min = alis_maliyeti_dizi1[9];
                                                   i1=9;
                                                   if(alis_maliyeti_dizi1[9] == 0){
                                                       min = alis_maliyeti_dizi1[10];
                                                       i1=10;
                                                   }
                                               }
                                           }
                                       }
                                   }
                               }
                           }
                       }
                   }
               }
                for(i=i1+1;i<10;i++){
                    if(min > alis_maliyeti_dizi1[i] && alis_maliyeti_dizi1[i] != 0){
                        min = alis_maliyeti_dizi1[i];
                        i1 = i;
                    }
                }
                i1++;
               

                String miktar1 = nesne.query2("SELECT tMiktar FROM tedarikcihammadde " +
                    "WHERE tFirmaID = '"+i1+"' "+
                    "AND tHammaddeID = '"+bir_bilesen+"' "
                    ,"tedarikcihammadde");
                
                
                float miktar11 = Float.parseFloat(miktar1);
                float s1 = miktar11-sayi1;
                
                if(s1 <= 0){
                    nesne.deleteFromTable("DELETE FROM tedarikcihammadde "+
                    "WHERE tFirmaID = '"+i1+"' "+
                    "AND tHammaddeID = '"+bir_bilesen+"' ");
                }
                else{
                    nesne.update("UPDATE tedarikcihammadde SET "+
                        "tMiktar = '"+s1+"' " +
                         "WHERE tFirmaID = '"+i1+"' "+
                        "AND tHammaddeID = '"+bir_bilesen+"' ");
                }  
                
                ystok1 = stok11+sayi1;                
                
                String miktaru1;
                String uAlisMaliyeti1;
                if(stok11 == 0){
                    miktaru1 ="0";
                    uAlisMaliyeti1="0";                    
                }
                else{
                    miktaru1 = nesne.query2("SELECT uMiktar FROM ureticialinanhammadde "+
                    "WHERE uHammaddeID = '"+bir_bilesen+"' "
                    ,"ureticialinanhammadde");
                    
                    uAlisMaliyeti1 = nesne.query4("SELECT uAlisMaliyeti FROM ureticialinanhammadde "+
                    "WHERE uHammaddeID = '"+bir_bilesen+"' "
                    ,"ureticialinanhammadde");
                }

                
                
                float miktaru11 = Float.parseFloat(miktaru1);
                float ymiktaru = miktaru11 + sayi1;                
                float uAlisMaliyeti11 = Float.parseFloat(uAlisMaliyeti1);
                
                float yeni_maliyet = kargo_maliyet1 + uAlisMaliyeti11 + satis_fiyat11*sayi1;
                
                nesne.update("UPDATE ureticialinanhammadde SET "+
                    "uMiktar = '"+ymiktaru+"', " +
                    "uStok = '"+ystok1+"', " +
                    "uAlisMaliyeti = '"+yeni_maliyet+"' " +
                    "WHERE uHammaddeID = '"+bir_bilesen+"' ");  
                
                nesne.deleteFromTable("DELETE FROM ureticialinanhammadde "+
                "WHERE uHammaddeID = '"+bir_bilesen+"' ");
            }
            else{
                String alismaliyeti1 = nesne.query4("SELECT uAlisMaliyeti FROM ureticialinanhammadde "+
                    "WHERE uHammaddeID = '"+bir_bilesen+"' "
                    ,"ureticialinanhammadde");            
            
                nesne.update("UPDATE ureticialinanhammadde SET "+
                    "uStok = '"+ystok1+"' " +
                    "WHERE uHammaddeID = '"+bir_bilesen+"' ");
                        
                float ialismaliyeti1 = Float.parseFloat(alismaliyeti1);
                float oran1 = ialismaliyeti1/stok11;
                float son1 = oran1*sayi1;
                float yenimali1 = ialismaliyeti1-oran1*sayi1;
            
                nesne.update("UPDATE ureticialinanhammadde SET "+
                    "uAlisMaliyeti = '"+yenimali1+"' " +
                    "WHERE uHammaddeID = '"+bir_bilesen+"' ");
            
                if(ystok1 == 0){
                    nesne.deleteFromTable("DELETE FROM ureticialinanhammadde "+
                    "WHERE uHammaddeID = '"+bir_bilesen+"' ");
                }
            }
            
               int flag2 = nesne.stok("SELECT uHammaddeID FROM ureticialinanhammadde ","ureticialinanhammadde",iki_bilesen);
            
               String stok2;
            
                if(flag2 == 0){
                    stok2 = "0";
                }
                else{
                     stok2 = nesne.query3("SELECT uStok FROM ureticialinanhammadde "+
                        "WHERE uHammaddeID = '"+iki_bilesen+"' "
                        ,"ureticialinanhammadde");
                }
            
            float stok21 = Float.parseFloat(stok2);
            float ystok2 = stok21-sayi2;
            float kargo_maliyet2 = 0;
            float satis_fiyat21 = 0;
            
  
            if(ystok2 <0){
                String[] dizi ={"ANK1"," ESK1", "GAZ1"," IST1" ,"IST2", "IST3" ,"LON1", "BER1", "BER2","SB1"};
                float [] alis_maliyeti_dizi2 = new float[10];
                int i=0;
                while(i<10){
                    
                    int flag222 = nesne.firma3("SELECT * FROM tedarikcibilgi ","tedarikcibilgi",dizi[i]);            
                    
                    String firmaıd2;
            
                    if(flag222 == 0){
                        i++;
                        continue;
                    }
                    else{
                        firmaıd2 = nesne.query2("SELECT tFirmaID FROM tedarikcibilgi " +
                        "WHERE tFirmaAdi = '"+dizi[i]+"' "
                        ,"tedarikcibilgi");
                    }
                    
                    int flag22 = nesne.stok2("SELECT * FROM tedarikcihammadde ","tedarikcihammadde",iki_bilesen,firmaıd2);            
                    
                    String satis_fiyat2;
            
                    if(flag22 == 0){
                        satis_fiyat2 = "0";
                    }
                    else{
                        satis_fiyat2 = nesne.query3("SELECT tSatisFiyati FROM tedarikcihammadde "+
                        "WHERE tFirmaID = '"+firmaıd2+"' "+
                        "AND tHammaddeID = '"+iki_bilesen+"' "
                        ,"tedarikcihammadde");
                    }
 
                    String ulke_ad2 = nesne.query3("SELECT tUlkeAdi FROM tedarikcibilgi " +
                    "WHERE tFirmaID = '"+firmaıd2+"' "
                    ,"tedarikcibilgi");
                    
                    String sehir_ad2 = nesne.query4("SELECT tSehirMerkezi FROM tedarikcibilgi " +
                    "WHERE tFirmaID = '"+firmaıd2+"' "
                    ,"tedarikcibilgi");

                    String mesafe2 = nesne.query2("SELECT mesafe FROM mesafebilgi "+
                    "WHERE tFirmaID = '"+firmaıd2+"' "
                    ,"mesafebilgi");
                    
                    if(satis_fiyat2.equals("0") == false){
                        int mesafe21 = Integer.parseInt(mesafe2);
                        satis_fiyat21 = Float.parseFloat(satis_fiyat2);
                        float alis_maliyeti2 = 0;

                        if(ulke_ad2.equals("TURKIYE")){
                            kargo_maliyet2 = mesafe21/2;
                            alis_maliyeti2 = kargo_maliyet2 + satis_fiyat21*sayi2;
                        }
                        if(ulke_ad2.equals("TURKIYE") == false){
                            kargo_maliyet2 = mesafe21;
                            alis_maliyeti2 = kargo_maliyet2 + satis_fiyat21*sayi2;
                        }
                        alis_maliyeti_dizi2[i] = alis_maliyeti2;
                    }   
                    i++;
                }
                         
                
               
                
               float min = alis_maliyeti_dizi2[0];
               int i1=0;
               if(alis_maliyeti_dizi2[0] == 0){
                   min = alis_maliyeti_dizi2[1];
                   i1=1;
                   if(alis_maliyeti_dizi2[1] == 0){
                       min = alis_maliyeti_dizi2[2];
                       i1=2;
                       if(alis_maliyeti_dizi2[2] == 0){
                           min = alis_maliyeti_dizi2[3];
                           i1=3;
                           if(alis_maliyeti_dizi2[3] == 0){
                               min = alis_maliyeti_dizi2[4];
                               i1=4;
                               if(alis_maliyeti_dizi2[4] == 0){
                                   min = alis_maliyeti_dizi2[5];
                                   i1=5;
                                   if(alis_maliyeti_dizi2[5] == 0){
                                       min = alis_maliyeti_dizi2[6];
                                       i1=6;
                                       if(alis_maliyeti_dizi2[6] == 0){
                                           min = alis_maliyeti_dizi2[7];
                                           i1=7;
                                           if(alis_maliyeti_dizi2[7] == 0){
                                               min = alis_maliyeti_dizi2[8];
                                               i1=8;
                                               if(alis_maliyeti_dizi2[8] == 0){
                                                   min = alis_maliyeti_dizi2[9];
                                                   i1=9;
                                                   if(alis_maliyeti_dizi2[9] == 0){
                                                       min = alis_maliyeti_dizi2[10];
                                                       i1=10;
                                                   }
                                               }
                                           }
                                       }
                                   }
                               }
                           }
                       }
                   }
               }
                for(i=i1+1;i<10;i++){
                    if(min > alis_maliyeti_dizi2[i] && alis_maliyeti_dizi2[i] != 0){
                        min = alis_maliyeti_dizi2[i];
                        i1 = i;
                    }
                }
                i1++;
                

                
                String miktar2 = nesne.query2("SELECT tMiktar FROM tedarikcihammadde " +
                    "WHERE tFirmaID = '"+i1+"' "+
                    "AND tHammaddeID = '"+iki_bilesen+"' "
                    ,"tedarikcihammadde");
                
                float miktar21 = Float.parseFloat(miktar2);
                float s1 = miktar21-sayi2;
                
                if(s1 <= 0){
                    nesne.deleteFromTable("DELETE FROM tedarikcihammadde "+
                    "WHERE tFirmaID = '"+i1+"' "+
                    "AND tHammaddeID = '"+iki_bilesen+"' ");
                }
                else{
                    nesne.update("UPDATE tedarikcihammadde SET "+
                        "tMiktar = '"+s1+"' " +
                         "WHERE tFirmaID = '"+i1+"' "+
                        "AND tHammaddeID = '"+iki_bilesen+"' ");
                }  
                
            
                ystok2 = stok21+sayi2;
                
                
                String miktaru2;
                String uAlisMaliyeti2;
                if(stok21 == 0){
                    miktaru2 ="0";
                    uAlisMaliyeti2="0";                    
                }
                else{
                    miktaru2 = nesne.query2("SELECT uMiktar FROM ureticialinanhammadde "+
                    "WHERE uHammaddeID = '"+iki_bilesen+"' "
                    ,"ureticialinanhammadde");
                    
                    uAlisMaliyeti2 = nesne.query4("SELECT uAlisMaliyeti FROM ureticialinanhammadde "+
                    "WHERE uHammaddeID = '"+iki_bilesen+"' "
                    ,"ureticialinanhammadde");
                }                
                               
                
                float miktaru21 = Float.parseFloat(miktaru2);
                float ymiktaru2 = miktaru21 + sayi2;
                                
                float uAlisMaliyeti21 = Float.parseFloat(uAlisMaliyeti2);
                
                float yeni_maliyet2 = kargo_maliyet2 + uAlisMaliyeti21 + satis_fiyat21*sayi2;
                
                nesne.update("UPDATE ureticialinanhammadde SET "+
                    "uMiktar = '"+ymiktaru2+"', " +
                    "uStok = '"+ystok2+"', " +
                    "uAlisMaliyeti = '"+yeni_maliyet2+"' " +
                    "WHERE uHammaddeID = '"+iki_bilesen+"' ");  
                
                nesne.deleteFromTable("DELETE FROM ureticialinanhammadde "+
                "WHERE uHammaddeID = '"+iki_bilesen+"' ");

            }
            else{
            String alismaliyeti2 = nesne.query4("SELECT uAlisMaliyeti FROM ureticialinanhammadde "+
                "WHERE uHammaddeID = '"+iki_bilesen+"' "
                ,"ureticialinanhammadde");
            
            
            nesne.update("UPDATE ureticialinanhammadde SET "+
                "uStok = '"+ystok2+"' " +
                "WHERE uHammaddeID = '"+iki_bilesen+"' ");
                        
            float ialismaliyeti2 = Float.parseFloat(alismaliyeti2);
            float oran2 = ialismaliyeti2/stok21;
            float son2 = oran2*sayi2;
            float yenimali2 = ialismaliyeti2-oran2*sayi2;
            
            nesne.update("UPDATE ureticialinanhammadde SET "+
                "uAlisMaliyeti = '"+yenimali2+"' " +
                "WHERE uHammaddeID = '"+iki_bilesen+"' ");  
            
            if(ystok2 == 0){
                nesne.deleteFromTable("DELETE FROM ureticialinanhammadde "+
                "WHERE uHammaddeID = '"+iki_bilesen+"' ");
            }
 
        } 
             
  
     
            
            nesne.deleteFromTable("DELETE FROM uretilenurunler "+
                "WHERE uKimyasalUrunID = '"+urunıd+"' ");
            
            
            
        }else if(s == 0){
            
            
            String esliMaliyet = nesne.query3("SELECT uToplamMaliyet FROM uretilenurunler "+
                "WHERE uKimyasalUrunID = '"+urunıd+"' "
                ,"uretilenurunler");
            String eskiIscilik = nesne.query4("SELECT uTumIscilikMaliyeti FROM uretilenurunler "+
                "WHERE uKimyasalUrunID = '"+urunıd+"' "
                ,"uretilenurunler");
            String eskiMiktar = nesne.query2("SELECT uUrunMiktari FROM uretilenurunler "+
                "WHERE uKimyasalUrunID = '"+urunıd+"' "
                ,"uretilenurunler");
            String eskiSatisFiyati = nesne.query7("SELECT uUrunSatisFiyati FROM uretilenurunler "+
                "WHERE uKimyasalUrunID = '"+urunıd+"' "
                ,"uretilenurunler");
            
            
            float eskiMiktar1 = Float.parseFloat(eskiMiktar);
            float eskiSatisFiyati1 = Float.parseFloat(eskiSatisFiyati);
            float esliMaliyet1 = Float.parseFloat(esliMaliyet);
            float eskiIscilik1 = Float.parseFloat(eskiIscilik);
             
            
            
            float kar_oranı = (eskiSatisFiyati1 - esliMaliyet1)*100/eskiSatisFiyati1;
            
            jLabel4.setText(""+kar_oranı);  
            
            nesne.deleteFromTable("DELETE FROM uretilenurunler "+
                "WHERE uKimyasalUrunID = '"+urunıd+"' ");
        }else{

            String esliMaliyet = nesne.query3("SELECT uToplamMaliyet FROM uretilenurunler "+
                "WHERE uKimyasalUrunID = '"+urunıd+"' "
                ,"uretilenurunler");
            String eskiIscilik = nesne.query4("SELECT uTumIscilikMaliyeti FROM uretilenurunler "+
                "WHERE uKimyasalUrunID = '"+urunıd+"' "
                ,"uretilenurunler");
            String eskiMiktar = nesne.query2("SELECT uUrunMiktari FROM uretilenurunler "+
                "WHERE uKimyasalUrunID = '"+urunıd+"' "
                ,"uretilenurunler");
            String eskiSatisFiyati = nesne.query7("SELECT uUrunSatisFiyati FROM uretilenurunler "+
                "WHERE uKimyasalUrunID = '"+urunıd+"' "
                ,"uretilenurunler");
            
            
            float eskiMiktar1 = Float.parseFloat(eskiMiktar);
            float eskiSatisFiyati1 = Float.parseFloat(eskiSatisFiyati);
            float esliMaliyet1 = Float.parseFloat(esliMaliyet);
            float eskiIscilik1 = Float.parseFloat(eskiIscilik);
             
            
            float oran = eskiMiktar1/b1;
            float yeniSatisFiyati1 = eskiSatisFiyati1-eskiSatisFiyati1/oran;
            float yenimaliyet = esliMaliyet1-esliMaliyet1/oran;
            float yeniIscilik = eskiIscilik1-eskiIscilik1/oran;
            
            
            nesne.update("UPDATE uretilenurunler SET "+
                "uUrunMiktari = '"+s+"', "+
                "uTumIscilikMaliyeti = '"+yeniIscilik+"', "+
                "uToplamMaliyet = '"+yenimaliyet+"', "+
                "uUrunSatisFiyati = '"+yeniSatisFiyati1+"' "+
                "WHERE uKimyasalUrunID = '"+urunıd+"' ");
            
            float kar_oranı = (eskiSatisFiyati1 - esliMaliyet1)*100/eskiSatisFiyati1;
            
            jLabel4.setText(""+kar_oranı);              
            
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        VeritabaniProjesi nesne = new VeritabaniProjesi();
        nesne.tedarikcihammadde();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        VeritabaniProjesi nesne = new VeritabaniProjesi();
        nesne.ureticialinanhammadde();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        VeritabaniProjesi nesne = new VeritabaniProjesi();
        nesne.uretilenurunler();
    }//GEN-LAST:event_jButton4ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Problem5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAnaMenuyeDon;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
