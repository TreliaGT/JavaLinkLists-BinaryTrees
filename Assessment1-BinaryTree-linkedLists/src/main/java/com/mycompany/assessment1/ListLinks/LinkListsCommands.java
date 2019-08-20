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
        while(current.iData != key) 
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
        LinkNode previous = first;
        while(current.iData != key)
        {
            if(current.next == null)
                return null; 
            else{
            previous = current; 
            current = current.next;
            }
        } // found it
        if(current == first) 
            first = first.next;
        else 
            previous.next = current.next; 
        return current;
    }

    public boolean isEmpty()
    {
    return(first==null);
    }

    public void insertFirst(String d) 
    {
    LinkNode newLink=new LinkNode(d);
        if(isEmpty()) {
            last=newLink;
            newLink.next=first; 
            first=newLink; 
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






