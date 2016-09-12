/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitlab1;

/**
 *
 * @author tuc54014
 */
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class testclass {
    
    String message = "Hello World";
    
    @Test
    public void testPrintMessage(){
        assertEquals(6, new JUnitLab1().add(2, 3));
        
    }
    
    @Test
    public void test1(){
        Date d1 = new Date (2009, 12, 25);
        Date d2 = new Date (2009, 12, 25);
        
        int daysBetween = d1.daysTo(d2);
        
        assertEquals(0, daysBetween);

    }
    
    @Test
    public void test2(){
        Date d1 = new Date (2009, 12, 25);
        Date d2 = new Date (2009, 2, 25);
        
        int daysBetween = d1.daysTo(d2);
        
        assertEquals(300, daysBetween);

    } 
    
    @Test
    public void test3(){
        Date d1 = new Date (2009, 12, 25);
        Date d2 = new Date (2009, 2, 25);
        
        int daysBetween = d1.daysTo(d2);
        
        assertEquals(1, daysBetween);

    } 
}
