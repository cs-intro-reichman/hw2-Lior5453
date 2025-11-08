// Computes an approximation of PI.
public class CalcPi 
{
	public static void main(String [] args) 
	{
		int numberElements = Integer.parseInt(args[0]);
		double newPI = 0;
		
		for (int i = 0; i < numberElements; i++) // each time adding the correct value into newPI
		{
			newPI += (Math.pow(-1, i) / (2*i + 1));
		}
		newPI *= 4; // Timing the sum by 4 to get the newPI real value

		System.out.println("pi according to Java: " + Math.PI); // priniting PI
		System.out.println("pi, approximated:     " + newPI); // printing new PI
	}
}