package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Main thisMan = new Main();
        thisMan.randMath();
    }

    public void randMath(){
        System.out.println((int) ((Math.random()*9+1)*1000000000));
    }
}
