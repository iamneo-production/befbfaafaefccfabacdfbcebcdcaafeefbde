package controller;

public class CalculateBMI {

    public static double Calculate(double height, double weight) {
        if (height <= 0 || weight <= 0) {
            return -1.0;
        }
        double bmi = weight / (height * height);
        return bmi;
    }

    
    public static String description(double bmi) {
        if (bmi < 18.5) {
            return "Under Weight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Over Weight";
        } else if (bmi >= 30 && bmi < 34.9) {
            return "Obese";
        } else {
            return "Extremely Obese";
        }
    }

    public static void main(String[] args) {
        double height = 1.75; 
        double weight = 65.0; 

        double bmi = Calculate(height, weight);
        String category = description(bmi);

        System.out.println("BMI: " + bmi);
        System.out.println("Category: " + category);
    }
}

