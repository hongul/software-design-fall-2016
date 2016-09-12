/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junitlab1;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 *
 * @author tuc54014
 */


public class JUnitLab1 {
    
    public int add(int i, int j){
        return i+j;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World");
        Result result = JUnitCore.runClasses(testclass.class);
        
        for (Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
        
        
        
    }
    
}
