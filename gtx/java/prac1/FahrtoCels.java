import java.util.Scanner;

public class FahrtoCels {
    public static void main(String[] args) {
        final int MIN_TEMP = 70;
        final int MAX_TEMP = 90;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a saturday fahrenheit value: ");
        int satFahr = input.nextInt(); //declaring variables

        double satCels = (5.0/9) * (satFahr - 32);

        boolean raining = false;
        System.out.print("Is it raining? ");
        String in = input.next().toLowerCase();
        if (in.startsWith("y")){
            raining = true;
        }

        System.out.println("Weekend averages:");
        System.out.printf("Saturday: %.2f \n", satCels);

        if ((satFahr >= MIN_TEMP) && (satFahr <= MAX_TEMP) && !raining){
            System.out.println("Yay! Its atleast "
                                + MIN_TEMP
                                + " degrees but under "
                                + MAX_TEMP
                                + ".");
            System.out.println("Time to go to park");
        }
        else{
            System.out.println("Stay home");
        }
    }
}