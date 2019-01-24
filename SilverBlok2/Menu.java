package SilverBlok2;

import java.util.*;

public class Menu {

    public int AmountOfPlayers;

    public Menu(){
        Scanner scan = new Scanner(System.in);
        boolean PlayerNumber = false;
        int InputPlayers = 0;

        // je kijkt met hoeveel spelers gaat worden gespeeld
        System.out.println("With how many players do you wanne play?");
        while(PlayerNumber == false){
            InputPlayers = scan.nextInt();
            if(InputPlayers < 2){
                System.out.println("Te weinig spelers.");
            }else if(InputPlayers > 15){
                System.out.println("Te veel spelers.");
            }else{
                PlayerNumber = true;
            }
        }
        AmountOfPlayers = InputPlayers;
    }

    public boolean JaOfNee(String item) {
        Scanner scan = new Scanner(System.in);
        if (item.equals("wapen")) {
            System.out.println("Wil je dit wapen oppakken?");
        } else if (equals("shild")) {
            System.out.println("Wil je dit shild vervangen voor je eigen shild?");
        } else {
            System.out.println("Wil je deze armor vervangen voor je eigen armor?");
        }

        boolean Input = false;
        String JaOfnee = "";
        while (Input == false) {
            JaOfnee = scan.nextLine();
            if (JaOfnee.equals("ja")) {
                Input = true;
                return true;
            } else if (JaOfnee.equals("nee")) {
                Input = true;
                return false;
            }
        }

        return true;
    }

    public boolean WeightChecker(int PlayerWeight, int MaxWeight){
        if(MaxWeight >= PlayerWeight){
            return true;
        }else{
            return false;
        }

    }
}
