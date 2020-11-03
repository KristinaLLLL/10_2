package com.company;

public class Main {

    public static void main(String[] args) {
	ChairFactory chair =new ChairFactory();
	Chair chair1=chair.createFunctionalChair();
	Chair chair2=chair.createMagicChair();
	Chair chair3=chair.createVictorianChair(255);
    }
}
