/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.os.writersandreaderinrealworld;


/**
 *
 * @author mahmoud hossam
 */
public class Writer implements Runnable{

    private final Long id;
    private final String newContent;
    private final Resource resource;
    
    public Writer(Long id,String newContent, Resource resource){
        this.id=id;
        this.newContent=newContent;
        this.resource=resource;
        
    }
    
    @Override
    public void run() {
    
        try{
            
            System.out.println(resource.write(id,newContent)); 
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
    
    
}
