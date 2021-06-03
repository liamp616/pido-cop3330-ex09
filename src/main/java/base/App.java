/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Liam Pido
 */

/*
Exercise 9 - Paint Calculator

Sometimes you have to round up to the next number rather than follow standard rounding rules.

Calculate gallons of paint needed to paint the ceiling of a room. Prompt for the length and width, and assume one gallon covers 350 square feet.
Display the number of gallons needed to paint the ceiling as a whole number.

Example Output

You will need to purchase 2 gallons of paint to cover 360 square feet.

Remember, you can’t buy a partial gallon of paint. You must
round up to the next whole gallon.

Constraints

Use a constant to hold the conversion rate.
Ensure that you round up to the next whole number.

Challenges

Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
Implement support for a round room.
Implement support for an L-shaped room.
Implement a mobile version of this app so it can be used at the hardware store.
 */

package base;

import java.util.Scanner;

public class App {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        App myApp = new App();
        int length = myApp.inputLength();
        int width = myApp.inputWidth();
        int sf = (length * width);
        double c = (1.0/350.0);
        myApp.output(sf, c);
    }

    public void output(int sf, double c) {
        int gallons =(int) Math.ceil(sf * c);

        if(gallons == 1) {
            System.out.println("You will need to purchase " + gallons + " gallon of paint to cover " + sf + " square feet.");
        } else {
            System.out.println("You will need to purchase " + gallons + " gallons of paint to cover " + sf + " square feet.");
        }

    }

    public int inputWidth() {
        System.out.print("Width ");
        String input = in.nextLine();
        return Integer.parseInt(input);
    }

    public int inputLength() {
        System.out.print("Length ");
        String input = in.nextLine();
        return Integer.parseInt(input);
    }
}