package Cracking_The_Code_INTERVIEWS;

/**
 * Created by _kbluue_ on 2/14/2018.
 *
 * Check https://www.hackerrank.com/challenges/ctci-making-anagrams/problem for full question
 */
public class Strings__Making_Anagrams {

    static _Misc misc = new _Misc();

    private int getDifference(String first,String second){
        String control = (first.length() > second.length()) ? second : first;
        String other = (first.equals(control)) ? second : first;
        for (int i = 0; i < control.length(); i++) {
            String charr = control.substring(i, i + 1);
            if (other.contains(charr)){
                control = misc.trimString(control, i);
                other = misc.trimString(other, charr);
                i--;
            }
        }
        return control.length() + other.length();
    }

    public static void run(){
        //read
        String first = misc.input.nextLine();
        String second = misc.input.nextLine();

        //run and print
        System.out.println(new Strings__Making_Anagrams().getDifference(first, second));
    }
}
