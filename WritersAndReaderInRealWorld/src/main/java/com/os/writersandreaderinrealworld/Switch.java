/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.os.writersandreaderinrealworld;

import java.util.concurrent.Semaphore;

/**
 *
 * @author mahmoud hossam
 */
public class Switch {
    
    private int counter=0;
    private final Semaphore mutex=new Semaphore(5);
    
    public void lock(Semaphore semaphore) throws InterruptedException{
        mutex.acquire();
        try{
            counter++;
            if(counter==1){
                semaphore.acquire();
            }
            
        }finally{
            mutex.release();
        }
        
    }
    public void unlock(Semaphore semaphore) throws InterruptedException{
        mutex.acquire();
        try{
            counter--;
            if(counter==0){
                semaphore.release();
            }
        }finally{
            mutex.release();
        }
        
    }
    
    
    
}
