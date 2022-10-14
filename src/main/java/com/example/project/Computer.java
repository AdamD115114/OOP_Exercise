
package com.example.project;
/**
 * Computer
 */
public class Computer {
    private int id;
    private String memory;
    private String cpu; 
    private String storage;
    public Computer(int id, String memory, String cpu, String storage){
        this.id = id;
        this.cpu = cpu;
        this.memory = memory;
        this.storage = storage;
    }

    public String getMemory(){
        return memory;
    }
    public String getCpu(){
        return cpu;
    }
    public String getStorage(){
        return storage;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setMemory(String memory){
        this.memory = memory;
    }
    public void setCpu(String cpu){
        this.cpu = cpu;
    }
    public void setStorage(String storage){
        this.storage = storage;
    }


    public String toString(){
        return  "Computer id: " + getId() + "\n" +
                "Cpu : " + getCpu() + "\n" + 
                "Memory: " + getMemory() + "\n" +
                "Storage: " + getStorage();
    }
}