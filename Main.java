import java.util.Scanner;

public class Main{
	public static void main(String[] args){

	Scanner stdln = new Scanner(System.in);

    	System.out.print("身長(m):");
    	double hieght = stdln.nextDouble();

	System.out.print("体重(kg):");
	double weight = stdln.nextDouble();

	double bmi = weight / Math.pow(hieght,2);

    	System.out.println("BMI:"+(Math.floor(bmi*100)/100));

	}
}
