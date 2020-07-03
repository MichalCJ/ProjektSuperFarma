package ThingsToSell;

public class Animals {
    public String speciesName;
    public Double startPurchaseCost;
    public Double howFastTheyGainWage;
    public Double timeToBeingFullAdult;
    public Double amountOfFoodPerWeek;
    public Double chanceForReproduction;
    public String typeOfFood;


    public Animals(String speciesName, Double startPurchaseCost, Double howFastTheyGainWage, Double timeToBeingFullAdult, Double amountOfFoodPerWeek, Double chanceForReproduction, String typeOfFood) {
        this.speciesName = speciesName;
        this.startPurchaseCost = startPurchaseCost;
        this.howFastTheyGainWage = howFastTheyGainWage;
        this.timeToBeingFullAdult = timeToBeingFullAdult;
        this.amountOfFoodPerWeek = amountOfFoodPerWeek;
        this.chanceForReproduction = chanceForReproduction;
        this.typeOfFood = typeOfFood;
    }

    @Override
    public String toString() {
        return "  species: " + this.speciesName + " ,  price:  " + this.startPurchaseCost;
    }

    public Double getPrice() {
        return startPurchaseCost;
    }

    public void feed() {

    }


}
