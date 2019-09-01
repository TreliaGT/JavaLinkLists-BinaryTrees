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
          
    /**
     * Tests if list can have an value
     */
    @Test
    public void testLinkList(){
        LinkListsCommands list = new LinkListsCommands();
       list.AddingData();
     String actual =  list.first.iData;
       assertEquals("Spades K" , actual);
    }
    
    /**
     * second tests if list can have an value
     */
      @Test
    public void testLinkList2(){
        LinkListsCommands list = new LinkListsCommands();
       list.AddingData();
     String actual =  list.last.iData;
       assertEquals("Diamonds 1" , actual);
    }
    
    /**
     * Test to not find if  value exists 
     */
    @Test
    public void testLinkListFind(){
        String key = "Diamond";
        LinkListsCommands list = new LinkListsCommands();
        list.AddingData();
        assertNull(list.find(key));
    }
    
       /**
     * Test 2 to find if value exists 
     */
    @Test
    public void testLinkListFind2(){
        String key = "Diamonds 1";
        boolean result;
        LinkListsCommands list = new LinkListsCommands();
         list.AddingData();
       if(list.find(key) == null){
            result = false;
        }else{
           result = true;
       }
        assertTrue(result);
    }
    
   
    /**
     * Test one for binary decoder
     */
    @Test
    public void testBinaryDecoder(){
        BinaryTreeCommands Binary = new BinaryTreeCommands();
        Binary.loopAddData();
        String expResult = "A";
        assertEquals(expResult ,Binary.decodeLetter(".- "));
    }
    
    /**
     * Test 2 for binary decoder 
     */
     @Test
    public void testBinaryDecoder2(){
        BinaryTreeCommands Binary = new BinaryTreeCommands();
        Binary.loopAddData();
        String expResult = "B";
        assertEquals(expResult ,Binary.decodeLetter("-... "));
    }
    
  
}
