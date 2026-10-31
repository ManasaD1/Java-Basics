import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int money = sc.nextInt();
        int burgers = sc.nextInt();
        int juices = sc.nextInt();

        int bill = (burgers * 80) + (juices * 40);

        if (bill >= 200) {
            bill = bill - 30;
        }

        if (money >= bill) {
            int change = money - bill;

            System.out.println("Bill ₹" + bill);
            System.out.println("Affordable");
            System.out.println("Change ₹" + change);
        } else {
            System.out.println("Bill ₹" + bill);
            System.out.println("Not Affordable");
        }

        sc.close();
    }
}