/*
Quintin Amon
01/20/22
Exercise 1
*/
package com.company;

public class Main {

    public static void main(String[] args) {

        int zip = 43215;
        String city = "Columbus";
        double[] temps = {32.0, 25.0, 27.5, 40.0, 45.0};
        double avg = (temps[0]+temps[1]+temps[2]+temps[3]+temps[4])/5;
        System.out.print("City:" + city + " " + "Zip code:" + zip + " " + "Average temp:" + avg);

    }
}
