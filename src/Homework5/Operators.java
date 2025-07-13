package Homework5;

public class Operators {

    //Arithmetic Operators

    //1․ Ստեղծել 2 փոփոխական(int a = 8, int b = 6), տպել console -ում  հետևյալը․
    //a + b
    //a * b
    //a / b
    //a - b
    //a % b




    public static void main(String[] args) {

        System.out.println(sum(10, 11));
        System.out.println(multiply(10, 10));
        System.out.println(divide(10, 20));
        System.out.println(subtract(10, 30));
        System.out.println(calculate_remainder(11, 2));

        double c = 6.4;
        double d = 0.03;

        System.out.println(sumd(c,d));
        System.out.println(multiplyd(c,d));
        System.out.println(divided(c,d));
        System.out.println(subtractd(c, d));
        System.out.println(calculate_remainderd(c , d));

        int x = 2 * ((5 + 3) * 4 - 8);
        int y = 2 * 5 + 3 * 4 - 8;

        System.out.println(calculation1(x));
        System.out.println(calculation2(y));

        int e = 10;
        int f = -88;
        boolean n1 = true;

        System.out.println(create_minus1(e));
        System.out.println(create_minus2(f));
        System.out.println(adder_to_plus(e));
        System.out.println(invert(n1));
        System.out.println(double_invert(n1));
        System.out.println(add_by_1(e));
        System.out.println(subtrack_by_1(f));

         int v = 3;
         int u = ++v * 5 / v-- + --v;
         System.out.println("v is " + v);
         System.out.println("u is " + u);

        // 5․ Տպել  console -ում  հետևյալ արտահայտությունների պատասխանները`
        // int x = (int)1.0;
        // short y = (short)1921222;
        // System.out.print(2147483647+1);
        // long y = (x=3);
        //5) boolean a = false;
        //   boolean b = (y = true);
        //   System.out.println(x);

        int i = (int)1.0;
        boolean g = false;
        System.out.println(2147483647+1);
        long q = (i = 3);
        boolean w = false;
        boolean p = (g = true);
        System.out.println(i);
        System.out.println(g);
        System.out.println(q);
        System.out.println(w);
        System.out.println(p);

        int m = 10;
        int n = 20;


        System.out.println(check_if_small(m,n));
        System.out.println(check_if_small_or_equal(m,n));
        System.out.println(check_if_big_or_equal(m,n));
        System.out.println(check_if_big(m,n));

        //7. Գտնե և ուղղել սխալը․
        //
        //  1)  float y = 2.1;
        //
        //  2)  byte x = 5;
        //       byte y = 10;
        //       byte z = x + y;
        //
        // 3)   short x = 10;
        //       short y = 3;
        //       short z = x * y;

        // 4)    long x = 10;
        //       int y = 5;
        //       y = y * x;



        float yy = 2.1f;

        byte xx = 5;
        byte yyy = (byte)yy;
        byte zz = (byte) (xx + yyy);

        short xxx = (short) xx;
        short yyyy = (short) yy;
        short zzz = (short) (xx * yy);

        long xxxx = xx;
        int yyyyy = (int)yy;
        yy = yy * xx;

        System.out.println(yy);
        System.out.println(xx);
        System.out.println(yyy);
        System.out.println(zz);
        System.out.println(xxx);
        System.out.println(yyyy);
        System.out.println(zzz);
        System.out.println(xxxx);
        System.out.println(yyyyy);
        System.out.println(yy);


        //8․ Հայտարարել երկու int տիպի փոփոխականներ, վերագրել 10 և 5 այնուհետև փոփոխականի արժեքները տեղերով փոխել։

        int s1 = 10;
        int s2 = 5;

        System.out.println(s1);
        System.out.println(s2);

        int s3 = s1;
        s1 = s2;
        s2  = s3;

        System.out.println(s1);
        System.out.println(s2);

        //9․ Փորձեք 8-րդ խնդիրը լուծել առանց երրորդ փոփոխական օգտագործելու։

        int t1 = 10;
        int t2 = 5;
        System.out.println(t1);
        System.out.println(t2);

        t1 = t1 + t2; //15
        t2 = t1 - t2; // 10
        t1 = t1 - t2;

        System.out.println(t1);
        System.out.println(t2);


        //10․ Գրել ծրագիր, որը հաշվում է  1-100 թվերի գումարը։ (ցիկլ չoգտագործել)

        // սա կանենք թվաբանական պրոգրեսիայի գումարի առաջին n անդամների գումարի բանաձևով

        // Sn = (a1+an)n/2

        System.out.println(zero_to_hundred_sum(1,100,100));

        //1․ Ստեղծել 2 փոփոխական(int a = 8, int b = 3), տպել console -ում  հետևյալը․
        //a & b
        //a ^ b
        //a | b
        //~a
        //true || (a < 4)
        //(b >= 6) || (++a <= 7);
        //(a<b)?a:b
        //b^b

        int b = 8;
        int j = 3;

        System.out.println();



        //1․ Ստեղծել 2 փոփոխական(int a = 8, int b = 3), տպել console -ում  հետևյալը․
        //a & b
        //a ^ b
        //a | b
        //~a
        //true || (a < 4)
        //(b >= 6) || (++a <= 7);
        //(a<b)?a:b
        //b^b

        int numbera = 8;
        int numberb = 3;

        System.out.println(bitewise_AND(numbera, numberb));
        System.out.println(bitewise_XOR(numbera,numberb));
        System.out.println(bitewise_OR(numbera,numberb));
        System.out.println(bitewise_NOT(numbera));
        System.out.println(true || (numbera < 4));
        System.out.println((numberb > 6) || (++numbera <= 7) );
        System.out.println((numbera < numberb)?numbera:numberb);
        System.out.println(bitewise_XOR(numberb,numberb));

        //1․ Տպել console -ում  հետևյալը․
        //10 << 2
        //-10 << 3
        //20 >> 2
        //15 >> 3

        System.out.println(left_shift(10,2));
        System.out.println(left_shift(-10,3));
        System.out.println(right_shift(20,2));
        System.out.println(right_shift(15,3));




    }

