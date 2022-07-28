import java.util.Scanner;
public class Survey {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name :");
        String name=scan.nextLine();
        System.out.println("how much money do you spend for food ");
        double money= scan.nextDouble();
        System.out.println("My name is "+name+" I spend "+money+" rupees a day");
        scan.close();
    }
    
}