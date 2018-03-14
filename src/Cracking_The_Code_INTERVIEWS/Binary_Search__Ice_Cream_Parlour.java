package Cracking_The_Code_INTERVIEWS;

import java.util.Arrays;

/**
 * Created by _kbluue_ on 3/11/2018.
 */
public class Binary_Search__Ice_Cream_Parlour {

    int money, iceCreamPrices[];

    Binary_Search__Ice_Cream_Parlour(int money,int[] iceCreamPrices){
        this.money = money;
        this.iceCreamPrices = iceCreamPrices;
    }

    class permute{

        int valuesIndex[], a, b;
        boolean complete;

        permute(int a,int b){
            if (b > a){
                System.out.println("Binary_Search__Ice_Cream_Parlour.permute error (b cannot be more than a)");
                complete = true;
                return;
            } else if (b < 1){
                System.out.println("permute.permute error (b cannot be less than 1)");
                complete = true;
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

    void readValues(){
        _Misc in = new _Misc();
        int times = in.nextInt();
        for (int i = 0; i < times; i++) {
            money = in.nextInt();
            int n = in.nextInt();
//            int values[] = new int[n];
            for (int j = 0; j < n; j++) {
//                values[j] = in.nextInt();
            }
        }
    }

    int sumOfSet(int[] set){
        int sum = 0;
        for (int i : set) sum += iceCreamPrices[i];
        return sum;
    }

    void runPermute(){
        permute permute = new permute(iceCreamPrices.length, 2);
        while (!permute.complete){
            if (sumOfSet(permute.valuesIndex) == money) System.out.printf("%d %d", permute.valuesIndex[0] + 1,
                    permute.valuesIndex[1] + 1);
        }
    }

    public static void main(String[] args){
    }
}
