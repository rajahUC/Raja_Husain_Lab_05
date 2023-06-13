/*
class DrinkingAgeDetector
    main()
        //Declare Variables
        num age = 0
        num DRINKING_AGE = 21
        //Prompt and Input
        output "Enter your age: "
        input age
        //Process & Output
        if age > 21 then
            output "You get a wristband!"
        endIf
    return
endClass
 */

import java.util.Scanner;

public class TheatreKiosk
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String trash = "";

        int age = 0;
        final int MINIMUM_AGE = 21;

        System.out.print("Enter your age: ");

        if(in.hasNextInt())
        {
            age = in.nextInt();
        }
        else
        {
            trash = in.nextLine();;
            System.out.println("Invalid age: " + trash);
            System.exit(0);
        }

        if(age >= MINIMUM_AGE)
        {
            System.out.println("You get a wristband!");
        }
    }
}