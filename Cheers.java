public class Cheers
{
    public static void main(String[] args)
    {
        String inputWord = args[0];
        int numPrints = Integer.parseInt(args[1]);

        String printA = "AEFHILMNORSX";
        //{'A', 'E', 'F', 'H', 'I', 'L', 'M', 'N', 'O', 'R', 'S', 'X'}

        for (int i = 0; i < inputWord.length(); i++)
        {
            char currentChar = inputWord.charAt(i);
            if (printA.indexOf(currentChar) != -1)
                System.out.printf("Give me an %c: %c!\n", currentChar, currentChar);
            else
                System.out.printf("Give me a  %c: %c!\n", currentChar, currentChar);
        }

        System.out.println("What does that spell?");
        for (int i = 0; i < numPrints; i++)
        {
            System.out.printf("%s!!!\n", inputWord);
        }
    }
}  