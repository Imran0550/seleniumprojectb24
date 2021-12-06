package com.cybertek.tests.MyPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class HappyFunTime {
    public static void main(String[] args) {

        String s = "AAABBBBCCCCG";

        String [] arr = s.split("");
        System.out.println(Arrays.toString(arr));
       String result = "";
             for(String each : arr){
                 int count = 0;
                 for(String each2 : arr){

                     if(each2.equals(each)){
                         count++;
                     }


                 }

                 if(!result.contains(each)){
                     result += each + count;
                 }

             }
        System.out.println(result);


             int [] arr2 = {1,2,3,4,5,6};
             int n =9;
             int y =0;

             int length = arr2.length;

             int [] newArr= new int[length + 2];

             for(int i =0;i<length;i++){
                 newArr[i] = arr2[i];
             }

             newArr[length] = n;
             newArr[length + 1] = y;

        System.out.println(Arrays.toString(newArr));


        int [][] arr3 = new int[3][3];

        arr3[0][0]=3;
        arr3[0][1]=4;
        arr3[0][2]=5;
        arr3[1][0]=1;
        arr3[2] [1]= 2;

        System.out.println(Arrays.toString(arr3[0]));
        System.out.println(Arrays.toString(arr3[1]));
        int max = arr3[0][0];
        for(int [] each : arr3){
            int count =0;
            for(int each2 : each){

                if(each2 > max){
                    max = each2;
                }

            }
        }

        System.out.println(max);

        int [][] ar = {

                {1,2,3,4,5},
                {1,3,3,4,5},
                {2,4,5,6}
        };

        System.out.println(Arrays.toString(ar[0]));
        System.out.println(Arrays.toString(ar[1]));
        System.out.println(Arrays.toString(ar[2]));
int min = ar[0][0];
        for(int [] each : ar){

            for(int each2 : each){
                if(each2<min){
                    min = each2;
                }
            }
        }
        System.out.println(min);

        ArrayList<Character> list = new ArrayList<>();

        String s1 = "12345jkdhfak";



        for(char ea : s1.toCharArray()){
            if(Character.isDigit(ea)){
                list
                        .add(ea);
            }
        }
        System.out.println(list);
    }
}
