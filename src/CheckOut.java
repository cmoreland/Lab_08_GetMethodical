import java.util.Scanner;
public class CheckOut {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double total = 0;
        boolean hasItem = SafeInput.getYNConfirm(in,"Do you have an item? [Y/N]");
        if (hasItem){
            do {
                double price = SafeInput.getRangedDouble(in, "What is the price of your item?", 0.50, 10);
                total = total + price;
                System.out.println("Your current total is $" + total);
                in.nextLine();
                hasItem = SafeInput.getYNConfirm(in, "Do you have any more items? [Y/N]");
            }while(hasItem);
        }
        System.out.printf("Your final total is $%.2f", total);
    }
}
