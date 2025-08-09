package homework8;

import java.util.ArrayList;
import java.util.Arrays;


public class ArrayUtil {
    public static void main(String[] args) {

        int[] a = new int[]{1, -10, 5, 9, 24, -124};
        print_positive_values(a);

        short[] b = new short[]{257, 124, 5474, 15};
        do_reverse(b);

        long[] c = new long[]{1, 100, 4, 5000};
        find_the_max_value(c);

        float[] d = new float[]{10.0f, 50.0f, 1.0f};
        find_the_min_value(d);

        int[] e = new int[]{10, 20, 30, 40, 50};
        add_from_other_one_into_another(e);

        int[] f = new int[]{10, 20, 30, 40};
        int[] g = new int[]{10, 20, 30, 40};

        add(f, g);

        int[] h = new int[]{1, 5, 5, 10, 15, 25, 5, 5};
        check_frequency(h);

        int[] v = new int[]{1,5,6,4};
        printUniqueGroups(v);

        int[] i = new int[]{50, 1, 8, 6, 7, 25, 9};
        c(i);

        int[] j = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        g(j);


        //11.Տրված իրական թվերի հաջորդականությունից հեռացնել բոլոր զրոները։
        //Oրինակ՝  array = {1,0,6,4,9,0,0}
        //
        //                   // {1,6,4,9}

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(0, 1);
        nums.add(1, 0);
        nums.add(2, 0);
        nums.add(2, 5);
        nums.add(2, 8);

        for (int p = 0; p <= nums.size(); p++) {
            if (nums.get(p) == 0) {
                nums.remove(p);
            }

        }
        System.out.println(nums);

        int[] k = new int[]{1, 1, 0, 0, 1, 1};
        binary_to_decimal(k);



        int l [] = new int[] {1,5,6,4,9,0,4,7,7,9, 1};




        int[] x = {1,5,6,4,9,0,4,7,7,9, 1};




        //Տպել տրված մատրիցի գլխավորա անկյունագծից վերև բոլոր տարերը:
        int matrix1[][] = new int[][] {
                {1,2,7},
                {3,4,6},
                {1,2,4}
        };



        matrix1(matrix1);



        int matrix[][] = new int[][] {
                {1,2,7},
                {3,4,8},
                {4,6,7}


        };

        System.out.println(Arrays.deepToString(matrix));
        matrixMain(matrix);




        int matrix3[][] = new int[][]{{1, 0, 3},
                {4, 7, 9},
                {9, 2, 5},
        };

        System.out.println(matrix3(matrix3));


    }

    //1․ Գրել method, որը տպում է int[] n  array-ի դրական տարրերը

    public static void print_positive_values(int[] n) {

        for (int i = 0; i < n.length; i++) {
            if (n[i] > 0) {
                System.out.println(n[i]);

            }
        }

    }

    //2. Գրել method, որը տպում է short[] s  array-ի էլեմենտները հակառակ հերթականությամբ
    //    Օրինակ՝ ( 257 -> 752)․

    public static void do_reverse(short[] s) {
        for (short i : s) {
            String x = "";
            while (i > 0) {
                x += Short.toString((short) (i % 10));
                i /= 10;

            }
            System.out.println(x);

        }

    }

    //3. Գրել method, որը գտնում և  տպում է  long[] l array-ի ամենամեծ տարրը․

    public static void find_the_max_value(long[] l) {
        long max = l[0];
        for (long i : l) {
            if (i > max) {
                max = i;
            }

        }
        System.out.println(max);

    }

    //4. Գրել method, որը գտնում և տպում է  float[] f  array-ի ամենափոքր տարրը

    public static void find_the_min_value(float[] f) {
        float min = f[0];
        for (float i : f) {

            if (i < min) {
                min = i;
            }

        }
        System.out.println(min);
    }

    //5 ․ Գրել method, որը int[] n array-ի էլեմենտները և տեղափոխում  int[] m  array-ի մեջ։

    public static void add_from_other_one_into_another(int[] n) {
        int[] m = new int[n.length];
        int index = 0;

        for (int i : n) {
            m[index] = i;
            index++;


        }
        System.out.println(Arrays.toString(m));


    }

    //6․ Գրել method, որը ստեղծում է երկու նույն չափը ունեցող array-ներ գումարում
    // է array -ի համապատասխան էլեմենտները և գրում երրորդ array-ի մեջ։

    //Oրինակ՝ array1 = {1,5,6,4,7}
    //array2 = {7,4,2,3,5}

    //array3 = {8,9,8,7,12}

    public static void add(int[] a, int[] b) {
        int[] c = new int[a.length];
        if (a.length == b.length) {
            for (int i = 0; i < a.length; i++) {
                c[i] = a[i] + b[i];
            }
            System.out.println(Arrays.toString(c));
        } else {
            System.out.println("Given arrays are not the same size");
        }

    }

    /*7. Գրել method, որը հաշվում է թե քանի անգամ է  k թիվը հանդիպել array-ի  Էլեմենտների մեջ։

    Oրինակ՝  array = {1,5,6,4,5}
    k = 5;
    // 2

     */

    public static void check_frequency(int[] m) {
        int k = 5;
        int existance = 0;
        for (int i : m) {
            if (i == k) {
                existance += 1;
            }
        }
        System.out.println(existance);
    }


