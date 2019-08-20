/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assessment1.BinaryTree;

import javafx.scene.Node;

/**
 *
 * @author Trelia
 */
public class BinaryTreeNode {
    int value;
    Node left;
    Node right;
 
    BinaryTreeNode(int value) {
        this.value = value;
        right = null;
        left = null;
    }
}
