package Cracking_The_Code_INTERVIEWS;

import java.util.Arrays;

/**
 * Created by _kbluue_ on 3/11/2018.
 */
public class Binary_Search__Ice_Cream_Parlour {

    private void allCombo(int... values){
        int size = values.length;

        for (int i = 1; i < size; i++) {

        }
    }

    class permute{

        int valuesIndex[], a, b, iceCreamPrice[];
        boolean complete;

        permute(int a,int b){
            if (b > a){
                System.out.println("Binary_Search__Ice_Cream_Parlour.permute error (b cannot be more than a)");
                return;
            }

            this.a = a;
            this.b = b;
            valuesIndex = new int[b];
            complete = false;

            //set initial state
            for (int i = 0; i < b; i++) {
                valuesIndex[i] = i;
            }

        }
        void plus1(int index){
            if (index < 0) return;
            valuesIndex[index]++;
            if (valuesIndex[index] > (a - b + index)){
                plus1(index - 1);
                if (index > 0) valuesIndex[index] = valuesIndex[index - 1] + 1;
                else complete = true;
            }
        }

        void plus1(){
            plus1(b - 1);
        }

        void allPerms(){
            while (!complete){
                System.out.println(Arrays.toString(valuesIndex));
                plus1();
            }
        }
    }

    private void permute(int a,int b){
    }

    public static void main(String[] args){
        new Binary_Search__Ice_Cream_Parlour().new permute(4, 2).allPerms();
    }
}
