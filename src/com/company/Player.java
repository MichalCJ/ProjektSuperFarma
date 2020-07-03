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
        this.ownedAnimals = new ArrayList<>();
        this.ownedPlants = new ArrayList<>();
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

    public void makeBuildings() {
        farmBuildings.add(new Silo(" Silos ", 50.00, 100.00));
        farmBuildings.add(new Byre(" Byre ", 40.00, 20.0));
        farmBuildings.add(new ChickenCoop(" Chicken copp ", 30.00, 15.0));
        farmBuildings.add(new Stable(" Stable ", 45.00, 20.0));
    }


    public void makeAnimals() {
        farmAnimals.add(new Animals("Cow", 5.0, 3.0, 2.0, 6.0, 6.9, "grass"));
        farmAnimals.add(new Animals("Horse", 6.0, 3.0, 2.0, 5.0, 6.9, "Hay"));
        farmAnimals.add(new Animals("Sheep", 3.0, 2.0, 1.5, 4.0, 6.9, "grass"));
        farmAnimals.add(new Animals("Chicken", 1.0, 1.5, 1.0, 2.0, 6.9, "grain"));

    }

    public void makePlants() {
        farmPlants.add(new Plants(4.0, "Apple-tree", 5.0, 6.0, 2.0, 3.0, 2.5, 8.0, "Spring"));
        farmPlants.add(new Plants(2.0, "Wheat", 3.0, 4.0, 3.0, 2.0, 2.0, 5.0, "Spring"));
        farmPlants.add(new Plants(2.5, "Potatoes", 3.5, 4.5, 4.0, 2.0, 2.0, 6.5, "Spring"));


    }

    public void setFarmBuildings() {
        this.makeBuildings();

    }

    public void setMakeAnimals() {
        this.makeAnimals();

    }

    public void setMakePlants() {
        this.makePlants();
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

    public void buyAnimals(Animals animal, int i) {
        if (money >= farmAnimals.get(i).getPrice()) {
            this.ownedAnimals.add(farmAnimals.get(i));
            this.money = money - (farmAnimals.get(i).getPrice());
            farmAnimals.add(animal);
            System.out.println("you bought a animal " + this.ownedAnimals);
        } else {
            System.out.println("You don't have money for that try something else");
        }
        System.out.println("now you have: " + this.money);
    }

    public void buyPlants(Plants plant, int i) {
        if (money >= farmPlants.get(i).getPrice()) {
            this.ownedPlants.add(farmPlants.get(i));
            this.money = money - (farmPlants.get(i).getPrice());
            farmPlants.add(plant);
            System.out.println("you bought a plant seed " + this.ownedPlants);
        } else {
            System.out.println("You don't have money for that try something else");
        }
        System.out.println("now you have: " + this.money);
    }


}
