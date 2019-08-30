/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assessment1.BinaryTree;

import org.w3c.dom.Node;


/**
 *
 * @author Trelia
 */
public class BinaryTreeNode {
   public char letter;
   public String code;
   public BinaryTreeNode left;
   public BinaryTreeNode right;
     public static final char EMPTY = ' ';
     
   public BinaryTreeNode(){
       code = null;
        letter = EMPTY;
        left = null;
        right = null;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BinaryTreeNode getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }
 

 
   
   
}
