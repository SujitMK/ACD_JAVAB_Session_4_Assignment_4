package aliquotSumAndPerfectNumbersPKG;

public class AliquotSum {
	
	protected int num;     // Declaring a Variable
	
	public void setNum(int num)            // Using setter to set the variable value
	{
		this.num = num;
	}

	public int getAliquotSum()            // Using getter to get the Aliquot Divisors Sum message
	{
		int j = 0;
		
		for(int i = 1; i < this.num ; i++)        // Looping through all possible Aliquot divisors
		{
			if((this.num % i) == 0)               // Checking Aliquot Divisors and getting their sum
			{
				j = i + j;                       
			}
		}
		
		return j;
	}
}
