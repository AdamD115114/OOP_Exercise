package com.example.project;

// Attributes
// Series
// Socket type
// Brand
// Number of Cores
// Base clock

/**
 * Cpu
 */
public class Cpu {

    
    //Attributes
    private String series;
    private String socketType;
    private String brand;
    private int cores;
    private double baseClock;

    public Cpu(String series, String socketType, String brand, int cores, double baseClock) {
        this.series = series;
        this.socketType = socketType;
        this.brand = brand;
        this.cores = cores;
        this.baseClock = baseClock;
    }
    
    public String getSeries() {
        return series;
    }
    public String getSocketType() {
        return socketType;
    }
    public String getbrand() {
        return brand;
    }
    public int getcores() {
        return cores;
    }
    public double getBaseClock() {
        return baseClock;
    }

    public void setSeries(String series){
        this.series = series;
    }
    public void setSocketType(String socketType){
        this.socketType = socketType;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setcores(int cores){
        this.cores = cores;
    }
    public void setBaseClock(double baseClock){
        this.baseClock = baseClock;
    }

}