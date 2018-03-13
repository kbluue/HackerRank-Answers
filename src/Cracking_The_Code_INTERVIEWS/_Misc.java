package Cracking_The_Code_INTERVIEWS;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by _kbluue_ on 2/14/2018.
 */
public class _Misc {
    Scanner input;

    public _Misc(){
        init();
    }

    void init(){
        input = new Scanner(System.in);
    }

    String trimString(String string,int indexStart,int indexEnd){
        if (indexStart >= indexEnd || indexStart < 0 || indexEnd > string.length()) return string;
        return string.substring(0,indexStart) + string.substring(indexEnd);
    }

    String trimString(String string,int index){
        return trimString(string, index, index + 1);
    }

    public String trimString(String string, String cut){
        if (!string.contains(cut)) return string;
        int index = string.indexOf(cut);
        return trimString(string, index, index + cut.length());
    }

    int nextInt(){
        try{
            return input.nextInt();
        } catch (InputMismatchException e){
            System.out.printf("Numbers Only. %s is not a number! Try again.\n", input.next());
            return nextInt();
        }
    }

    private long aCb(int a,int b){
        if (a < b) return -1;
        return (factorial(a)/(factorial(b)*factorial(a-b)));
    }

    private long aPb(int a,int b){
        if (a < b) return -1;
        return (factorial(a)/(factorial(b)));
    }

    private long factorial(int A){
        if (A <= 1) return 1;
        long out = 1;
        for (int i = 1; i < A + 1; i++) {
            out *= i;
        }
        return out;
    }

    String nextLine(){
        return input.nextLine();
    }

    String next(){
        return input.next();
    }


}
