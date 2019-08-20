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


/**
 *
 * @author Trelia
 */
public class Main {
     public LinkListsCommands list = new LinkListsCommands();
     
      
     public static void main(String[] args) throws IOException{
          System.out.println("Please Select LinkList example (L) or BinaryTree example (B)");
        Selection();
     }
     
     /**
      * Runs the selection between binary or linklist examples
      * @param input
      * @throws IOException 
      */
     public static void Selection() throws IOException{
          String input;
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
     public static void LinkList(){
          System.out.println("LinkList example");
     }
     
     
     
     /**
      * Start of the binary Tree example
      */
     public static void binaryTree(){
         System.out.println("BinaryTree example");
     }
     
     
}
