package com.example.computer.classes;

import com.example.computer.interfaces.ComputerOperations;

public class Computer implements ComputerOperations {
    private String className;

    public Computer() {
        this.className = "Computer";
    }

    public String getComputer() {
        return className;
    }

    public void setComputer(String className) {
        this.className = className;
    }

    @Override
    public void turnOn() {
        // TODO Auto-generated method stub
        System.out.println(getComputer() + " is now turned on!");
    }

    @Override
    public void turnOff() {
        // TODO Auto-generated method stub
        System.out.println(getComputer() + " is now turned off!");
        
    }

    @Override
    public void performDownload() {
        // TODO Auto-generated method stub
        System.out.println(getComputer() + " is performing a download!");
    }

    @Override
    public void performUpload() {
        // TODO Auto-generated method stub
        System.out.println(getComputer() + " is performing an upload!");
    }

    @Override
    public void playVideo() {
        // TODO Auto-generated method stub
        System.out.println(getComputer() + " is playing video!");
    }

    @Override
    public void playMusic() {
        // TODO Auto-generated method stub
        System.out.println(getComputer() + " is playing music!");
    }
    
}
