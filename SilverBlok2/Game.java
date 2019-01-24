package SilverBlok2;

import java.util.*;

public class Game {

    public static void main(String[] args) {
        //menu opent en je kiest het aantel spelers
        Menu Menu = new Menu();

        //je maakt het aantal spelers aan
        Player[] player = new Player[Menu.AmountOfPlayers];

        Scanner scan = new Scanner(System.in);

        //spelers worden gemaakt
        for (int i = 0; i < player.length; i++) {
            player[i] = new Player();
        }

        //de naam van de players worden hier later in opgeslagen
        String PlayerNames[] = new String[Menu.AmountOfPlayers];

        //loop om iedereen zijn keuzes te laten maken
        for (int i = 0; i < player.length; i++) {
            int p = i + 1;
            boolean ChooseClass = false;

            //je kiest de naam voor je speler
            System.out.println("Player " + p + " what is your name?");
            boolean ChooseName = false;
            while (ChooseName == false) {
                String InputName = "";
                InputName = scan.nextLine();
                player[i].SetName(InputName);
                PlayerNames[i] = InputName;

                ChooseName = true;

                if (InputName.equals("")) {
                    ChooseName = false;
                }
            }

            System.out.println("\n\n" + player[i].GetName() + " which class do you want?");
            System.out.println("Type 1 for Soldier:   Hp: 250.   Attack: 10.   Defence: 25.   Max Weight: 250.");
            System.out.println("Type 2 for Scout:     Hp: 150.   Attack: 5.    Defence: 15.   Max Weight: 270.");
            System.out.println("Type 3 for Sniper:    Hp: 100.   Attack: 20.   Defence: 20.   Max Weight: 310.");
            System.out.println("Type 4 for Knight:    Hp: 300.   Attack: 15.   Defence: 20.   Max Weight: 230.");
            System.out.println("Type 5 for Tank:      Hp: 450.   Attack: 5.    Defence: 40.   Max Weight: 210.");

            // je kiest je class
            while (ChooseClass == false) {
                int InputClass = 0;
                InputClass = scan.nextInt();
                switch (InputClass) {
                    case 1:
                        player[i].SetHp(250);
                        player[i].SetAttack(10);
                        player[i].SetDefence(25);
                        player[i].SetMaxWeight(250);
                        ChooseClass = true;
                        break;
                    case 2:
                        player[i].SetHp(150);
                        player[i].SetAttack(5);
                        player[i].SetDefence(15);
                        player[i].SetMaxWeight(270);
                        ChooseClass = true;
                        break;
                    case 3:
                        player[i].SetHp(100);
                        player[i].SetAttack(20);
                        player[i].SetDefence(20);
                        player[i].SetMaxWeight(310);
                        ChooseClass = true;
                        break;
                    case 4:
                        player[i].SetHp(300);
                        player[i].SetAttack(15);
                        player[i].SetDefence(20);
                        player[i].SetMaxWeight(230);
                        ChooseClass = true;
                        break;
                    case 5:
                        player[i].SetHp(450);
                        player[i].SetAttack(5);
                        player[i].SetDefence(40);
                        player[i].SetMaxWeight(210);
                        ChooseClass = true;
                        break;
                }
                if (ChooseClass == false) {
                    System.out.println("Class not defined.");
                }
            }

            System.out.println("\n\n" + player[i].GetName() + " what weapon do you want?");
            System.out.println("Press 1 for Knife:     Damage: 70.     Durability: 10.  Accuracy: 100.  Weight: 20;");
            System.out.println("Press 2 for Sword:     Damage: 100.    Durability: 4.   Accuracy: 75.   Weight: 40;");
            System.out.println("Press 3 for Pistol:    Damage: 80.     Durability: 6.   Accuracy: 80.   Weight: 10;");
            System.out.println("Press 4 for Shotgun:   Damage: 130.    Durability: 2.   Accuracy: 70.   Weight: 60;");
            System.out.println("Press 5 for RPG:       Damage: 170.    Durability: 1.   Accuracy: 80.   Weight: 70;");

            //je kiest je beginwapen
            boolean ChooseWeapon = false;
            while (ChooseWeapon == false) {
                int InputWeapon = 0;
                InputWeapon = scan.nextInt();
                switch (InputWeapon) {
                    case 1:
                        player[i].AddWeapon("Knife");
                        ChooseWeapon = true;
                        player[i].SetWeight(20);
                        break;
                    case 2:
                        player[i].AddWeapon("Sword");
                        ChooseWeapon = true;
                        player[i].SetWeight(40);
                        break;
                    case 3:
                        player[i].AddWeapon("Pistol");
                        ChooseWeapon = true;
                        player[i].SetWeight(10);
                        break;
                    case 4:
                        player[i].AddWeapon("Shotgun");
                        ChooseWeapon = true;
                        player[i].SetWeight(60);
                        break;
                    case 5:
                        player[i].AddWeapon("RPG");
                        ChooseWeapon = true;
                        player[i].SetWeight(70);
                        break;
                }
                if (ChooseWeapon == false) {
                    System.out.println("Weapon not defined.");
                }
            }

            System.out.println("\n\n" + player[i].GetName() + " what kind of armor_shields do you want?");
            System.out.println("Press 1 for Wooden Armor_Shields:   Defence: 40.  Durability: 3.   Weight: 20.");
            System.out.println("Press 2 for Iron Armor_Shields:     Defence: 20.  Durability: 5.   Weight: 40.");
            System.out.println("Press 3 for Steel Armor_Shields:    Defence: 30.  Durability: 7.   Weight: 50.");
            System.out.println("Press 4 for Gold Armor_Shields:     Defence: 10.  Durability: 10.  Weight: 10.");
            System.out.println("Press 5 for Diamond Armor_Shields:  Defence: 60.  Durability: 2.   Weight: 70.");

            //je kiest de armor_shields waarmee je begint
            boolean ChooseArmor = false;
            while (ChooseArmor == false) {
                int InputArmor = 0;
                InputArmor = scan.nextInt();
                switch (InputArmor) {
                    case 1:
                        player[i].SetArmor("Wooden_Armor");
                        ChooseArmor = true;
                        player[i].SetWeight(player[i].GetWeight() + 20);
                        break;
                    case 2:
                        player[i].SetArmor("Iron_Armor");
                        ChooseArmor = true;
                        player[i].SetWeight(player[i].GetWeight() + 40);
                        break;
                    case 3:
                        player[i].SetArmor("Steel_Armor");
                        ChooseArmor = true;
                        player[i].SetWeight(player[i].GetWeight() + 50);
                        break;
                    case 4:
                        player[i].SetArmor("Gold_Armor");
                        ChooseArmor = true;
                        player[i].SetWeight(player[i].GetWeight() + 10);
                        break;
                    case 5:
                        player[i].SetArmor("Diamond_Armor");
                        ChooseArmor = true;
                        player[i].SetWeight(player[i].GetWeight() + 70);
                        break;
                }
                if (ChooseWeapon == false) {
                    System.out.println("Armor_Shields not defined.");
                }
            }

            System.out.println("\n\n" + player[i].GetName() + " what kind of Shield do you want?");
            System.out.println("Press 1 for Wooden Shield:   Defence: 40.  Durability: 3.   Weight: 20.");
            System.out.println("Press 2 for Iron Shield:     Defence: 20.  Durability: 5.   Weight: 40.");
            System.out.println("Press 3 for Steel Shield:    Defence: 30.  Durability: 7.   Weight: 50.");
            System.out.println("Press 4 for Gold Shield:     Defence: 10.  Durability: 10.  Weight: 10.");
            System.out.println("Press 5 for Diamond Shield:  Defence: 60.  Durability: 2.   Weight: 70.");

            // je kiest het schild waarmee je begint
            boolean ChooseShield = false;
            while (ChooseShield == false) {
                int InputShield = 0;
                InputShield = scan.nextInt();
                switch (InputShield) {
                    case 1:
                        player[i].SetShield("Wooden_Shield");
                        ChooseShield = true;
                        player[i].SetWeight(player[i].GetWeight() + 20);
                        break;
                    case 2:
                        player[i].SetShield("Iron_Shield");
                        ChooseShield = true;
                        player[i].SetWeight(player[i].GetWeight() + 40);
                        break;
                    case 3:
                        player[i].SetShield("Steel_Shield");
                        ChooseShield = true;
                        player[i].SetWeight(player[i].GetWeight() + 50);
                        break;
                    case 4:
                        player[i].SetShield("Gold_Shield");
                        ChooseShield = true;
                        player[i].SetWeight(player[i].GetWeight() + 10);
                        break;
                    case 5:
                        player[i].SetShield("Diamond_Shield");
                        ChooseShield = true;
                        player[i].SetWeight(player[i].GetWeight() + 70);
                        break;
                }
                if (ChooseShield == false) {
                    System.out.println("Shield not defined.");
                }
            }
        }

        //de game gaat starten
        boolean GameAan = true;
        while (GameAan == true) {

            int LijstGewichten[] = new int[Menu.AmountOfPlayers];
            int Order = 0;
            int PlayerNumber = 0;

            //je maakt de gewichtenlijst en ordent hem.
            for (int i = 0; i < LijstGewichten.length; i++) {
                LijstGewichten[i] = player[i].GetWeight();
            }
            Arrays.sort(LijstGewichten);

            //dit zorgt ervoor dat er steeds een ronde gaat gebeuren
            boolean RoundAan = true;
            while (RoundAan == true) {

                //je kijkt welke player gaat beginnen.
                for (int i = 0; i < player.length; i++) {
                    if (LijstGewichten[Order] == player[i].GetWeight()) {
                        PlayerNumber = i;
                    }
                }

                //vraagt of je wil aanvallen of gaan zoeken
                System.out.println(player[PlayerNumber].GetName() + " do you want to attack or search for a item?");
                String InputAction = "";
                boolean ChooseAction = false;
                while (ChooseAction == false) {
                    InputAction = scan.nextLine();
                    InputAction = InputAction.toLowerCase();
                    if (InputAction.equals("attack") || InputAction.equals("search")) {
                        ChooseAction = true;
                    }
                }

                if (InputAction.equals("attack")) {

                    // vraagt wie je wilt aanvallen en laat een lijst zijn wie je kunt aanvallen
                    System.out.println("Who do you want to attack?");
                    for (int i = 0; i < PlayerNames.length; i++) {
                        System.out.println(PlayerNames[i] + " HP: " + player[i].GetHp());
                    }

                    //checkt of je een player hebt gekozen om aan te vallen en zoekt uit welke dat is
                    boolean ChoosePlayer = false;
                    String InputPlayer = "";
                    int ChosenPlayer = 0;
                    while (ChoosePlayer == false) {
                        InputPlayer = scan.nextLine();
                        for (int i = 0; i < PlayerNames.length; i++) {
                            if (InputPlayer.equals(PlayerNames[i])) {
                                ChoosePlayer = true;
                                ChosenPlayer = i;
                            }
                        }
                    }

                    //vraagt met welk wapen je wil aanvallen
                    System.out.println("With which weapon do you want to attack?");
                    String WeaponList[] = new String[player[PlayerNumber].GetWeaponsLength()];
                    for (int i = 0; i < WeaponList.length; i++) {
                            WeaponList[i] = player[PlayerNumber].GetWeapons(i);
                    }
                    for (int i = 0; i < WeaponList.length; i++) {
                        if (WeaponList[i] == null) {

                        } else {
                            System.out.println(player[PlayerNumber].GetWeapons(i));
                        }
                    }

                    //checkt welk wapen je hebt gekozen en onthoud het
                    boolean ChooseWeapon = false;
                    String InputWeapon = "";
                    int ChosenWeapon = 0;
                    while (ChooseWeapon == false) {
                        InputWeapon = scan.nextLine();
                        for (int i = 0; i < WeaponList.length; i++) {
                            if (InputWeapon.equals(WeaponList[i])) {
                                ChooseWeapon = true;
                                ChosenWeapon = i;
                            }
                        }
                    }

                    //checkt of het hit
                    double AccuracyTester = Math.ceil(Math.random() * 100);
                    if (AccuracyTester < player[PlayerNumber].GetRealWeapon(ChosenWeapon).GetAccuracy()) {
                        // hij doet damgage met de attack en de damage van het wapen samen
                        int Damage = (player[PlayerNumber].GetRealWeapon(ChosenWeapon).GetDamage() + player[PlayerNumber].GetAttack()) - (player[ChosenPlayer].GetRealShield().GetDefense() + player[ChosenPlayer].GetRealArmor().GetDefense() + player[ChosenPlayer].GetDefence());
                        if (Damage < 0) {
                            Damage = 0;
                        }
                        System.out.println("Je hebt hem geraakt je deed " + Damage + " damage.");
                        System.out.println("Hij heeft nog " + player[ChosenPlayer].GetHp() + " HP over");
                        player[ChosenPlayer].SetHp(player[ChosenPlayer].GetHp() - Damage);
                        player[PlayerNumber].GetRealWeapon(ChosenWeapon).SetDurability(player[ChosenWeapon].GetRealWeapon(ChosenPlayer).GetDurability() - 1);
                        player[ChosenPlayer].CheckDurabilityArmor();
                        player[ChosenPlayer].CheckDurabilityShield();

                        if(player[PlayerNumber].CheckDurabilityWeapon(ChosenWeapon) == true){
                            System.out.print("Je wapen is gebroken.");
                        }

                        //checkt of de player dood is
                        if(player[ChosenPlayer].GetHp() == 0){
                            player[ChosenPlayer] = null;
                        }
                    } else {
                        //hij mist hier de attack
                        System.out.println("Jammer genoeg miste je");
                        player[PlayerNumber].GetRealWeapon(ChosenPlayer).SetDurability(player[PlayerNumber].GetRealWeapon(ChosenPlayer).GetDurability() - 1);
                    }

                } else if (InputAction.equals("search")) {
                    double RandomNumber = Math.ceil(Math.random() * 16);
                    boolean Antwoord;
                    if (RandomNumber == 1) {
                        System.out.println("Je hebt jammer genoeg niks gevonden.");
                    } else if (RandomNumber == 2) {
                        System.out.println("Je hebt Golden Armor gevonden.");
                        Antwoord = Menu.JaOfNee("armor");
                        if(Antwoord == true){
                            player[PlayerNumber].SetShield("Gold_Armor");
                        }
                    } else if (RandomNumber == 3) {
                        System.out.println("Je hebt een IJzeren Shild gevonden.");
                        Antwoord = Menu.JaOfNee("shild");
                        if(Antwoord == true) {
                            player[PlayerNumber].SetShield("Iron_shield");
                        }
                    } else if (RandomNumber == 4) {
                        System.out.println("Je hebt Houten Armor gevonden.");
                        Antwoord = Menu.JaOfNee("armor");
                        if(Antwoord == true){
                            player[PlayerNumber].SetArmor("Wood_Armor");
                        }
                    } else if (RandomNumber == 5) {
                        System.out.println("Je hebt een Knife gevonden.");
                        Antwoord = Menu.JaOfNee("wapen");
                        if(Antwoord == true){
                            if(Menu.WeightChecker(player[PlayerNumber].GetWeight() + 20,player[PlayerNumber].GetMaxWeight())) {
                                player[PlayerNumber].AddWeapon("Knife");
                            }else{
                                System.out.println("Je kunt dit wapen niet dragen.");
                            }
                        }
                    } else if (RandomNumber == 6) {
                        System.out.println("Je hebt een Gouden Shild gevonden.");
                        Antwoord = Menu.JaOfNee("shild");
                        if(Antwoord == true){
                            player[PlayerNumber].SetShield("Gold_shild");
                        }
                    } else if (RandomNumber == 7) {
                        System.out.println("Je hebt een Diamond Shild gevonden.");
                        Antwoord = Menu.JaOfNee("shild");
                        if(Antwoord == true){
                            player[PlayerNumber].SetShield("diamond_shild");
                        }
                    } else if (RandomNumber == 8) {
                        System.out.println("Je hebt een RPG gevonden.");
                        Antwoord = Menu.JaOfNee("wapen");
                        if(Antwoord == true){
                            if(Menu.WeightChecker(player[PlayerNumber].GetWeight() + 100,player[PlayerNumber].GetMaxWeight())) {
                                player[PlayerNumber].AddWeapon("RPG");
                            }else{
                                System.out.println("Je kunt dit wapen niet dragen.");
                            }
                        }
                    } else if (RandomNumber == 9) {
                        System.out.println("Je hebt Diamond Armor gevonden.");
                        Antwoord = Menu.JaOfNee("armor");
                        if(Antwoord == true){
                            player[PlayerNumber].SetArmor("Diamond_Armor");
                        }
                    } else if (RandomNumber == 10) {
                        System.out.println("Je hebt een Stalen Shild gevonden.");
                        Antwoord = Menu.JaOfNee("shild");
                        if(Antwoord == true){
                            player[PlayerNumber].SetShield("steel_shild");
                        }
                    } else if (RandomNumber == 11) {
                        System.out.println("Je hebt een Pistol gevonden.");
                        Antwoord = Menu.JaOfNee("wapen");
                        if(Antwoord == true){
                            if(Menu.WeightChecker(player[PlayerNumber].GetWeight() + 10,player[PlayerNumber].GetMaxWeight())) {
                                player[PlayerNumber].AddWeapon("Pistol");
                            }else{
                                System.out.println("Je kunt dit wapen niet dragen.");
                            }                        }
                    } else if (RandomNumber == 12) {
                        System.out.println("Je hebt Iron Armor gevonden.");
                        Antwoord = Menu.JaOfNee("armor");
                        if(Antwoord == true){
                            player[PlayerNumber].SetArmor("iron_Armor");
                        }
                    } else if (RandomNumber == 13) {
                        System.out.println("Je hebt een Shotgun gevonden.");
                        Antwoord = Menu.JaOfNee("wapen");
                        if(Antwoord == true){
                            if(Menu.WeightChecker(player[PlayerNumber].GetWeight() + 80, player[PlayerNumber].GetMaxWeight())) {
                                player[PlayerNumber].AddWeapon("Shotgun");
                            }else{
                                System.out.println("Je kunt dit wapen niet dragen.");
                            }                        }
                    } else if (RandomNumber == 14) {
                        System.out.println("Je hebt Steel Armor gevonden.");
                        Antwoord = Menu.JaOfNee("armor");
                        if(Antwoord == true){
                            player[PlayerNumber].SetArmor("steel_Armor");
                        }
                    } else if (RandomNumber == 15) {
                        System.out.println("Je hebt een Houten Shild gevonden.");
                        Antwoord = Menu.JaOfNee("shild");
                        if(Antwoord == true){
                            player[PlayerNumber].SetShield("wooden_Armor");
                        }
                    } else if (RandomNumber == 16) {
                        System.out.println("Je hebt een Sword gevonden.");
                        Antwoord = Menu.JaOfNee("wapen");
                        if(Antwoord == true){
                            if(Menu.WeightChecker(player[PlayerNumber].GetWeight() + 50, player[PlayerNumber].GetMaxWeight())) {
                                player[PlayerNumber].AddWeapon("Sword");
                            }else{
                                System.out.println("Je kunt dit wapen niet dragen.");
                            }                        }
                    }
                }

                // zorgt ervoor dat hierna de volgende is
                Order = Order + 1;

                //zorgt ervoor dat de ronde stopt als de laatste speler is geweest
                if (Order == Menu.AmountOfPlayers) {
                    RoundAan = false;
                }
            }
        }
    }
}
