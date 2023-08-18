package Practice.Recursion_2;

import java.util.Scanner;

public class GCD_RECURSION {
    static int gcd(int x ,int y){
        while(x%y!=0){
            int rem=x%y;
            x=y;
            y=rem;
        }
        return y;
    }
    static int EuclidsAlgo(int x , int y){
        // gcd(x,y) = gcd(y,x%y)
        // gcd(x,0)= x
        if (y==0){
            return  x;
        }
        return  EuclidsAlgo(y,x%y);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
//        System.out.println(gcd(x,y));

        System.out.println(EuclidsAlgo(x,y));
    }
}
