package FarmObjects;

import com.company.RandomResult;

import java.util.concurrent.ThreadLocalRandom;

public class Farm implements RandomResult {


   public Integer priceFarm;
   public String name;
   public Integer[] place = new Integer[]{3, 4, 5, 6, 7, 8};
   public String[] farmNames = new String[]{"Fox Run", "Coyote Crossing", "Dingo Point", " Wild Turkey Ranch", "Blueberry Hill", "Whispering Pines"};
   public Integer randomPriceForFarm = ThreadLocalRandom.current().nextInt(250, 1000 + 1);
   public Integer capacity;


   public Farm() {
      this.name = RandomResult.randomResultString(farmNames);
      this.priceFarm = randomPriceForFarm;
      this.capacity = RandomResult.randomResultInteger(place);
   }

   @Override
   public String toString() {
      return " name : " + this.name + " Price farm : " + this.priceFarm + " capacity : " + this.capacity;
   }


}
