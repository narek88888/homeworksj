package homework16;

//Sort int[] a  using Bubble sort

import java.util.Arrays;

public class task2 {
    public static int[] DoBubbleSort(int[] elements) {

        /*
        len = 3
        0 < 2
        10 1 50
        1 10 50
        1 < 2
         0 < 1
         */


        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements.length - i - 1; j++) {
                // ԵԹԵ ՍՏԵՂ -1 ՉԳՐԵԻՆՔ INDEXOUT ԿՏԱՐ ՈՐՏև ԼԻՆԵԼՈՒ Է ԱՌԱՋԻՆԻ ԺԱՄԱՆԱԿ lenght - 0 հետո +1-ով
                // մի դուրս էինք գալու զանգվածից
                if (elements[j] > elements[j + 1]) {
                    int saver = elements[j];
                    elements[j] = elements[j + 1];
                    elements[j + 1] = saver;
                }
            }
        }

        return elements;
}


    public static void main(String[] args) {
        int[] x = new int[]{1,500,20,10,50};
        System.out.println(Arrays.toString(DoBubbleSort(x)));
    }
}
