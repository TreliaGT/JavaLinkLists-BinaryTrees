/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assessment1.BinaryTree;



/**
 *
 * @author Trelia
 */
public class BinaryTreeCommands {
      BinaryTreeNode root;
        BinaryTreeNode current;
    public char[] letters = {'A', 'B', 'C', 'D', 'E' , 'F' , 'G' , 'H' , 'I' , 'J', 'K', 'L' , 'M' , 'N' , 'O' , 'P', 'Q', 'R', 'S' , 'T' , 'U', 'V', 'W', 'X', 'Y' ,'Z', '1', '2', '3', '4', '5' , '6', '7', '8' , '9' , '.' };
    public String[] Code = {".-" , "-..." , "-.-.", "-.." , "." , 
        "..-.", "--.", "....", "..",  ".---" , "-.-" ,
        ".-..", "--" , "-.", "---" , ".--.", "--.-", ".-.", "..." , 
        "-", "..-" , "...-", ".--", "-..-" , "-.--" , "--." , ".----" , "..---" , "...--" , "....--" , ".....", "-...." , "--...", "---.." , "----.", "-----", ".-.-.-"};
    
    /**
     * Adds data to binary tree
     * currently not working :(
     */
    public void addData(){
       current = root;
      for (int i = 0; i < Code.length; i++){  
          char [] dots = Code[i].toCharArray();
          for (char dot : dots){
              if(dot == '.'){
                if (current.getRight() != null) {
                    current = current.getRight();
                } else {
                    current.setRight(new BinaryTreeNode(letters[i], Code[i]));
                    current = current.getRight();
                } 
              }else if (dot == '-'){
                if (current.getLeft() != null) {
                    current = current.getLeft();
                } else {
                    current.setLeft(new BinaryTreeNode(letters[i], Code[i]));
                    current = current.getLeft();
                }
              }
           }
        }
    }
    
    /**
     * decodes a code to letter
     * @param Message
     * @return 
     */
    public String decodeLetter(String Message){
        return "";
    }
    
    /**
     * codes a message 
     * @param Message
     * @return 
     */
    public String Code(String Message){
        return "";
    }
 
}