    /**
     * this method adds
     * @param a
     * @param b
     * @return
     */

    public static int sum(int a, int b) {

        return a + b;

    }

    /**
     * this method multiplies
     * @param a
     * @param b
     * @return
     */

    public static int multiply(int a, int b) {
        return a * b;

    }

    /**
     * this method divides
     * @param
     * @return
     */

    public static double divide(double a, double b) {
        return  a / b;
    }

    /**
     * this method subtracts
     * @param
     * @return
     */

    public static int subtract(int a, int b){
        return a - b;
    }

    /**
     * this method calculates remainder of the number
     * @param
     * @return
     */


    public static int calculate_remainder(int a, int b) {
        return a % b;
    }

    //2․ Ստեղծել 2 փոփոխական(double c = 6.4, double d = 0.03), տպել  console -ում հետևյալը.
    //c + d
    //c * d
    //c / d
    //c - d
    //c % d

    /**
     * this method adds double type of numbers
     * @param
     * @return
     */


    public static double sumd(double k, double b) {

        return k + b;

    }

    /**
     * this method multiplies double type of numbers
     * @param
     * @return
     */


    public static double multiplyd(double k, double b){

        return k * b;

    }

    /**
     * this method divides double type of numbers
     * @param
     * @return
     */


    public static double divided(double k, double b){

        return  k / b;
    }

    /**
     * this method subtracts double type of numbers
     * @param
     * @return
     */


    public static double subtractd(double k, double b){
        return  k - b;
    }

    /**
     * this method calculates remainder of double type of numbers
     * @param
     * @return
     */


    public static double calculate_remainderd(double k , double b){
        return  k - b;
    }

    //3․ Տպել  console -ում  հետևյալ արտահայտությունների պատասխանները`
    //int x = 2 * ((5 + 3) * 4 – 8);
    //int y = 2 * 5 + 3 * 4 - 8;

    /**
     * this method does matematical calculation
     * @param
     * @return
     */


    public static int calculation1(int p){
        return p;

    }

    /**
     * this method does matematical calculation
     * @param
     * @return
     */

    public static int calculation2(int j){
        return j;
    }

                                   // Unary Operators

    //4․ Ստեղծել 2 փոփոխական(int e = 10,  int f = -88, boolean n1 = true), տպել console -ում  հետևյալը
    //1)-e
    //2)-f
    //3)+e
    //4)-e +92
    //5)!n1
    //6)!(!n1)
    //7)e++
    //8)--f

    /**
     * this method create make the number minus
     * @param
     * @return
     */

    public static int create_minus1(int o){
        return -o;
    }

    /**
     * this method create make the number minus
     * @param
     * @return
     */

    public static int create_minus2(int q){
        return -q;
    }
    /**
     * this method doesn't change the matematical symbol
     * @param
     * @return
     */

    public static int same(int l){
        return l;
    }

    /**
     * this method add the parameter by 92
     * @param
     * @return
     */

    public static int adder_to_plus(int l){
        return -l + 92;

    }

    /**
     * this method inverts the boolean value
     * @param
     * @return
     */

    public static boolean invert(boolean k){
        return !k;
    }

    /**
     * this method inverts two times
     * @param k
     * @return
     */

