import java.util.Scanner;

public class YoungestAndTallestFriend {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Amar's age: ");
        int amarAge = input.nextInt();
        System.out.print("Enter Amar's height: ");
        double amarHeight = input.nextDouble();

        System.out.print("Enter Akbar's age: ");
        int akbarAge = input.nextInt();
        System.out.print("Enter Akbar's height: ");
        double akbarHeight = input.nextDouble();

        System.out.print("Enter Anthony's age: ");
        int anthonyAge = input.nextInt();
        System.out.print("Enter Anthony's height: ");
        double anthonyHeight = input.nextDouble();

        String youngest = "Amar";
        int youngestAge = amarAge;
        if (akbarAge < youngestAge) {
            youngest = "Akbar";
            youngestAge = akbarAge;
        }
        if (anthonyAge < youngestAge) {
            youngest = "Anthony";
            youngestAge = anthonyAge;
        }

        String tallest = "Amar";
        double tallestHeight = amarHeight;
        if (akbarHeight > tallestHeight) {
            tallest = "Akbar";
            tallestHeight = akbarHeight;
        }
        if (anthonyHeight > tallestHeight) {
            tallest = "Anthony";
            tallestHeight = anthonyHeight;
        }

        System.out.println("Youngest friend: " + youngest);
        System.out.println("Tallest friend: " + tallest);

        input.close();
    }
}
