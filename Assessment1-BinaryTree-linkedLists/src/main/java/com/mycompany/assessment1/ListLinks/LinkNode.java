/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assessment1.ListLinks;

/**
 *
 * @author Trelia
 */
public class LinkNode {
    public String iData;
    public LinkNode next;
    public LinkNode prev;

    public LinkNode(String dData) {
        this.iData = dData;
    }

 public void displayLink()
 {
   System.out.print(iData+" ");
 }

  

    
}
