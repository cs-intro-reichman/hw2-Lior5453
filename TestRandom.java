// This function gets a random num and generates that number of times math.random function
// this function will print the num times bigger and lower then 0.5 and the ratio between them
public  class  TestRandom 
{
	public static void main(String[]  args)
	{
		int numTries = Integer.parseInt(args[0]);
		double numLowerThenHalf = 0;
		double numHigherThenHalf = 0;

		for (int i = 0; i < numTries; i++)
		{
			double randomNum = Math.random();
			if (randomNum < 0.5)
				numLowerThenHalf++;
			else
				numHigherThenHalf++;
		}

		System.out.printf("> 0.5:  %d times\n" , (int)numHigherThenHalf);
		System.out.printf("<= 0.5: %d times\n", (int)numLowerThenHalf);
		
		double ratio = (numHigherThenHalf / numLowerThenHalf);
		if (ratio != 0)
			System.out.println("Ratio:  " + ratio);
	}
}