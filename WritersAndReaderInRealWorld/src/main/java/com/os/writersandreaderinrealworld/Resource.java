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
public class Resource {

    private String content;
    private final Switch readSwitch = new Switch();
    private final Semaphore turn = new Semaphore(1);
    private final Semaphore readRoom = new Semaphore(1);
    public Resource(String content) {
        this.content = content;
    }
    public String Read(Long id) throws InterruptedException {

        turn.acquire();

        readSwitch.lock(readRoom);
        turn.release();
        String currentContent = null;
        try {
            currentContent = "id: " + id + " content:" + content;
        } finally {
            readSwitch.unlock(readRoom);
        }
        return currentContent;
    }

    public String write(long id, String data) throws InterruptedException {
        turn.acquire();
        readRoom.acquire();
        try {
            this.content = "after write:  id:" + id + " content:" + data;
        } finally {
            turn.release();
            readRoom.release();
        }
        return content;

    }

}
