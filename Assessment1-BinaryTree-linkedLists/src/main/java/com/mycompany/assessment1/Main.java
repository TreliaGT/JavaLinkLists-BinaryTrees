/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assessment1;

import com.mycompany.assessment1.ListLinks.LinkListsCommands;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.mycompany.assessment1.ListLinks.*;
import com.mycompany.assessment1.BinaryTree.*;

/**
 *
 * @author Trelia
 */
public class Main {
      public static LinkListsCommands link = new LinkListsCommands();
      public static BinaryTreeCommands binary = new BinaryTreeCommands();
       public static String input;
       
       
     public static void main(String[] args) throws IOException{
        link.AddingData();
       binary.loopAddData();
        Selection();
     }
     
     /**
      * Runs the selection between binary or linklist examples
      * @param input
      * @throws IOException 
      */
     public static void Selection() throws IOException{
            System.out.println("Please Select LinkList example (L) or BinaryTree example (B)");
              System.out.flush();
                  input = getString();
              if(input.equals("L") ||input.equals("l")){
                LinkList();
            }else if(input.equals("B") ||input.equals("b")){
                binaryTree();
            }else{
                 System.out.println("Please Input L for LinkList or B for BinaryTree");
                 Selection();
            }
     }
    
        /**
      * Gets the input from the user
      * @return
      * @throws IOException 
      */
      public static String getString() throws IOException {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String s = br.readLine();
            return s;
        }
     
     
     /**
      * the start of the linklist example
      */
     public static void LinkList()  throws IOException{
          System.out.println("LinkList example");
             System.out.println("Add (A) , Delete(D), Display Data(DD) , Find(F), Back(back)");
           LinkListselection();
     }
     
     /**
      * Link List option Selection 
      * @throws IOException 
      */
     public static void LinkListselection() throws IOException{
               
               System.out.flush();
                  input = getString();
            if (input.equals("A") ||input.equals("a")){ // adding 
                        System.out.println("Enter what you wish to add to this list");
                           System.out.flush();
                           input = getString();
                           link.insertFirst(input);
                              System.out.println("Has been added");
                              LinkList();
               } else if (input.equals("D") ||input.equals("d")){ //deleting
                   LinkListDelete();
               }else if (input.equals("DD") ||input.equals("dd")){//displaying
                           LinkListDisplaying();
               }else if (input.equals("F") ||input.equals("f")){ //finding data
                          LinkListFind();
               }else if (input.equals("Back") || input.equals("back")){ //back to main menu
                   Selection();
               }else{
                   LinkListselection();
               }  
     }
    
     /**
      * Displays the link list 
      * @throws IOException 
      */
       public static void LinkListDisplaying() throws IOException{
            System.out.println("Do you like to display the data in Reverse order (Y / N)");
                           System.out.flush();
                           input = getString();
                           if(input.equals("Y") || input.equals("y")){
                               link.rDisplayList();
                           }else if (input.equals("N") || input.equals("n")){
                               link.displayList();
                           }else{
                               LinkListDisplaying();
                           }
            LinkList();
       }
       
       public static void LinkListFind() throws IOException{
               System.out.println("Enter what one you wish to find");
               System.out.flush();
             input = getString();
               if(link.find(input) == null){
                   System.out.println("Doesn't Exist");
               }else{
                   System.out.println("This Exists");
               }
                  LinkList();
       }
       
       /**
        * Deletes the item in the link list
        * @throws IOException 
        */
        public static void LinkListDelete() throws IOException{
         System.out.println("Enter what one you wish to delete");
                           System.out.flush();
                           input = getString();
                           link.delete(input);
                           System.out.println("Has been deleted");
                            LinkList();
        }
        
     
     
     /**
      * Start of the binary Tree example
      */
     public static void binaryTree() throws IOException{
         System.out.println("BinaryTree example");
          System.out.flush();
          input = getString();
          System.out.println(binary.decodeLetter(input));          
      
     }
     
     
}
