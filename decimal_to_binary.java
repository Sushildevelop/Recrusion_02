package Practice.Recursion_2;

import java.util.Scanner;

public class decimal_to_binary {
    static int find(int dec){
        if (dec==0){
            return 0;
        }
        else
            return (dec%2+10*find(dec/2));
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(find(n));
    }
}
