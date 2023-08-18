package Practice.Recursion_2;

import java.util.Scanner;

public class M_summation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number n and m: ");
        int n = scn.nextInt();
//        int m = scn.nextInt();
//        System.out.println(rec(n, m));
        System.out.println(sumofn(n));
    }
    public static int rec(int n, int m) {
        if (m == 1)
            return sumofn(n);

        int sum = rec(n, m - 1);
        return sumofn(sum);
    }
    public static int sumofn(int n){  // 3 - 2 -1 (1)
        int ans = 0;
        if(n == 1){
            ans++;
            return ans;
        }
        ans = ans+ n + sumofn(n-1);
        return ans;
    }

}
