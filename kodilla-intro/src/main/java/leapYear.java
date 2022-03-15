public class leapYear {
    public static void main(String[] args) {
        int year = 1996;
        boolean leap = false;
        System.out.println("Year you want to check is: " + year);

        if (year % 4 == 0) {
            if (year % 100 == 0) {

                if (year % 400 == 0) {
                    leap = true;
                } else {
                    leap = false;
                }
            } else {
                leap = true;
            }
        } else {
            leap = false;
        }

        if (leap == true) {
            System.out.println("Year " + year + " is leap");
        } else {
            System.out.println("Year " + year + " is not a leap year");
        }
    }
}
