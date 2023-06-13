/*
class ComparingTwoNumbers
    main()
        //Declare Variables
        num num1 = 0
        num num2 = 0
        //Prompt and Input
        output "Enter the first number: "
        input num1
        output "Enter the second number: "
        input num2
        //Process & Output
        if num1 > num2 then
            output "The first number, " + num 1 ", is greater than the second number, " + num2
        else if num1 < num2 then
            output "The first number, " + num 1 ", is less than the second number, " + num2
        else
            output "The first number, " + num 1 ", is equal to the second number, " + num2
        endIf
    return
endClass

 */

import java.util.Scanner;

public class NumCompare
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String trash = "";

        int num1 = 0;
        int num2 = 0;

        System.out.print("Enter the first number: ");

        if(in.hasNextInt())
        {
            num1 = in.nextInt();
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid input. Re-run the program and try again.");
            System.exit(0);
        }

        System.out.print("Enter the second number: ");

        if(in.hasNextInt())
        {
            num2 = in.nextInt();
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid input. Re-run the program and try again.");
            System.exit(0);
        }

        if(num1 > num2)
        {
            System.out.println("The first number, " + num1 + ", is greater than the second number, " + num2);
        }
        else if(num1 < num2)
        {
            System.out.println("The first number, " + num1 + ", is less than the second number, " + num2);
        }
        else
        {
            System.out.println("The first number, " + num1 + ", is equal to the second number, " + num2);
        }
    }
}