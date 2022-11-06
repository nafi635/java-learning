package com.nafi.basicIntro;

import java.util.Arrays;

public class ArraysConcept {
    public static void main(String[] args) {

        int[]  numbers = {2,3,8,5,6};
        System.out.println(numbers.length);  //Arrays have fixed length , you can't add. if you want, you have to use collections

        //Arrays object is very powerful
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));  /// You can't print arrays directly. Have to use toString method.

        //Multi Dimentional Arrays
        int[][] multiNumbers = new int[2][3];
        multiNumbers[0][0] = 1;
        System.out.println(Arrays.deepToString(multiNumbers)); //toDeepString is needed to print multi dimentional arrays

        int[][] multiNumbersDifferent = {{2,3,4},{4,5,6}};
        System.out.println(multiNumbersDifferent);

    }
}
