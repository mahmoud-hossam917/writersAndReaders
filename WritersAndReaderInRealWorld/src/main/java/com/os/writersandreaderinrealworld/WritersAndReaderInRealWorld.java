/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.os.writersandreaderinrealworld;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mahmoud hossam
 */
public class WritersAndReaderInRealWorld {
    

    public static void main(String[] args) throws InterruptedException {
        
        final Long numberOfReaders=5L;
        final Long numberOfWriter=5L;    
      
       
        final Resource resource=new Resource("No comment");
        for(int i=0;i<numberOfReaders;i++){
               Long id=Long.valueOf(i);
            new Thread(new Reader(id,resource)).start();
        }
        for(int i=0;i<numberOfWriter;i++){
            Long id=Long.valueOf(i);
            new Thread(new Writer(id,"new content",resource)).start();
        }
      
        
    }
}
