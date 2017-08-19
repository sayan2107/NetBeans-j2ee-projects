/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author sayan
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Thread t1 = new Thread(new basicthread("one"));
     Thread t2 = new Thread(new basicthread("two"));
     Thread t3 = new Thread(new basicthread("three"));
     Thread t4 = new Thread(new basicthread("four"));
     
     t1.start();
     t2.start();
     t3.start();
     t4.start();
    }
    
}
