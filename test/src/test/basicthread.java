/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.util.*;
/**
 *
 * @author sayan
 */
public class basicthread implements Runnable{
    
    String name;
    int time;
    Random r = new Random();
    
    //constructor basicthread
    basicthread(String name){
    this.name = name;
        time = r.nextInt(1999);
    }
    
    public void run(){
      try{
          System.out.printf("%s is sleeping for %d \n",name,time);
          Thread.sleep(time);
          System.out.printf("%s is done \n",name);
      }catch(Exception e){
      
      }
    }
}
