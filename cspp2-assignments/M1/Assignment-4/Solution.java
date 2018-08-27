import java.util.Scanner;

public class Solution {
	/*
	Do not modify this main function.
	*/
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		double degreesCelsius = scan.nextDouble();
		calculateFromDegreesToFarenheit(degreesCelsius);
		// double temp_f = (degreesCelsius*1.8)+32;
		// System.out.println("Temp in Celsius: "+degreesCelsius);
		// System.out.println("Temp in Farhenheit: "+temp_f);
	}
	/*
	Need to fill the calculateFromDegreesToFarenheit function and print the output
	of fahrenheit.
	*/
	public static void calculateFromDegreesToFarenheit(double degreesCelsius)
	{
		double temp_f = (degreesCelsius*1.8)+32;
		// System.out.println("Temp in Celsius: "+degreesCelsius);
		System.out.println(temp_f);
	}
}