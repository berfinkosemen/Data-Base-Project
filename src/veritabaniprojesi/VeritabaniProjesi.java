
package veritabaniprojesi;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.util.Objects;

public class VeritabaniProjesi {

    private static Connection connect = null;
    private static Statement statement = null;
    private static ResultSet resultSet = null;
    private static String url = "jdbc:mysql://localhost:3306/proje3?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDate"
                    + "timeCode=false&serverTimezone=UTC&characterEncoding=utf-8&useSSL=false";
    private static String username = "root";
    private static String password = "1234";
    
    public static void main(String[] args) {
        VeritabaniProjesi v = new VeritabaniProjesi();
        v.connectToDb();
        //ınsertData("INSERT INTO tedarikcibilgi (tFirmaID,tFirmaAdi,tUlkeAdi,tSehirMerkezi) VALUES ('1','A','TÜRKİYE','KOCAELİ')");
        //ınsertData("INSERT INTO tedarikcibilgi (tFirmaID,tFirmaAdi,tUlkeAdi,tSehirMerkezi) VALUES ('2','B','TÜRKİYE','ADANA')");
       // product_query(); 
        //tedarikcibilgi();       
       arayuzGirisEkraninaBaglan(); 
       //ınsertData("");
       
    }

    
    public static void arayuzGirisEkraninaBaglan() {
        ArayuzGirisEkrani buttonFenster = new ArayuzGirisEkrani();
        buttonFenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buttonFenster.setSize(535, 378);
        buttonFenster.setVisible(true); 
    }
    
    
    public void connectToDb() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection(url, username, password);
            statement = connect.createStatement();
            System.out.println("Veritabanina basarili bir sekilde baglandi");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();        
            System.out.println("Sürücü projeye eklenmemiş!");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Veritabanına bağlantı sağlanamadı!");
        }
    } 
    
    static void update(String query) {
        try {
            connect = DriverManager.getConnection(url, username, password);
            statement = connect.createStatement();
            statement.executeUpdate(query);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
      
     static void query(String query,String table) {
        try {
            connect = DriverManager.getConnection(url, username, password);
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);
            writeResultSet(resultSet,table);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
      
    static String query2(String query ,String table) {
        String a = null;
        try {
            connect = DriverManager.getConnection(url, username, password);
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);
            if(table.equals("tedarikcibilgi")){
                while (resultSet.next()) {
                    a = resultSet.getString("tFirmaID");
                }
            }
            if(table.equals("tedarikcihammaddebilgi")){
                while (resultSet.next()) {
                    a = resultSet.getString("tHammaddeID");
                }
            }
            if(table.equals("tedarikcihammadde")){
                while (resultSet.next()) {
                    a = resultSet.getString("tMiktar");
                }
            }
            if(table.equals("ureticialinanhammadde")){
                while (resultSet.next()) {
                    a = resultSet.getString("uMiktar");
                }
            }
            if(table.equals("mesafebilgi")){
                while (resultSet.next()) {
                    a = resultSet.getString("mesafe");
                }
            }
            if(table.equals("uretilenurunler")){
                while (resultSet.next()) {
                    a = resultSet.getString("uUrunMiktari");
                }
            }
            if(table.equals("kimyasalurun")){
                while (resultSet.next()) {
                    a = resultSet.getString("uKimyasalUrunID");
                }
            } 
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return a;
    }
    
    static String query3(String query ,String table){
        String a = null;
        try {
            connect = DriverManager.getConnection(url, username, password);
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);
           
            if(table.equals("ureticialinanhammadde")){
                while (resultSet.next()) {
                    a = resultSet.getString("uStok");
                }
            }
            if(table.equals("tedarikcihammadde")){
                while (resultSet.next()) {
                    a = resultSet.getString("tSatisFiyati");
                }
            }
            if(table.equals("tedarikcibilgi")){
                while (resultSet.next()) {
                    a = resultSet.getString("tUlkeAdi");
                }
            }
            if(table.equals("uretilenurunler")){
                while (resultSet.next()) {
                    a = resultSet.getString("uToplamMaliyet");
                }
            }            
                  
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return a;
    }
    static String query4(String query ,String table){
        String a = null;
        try {
            connect = DriverManager.getConnection(url, username, password);
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);
            
            
            if(table.equals("tedarikcibilgi")){
                while (resultSet.next()) {
                    a = resultSet.getString("tSehirMerkezi");
                }
            }
            if(table.equals("ureticialinanhammadde")){
                while (resultSet.next()) {
                    a = resultSet.getString("uAlisMaliyeti");
                }
            }
            if(table.equals("uretilenurunler")){
                while (resultSet.next()) {
                    a = resultSet.getString("uTumIscilikMaliyeti");
                }
            }
            if(table.equals("tedarikcihammadde")){
                while (resultSet.next()) {
                    a = resultSet.getString("tRafOmru");
                }
            }
            
                  
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return a;
    }
    
    static String query5(String query ,String table){
        String a = null;
        try {
            connect = DriverManager.getConnection(url, username, password);
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);
            
            
            
            if(table.equals("uretilenurunler")){
                while (resultSet.next()) {
                    a = resultSet.getString("uUretimTarihi");
                }
            }
            if(table.equals("tedarikcihammadde")){
                while (resultSet.next()) {
                    a = resultSet.getString("tUretimTarihi");
                }
            }
            
                  
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return a;
    }
    static String query6(String query ,String table){
        String a = null;
        try {
            connect = DriverManager.getConnection(url, username, password);
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);
            if(table.equals("uretilenurunler")){
                while (resultSet.next()) {
                    a = resultSet.getString("uRafOmru");
                }
            }
            
                  
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return a;
    }
    
        static String query7(String query ,String table){
        String a = null;
        try {
            connect = DriverManager.getConnection(url, username, password);
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);
            if(table.equals("uretilenurunler")){
                while (resultSet.next()) {
                    a = resultSet.getString("uUrunSatisFiyati");
                }
            }                              
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return a;
    }
         
    static int urunler8(String query ,String table ,String urunıd){
        int sayac=0;
        try {
            connect = DriverManager.getConnection(url, username, password);
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);
            if(table.equals("uretilenurunler")){                           
                while (resultSet.next()) {
                    //System.out.println(resultSet.getString("uKimyasalUrunID")); 
                    //System.out.println(urunıd);
                    if(urunıd.equals(resultSet.getString("uKimyasalUrunID")))
                        sayac++;
                }
                System.out.println(sayac);
            }   
        } catch (Exception e) {
            System.out.println(e.toString());
        }finally {
            try {
                if (connect != null) {
                    connect.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException sqlee) {
                sqlee.printStackTrace();
            }
        }
        return sayac;
    }
    
    static int stok(String query ,String table ,String urunıd){
        int sayac=0;
        try {
            connect = DriverManager.getConnection(url, username, password);
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);
            if(table.equals("ureticialinanhammadde")){                           
                while (resultSet.next()) {
                    //System.out.println(resultSet.getString("uHammaddeID")); 
                    //System.out.println(urunıd);
                    if(urunıd.equals(resultSet.getString("uHammaddeID")))
                        sayac++;
                }
                System.out.println(sayac);
            }   
        } catch (Exception e) {
            System.out.println(e.toString());
        }finally {
            try {
                if (connect != null) {
                    connect.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException sqlee) {
                sqlee.printStackTrace();
            }
        }
        return sayac;
    }
    
    
    static int stok2(String query ,String table ,String urunıd ,String firmaıd){
        int sayac=0;
        try {
            connect = DriverManager.getConnection(url, username, password);
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);
            if(table.equals("tedarikcihammadde")){                           
                while (resultSet.next()) {
                    if(urunıd.equals(resultSet.getString("tHammaddeID")) && firmaıd.equals(resultSet.getString("tFirmaID")))
                        sayac++;
                }
                System.out.println(sayac);
            }   
        } catch (Exception e) {
            System.out.println(e.toString());
        }finally {
            try {
                if (connect != null) {
                    connect.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException sqlee) {
                sqlee.printStackTrace();
            }
        }
        return sayac;
    }
    
    static int tarih(String query ,String table,int tarih){
        int sayac=0;
        try {
            connect = DriverManager.getConnection(url, username, password);
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);
            if(table.equals("tedarikcihammadde")){                           
                while (resultSet.next()) {
                    String a = resultSet.getString("tUretimTarihi");
                    String b = resultSet.getString("tRafOmru");
                    int a1 = Integer.parseInt(a);
                    int b1 = Integer.parseInt(b);
                    if(a1+b1 == tarih){
                        deleteFromTable("DELETE FROM tedarikcihammadde "+
                             "WHERE tUretimTarihi = '"+a+"' "+
                             "AND tRafOmru = '"+b+"' "    );
                    }
                        sayac++;
                }
                System.out.println(sayac);
            }   
        } catch (Exception e) {
            System.out.println(e.toString());
        }finally {
            try {
                if (connect != null) {
                    connect.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException sqlee) {
                sqlee.printStackTrace();
            }
        }
        return sayac;
    }
    
        static int firma3(String query ,String table ,String firmaadi){
        int sayac=0;
        try {
            connect = DriverManager.getConnection(url, username, password);
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);
            if(table.equals("tedarikcibilgi")){                           
                while (resultSet.next()) {
                    if(firmaadi.equals(resultSet.getString("tFirmaAdi")) ) {
                         sayac++;
                    }                       
                }
                System.out.println(sayac);
            }   
        } catch (Exception e) {
            System.out.println(e.toString());
        }finally {
            try {
                if (connect != null) {
                    connect.close();
                }
                if (statement != null) {
                    statement.close();
                }
            } catch (SQLException sqlee) {
                sqlee.printStackTrace();
            }
        }
        return sayac;
    }

     
    private static void writeResultSet(ResultSet resultSet, String table) throws SQLException {
       
        JFrame f= new JFrame("Urun alış satis uretim");   

        if(table.equals("a")){
            
            JTable j = new JTable(); 
            DefaultTableModel dtm = new DefaultTableModel(0, 0);
         
            // add header of the table
            String header[] = new String[] { "tFirmaAdi", "tHammaddeAdi", "tMiktar","tUretimTarihi", "tRafOmru","tSatisFiyati" };
            // add header in table model     
            dtm.setColumnIdentifiers(header);
            //set model into the table object
            j.setModel(dtm);
            
            while (resultSet.next()) {
                String a = resultSet.getString("tFirmaAdi");
                String b = resultSet.getString("tHammaddeAdi");
                String c = resultSet.getString("tMiktar");
                String d = resultSet.getString("tUretimTarihi");
                String e = resultSet.getString("tRafOmru");
                String g = resultSet.getString("tSatisFiyati");
            
                dtm.addRow(new Object[] { a, b, c, d, e, g});
            }    
            
             j.setBounds(30, 40, 200, 300); 
  
                // adding it to JScrollPane 
                JScrollPane sp = new JScrollPane(j); 
                f.add(sp); 
                // Frame Size 
                f.setSize(500, 200); 
                // Frame Visible = true 
                f.setVisible(true); 
               /* System.out.println(a);
                System.out.println(b);
                System.out.println(c);
                System.out.println(d);
                System.out.println(e);
                System.out.println(g);*/
            }
        else if(table.equals("tedarikcibilgi")){
                
            JTable j = new JTable(); 
            DefaultTableModel dtm = new DefaultTableModel(0, 0);
                
            // add header of the table
            String header[] = new String[] { "tFirmaID", "tFirmaAdi", "tUlkeAdi","tSehirMerkezi"};
            // add header in table model     
            dtm.setColumnIdentifiers(header);
            //set model into the table object
            j.setModel(dtm);
                
            while (resultSet.next()) {
                String a = resultSet.getString("tFirmaID");
                String b = resultSet.getString("tFirmaAdi");
                String c = resultSet.getString("tUlkeAdi");
                String d = resultSet.getString("tSehirMerkezi");
               
                // add row dynamically into the table      
                dtm.addRow(new Object[] { a, b, c, d});
            }
               
                /*String[][] data = { 
                { a, b, c, d }, 
                }; 
  
                // Column Names 
                String[] columnNames = { "tFirmaID", " tFirmaAdi", "tUlkeAdi", "tSehirMerkezi"}; 
  
                // Initializing the JTable 
                j = new JTable(data, columnNames); */
                j.setBounds(30, 40, 200, 300); 
  
                // adding it to JScrollPane 
                JScrollPane sp = new JScrollPane(j); 
                f.add(sp); 
                // Frame Size 
                f.setSize(500, 200); 
                // Frame Visible = true 
                f.setVisible(true); 
                

                
            }
            else if(table.equals("tedarikcihammadde")){
                
            JTable j = new JTable(); 
            DefaultTableModel dtm = new DefaultTableModel(0, 0);
                
            // add header of the table
            String header[] = new String[] { "tFirmaID", "tHammaddeID", "tMiktar","tUretimTarihi","tRafOmru","tSatisFiyati"};
            // add header in table model     
            dtm.setColumnIdentifiers(header);
            //set model into the table object
            j.setModel(dtm);
                
            while (resultSet.next()) {
                String a = resultSet.getString("tFirmaID");
                String b = resultSet.getString("tHammaddeID");
                String c = resultSet.getString("tMiktar");
                String d = resultSet.getString("tUretimTarihi");
                String e = resultSet.getString("tRafOmru");
                String g = resultSet.getString("tSatisFiyati");
               
                // add row dynamically into the table      
                dtm.addRow(new Object[] { a, b, c, d, e, g});
            }
               
                j.setBounds(30, 40, 200, 300); 
                // adding it to JScrollPane 
                JScrollPane sp = new JScrollPane(j); 
                f.add(sp); 
                // Frame Size 
                f.setSize(500, 200); 
                // Frame Visible = true 
                f.setVisible(true); 
            }
            else if(table.equals("tedarikcihammaddebilgi")){
                
            JTable j = new JTable(); 
            DefaultTableModel dtm = new DefaultTableModel(0, 0);
                
            // add header of the table
            String header[] = new String[] { "tHammaddeID", "tHammaddeAdi"};
            // add header in table model     
            dtm.setColumnIdentifiers(header);
            //set model into the table object
            j.setModel(dtm);
                
            while (resultSet.next()) {
                String a = resultSet.getString("tHammaddeID");
                String b = resultSet.getString("tHammaddeAdi");
               
                // add row dynamically into the table      
                dtm.addRow(new Object[] { a, b});
            }
               
                j.setBounds(30, 40, 200, 300);  
                // adding it to JScrollPane 
                JScrollPane sp = new JScrollPane(j); 
                f.add(sp); 
                // Frame Size 
                f.setSize(500, 200); 
                // Frame Visible = true 
                f.setVisible(true);   
            }
            else if(table.equals("ureticibilgi")){
                
            JTable j = new JTable(); 
            DefaultTableModel dtm = new DefaultTableModel(0, 0);
                
            // add header of the table
            String header[] = new String[] { "uFirmaID", "uFirmaAdi", "uUlkeAdi","uSehirMerkezi"};
            // add header in table model     
            dtm.setColumnIdentifiers(header);
            //set model into the table object
            j.setModel(dtm);
                
            while (resultSet.next()) {
                String a = resultSet.getString("uFirmaID");
                String b = resultSet.getString("uFirmaAdi");
                String c = resultSet.getString("uUlkeAdi");
                String d = resultSet.getString("uSehirMerkezi");

                // add row dynamically into the table      
                dtm.addRow(new Object[] { a, b ,c ,d});
            }
               
                j.setBounds(30, 40, 200, 300); 
  
                // adding it to JScrollPane 
                JScrollPane sp = new JScrollPane(j); 
                f.add(sp); 
                // Frame Size 
                f.setSize(500, 200); 
                // Frame Visible = true 
                f.setVisible(true);                
            }
            else if(table.equals("ureticialinanhammadde")){
                
            JTable j = new JTable(); 
            DefaultTableModel dtm = new DefaultTableModel(0, 0);
                
            // add header of the table
            String header[] = new String[] { "uFirmaID", "uHammaddeID", "uMiktar","uStok","uAlisMaliyeti"};
            // add header in table model     
            dtm.setColumnIdentifiers(header);
            //set model into the table object
            j.setModel(dtm);
                
            while (resultSet.next()) {
                String a = resultSet.getString("uFirmaID");
                String b = resultSet.getString("uHammaddeID");
                String c = resultSet.getString("uMiktar");
                String d = resultSet.getString("uStok");
                String e = resultSet.getString("uAlisMaliyeti");

                // add row dynamically into the table      
                dtm.addRow(new Object[] { a, b ,c ,d ,e });
            }
               
                j.setBounds(30, 40, 200, 300); 
  
                // adding it to JScrollPane 
                JScrollPane sp = new JScrollPane(j); 
                f.add(sp); 
                // Frame Size 
                f.setSize(500, 200); 
                // Frame Visible = true 
                f.setVisible(true);                                 
            }
            else if(table.equals("kimyasalurun")){
                
            JTable j = new JTable(); 
            DefaultTableModel dtm = new DefaultTableModel(0, 0);
                
            // add header of the table
            String header[] = new String[] { "uKimyasalUrunID", "uKimyasalUrun"};
            // add header in table model     
            dtm.setColumnIdentifiers(header);
            //set model into the table object
            j.setModel(dtm);
                
            while (resultSet.next()) {
                String a = resultSet.getString("uKimyasalUrunID");
                String b = resultSet.getString("uKimyasalUrun");

                // add row dynamically into the table      
                dtm.addRow(new Object[] { a, b });
            }
               
                j.setBounds(30, 40, 200, 300); 
  
                // adding it to JScrollPane 
                JScrollPane sp = new JScrollPane(j); 
                f.add(sp); 
                // Frame Size 
                f.setSize(500, 200); 
                // Frame Visible = true 
                f.setVisible(true);                 
            }
            else if(table.equals("kubilgileri")){
                
            JTable j = new JTable(); 
            DefaultTableModel dtm = new DefaultTableModel(0, 0);
                
            // add header of the table
            String header[] = new String[] { "uFirmaID", "uKimyasalUrunID", "uBilesenID", "uBilesenMiktar"};
            // add header in table model     
            dtm.setColumnIdentifiers(header);
            //set model into the table object
            j.setModel(dtm);
                
            while (resultSet.next()) {
                String a = resultSet.getString("uFirmaID");
                String b = resultSet.getString("uKimyasalUrunID");
                String c = resultSet.getString("uBilesenID");
                String d = resultSet.getString("uBilesenMiktar");

                // add row dynamically into the table      
                dtm.addRow(new Object[] { a ,b ,c ,d});
            }
               
                j.setBounds(30, 40, 200, 300); 
  
                // adding it to JScrollPane 
                JScrollPane sp = new JScrollPane(j); 
                f.add(sp); 
                // Frame Size 
                f.setSize(500, 200); 
                // Frame Visible = true 
                f.setVisible(true);                                
            }
            else if(table.equals("mesafebilgi")){
                
            JTable j = new JTable(); 
            DefaultTableModel dtm = new DefaultTableModel(0, 0);
                
            // add header of the table
            String header[] = new String[] { "tFirmaID", "uFirmaID", "mesafe"};
            // add header in table model     
            dtm.setColumnIdentifiers(header);
            //set model into the table object
            j.setModel(dtm);
                
            while (resultSet.next()) {
                String a = resultSet.getString("tFirmaID");
                String b = resultSet.getString("uFirmaID");
                String c = resultSet.getString("mesafe");

                // add row dynamically into the table      
                dtm.addRow(new Object[] { a ,b ,c });
            }
               
                j.setBounds(30, 40, 200, 300); 
  
                // adding it to JScrollPane 
                JScrollPane sp = new JScrollPane(j); 
                f.add(sp); 
                // Frame Size 
                f.setSize(500, 200); 
                // Frame Visible = true 
                f.setVisible(true);                                                 
            }
            else if(table.equals("uretilenurunler")){
                
            JTable j = new JTable(); 
            DefaultTableModel dtm = new DefaultTableModel(0, 0);
                
            // add header of the table
            String header[] = new String[] {"uFirmaID","uKimyasalUrunID","uUretimTarihi","uUrunMiktarı","uRafOmru","uUrunSatisFiyati","uTumIscilikMaliyeti","uToplamMaliyet"};
            // add header in table model     
            dtm.setColumnIdentifiers(header);
            //set model into the table object
            j.setModel(dtm);
                
            while (resultSet.next()) {
                String a = resultSet.getString("uFirmaID");
                String b = resultSet.getString("uKimyasalUrunID");
                String c = resultSet.getString("uUretimTarihi");
                String d = resultSet.getString("uUrunMiktarı");
                String e = resultSet.getString("uRafOmru");
                String g = resultSet.getString("uUrunSatisFiyati");
                String h = resultSet.getString("uTumIscilikMaliyeti");
                String k = resultSet.getString("uToplamMaliyet");

                // add row dynamically into the table      
                dtm.addRow(new Object[] { a ,b ,c ,d ,e ,g ,h ,k });
            }
               
                j.setBounds(30, 40, 200, 300); 
  
                // adding it to JScrollPane 
                JScrollPane sp = new JScrollPane(j); 
                f.add(sp); 
                // Frame Size 
                f.setSize(500, 200); 
                // Frame Visible = true 
                f.setVisible(true);                                                 
            }
            else if(table.equals("musteribilgileri")){
                
            JTable j = new JTable(); 
            DefaultTableModel dtm = new DefaultTableModel(0, 0);
                
            // add header of the table
            String header[] = new String[] {"musteriID","musteriAdi","adres"};
            // add header in table model     
            dtm.setColumnIdentifiers(header);
            //set model into the table object
            j.setModel(dtm);
                
            while (resultSet.next()) {
                String a = resultSet.getString("musteriID");
                String b = resultSet.getString("musteriAdi");
                String c = resultSet.getString("adres");

                // add row dynamically into the table      
                dtm.addRow(new Object[] { a ,b ,c });
            }
               
                j.setBounds(30, 40, 200, 300); 
  
                // adding it to JScrollPane 
                JScrollPane sp = new JScrollPane(j); 
                f.add(sp); 
                // Frame Size 
                f.setSize(500, 200); 
                // Frame Visible = true 
                f.setVisible(true);                                                 
            }
            else if(table.equals("musteriurunmiktari")){
                
            JTable j = new JTable(); 
            DefaultTableModel dtm = new DefaultTableModel(0, 0);
                
            // add header of the table
            String header[] = new String[] {"musteriID","mUrunID","mUrunMiktari"};
            // add header in table model     
            dtm.setColumnIdentifiers(header);
            //set model into the table object
            j.setModel(dtm);
                
            while (resultSet.next()) {
                String a = resultSet.getString("musteriID");
                String b = resultSet.getString("mUrunID");
                String c = resultSet.getString("mUrunMiktari");

                // add row dynamically into the table      
                dtm.addRow(new Object[] { a ,b ,c });
            }
               
                j.setBounds(30, 40, 200, 300); 
  
                // adding it to JScrollPane 
                JScrollPane sp = new JScrollPane(j); 
                f.add(sp); 
                // Frame Size 
                f.setSize(500, 200); 
                // Frame Visible = true 
                f.setVisible(true);                                                 
            }
        
    }
     
     static void deleteFromTable(String query){
        update(query);
    }
     static void ınsertData(String query){
         update(query);
     }
     static void product_query(){
         query("SELECT b.tFirmaAdi,hb.tHammaddeAdi,h.tMiktar,h.tUretimTarihi,h.tRafOmru,h.tSatisFiyati FROM tedarikcibilgi b,tedarikcihammadde h, tedarikcihammaddebilgi hb where b.tFirmaID = h.tFirmaID and hb.tHammaddeID = h.tHammaddeID","a");
     }
     static void tedarikcibilgi(){
         query("select* from tedarikcibilgi","tedarikcibilgi");
     }
      static void tedarikcihammaddebilgi(){
         query("select* from tedarikcihammaddebilgi","tedarikcihammaddebilgi");
     }
       static void tedarikcihammadde(){
         query("select* from tedarikcihammadde","tedarikcihammadde");
     }
    static void ureticialinanhammadde(){
           query("select* from ureticialinanhammadde","ureticialinanhammadde");
       }
       static void mesafebilgi(){
           query("select* from mesafebilgi","mesafebilgi");
       }
       static void kimyasalurun(){
           query("select* from kimyasalurun","kimyasalurun");
       }
       static void kubilgileri(){
           query("select* from kubilgileri","kubilgileri");
       }
    static void uretilenurunler(){
           query("select* from uretilenurunler","uretilenurunler");
       }
    static void musteribilgileri(){
           query("select* from musteribilgileri","musteribilgileri");
    }
    static void musteriurunmiktari(){
           query("select* from musteriurunmiktari","musteriurunmiktari");
    }
       
       static int getrows(String query){
           int rows = 0;
           try {
            connect = DriverManager.getConnection(url, username, password);
            statement = connect.createStatement();
            resultSet = statement.executeQuery(query);
            while (resultSet.next()) {

                rows++;
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }

        return rows;
       }
   

}
