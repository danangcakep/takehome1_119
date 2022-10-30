/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package takehome1_119.takehome1_119;

/**
 *
 * @author Microsoft
 */

public class controllerhitung {
    int jumlahbayar;
    int diskon;
    
    
    public int hitung(String hargamakanan,String jumlahporsi){
        int Total;
        
        Integer chmakanan = Integer.valueOf(hargamakanan);
        Integer cjmakanan = Integer.valueOf(jumlahporsi);
        
       Total = chmakanan * cjmakanan;
       jumlahbayar = Total;
        return jumlahbayar;
    }
    
    public int diskon(){
        int totalbayar;
        int Totalbayardiskon;
    
         if(jumlahbayar < 10000){
            totalbayar = jumlahbayar - (jumlahbayar*0/100);
            Totalbayardiskon = jumlahbayar*diskon/100;
            
        }else if( jumlahbayar < 50000){
            diskon = 5;
            totalbayar = jumlahbayar - (jumlahbayar*10/100);
            Totalbayardiskon = jumlahbayar*diskon/100;
        }else {
            diskon = 10;
            totalbayar = jumlahbayar - (jumlahbayar*diskon/100);
            Totalbayardiskon = jumlahbayar*diskon/100;
        }
        return 0;
    }
    public String tampildiskon(){
  
        String Diskon="";
        if(jumlahbayar < 10000){
           Diskon = "0%";
        return Diskon;
                   
        }
        else if( jumlahbayar < 50000){
            
            Diskon = "10%";
        return Diskon;
        
        }
        return null;
    }
}    
        
   
  
