public class LeapYear {
    public static void main(String[] args) {
        
        int year = 2024; // Year to check
        boolean isLeapYear = false; // Variable to store leap year status

        // Check if the year is divisible by 400
        if (year % 400 == 0) {
            isLeapYear = true; // Year is a leap year
        }
        // Check if the year is divisible by 100 but not by 400
        else if (year % 100 == 0) {
            isLeapYear = false; // Year is not a leap year
        }
        // Check if the year is divisible by 4 but not by 100
        else if (year % 4 == 0) {
            isLeapYear = true; // Year is a leap year
        }
        // If none of the above conditions are met, it is not a leap year
        else {
            isLeapYear = false; // Year is not a leap year
        }

        // Print whether the year is a leap year or not
        if (isLeapYear) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
