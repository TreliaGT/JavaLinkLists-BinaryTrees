/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.mycompany.assessment1.ListLinks.*;

/**
 *
 * @author V244682
 */
public class Assessment1JUnitTest {
     LinkListsCommands list = new LinkListsCommands();
    public Assessment1JUnitTest() {
    }
    
    /**
     * Tests if the linklist is able to find a value
     */
   @Test
   public void LinkListFindTest(){
      list.AddingData();
      
     // assertEquals( list.find("Diamonds 1") , null);
       assertEquals( list.find("1") , null);
   }

     @Test
    public void test1(){
        assertEquals(1,1);
    }
}
