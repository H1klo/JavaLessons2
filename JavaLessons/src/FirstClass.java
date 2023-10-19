import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Random;

public class FirstClass {
    public static void main(String[] args) {
//        float mass = 83.0f;
//        double marsMass = mass*0.38f;
//        System.out.printf("%.1f kg on Earth is kg %.4f on Mars\n", mass,marsMass);
//        int marsMassInt = (int)marsMass;
//        System.out.println("Mars mass in round to int: "+ marsMassInt);
//        char marsMassChar = (char)marsMassInt;
//        System.out.println("Mars mass in round to char: "+ marsMassChar);
//        int marsMassCharOperations = marsMassChar * 2 -3;
//        System.out.println("Char after operations: "+ marsMassCharOperations);


//      int randomNumber = (int) (Math.random()*100);
//
//      System.out.println(randomNumber + "\nThe number is even? : \n" + (randomNumber % 2==0));


        BigDecimal priceBD = new BigDecimal("9.99");
        priceBD = (priceBD.add(priceBD.multiply(new BigDecimal(0.23)))).setScale(2,RoundingMode.HALF_EVEN);
        System.out.println("price with tax: " + priceBD);
        priceBD = priceBD.multiply(new BigDecimal(10000)).setScale(2,RoundingMode.HALF_EVEN);
        System.out.println("10000 items with tax: " + priceBD);
        priceBD = priceBD.subtract(priceBD.multiply(new BigDecimal(0.23))).setScale(2,RoundingMode.HALF_EVEN);
        System.out.println("10000 items without tax: " + priceBD);

        System.out.println("double");
        double priceD = 9.99;
        System.out.println("price with tax: "+ (priceD+priceD*0.23));
        double priceDAfterVAT = (priceD+priceD*0.23)*10000;
        System.out.println("10000 items without tax: " +(priceDAfterVAT-priceDAfterVAT*0.23));


    }
}
