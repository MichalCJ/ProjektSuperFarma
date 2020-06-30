package com.company;

import java.io.IOException;
import java.util.Scanner;
public class Main {

    public static int menu() {
        System.out.println("This is the main section of the game. Choose a number for a next option.");
        System.out.println("1. Buy a farm.");
        System.out.println("2. Buy a field(Arable land).");
        System.out.println("3. Buy a Silo.");
        System.out.println("4. Buy a Byre.");
        System.out.println("5. Buy animals.");
        System.out.println("6. Buy plants.");
        System.out.println("7. Plant plants.");
        System.out.println("8.Harvest plants.");
        System.out.println("9.Sell plants.");
        System.out.println("10.Sell animals .");
        System.out.println("11.Check how much plants do you have .");
        System.out.println("12.Check how much animals do you have .");
        System.out.println("13. End this week.");
        Scanner scanMenu = new Scanner(System.in);

        return scanMenu.nextInt();
    }

    public static void main(String[] args) throws IOException {

        Scanner number = new Scanner(System.in);

        Player player = new Player();
        player.setMyFarms();
        player.setFarmBought();
        System.out.println("Welcome ! Let's star new game.");


        int choice = menu();
        while (choice != 0) {
            switch (choice) {
                case 1:
                    System.out.println(" This are available farms ");
                    System.out.println(" This is your money" + player.money);
                    System.out.println(player.myFarms);
                    System.out.println(" Now you need to choose between this three farms ");
                    int farm = number.nextInt();
                    switch (farm) {
                        case 1:
                            player.buyFarm(0);
                            break;
                        case 2:
                            player.buyFarm(1);
                            break;
                        case 3:
                            player.buyFarm(2);
                            break;
                        default:
                            System.out.println("Choose number between 1-3");
                            break;
                    }

                    break;
                case 2:
                    System.out.println(" This is your money" + player.money);
                    break;
                case 3:
                    System.out.println(" This is your  money" + player.money);
                    break;
                case 4:
                    System.out.println(" This is your   money" + player.money);
                    break;
                case 5:
                    System.out.println("  This is your money" + player.money);
                    break;
                case 6:
                    System.out.println("   This is your money" + player.money);
                    break;
                case 7:
                    System.out.println(" You decided to plant plants, you need to choose which one : ");

//                    int plantPlants = number.nextInt();
//                   switch (plantPlants){
//                        case 1:
//                            break;
//                        case 2:
//                            break;
//                        case 3:
//                            break;
//                    }

                    break;
                case 8:
                    System.out.println(" 8");
                    break;
                case 9:
                    System.out.println(" 9");
                    break;

                case 10:
                    System.out.println(" 10");
                    break;
                case 11:
                    System.out.println(" 11");
                    break;
                case 12:
                    System.out.println(" 12");
                    break;

                case 13:
                    System.out.println(" 13");
                    break;

            }
            System.out.println("Now you need press enter to continue");
            System.in.read();
            choice = menu();

        }

    }
}