package ThingsToSell;

public class Plants {
    public String nameOfPlant;
    public Double costOfSeeds;
    public Double costOfPreparingThePlanting;
    public Double costOfProtectionAgainstPests;
    public Double efficiencyInTonsFromHectare;
    public Double TimeToFullGrow;
    public Double costOfHarvest;
    public Double pricePerKg;
    public String whenToPlant;

    public Plants(Double costOfSeeds, String nameOfPlant, Double costOfPreparingThePlanting, Double costOfProtectionAgainstPests, Double efficiencyInTonsFromHectare, Double TimeToFullGrow, Double costOfHarvest, Double pricePerKg, String whenToPlant) {
        this.costOfSeeds = costOfSeeds;
        this.nameOfPlant = nameOfPlant;
        this.costOfPreparingThePlanting = costOfPreparingThePlanting;
        this.costOfProtectionAgainstPests = costOfProtectionAgainstPests;
        this.efficiencyInTonsFromHectare = efficiencyInTonsFromHectare;
        this.TimeToFullGrow = TimeToFullGrow;
        this.costOfHarvest = costOfHarvest;
        this.pricePerKg = pricePerKg;
        this.whenToPlant = whenToPlant;
    }

    @Override
    public String toString() {
        return "  name: " + this.nameOfPlant + " ,  price:  " + this.costOfSeeds;
    }

    public Double getPrice() {
        return costOfSeeds;
    }

}
