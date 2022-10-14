package com.example.project;

/**
 * entryPoint
 */
public class EntryPoint {

    public static void main(String[] args){
        Computer myComputer = new Computer(01, "32 GB", "AMD Ryzen Threadripper 3990X", "1TB M.1 PCIE Gen3.0");


        System.out.println(myComputer.toString());
    }
}