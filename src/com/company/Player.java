package com.company;

import FarmObjects.Buildings;
import FarmObjects.Farm;
import ThingsToSell.Animals;
import ThingsToSell.Plants;

import java.util.ArrayList;
import java.util.List;

public class Player {


    public Double money;
    public List<Plants> ownedPlants;
    public List<Plants> farmPlants = new ArrayList<>();
    public List<Farm> myFarms = new ArrayList<>();
    public List<Animals> ownedAnimals;
    public List<Animals> farmAnimals = new ArrayList<>();
    public Farm farm;
    public Integer week = 1;
    public Integer year = 2020;
    public List<Farm> farmBought;
    public List<Buildings> farmBuildings = new ArrayList<>();
    public List<Buildings> ownedBuildings;

    public Player() {
        this.money = 2137.00;
        this.farm = null;
    }

    public void date() {
        this.week = 1;
        this.year = 2020;
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


/*
    public void buyBuildings(int i) {
        if (money >= farmBuildings.get(i).price) {
            this.ownedBuildings.add(farmBuildings.get(i));
            this.money = money - (farmBuildings.get(i).price);
            farmBuildings.add(i, new Buildings() {

            });
            System.out.println("you bought a building" + this.farmBought);
        } else {
            System.out.println("You don't have money for that try something else");
        }
        System.out.println("now you have: " + this.money);
    }
*/

}
