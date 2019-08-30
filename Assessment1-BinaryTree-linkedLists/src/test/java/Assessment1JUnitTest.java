/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.mycompany.assessment1.ListLinks.*;
import com.mycompany.assessment1.BinaryTree.*;

/**
 *
 * @author V244682
 */
public class Assessment1JUnitTest {
     LinkListsCommands list = new LinkListsCommands();
     BinaryTreeCommands Binary = new BinaryTreeCommands();   
     
    @Test
    public void test1(){
        assertEquals(1,1);
    }
    
    @Test
    public void LinkListTest(){
       list.AddingData();
     String actual =  list.first.iData;
       assertEquals("Diamonds 2" , actual);
    }
    
    @Test
    public void LinkListFindTest(){
        String key = "Diamond";
        LinkListsCommands instance = new LinkListsCommands();
        assertNull(instance.find(key));
    }
    
    @Test
    public void DecoderTest(){
        Binary.loopAddData();
        String expResult = "A";
        assertEquals(Binary.decodeLetter(".-"), expResult);
    }
}
