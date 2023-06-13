/*
class ShippingCostCalculator
    main()
        //Declare Variables
        num itemCost = 0
        num SHIPPING_MULTIPLIER = 0.02
        num shippingCost = 0
        num totalCost = 0;
        //Prompt and Input
        output "Enter the price of the item: "
        input itemCost
        //Process
        if itemCost < 100 then
            shippingCost = itemCost * SHIPPING_MULTIPLIER
        else
            shippingCost = 0
        endIf
        totalCost = itemCost + shippingCost
        //Output
        output "The shipping cost is $" + shippingCost + " and the total cost of the item is $" + totalCost
    return
endClass
*/

import java.util.Scanner;

public class ShipCostCalculator
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String trash = "";

        int itemCost = 0;
        final double SHIPPING_MULTIPLIER = 0.02;
        double shippingCost = 0;
        double totalCost = 0;

        System.out.print("Enter the price of the item: ");

        if(in.hasNextInt())
        {
            itemCost = in.nextInt();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("\n" + trash + " is not a valid price");
            System.out.println("Run the program again and enter a valid price");
            System.exit(0);
        }

        if(itemCost < 100)
        {
            shippingCost = SHIPPING_MULTIPLIER * itemCost;
        }
        else
        {
            shippingCost = 0;
        }

        totalCost = itemCost + shippingCost;

        System.out.println("The shipping cost is $" + shippingCost + " and the total cost of the item is $" + totalCost);
    }
}