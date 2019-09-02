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
 
  public Card card;
    public LinkNode next;
    public LinkNode prev;
    public LinkNode(String suit, String rank) {
        this.card = new Card(suit, rank);
    }

    /**
     * Displays data
     */
     public void displayLink()
     {
         System.out.println(card.getSuit() + " " + card.getRank());
     }
 
     /**
      * Returns display
      */
     public String ReturnDisplayLink(){
         return card.getSuit() + " " + card.getRank();
     }
}
