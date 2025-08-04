package homework6;

import java.math.BigInteger;

public class StatementsUtil {

    public static void main(String[] args) {
        check_odd_or_even(2);
        check_odd_or_even(3);

        check_positive_negative(5);
        check_positive_negative(-5);
        check_positive_negative(0);

        check_greater_than_or_less_than(10);
        check_greater_than_or_less_than(6);
        check_greater_than_or_less_than(16);

        check_five_and_seven_multiple(15);
        check_five_and_seven_multiple(49);
        check_five_and_seven_multiple(48);

        check_seven(851);
        check_seven(874);

        check_coordinates(0, 5);
        check_coordinates(10, 15);

        find_the_largest(10,5, 1);

        check_leap_year(2024);

        //(9)11.Գրել method, որը console -ում  տպում է  1 ից  200 թվերը

        for (int i = 0; i <= 200; i++) {
            System.out.println(i);
        }

        print_first_digit(1080);

        //13. Տրված են int x = 1, int y = 0.  Քանի դեռ x < 5 ից  և  y < 10  տպել  x+y արտահայտությունը․

        int x = 1;
        int y = 0;
        int sum = 0;

        while (x < 5 && y < 10) {
            sum = x + y;
            x++;
            y++;

        }
        System.out.println(sum);

        create_square(10);

        count_sum(15);

        even_multiplied(98);

        min_max(12);
        digit_sum1(11111);


    }


    //1․ Գրել method, որը ստուգում է տրված x ամբողջ  թիվը զույգ է թե կենտ.
    public static void check_odd_or_even(int num1) {
        if (num1 % 2 == 0) {
            System.out.println("it is odd number");
        } else {
            System.out.println("it is even");
        }

    }

    //2. Գրել method, որը ստուգում է տրված  x ամբողջ  թիվը դրական է թե բացասական.
    public static void check_positive_negative(int num1) {
        if (num1 < 0) {

            System.out.println("it is negative");

        } else if (num1 > 0) {

            System.out.println("it is positive");
        } else {
            System.out.println("it is neither positive nor negative");
        }

    }

//3․ Գրել method, որը ստուգում է տրված x ամբողջ  թիվը  ՝ կամ փոքր 8 ից  և մեծ 5 ից
//    Կամ փոքր  20 ից և մեծ 15 ից ․

    public static void check_greater_than_or_less_than(int x) {
        if (x > 5 && x < 8) {
            System.out.println("it is greater than 5 and less than 8");
        } else if (x > 15 && x < 20) {
            System.out.println("it is greater than 15 and less than 20 ");

        } else {
            System.out.println("you have given a number that doesn't suit the range");
        }
    }

//4.Գրել method, որը ստուգում է տրվածղ ամբողջ թիվը կարող է բաժանվել 5-ի և 7-ի վրա առանց մնացորդի.

    public static void check_five_and_seven_multiple(int num1) {
        if (num1 % 5 == 0) {
            System.out.println("it is five's multiple");
        } else if (num1 % 7 == 0) {
            System.out.println("it is seven's multiple");

        } else {
            System.out.println("it is neither five's nor seven's multiple");
        }
    }

//5․ Գրել method, որը ստուգում է տրված եռանիշ թվի երկրորդ թվանշանը 7 է թե ոչ։

    public static void check_seven(int num1) {
        if ((num1 / 10) % 10 == 7) {
            System.out.println("the second number is 7");
        } else {
            System.out.println("the second number isn't 7");
        }
    }

//6․ Գրել method, որը ստուգում է (x,y) կորդինատներով
// կետը գտնվում է արդյոք K(0,5) շրջանի մեջ թե ոչ։

    public static void check_coordinates(int x, int y) {
        if (x * x + y * y <= 25 && x * x + y * y >= -25) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

//7. Գրել method, որը գտնում է տրված 3 թվերից մեծագույնը։


    public static void find_the_largest(int x, int y, int z) {
     /*  this is option one
      int max;

        if (x >= y && x >= z) {
            max = x;
            System.out.println(max);
        } else if (y >= x && y >= z) {
            max = y;
            System.out.println(max);
        } else {
            max = z;
            System.out.println(z);
        }
    }


      */
        //this is option two

        int max = x;

        if(y > max) {
            max = y;
        }

         if(z > max){
            max = z;
        }
        System.out.println(max);

        }




//8․ Գրե՛ք method, որը ստուգում է տրված տարին համարվում է արդյոք նահանջ։
// (նահանջ է համարվում այն տարին որը բաժանվում է 4, բայց բացառություն է արվում
// այն տարիների համար, որոնք 100-ի բաժանվող են։ Այդ տարիները նահանջ են միայն,
// եթե նաև բաժանվում են 400-ի։)

    public static void check_leap_year(int year) {

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("it is a leap year");

        } else {
            System.out.println("it is not a leap year");
        }


    }

//(9)11.Գրել method, որը console -ում  տպում է  1 ից  200 թվերը

// it is written in main method

//(10)12․  Գրել method, որը console -ում տպում է տրված թվի առաջին թվանշանը

    public static void print_first_digit(int x) {
        for (int i = 0; x >= 10; i++) {
            x = x / 10;

        }
        System.out.println(x);
    }

//(11)13. Տրված են int x = 1, int y = 0.  Քանի դեռ x < 5 ից  և  y < 10  տպել  x+y արտահայտությունը․

// it is written in main method


//(12)14. Գրել method, որը console -ում տպում է քառակուսի, օգտագործեք * սիմվոլը։

    public static void create_square(int num) {

        for (int v = 0; v <= num; v++) {
            for (int b = 0; b <= num; b++) {
                System.out.print("* ");

            }
            System.out.println();
        }


    }

//15․ Գրել method, որը console -ից ստանում է  N թիվը և հաշվում է [1-N]
// բոլոր 5 -ի բաժանվող թվերի գումարը։


    public static void count_sum(int x) {
        int sum2 = 0;
        for (int e = 1; e <= x; e++) {
            if (e % 5 == 0) {
                sum2 = sum2 + e;
            }

        }
        System.out.println(sum2);
    }

    //16. Գրել method, որը հաշվում է [1-N]  բոլոր  երկնիշ զույգ թվերի արտադրյալը։
    public static void even_multiplied(int n) {

        BigInteger multiplied = BigInteger.ONE;

        for (int k = 10; k <= n && k <=98; k+=2 ) {

            multiplied = multiplied.multiply(BigInteger.valueOf(k));
            }
        System.out.println(multiplied);



    }


//it is written in method

//17․ Գրել method, որը [1-N] հաջորդական  թվերի մեջ գտնում է
// մեծագույն և փոքրագույն տարրերը և հաշվում նրանց թվաբանական միջինը։

        public static void min_max(int n){
            int min = 1;
            int max = n;
            float middle = (min + max) / 2;
            System.out.println(middle);
        }

        //18․ Գրել method, որը  ստանում է 5 - անիշ ամբողջ թիվ  և հաշվում  այդ թվի թվանշանների գումարը։
        public static void digit_sum1 ( int x){
            int sum_digit = 0;
            if (x >= 10000 && x <= 99999) {
                while (x > 0) {
                    sum_digit = sum_digit + x % 10;
                    x = x / 10;
                }
                System.out.println(sum_digit);
            } else {
                System.out.println("False");

            }

        }
    }

















