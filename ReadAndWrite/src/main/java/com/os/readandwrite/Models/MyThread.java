/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.os.readandwrite.Models;

import java.util.LinkedList;
import java.util.Queue;
import java.util.*;  
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mahmoud hossam
 */
public class MyThread implements Runnable{

    public final Semaphore turn=new Semaphore(1);
  
    @Override
    public void run() {
         System.out.println(Thread.currentThread().getName() + " is ready to enter:"); 
        try {
            turn.acquire();
             System.out.println(Thread.currentThread().getName() + " Entered");
             for(int i=0;i<5;i++){
                 System.out.println(i);
             }
        } catch (InterruptedException ex) {
            Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            turn.release();
            System.out.println(Thread.currentThread().getName() + " exit"); 
        }
    }
    
    
   
    
}
