/*
class BirthMonthChecker
    main()
        //Declare Variables
        num birthMonth = 0
        //Prompt and Input
        output = "Enter the number of your birth month: "
        input birthMonth
        //Process & Output
        if 1 =< birthMonth >= 12 then
            output "Your birth month is: " + birthMonth
        else
            output "You entered an incorrect month value: " + birthMonth
        endIf
    return
endClass
 */

import java.util.Scanner;

public class BirthMonth
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String trash = "";

        int birthMonth = 0;

        System.out.print("Enter the number of your birth month: ");

        if(in.hasNextInt())
        {
            birthMonth = in.nextInt();
            if(birthMonth >= 1 && birthMonth <= 12)
            {
                System.out.println("Your birth month is: " + birthMonth);
            }
            else
            {
                System.out.println("You entered an incorrect month value: " + birthMonth);
            }
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }
    }
}