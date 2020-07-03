package com.company;

import FarmObjects.*;
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
        this.farmBought = new ArrayList<>();
        this.ownedBuildings = new ArrayList<>();
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

    public void makeSilo() {
        farmBuildings.add(new Silo(" Silos ", 50.00, 100.00));
    }

    public void makeByre() {
        farmBuildings.add(new Byre(" Byre ", 40.00, 20.0));
    }

    public void makeCoop() {
        farmBuildings.add(new ChickenCoop(" Chicken copp ", 30.00, 15.0));
    }

    public void makeStable() {
        farmBuildings.add(new Stable(" Stable ", 45.00, 20.0));
    }

    public void setFarmBuildings() {
        this.makeSilo();
        this.makeByre();
        this.makeCoop();
        this.makeStable();
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


    public void buyBuildings(Buildings building, int i) {
        if (money >= farmBuildings.get(i).getPrice()) {
            this.ownedBuildings.add(farmBuildings.get(i));
            this.money = money - (farmBuildings.get(i).getPrice());
            farmBuildings.add(building);
            System.out.println("you bought a building " + this.ownedBuildings);
        } else {
            System.out.println("You don't have money for that try something else");
        }
        System.out.println("now you have: " + this.money);
    }


}
