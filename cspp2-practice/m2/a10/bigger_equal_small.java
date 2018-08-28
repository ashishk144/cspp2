import java.util.*;
class bigger_equal_small{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = sc.nextInt();

        if (a > b){
            System.out.println("a > b");
        }

        else if (a == b){
            System.out.println("a == b");
        }
        else{
            System.out.println("a < b");
        }
    }
}