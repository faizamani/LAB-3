/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelticket;

import java.util.Scanner;

/**
 *
 * @author My HP
 */
public class TravelTicket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner scanner = new Scanner (System.in);
  Scanner scanner1 = new Scanner ( System.in);
 
  System.out.print("PLEASE INSERT TICKET DETAILS: ");
  
  int num = scanner.nextInt();
  Ticket ticket [
          ] = new Ticket [num];
  
  for ( int i=0;i<num;i++){
      System.out.println("YOUR TRAVEL PACKAGE"+(i+1));
      System.out.println("TRAVEL PACKAGE :");
      String name = scanner.nextLine();
      System.out.println("DURATION:");
      String id = scanner.nextLine();
      System.out.println("PRICE  :");
      String salary = scanner.nextLine();
      System.out.println("DESCRIPTION :");
      String branch = scanner.nextLine();
  }
    for (int i = 0 ;i<num;i++){
        
        System.out.println("TICKET DETAILS"+(i+1));
        System.out.println("TRAVEL PACKAGE :"+ ticket[i].getPackage());
        System.out.println("DURATION :"+ ticket[i].getDuration());
        System.out.println("PRICE :"+ticket [i].getPrice());
        System.out.println("DESCRIPTION:"+ ticket[i].getDescription());
        
          System.out.println("$$$$$$$$$$ YOUR DETAILS WILL BE RECORDED THANK YOU $$$$$$$$$$");
    }
    
    }
    
}
