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


    public Player() {
        this.money = 2137.00;

    }


}
