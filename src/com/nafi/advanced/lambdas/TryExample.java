package com.nafi.advanced.lambdas;

public class TryExample {
    public static void main(String[] args)
    {
        try {
            int[] i = {1, 2, 3};
            int x = i[3];//Change to 2 to see "return" result
            System.exit(0);
            return;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("caught");

        } finally {
            System.out.println("finally");
        }
    }

}
