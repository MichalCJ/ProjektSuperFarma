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
}
