package aliquotSumAndPerfectNumbersPKG;

import java.util.Scanner;

public class AliquotSumAndPerfectNumbers {

	public static void main(String[] args) {
		
		// Taking dynamic input
		
		Scanner input = new Scanner(System.in);
		
		System.out.println();
		System.out.println("Enter an Integer number to find its Aliquot Sum and to check if it is a Perfect Number.");
		int num = input.nextInt();
		
		
		
		if (num == 1)                        // If given number is 1 then it doesnt have Aliquot Divisor
		{
			System.out.println();
			System.out.println("*****************************************");
			System.out.println("The Aliquot Sum Of "+ num+" Cannot Be Determined.");
		}
		
		else
		{
			// Creating AliquotSum class object and using setter and getter methods
			
		    AliquotSum as = new AliquotSum();
		    as.setNum(num);
		    System.out.println();
		    System.out.println("*****************************************");
		    System.out.println("The Aliquot Sum Of "+ num+" is : "+as.getAliquotSum());
		    
		    PerfectNumbers pn = new PerfectNumbers();
		    pn.perfectNumber(num);
		    pn.printOneToHundreadPerfectNumbers();
		}

	}

}
