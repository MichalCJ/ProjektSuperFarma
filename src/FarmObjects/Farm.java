package FarmObjects;

import com.company.RandomResult;

import java.util.concurrent.ThreadLocalRandom;

public class Farm implements RandomResult {


   public Double priceFarm;
   public String name;
   public Integer[] place = new Integer[]{3, 4, 5, 6};
   public String[] farmNames = new String[]{"Fox Run", "Coyote Crossing", "Dingo Point", " Wild Turkey Ranch"};
   public Double randomPriceForFarm = ThreadLocalRandom.current().nextDouble(250, 1000 + 1);
   public Integer capacity;


   public Farm() {
      this.priceFarm = randomPriceForFarm;
      this.name = RandomResult.randomResultString(farmNames);
      this.capacity = RandomResult.randomResultInteger(place);
   }

   @Override
   public String toString() {
      return "Price farm : " + this.priceFarm + "name : " + "capacity : " + this.capacity;
   }


}
