// Write a program to find the temperature in fahrenheit when the temperature is given in celcius. 

import java.util.Scanner;

public class find_temp_cel_to_fah {

    public static void main(String[] args) {

        float c = 0, f = 0;

        Scanner temp = new Scanner(System.in);

        System.out.print("Enter the temperature in celcius:");
        c = temp.nextFloat();

        f= (c*9/5)+32;

        System.out.println("The temperature in Fahrenheit :"+f);

    }
}
