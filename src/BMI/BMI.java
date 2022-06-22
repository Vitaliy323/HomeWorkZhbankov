package BMI;



public class BMI {

    // validation
    public String calculateValidation(float weight,float height) {

         if (weight < 0.212 || weight > 610) {
            System.out.println("Iccorrect input. Weight input range from 0.212kg to 610 kg");
            System.exit(0);
        } else if (height < 24 || height > 252) {
            System.out.println("Iccorrect input. Height input ran" +
                    "ge from 24cm to 252 cm");
            System.exit(0);
        }

        return null;
    }


    public String calculateBmi(float weight,float height) {
        String result = null;

   float  bmi = (float) ((100 * 100 * weight) / Math.pow(height, 2));

        if (bmi < 16){
            System.out.println("Severe Thinness");
            System.out.println("Your BMI is "+bmi);
        }
        else if (bmi >= 16 && bmi <= 17) {
            System.out.println("Moderate Thinness");
            System.out.println("Your BMI is "+bmi);
        }
        else if (bmi > 17 && bmi <= 18.5) {
            System.out.println("Mild Thinness");
            System.out.println("Your BMI is "+bmi);
        }
        else if (bmi > 18.5 && bmi <= 25) {
            System.out.println("Normal");
            System.out.println("Your BMI is "+bmi);
        }
        else if (bmi > 25 && bmi <= 30) {
            System.out.println("Overweight");
            System.out.println("Your BMI is "+bmi);
        }
        else if (bmi > 30 && bmi <= 35) {
            System.out.println("Obese Class I");
            System.out.println("Your BMI is "+bmi);
        }
        else if (bmi > 35 && bmi <= 40) {
            System.out.println("Obese Class II");
            System.out.println("Your BMI is "+bmi);
        }
        else if (bmi > 40 ) {
            System.out.println("Obese Class III");
            System.out.println("Your BMI is "+bmi);
        }
        return result;
    }


}
