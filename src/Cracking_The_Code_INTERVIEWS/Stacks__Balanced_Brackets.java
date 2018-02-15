package Cracking_The_Code_INTERVIEWS;

/**
 * Created by _kbluue_ on 2/15/2018.
 *
 * Check https://www.hackerrank.com/challenges/ctci-balanced-brackets/problem for full question
 */
public class Stacks__Balanced_Brackets {

    boolean isBalanced(String expression){
        String openers = "{[(", closer = "}])", control = "", chars[] = expression.split("");
        for (String s : chars) {
            if (openers.contains(s)) control += s;
            else {
                if (control.length() == 0 || control.charAt(control.length() - 1) != openers.charAt(closer.indexOf(s))) return false;
                else control = control.substring(0, control.length() - 1);
            }
        }
        return control.length() == 0;
    }

    public static void run(){
        //read
        _Misc in = new _Misc();
        int runTimes = in.nextInt();
        for (int i = 0; i < runTimes; i++) {
            //run
            boolean balanced = new Stacks__Balanced_Brackets().isBalanced(in.next());
            //print
            System.out.println((balanced ? "YES" : "NO"));
        }
    }
}
