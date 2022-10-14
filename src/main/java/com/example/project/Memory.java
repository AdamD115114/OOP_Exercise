package com.example.project;

// Attributes 
// - Speed
// - Size
// - Brand


/**
 * Memory
 */
public class Memory {
    private int size;
    private String speed;
    private String brand;


    // public Memory(int size, String speed, String brand){
    //     this.brand = brand;
    //     this.speed = speed;
    //     this.size = size;
    // }

    public Memory(){}
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setSpeed(String speed){
        this.speed = speed;
    }
    public void setSize(int size){
        this.size = size;
    }

    public String getBrand(){
        return brand;
    }
    public String getSpeed(){
        return speed;
    }
    public int getSize(){
        return size;
    }


}