    public static boolean double_invert(boolean k){
        return !(!k);
    }

    /**
     * this mettod add the number by 1
     * @param l
     * @return
     */

    public static int add_by_1(int l){
        return l++;
    }

    /**
     * this method subtrack the number by 1
     * @param l
     * @return
     */
    public static int subtrack_by_1(int l){
        return --l;
    }
    // 4․
    //9) int x = 3;
    //   int y = ++x * 5 / x-- + --x;
    //   System.out.println("x is " + x);
    //   System.out.println("y is " + y);

    // it is written in main method


                                // Assignment Operator

    // 5․ Տպել  console -ում  հետևյալ արտահայտությունների պատասխանները`
    // int x = (int)1.0;
    // short y = (short)1921222;
    // System.out.print(2147483647+1);
    // long y = (x=3);
    //5) boolean a = false;
    //   boolean b = (y = true);
    //   System.out.println(x);

    // it is written in main method


                                   // Relational Operators

    //6․ Ստեղծել 2 փոփոխական(int x = 10, int y = 20), տպել console -ում  հետևյալը․
    //
    //System.out.println(x < y);
    //System.out.println(x <= y);
    //System.out.println(x >= y);
    //System.out.println(x > y);

    /**
     * this method checks if x < y
     * @param x
     * @param y
     * @return
     */

    public static boolean check_if_small(int x, int y){
        return x < y;
    }

    /**
     * this method checks if <= y
     * @param x
     * @param y
     * @return
     */

    public static boolean check_if_small_or_equal(int x, int y){
        return x <= y;
    }

    /**
     * this method checks if x >= y
     * @param x
     * @param y
     * @return
     */

    public static boolean check_if_big_or_equal(int x, int y){
        return x >= y;
    }

    /**
     * this method checks if x > y
     * @param x
     * @param y
     * @return
     */

    public static boolean check_if_big(int x, int y){
        return x > y;
    }

                                  //Additional  tasks

    //7. Գտնե և ուղղել սխալը․
    //
    //  1)  float y = 2.1;
    //
    //  2)  byte x = 5;
    //       byte y = 10;
    //       byte z = x + y;
    //
    // 3)   short x = 10;
    //       short y = 3;
    //       short z = x * y;

    // 4)    long x = 10;
    //       int y = 5;
    //       y = y * x;

    // it is written in main method

    //8․ Հայտարարել երկու int տիպի փոփոխականներ, վերագրել 10 և 5 այնուհետև փոփոխականի արժեքները տեղերով փոխել։

    //it is written in main method

    //9․ Փորձեք 8-րդ խնդիրը լուծել առանց երրորդ փոփոխական օգտագործելու։
    // it is written in main method



//10․ Գրել ծրագիր, որը հաշվում է  1-100 թվերի գումարը։ (ցիկլ չoգտագործել)

    /**
     * this method counts from 0 to 100 numbers sum
     * @param a1
     * @param an
     * @param n
     * @return
     */

    public static int zero_to_hundred_sum(int a1, int an, int n){
        return (a1+an) * n / 2;
    }

                           // Bitwise & Logical Operators

    //1․ Ստեղծել 2 փոփոխական(int a = 8, int b = 3), տպել console -ում  հետևյալը․
    //a & b
    //a ^ b
    //a | b
    //~a
    //true || (a < 4)
    //(b >= 6) || (++a <= 7);
    //(a<b)?a:b
    //b^b

    /**
     * this method does bitewise AND
     * @param number1
     * @param number2
     * @return
     */

    public static int bitewise_AND(int number1, int number2){
        return number1 & number2;

    }

    /**
     * this method does bitewise XOR
     * @param number1
     * @param number2
     * @return bitewise XOR
     */

    public static int bitewise_XOR(int number1, int number2){
        return number1 ^ number2;
    }

    /**
     * this method does bitewise OR
     * @param number1
     * @param number2
     * @return
     */

    public static int bitewise_OR(int number1, int number2){
        return number1 | number2;
    }

    /**
     * this method dpes bitewise NOT
     * @param number1
     * @return
     */

    public static int bitewise_NOT(int number1){
        return ~number1 ;
    }

    // մնացածը գրել եմ main մեթոդում





                            //Shift Operator

    //1․ Տպել console -ում  հետևյալը․
            //10 << 2
            //-10 << 3
            //20 >> 2
            //15 >> 3

    /**
     * this method does bitewise left shift
     * @param num1
     * @param num2
     * @return
     */

    public static int left_shift(int num1, int num2){
        return num1 << num2;
    }

    /**
     * this method does bitwise right shift
     * @param num1
     * @param num2
     * @return
     */

    public static int right_shift(int num1,int num2){
        return num1 >> num2;
    }






}
