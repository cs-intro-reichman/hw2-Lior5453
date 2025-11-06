// This code gets a 24h input of the time and minutes to add to the timer and the code will 
// print the new time in a 24h time format
public class TimeCalc 
{
    public static void main(String[] args) 
    {
        String time = args[0]; // hh:mm
        int minutesToAdd = Integer.parseInt(args[1]);

        // getting a char from the string of the minutes and turning it into string then changing it into an int
        // timing the tens of the minutes by 10 to change to minutes
        // after that doing the same with the hourse and at the end timing it by 60 to change to minutes
        // summaraizing all of the minutes together to get current time in minutes
        int newMinutes = Integer.parseInt("" + time.charAt(3)) * 10 + Integer.parseInt("" + time.charAt(4));
        newMinutes += (Integer.parseInt("" + time.charAt(0)) * 10 + Integer.parseInt("" + time.charAt(1))) * 60;
        newMinutes += minutesToAdd; // adding the new minutes

        int newHours = (newMinutes / 60) % 24; // checking how much hours then getting the remainder of 24 to remove full days
        newMinutes = newMinutes % 60;
        System.out.printf("%02d:%02d", newHours, newMinutes); //using printf to change to 2 numbers if needed
    }
}