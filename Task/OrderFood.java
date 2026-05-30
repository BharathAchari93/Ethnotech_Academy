import java.util.*;


abstract class FoodOrder {
    abstract void showMenu();
    abstract void printBill(int qty);
}


class Swiggy extends FoodOrder {

    int price = 120;

    @Override
    void showMenu() {
        System.out.println(" MENU ");
        System.out.println("1. Burger - Rs.120");
    }

    @Override
    void printBill(int qty) {
        System.out.println("Bill Amount = Rs." + (price * qty));
    }
}

public class OrderFood {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        FoodOrder order = new Swiggy();

        order.showMenu();

        System.out.print("Enter Burger Quantity: ");
        int qty = sc.nextInt();

        order.printBill(qty);
    }
}