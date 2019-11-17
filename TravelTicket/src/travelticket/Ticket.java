/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelticket;

/**
 *
 * @author My HP
 */
public class Ticket {
    private String duration;
    private String description ;
    private String travelpackage;
    private String price;
    
    Ticket (){
    }
    void setDuration(String a){
         duration = a;
    }
    void setDescription (String b){
         description = b;
   }
    void setPackage (String c) {
        travelpackage = c ;    
   }
    void setPrice (String d) {
        price = d;
    }
    
    String getDuration(){
        return duration;
    }
    
    String getDescription(){
        return description ;
    }
    
    String getPackage(){
        return travelpackage ;
    }
     String getPrice(){
         return price ;
     } 














}


