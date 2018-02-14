package Cracking_The_Code_INTERVIEWS;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by _kbluue_ on 1/29/2018.
 * 
 * Check https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem for full question
 */
public class Arrays__Left_Rotation {

    private static int[] swap(int noOfIntegers,int noOfLeftRotation,int... arrayContent){
        if (arrayContent.length != noOfIntegers) System.out.println("Input Error");
        else {
            int[] out = new int[noOfIntegers];
            for (int i = 0; i < noOfIntegers; i++){
                int index = i + noOfLeftRotation;
                if (index >= noOfIntegers) index =- noOfIntegers;
                out[index] = arrayContent[i];
            }
            return out;
        }
        return null;
    }

    static void run(){
        //read
        Scanner in = new Scanner(System.in);
        int noOfIntegers = in.nextInt();
        int noOfLeftRotation = in.nextInt();
        int arrayContent[] = new int[noOfIntegers];
        for (int i = 0; i < noOfIntegers; i++) arrayContent[i] = in.nextInt();

        //swap
        int swappedArray[] = swap(noOfIntegers, noOfLeftRotation, arrayContent);

        //print
        System.out.println(Arrays.toString(swappedArray));
    }
}