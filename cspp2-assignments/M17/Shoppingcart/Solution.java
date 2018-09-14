import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int count = 0;
        while(count < n) {
            count++;
            String line = scan.nextLine();
            String[] input = line.split(" ");
            switch(input[0]) {
                case "Item":
                    String[] att = input[1].split(",");
                    cart.addToCatalog(new Item(att[0], Integer.parseInt(att[1]),
                        Double.parseDouble(att[2])));
                    break;
                case "catalog":
                    cart.showCatalog();
                    break;
                case "add":
                    att = input[1].split(",");
                    cart.addToCart(new Item(att[0],  Integer.parseInt(att[1])));
                    break;
                case "show":
                    cart.showCart();
                    break;
                case "remove":
                    att = input[1].split(",");
                    cart.removeFromCart(new Item(att[0], Integer.parseInt(att[1])));
                    break;
                case "totalAmount":
                    System.out.println("totalAmount:" + cart.getTotalAmount());
                    break;
                case "payableAmount":
                    System.out.println("Payable amount:" + cart.getPayableAmount());
                    break;
                case "coupon":
                    cart.applyCoupon(input[1]);
                    break;
                case "print":
                    cart.printInvoice();
                    break;
                default:
                    break;
            }
        }
    }
}