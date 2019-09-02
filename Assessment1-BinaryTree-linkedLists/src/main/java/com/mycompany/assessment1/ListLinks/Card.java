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
public class Card {
    
        private String suit;
    private String rank;
    
   public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }
    
    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

      public void setSuit(String suit) {
        this.suit = suit;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
