package com.kodilla.inheritance.homework;

public class Application {

    public static void main(String[] args){
        OperatingSystem operatingSystem = new OperatingSystem(2019);
        operatingSystem.displayName();
        operatingSystem.displayYear();

        macOs macOs = new macOs(2020);
        macOs.displayName();
        macOs.openSafari();
        macOs.displayYear();

        windows windows = new windows(1998);
        windows.openEdge();
        windows.displayName();
        windows.displayYear();
    }
}
