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
      BinaryTreeNode root = new BinaryTreeNode();
        BinaryTreeNode current;
    public char[] letters = {'A', 'B', 'C', 'D', 'E' , 'F' , 'G' , 'H' , 'I' , 'J', 'K', 'L' , 'M' , 'N' , 'O' , 'P', 'Q', 'R', 'S' , 'T' , 'U', 'V', 'W', 'X', 'Y' ,'Z', 
        '1', '2', '3', '4', '5' , '6', '7', '8' , '9' , '0', '.' };
    public String[] Code = {".-" , "-..." , "-.-.", "-.." , "." , 
        "..-.", "--.", "....", "..",  ".---" , "-.-" ,
        ".-..", "--" , "-.", "---" , ".--.", "--.-", ".-.", "..." , 
        "-", "..-" , "...-", ".--", "-..-" , "-.--" , "--." , ".----" , "..---" , "...--" , "....--" , ".....", "-...." , "--...", "---.." , "----.", "-----", ".-.-.-"};
    
    
    public void loopAddData(){
        for(int i = 0; i < letters.length; i++){
            addData(Code[i], letters[i]);
        }
    }
    
    
    
    
    /**
     * Adds data to binary tree
     * currently not working :(
     */
    public void addData(String mcode, char ltr){
     current = root;
        String signal = " ";
 
        for (int i = 0; i < mcode.length(); i++) {
            signal = mcode.substring(i, i + 1);
            if (signal.equals(".")) {
                if (current.getLeft() != null) {
                    current = current.getLeft();
                } else {
                    current.setLeft(new BinaryTreeNode());
                    current = current.getLeft();
                }
            } else {
                if (current.getRight() != null) {
                    current = current.getRight();
                } else {
                    current.setRight(new BinaryTreeNode());
                    current = current.getRight();
                }
            }
        }
        current.setLetter(ltr);
        current.setCode(mcode);
    }
      
    
    
    /**
     * remember space!!
     * decodes a code to letter
     * @param Message
     * @return 
     */
    public String decodeLetter(String Message){
        current = root;
        String word = "";
        char[] Char = Message.toCharArray();
        for (char item : Char){
            if(item == '.'){
               current = current.getLeft();
            }else if (item == '-'){
                current = current.getRight();
            }else if (item == ' '){
                word += current.getLetter();
                current = root;
            }  
        } 
        return word;
    } 
  
 
}
