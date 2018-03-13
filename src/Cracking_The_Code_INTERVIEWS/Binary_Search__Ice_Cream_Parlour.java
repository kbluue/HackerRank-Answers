package Cracking_The_Code_INTERVIEWS;

/**
 * Created by _kbluue_ on 3/11/2018.
 */
public class Binary_Search__Ice_Cream_Parlour {

    private void allCombo(int... values){
        int size = values.length;

        for (int i = 1; i < size; i++) {

        }
    }

    private long aPb(int a,int b){
        if (a < b) return -1;
        return (factorial(a)/(factorial(b)*factorial(a-b)));
    }

    private long factorial(int A){
        if (A <= 1) return 1;
        long out = 1;
        for (int i = 1; i < A + 1; i++) {
            out *= i;
        }
        return out;
    }

    class permuteControl{

        int[] currentIndex, startingIndex, endingIndex, array, content;
        boolean lastSet = false;

        permuteControl(int size,int[] array){
            if (size < 1) size = 1;
            if (size > array.length) size = array.length;
            if (size == array.length){
                content = array;
                lastSet = true;
                return;
            }

            //set starting and ending indexes
            startingIndex = new int[size];
            endingIndex = new int[size];
            for (int i = 0; i < size; i++) {
                startingIndex[i] = i;
                endingIndex[i] = array.length - 2 + i;
            }

            currentIndex = startingIndex;
            this.array = array;
        }

        private void next(./.l){
            currentIndex[]
        }
    }

    private void permute(int size,int[] array){
        if (size > array.length) {
            System.out.println("Error Something");
            return;
        }
        int[] index = new int[size];



        //set index to start
        index = sIndex;


    }

    public static void main(String[] args){
        System.out.println(new Binary_Search__Ice_Cream_Parlour().factorial(5));
        System.out.println(new Binary_Search__Ice_Cream_Parlour().aPb(5, 2));
    }
}
