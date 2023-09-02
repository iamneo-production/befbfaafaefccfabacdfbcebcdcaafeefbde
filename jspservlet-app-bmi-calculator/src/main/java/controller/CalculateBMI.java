package controller;

public class CalculateBMI {
	public static double calculate(double height,double weight){
		double bmi =weight/(height*height);
		return bmi;
	}
	public static String description(double bmi){
		if(bmi<18.5){
			return "Under Weight";
		}else if(bmi<24.9){
			return "Normal";
		}else if(bmi<29.9){
			return "Over Weight";
		}else if(bmi<34.9){
			return "Obese";
		}else{
			return "Extremely Obese";
		}
	}
}
