package com.company;

public class Main {

    public static void main(String[] args) {
	    switchStatement('E');
    }
    public static void switchStatement(char character) {
        switch (character) {
            case 'A':
                System.out.println("Value was A");
                break;
            case 'B':
                System.out.println("Value was B");
                break;
            case 'C':
                System.out.println("Value was C");
                break;
            case 'D':
                System.out.printf("Value was D");
                break;
            case 'E':
                System.out.printf("Value was E");
                break;
            default:
                System.out.println("Value wasn't A, B, C, D or E");
                break;
        }
    }

}
