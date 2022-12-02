/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.os.readandwrite;

import com.os.readandwrite.Models.MyThread;
import com.os.readandwrite.Models.componant;
import java.lang.invoke.VolatileCallSite;
import java.util.*;  
/**
 *
 * @author mahmoud hossam
 */
public class ReadAndWrite {
    
    
   

    public static void main(String[] args) throws InterruptedException {
        
      
        
      
        MyThread a=new MyThread();
        MyThread b=new MyThread();
        MyThread c=new MyThread();
        MyThread d=new MyThread();
        Thread t1=new Thread(a);
        Thread t2=new Thread(b);
        Thread t3=new Thread(c);
        Thread t4=new Thread(d);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
     
      
       
    }
}
