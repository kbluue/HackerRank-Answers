package Cracking_The_Code_INTERVIEWS;

import java.util.ArrayList;
import Cracking_The_Code_INTERVIEWS._Misc;

/**
 * Created by _kbluue_ on 2/15/2018.
 */
public class Heaps__Finding_The_Running_Median {

    double runningMedian(ArrayList<Integer> in){
        boolean even = in.size()%2 == 0;
        int midpoint = in.size()/2;
        return !even ? in.get(midpoint) : (in.get(midpoint) + in.get(midpoint-1))/2.0;
    }

    public void run(){
        _Misc in = new _Misc();
        ArrayList<Integer> numbers = new ArrayList();

        int times = in.nextInt();
        for(int i = 0; i < times; i++){
            numbers.add(in.nextInt());
            System.out.println(runningMedian(numbers));
        }
    }
}
