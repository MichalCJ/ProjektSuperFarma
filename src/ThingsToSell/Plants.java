package ThingsToSell;

public class Plants {

    public Double costOfPreparingThePlanting;
    public Double costOfProtectionAgainstPests;
    public Double efficiencyInTonsFromHectare;
    public Double TimeToFullGrow;
    public Double costOfHarvest;
    public Double pricePerKg;
    public String whenToPlant;

    public Plants(Double costOfPreparingThePlanting, Double costOfProtectionAgainstPests, Double efficiencyInTonsFromHectare, Double TimeToFullGrow, Double costOfHarvest, Double pricePerKg, String whenToPlant) {
        this.costOfPreparingThePlanting = costOfPreparingThePlanting;
        this.costOfProtectionAgainstPests = costOfProtectionAgainstPests;
        this.efficiencyInTonsFromHectare = efficiencyInTonsFromHectare;
        this.TimeToFullGrow = TimeToFullGrow;
        this.costOfHarvest = costOfHarvest;
        this.pricePerKg = pricePerKg;
        this.whenToPlant = whenToPlant;
    }

}
