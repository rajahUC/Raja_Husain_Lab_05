/*
class PartyAffiliationChecker
    main()
        //Declare Variables
        string partyAffiliation = ""
        //Prompt and Input
        output "Enter your party affiliation: "
        input partyAffiliation
        //Process & Output
        if partyAffiliation == "Democrat" then
            output "You get a Democratic Donkey!"
        else if partyAffiliation == "Republican" then
            output "You get a Republican Elephant!"
        else
            output "You get an Independant Man!"
        endIf
    return
endClass

 */

import java.util.Scanner;

public class PartyAffiliation
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String partyMenu = "D - Democrat\tR - Republican\tI - Independent\tO - Other\nChoose your party: ";
        String partyAffiliation = "";

        System.out.print(partyMenu);
        partyAffiliation = in.nextLine();
        partyAffiliation = partyAffiliation.toUpperCase();

        if(partyAffiliation.equals("D"))
        {
            System.out.println("You get a Democratic Donkey!");
        }
        else if(partyAffiliation.equals("R"))
        {
            System.out.println("You get a Republican Elephant!");
        }
        else if(partyAffiliation.equals("I"))
        {
            System.out.println("You get an Independent Man!");
        }
        else
        {
            System.out.println("You chose other!");
        }

    }
}