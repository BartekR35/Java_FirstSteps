// Mars gravity is about 38% of Earth's. Write a program which will count Your weight on Mars
// Plus variable type conversions

import java.math.BigDecimal;
import java.math.RoundingMode;

public class WhatsYourWeightOnMars {
    public static void main(String[] args) {
      float EarthWRainka = 100;
      float MarsWRainka = (float) (EarthWRainka * 0.38);

      System.out.println(MarsWRainka);

      // some data type conversions below

      double RandomVarRainka = 1.31415925;

      //double -> BigDecimal and limit to 4 zeros after coma

      BigDecimal RoundedRandomVarRainka = BigDecimal.valueOf(RandomVarRainka).setScale(4, RoundingMode.HALF_UP);

      System.out.println(RoundedRandomVarRainka);

      // double -> int

      double SomeDigitRainka = 63.340;

      SomeDigitRainka = (int) SomeDigitRainka;;

      // int -> char

      SomeDigitRainka = (char) SomeDigitRainka;

      System.out.println(SomeDigitRainka);;

      //Some math on variable

      SomeDigitRainka = (double) (SomeDigitRainka);

      SomeDigitRainka = SomeDigitRainka * 5.4;

      System.out.println(SomeDigitRainka);


    }
}