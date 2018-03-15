package Cracking_The_Code_INTERVIEWS;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by _kbluue_ on 3/15/2018.
 */
public class Binary_Search__Ice_Cream_Parlour {

    public void run(){
        _Misc in = new _Misc();
        int times = in.nextInt();
        for (int i = 0; i < times; i++) {
            int money = in.nextInt();
            int no = in.nextInt();
            int[] iceCreamValues = new int[no];
            for (int j = 0; j < no; j++) {
                iceCreamValues[j] = in.nextInt();
            }
//            pairValues(money, iceCreamValues);
            pairValues(iceCreamValues, money);
        }
    }

    void pairValues(int money,int[] iceCreamValues){
        for (int i = 0; i < iceCreamValues.length - 1; i++) {
            for (int j = i + 1; j < iceCreamValues.length; j++) {
                int a = iceCreamValues[i], b = iceCreamValues[j];
                if (a + b == money) System.out.println((i+1) + " " + (j+1));
            }
        }
    }

    void pairValues(int[] iceCreamValues,int money){
        Map<Integer, Integer> control = new HashMap<>();
        int index = 1;
        for (int value : iceCreamValues) {
            int complement = money - value;
            if (control.containsKey(complement)){
                System.out.printf("%d %d\n", control.get(complement), index);
                return;
            }
            control.put(value, index++);
        }
    }
}
