package BMI;
import java.util.Scanner;

public class Application {




    public static void main(String[] args) {

        Scanner  input = new Scanner(System.in);
        System.out.println("Input height in kg");// input in  kilograms. Range (0.212kg to 610kg)
        float weight = input.nextFloat();
        System.out.println("Input height in cm");  //input in centimeters. Range (24cm to 252 cm)
        float height = input.nextFloat();
        input.close();
      //  float  bmi = (float) ((100 * 100 * weight) / Math.pow(height, 2));

        BMI calculator = new BMI();
        String resultValidation = calculator.calculateValidation(weight,height);
        String resultBmi = calculator.calculateBmi(weight,height);

    }

 }

