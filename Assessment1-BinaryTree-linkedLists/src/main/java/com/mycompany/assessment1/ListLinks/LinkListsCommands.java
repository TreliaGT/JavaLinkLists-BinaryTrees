/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assessment1.ListLinks;

/** 
 * @author Trelia
 */
public class LinkListsCommands {
    public LinkNode first;
    public LinkNode last;

    /**
     * Finds an node in the linklist
     * @param key
     * @return 
     */
   public LinkNode find(String key) 
{ 
    LinkNode current = first;
    if (current == null) { return null; }
     String match = current.card.getSuit()+ " " + current.card.getRank();
    while(!match.equals(key)) 
    {
         match = current.card.getSuit()+ " " + current.card.getRank();
        if(current.next == null) 
            return null; // didn't find it
        else 
            current = current.next; 
    }
    return current; // found it
}

    /**
     * Deletes a node from the link lists
     * @param key
     * @return 
     */
    public LinkNode delete(String key) 
    { 
        LinkNode current = first;
        if (current == null) { return null;}
        String match = current.card.getSuit()+ " " + current.card.getRank();
    while(!match.equals(key)) 
        {
            match = current.card.getSuit()+ " " + current.card.getRank();
            if(current.next == null) {
                return null;
            }
            current = current.next;
        } // found it
        if(current == first) {
            if (current.next == null) {
                first = null;
                last = null;
            } else {
                LinkNode next = first.next;
                next.prev = null;
                first = null;
                first = next;
            }
        }
        else if (current == last) {
            if (current.prev == null) {
                last = null;
                first = null;
            } else {
                LinkNode prev = last.prev;
                prev.next = null;
                last = null;
                last = prev;
            }
        } else {
            LinkNode prev = current.prev;
            LinkNode next = current.next;
            prev.next = next;
            next.prev = prev;
        }
        return current;
    }

    /**
     * Sees if the linklist is empty
     * @return 
     */
    public boolean isEmpty()
    {
        return(first==null || last == null);
    }

    /**
     * Inserts data in the front of the list
     * @param d 
     */
    public void insertFirst(String s, String r) 
    {
        LinkNode newLink=new LinkNode(s , r );
        if (isEmpty()) {
            first = newLink;
            last = newLink;
        } else {
            newLink.next = first;
            first.prev = newLink;
            first = newLink;
        }
    }

    /**
     * displays the whole list 
     */
    public void displayList()
    {
        LinkNode current = first; 
        while(current != null) {
            current.displayLink(); 
            current = current.next; 
        }
        System.out.println("");
    }
    
        /**
     * displays the whole list 
     */
    public void rDisplayList()
    {
        LinkNode current = last; 
        while(current != null) {
            current.displayLink(); 
            current = current.prev; 
        }
        System.out.println("");
    }
    
    /**
     * Adds the card data
     */
    public void AddingData(){
        String[] Numbers = {"1", "2", "3", "4" , "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        for (String a : Numbers){
            insertFirst("Diamonds", a);
        }
        for (String a : Numbers){
            insertFirst("Hearts", a);
        }
        for (String a : Numbers){
            insertFirst("Clubs", a);
        }
        for (String a : Numbers){
            insertFirst("Spades", a);
        }
    }
    
}






