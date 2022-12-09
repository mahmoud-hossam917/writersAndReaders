/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.os.writersandreaderinrealworld;

/**
 *
 * @author mahmoud hossam
 */
public class Reader implements Runnable{
    
    private final Long id;
 
    private final Resource resource;
    public Reader(Long id, Resource resource){
        this.id=id;
        this.resource=resource;
    }
    @Override
    public void run() {
        
        try{
            System.out.println(resource.Read(id)); 
        }catch(Exception ex){
         ex.printStackTrace();
        }
      
    }
    
}
