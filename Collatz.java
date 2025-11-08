// Demonstrates the Collatz conjecture.
public class Collatz 
{
	public static void main(String args[]) 
	{
		int N = Integer.parseInt(args[0]); // Getting the seed
		String mode = args[1];

		if (mode.equals("v"))
		{
			for (int i = 1; i <= N; i++)
			{
				int currentNum = i;
				int count = 1;
				do // making to do while so it will check if cureentNum = 1
				{
					System.out.print(currentNum + " ");
					if (currentNum % 2 == 0) 
					{
						currentNum /= 2;
					}
					else
					{
						currentNum = currentNum * 3 + 1;
					}
					count++;	
				} while (currentNum != 1);
				System.out.println("1 (" + count + ")");
			}
		}
		else // "c" 
		{
			boolean reach1 = true;
			
			for (int i = 1; i <= N; i++)
			{
				int currentNum = i;
				do
				{
					if (currentNum % 2 == 0) 
					{
						currentNum /= 2;
					}
					else
					{
						currentNum = currentNum * 3 + 1;
					}
				} while (currentNum != 1);
			}

			if (reach1)
				System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
			else
				System.out.println("An error was accured, 1 wasn't reached");
		}
	}
}
