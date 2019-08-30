/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import com.mycompany.assessment1.BinaryTree.BinaryTreeCommands;
import com.mycompany.assessment1.ListLinks.LinkListsCommands;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author V244682
 */
public class JUnitTest {
    
    public JUnitTest() {
    }
          
    
    @Test
    public void testLinkList(){
        LinkListsCommands list = new LinkListsCommands();
       list.AddingData();
     String actual =  list.first.iData;
       assertEquals("Spades K" , actual);
    }
    
      @Test
    public void testLinkList2(){
        LinkListsCommands list = new LinkListsCommands();
       list.AddingData();
     String actual =  list.last.iData;
       assertEquals("Diamonds 1" , actual);
    }
    
    @Test
    public void testLinkListFind(){
        String key = "Diamond";
        LinkListsCommands instance = new LinkListsCommands();
        assertNull(instance.find(key));
    }
   
    
    @Test
    public void testBinaryDecoder(){
        BinaryTreeCommands Binary = new BinaryTreeCommands();
        Binary.loopAddData();
        String expResult = "A";
        assertEquals(expResult ,Binary.decodeLetter(".- "));
    }
    
     @Test
    public void testBinaryDecoder2(){
        BinaryTreeCommands Binary = new BinaryTreeCommands();
        Binary.loopAddData();
        String expResult = "B";
        assertEquals(expResult ,Binary.decodeLetter("-... "));
    }
    
  
}
