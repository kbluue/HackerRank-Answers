package Cracking_The_Code_INTERVIEWS;

import java.util.ArrayList;

/**
 * Created by _kbluue_ on 2/15/2018.
 */
public class Queues__A_Tale_Of_Two_Stacks {

    ArrayList<Integer> stack = new ArrayList<>();
    _Misc in = new _Misc();

    private void action(int command){
        if (command > 3 || command < 1) System.out.println("Command Error");
        if (command == 1) stack.add(in.nextInt());
        if (command == 2) stack.remove(0);
        if (command == 3) System.out.println(stack.get(0));
    }

    public void run(){
        int runTimes = in.nextInt();
        for (int i = 0; i < runTimes; i++) action(in.nextInt());
    }
}
