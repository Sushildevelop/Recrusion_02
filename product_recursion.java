package Practice.Recursion_2;

import java.util.Scanner;

public class product_recursion {
    static int product(int x , int y){
        if (y==0){
            return y;
        }
       if (x<y) {
           return product(y, x);
       }
        else if (y!=0){
            return (x+product(x,y-1));
       }
        else
            return 0;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int x = scn.nextInt();
        int y = scn.nextInt();
        System.out.println(product(x,y));
    }
}