    /* 8․Գրել method, որը  տպում է բոլոր չկրկնվող եռյակները array -ի։ Եռյակներում թվերի դասավորությունը էական չէ:
    Oրինակ՝  array = {1,5,6,4}

                   // {1,5,6},  {1,5,4} ,{1,4,6}, {4,5,6}
     */

    public static void printUniqueGroups(int[] numbers) {
        int n = numbers.length;

        if (numbers.length >= 3) {

            for (int i = 0; i < n - 2; i++) {
                for (int j = i + 1; j < n - 1; j++) {
                    for (int k = j + 1; k < n; k++) {
                        System.out.println(numbers[i] + " " + numbers[j] + " " + numbers[k]);
                    }
                }
            }
        } else {

        }
    }


// 9․ Դասավորել տրված թվերի հաջորդականության անդամները նվազման կարգով:

    public static void c(int[] n) {

        Arrays.sort(n);
        for (int i = n.length - 1; i >= 0; i--) {
            System.out.println(n[i]);
        }
    }

    //10․ Դասավորել տրված ամբողջ թվերի հաջորդականության անդամներն անյպես, որ վերջում լինեն կենտերը:

    public static void g(int[] n) {

        int countEven = 0;
        int countOdd = 0;


        for (int i = 0; i < n.length; i++) {
            if (n[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }

            int[] result = new int[countOdd +  countEven];
            int[] odd2 = new int[countOdd];

            int index1 = 0;
            for (int j = 0; j < n.length; j++) {

                if (n[j] % 2 == 0) {
                    result[index1++] = n[j];
                }
            }

            int index2 = 0;

            for(int k = 0; k < n.length; k++){

                if (n[k] % 2 != 0){
                    odd2[index2++] = n[k];
                }
            }



            int index3 = 0;
            for(int o = countEven; o < result.length; o++){

                result[o] = odd2[index3++];
            }

            System.out.println(Arrays.toString(result));



            }








        //11.Տրված իրական թվերի հաջորդականությունից հեռացնել բոլոր զրոները։
        //Oրինակ՝  array = {1,0,6,4,9,0,0}
        //
        //                   // {1,6,4,9}

        //it is written in main method


        //12․ Տպել տրված թվերի հաջորդականության ամենաերկար աճող ենթահաջորդականությունը:
        //Oրինակ՝  array = {1,5,6,4,9,0,4,7,7,9, 1}
        //
        //                   // {0,4,7,7,9}


     /*   public static void the_longest_increasing_sequence(int [] sequence){
        int index = sequence.length -1;
        int all_sequences[] = new int[sequence.length];
            for (int i = 1; i < sequence.length; i++) {
                for (int j = 0; j < sequence.length; j++) {
                    if(sequence[i] > sequence[j]){
                        all_sequences[index] = sequence[i];
                        --index;
                    }


                }

            }
            System.out.println(Arrays.toString(all_sequences));
        }

      */







        //13․ Ներածել n բնական թիվը 2-ական տեսքով՝ ստանալով 0-ներից ու 1-երից կազմված զանգված և արտածել n  թվի 10-ական ներկայացումը:
        //
        //Oրինակ՝    array = {1,1,0,0,1,1}
        //                   // 51


    public static void binary_to_decimal(int[] nums){
        int sum = 0;
        int power = 0;

        for(int i = nums.length - 1; i >= 0; i--){
            sum = (int) (Math.pow(2 , power) * nums[i] + sum);
            power++;


        }
        System.out.println(sum);

    }



        //14․ Տպել տրված մատրիցի գլխավորա անկյունագծից վերև բոլոր տարերը:




    public static void matrix1(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(j > i){
                    System.out.println(matrix[i][j]);
                }

            }
        }
    }




        //15․ Շրջել տրված ամբողջ թվերի քառակուսային մատրիցը գլխավոր անկյունագծի նկատմամբ:

        /** This method is used to rotate a given square matrix of integers about the main diagonal.
         * this method is used to
         * @param matrix
         */


        public static void matrixMain (int[][] matrix){
            for (int i = 0; i < matrix.length; i++) {
                for (int j = i + 1; j < matrix[i].length; j++) {
                    int saver = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = saver;
                }
            }
            System.out.println(Arrays.deepToString(matrix));
        }


        //16․ Տրված բնական թվերի քառակուսային մատրիցի համար արտածել YES, եթե նրա բոլոր տողերի տարրերի գումարը զույգ է։  NO հակառակ դեպքում։
        //
        //Oրինակ՝    a = {1,-1,0,0}
        //    {2,-2,1,-1}        // YES
        //    {9,7,1,-17}
        //
        //                      a = {1,2,0,0}
        //    {2,-2,1,-1}        //NO
        //    {9,7,1,-17}


        /**
         * This method is used to determine whether the sum of the row numbers of a given matrix is even.
         */


        public static String  matrix3 (int[][] matrix){



            for (int i = 0; i < matrix.length; i++) {
                int sum = 0;

                for (int j = 0; j < matrix[i].length; j++) {
                    sum += matrix[i][j];

                }
                if (sum % 2 != 0){
                    return "No";
                }


            }
            return "Yes";




        }


    }