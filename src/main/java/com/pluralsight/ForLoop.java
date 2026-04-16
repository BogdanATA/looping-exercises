package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) {

        //countdown 10 to 1 with for loop
        for (int i = 10; i >= 0; i--){
            if (i > 0){
                System.out.println(i);
            } else{
                System.out.println("Launch");
            }
        }
    }
}
