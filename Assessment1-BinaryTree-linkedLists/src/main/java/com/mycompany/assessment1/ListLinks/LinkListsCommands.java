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
    private LinkNode first;
    private LinkNode last;

    public LinkNode find(String key) 
    { 
        LinkNode current = first;
        if (current == null) { return null; }
        while(!current.iData.equals(key)) 
        {
        if(current.next == null) 
            return null; // didn’t find it
        else 
            current = current.next; 
        }
    return current; // found it
    }

    public LinkNode delete(String key) 
    { 
        LinkNode current = first;
        if (current == null) { return null;}
        while(!current.iData.equals(key))
        {
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

    public boolean isEmpty()
    {
        return(first==null || last == null);
    }

    public void insertFirst(String d) 
    {
        LinkNode newLink=new LinkNode(d);
        if (isEmpty()) {
            first = newLink;
            last = newLink;
        } else {
            newLink.next = first;
            first.prev = newLink;
            first = newLink;
        }
    }

    public void displayList()
    {
        LinkNode current = first; 
        while(current != null) {
            current.displayLink(); 
            current = current.next; 
        }
        System.out.println("");
    }
}






