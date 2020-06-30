package com.company;

import FarmObjects.Farm;
import ThingsToSell.Animals;
import ThingsToSell.Plants;

import java.util.ArrayList;
import java.util.List;

public class Player {


    public Double money;
    public List<Plants> ownedPlants = new ArrayList<>();
    public List<Farm> myFarms = new ArrayList<>();
    public List<Animals> ownedAnimals = new ArrayList<>();
    public Farm farm;
    public Integer week = 7;
    public List<Farm> farmBought;


    public Player() {
        this.money = 2137.00;
        this.farm = null;
    }

    public void setMyFarms() {
        this.makeRandomFarms();
    }

    public void makeRandomFarms() {
        for (int i = 0; i < 3; i++) {
            myFarms.add(new Farm());
        }
    }

    public void buyFarm(int i) {
        if (money >= myFarms.get(i).priceFarm) {

            this.farmBought.add(myFarms.get(i));
            this.money = money - (myFarms.get(i).priceFarm);
            myFarms.remove(i);
            myFarms.add(i, new Farm());
            System.out.println("you bought a farm " + this.farmBought);
        } else {
            System.out.println("You don't have money for that try something else");
        }
        System.out.println("now you have: " + this.money);
    }

    public void setFarmBought() {
        this.farmBought = new ArrayList<>();

    }
}
