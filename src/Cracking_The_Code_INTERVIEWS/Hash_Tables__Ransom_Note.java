package Cracking_The_Code_INTERVIEWS;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by _kbluue_ on 2/15/2018.
 *
 * Check https://www.hackerrank.com/challenges/ctci-ransom-note/problem for full question
 */
public class Hash_Tables__Ransom_Note {

    private boolean mapMatch(String magazine[],String ransom[]){
        Map<String, Integer> wordBank = new HashMap<>();
        for (String word : magazine) {
            if (wordBank.get(word) == null) wordBank.put(word, 1);
            else wordBank.put(word, wordBank.get(word) + 1);
        }
        for (String word : ransom) {
            if (wordBank.get(word) == null || wordBank.get(word) == 0) return false;
            wordBank.put(word, wordBank.get(word) - 1);
        }
        return true;
    }

    public static void run(){
        //read
        Scanner in = new Scanner(System.in);
        in.nextLine(); //redundant since I'm using String.split
        String magazine = in.nextLine();
        String ransom = in.nextLine();
        //run
        boolean run = new Hash_Tables__Ransom_Note().mapMatch(magazine.split(" "), ransom.split(" "));
        //print
        System.out.println((run ? "Yes" : "No"));
    }
}
