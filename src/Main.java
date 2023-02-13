public class Main {
    public static void main(String[] args) {
        int birthMonth;
        birthMonth = 33; //simulating input
        if (birthMonth >= 1 & birthMonth<=12) {
            System.out.println("Your birth month is : " + birthMonth);
        }

        //for a value not in range
        else {
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }
    }
}