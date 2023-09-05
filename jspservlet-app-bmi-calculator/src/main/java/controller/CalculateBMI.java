package controller;

public class CalculateBMI {

    // Method to calculate BMI
    public static double Calculate(double height, double weight) {
        if (height <= 0 || weight <= 0) {
            // Handle invalid input (height or weight cannot be zero or negative)
            return -1.0;
        }

        // Calculate BMI using the formula: BMI = weight (kg) / (height (m) * height (m))
        double bmi = weight / (height * height);
        return bmi;
    }

    // Method to describe BMI category
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
        // Example usage:
        double height = 1.75; // Replace with the actual height in meters
        double weight = 65.0; // Replace with the actual weight in kilograms

        double bmi = Calculate(height, weight);
        String category = description(bmi);

        System.out.println("BMI: " + bmi);
        System.out.println("Category: " + category);
    }
}

