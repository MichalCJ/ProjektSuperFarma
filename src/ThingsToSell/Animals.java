package ThingsToSell;

public class Animals {
    public String speciesName;
    public Double startPurchaseCost;
    public Double howFastTheyGainWage;
    public Double timeToBeingFullAdult;
    public Double amountOfFoodPerWeek;
    public Double chanceForReproduction;
    public Plants typeOfFood;


    public Animals(String speciesName, Double startPurchaseCost, Double howFastTheyGainWage, Double timeToBeingFullAdult, Double amountOfFoodPerWeek, Double chanceForReproduction, Plants typeOfFood) {
        this.speciesName = speciesName;
        this.startPurchaseCost = startPurchaseCost;
        this.howFastTheyGainWage = howFastTheyGainWage;
        this.timeToBeingFullAdult = timeToBeingFullAdult;
        this.amountOfFoodPerWeek = amountOfFoodPerWeek;
        this.chanceForReproduction = chanceForReproduction;

    }

    public void feed() {

    }


}
