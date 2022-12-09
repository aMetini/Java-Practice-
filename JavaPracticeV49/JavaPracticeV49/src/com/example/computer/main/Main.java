package com.example.computer.main;

import com.example.computer.classes.Computer;
import com.example.computer.classes.Laptop;
import com.example.computer.classes.StationeryComputer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.turnOn();
        computer.performDownload();
        computer.playMusic();
        computer.performUpload();
        computer.playVideo();
        computer.turnOff();

        Laptop laptop = new Laptop();
        laptop.turnOn();
        laptop.performDownload();
        laptop.playMusic();
        laptop.performUpload();
        laptop.playVideo();
        laptop.turnOff();

        StationeryComputer stationeryComputer = new StationeryComputer();
        stationeryComputer.turnOn();
        stationeryComputer.performDownload();
        stationeryComputer.playMusic();
        stationeryComputer.performUpload();
        stationeryComputer.playVideo();
        stationeryComputer.turnOff();
    }
    
}
