package aliquotSumAndPerfectNumbersPKG;

public class PerfectNumbers {

	AliquotSum as = new AliquotSum();
	
	public void perfectNumber(int pNum)
	{
		as.setNum(pNum);
		int rNum = as.getAliquotSum();
		
		System.out.println();
		System.out.println("*****************************************");
		System.out.println();
		System.out.println("Given Number : "+pNum);
		System.out.println("Aliquote Sum : "+rNum);
		
		if(pNum == rNum)
		{
			System.out.println();
			System.out.println("The Given Number is a Perfect Number.");
		}
		else
		{
			System.out.println();
			System.out.println("The Given Number is a Not Perfect Number");
		}
		
		System.out.println();
		System.out.println("*****************************************");	
	}
	
	public void printOneToHundreadPerfectNumbers()
	{
		
		System.out.println();
		System.out.println("The Perfect Number Between 1 to 100 Are,");
		System.out.println();
		
		for(int i = 1; i<=100; i++)
		{
			as.setNum(i);
			int j = as.getAliquotSum();
			
			if(i == j)
			{
				System.out.println(i);
			}
		}
	
		System.out.println("*****************************************");
	}
}
