package homework3;

public class Variables {

    public static void main(String[] args) {
            byte a = 100;
            byte b = 40;
            byte_print(a, b);

            short c = 3000;
            short ww = 200;
            short_print(c,ww);

            int e = 1000000;
            int f = 2000000;

            int_print(e,f);

            long g = 10000000l;
            long u = 100000000l;
            long_print(g,u);

            byte maxbb = 127;
            byte minbb = -127;
            short maxss = 32767;
            short minss = -32767;
            int maxii = 2147483647;
            int minii = -2147483648;
            long maxll = 9223372036854775807l;
            long minll = -9223372036854775808l;

            print_max_min_values_of_primitive_types(maxbb, minbb, maxss, minss, maxii, minii, maxll, minll);


            byte y = 0b1010011;
            int z = 0b011011100;

            print_binary(y,z);

            float ll = 5.5f;
            float k = 100.6f;

            print_float(ll,k);

            double tt = 1.1545111154152151;
            double kk = 5.5987613111151505151135153111151561511156151151561515161165415;

            print_double(tt,kk);

            char w = 'a';
            char o = 'b';

            print_char(w,o);


            //11.1 Տպել char s = 77;  և char w = 109;  արժեքները;
            char s = 77;
            char l = 109;

            System.out.println(s);
            System.out.println(l);

            //11.2 Տպել ՛K՛ symbolը  բոլոր հնարավոր տարբերակներով

            char way1 = 'K';
            char way2 = 75;
            char way3 = 0x004B;

            System.out.println(way1 + " " + way2 + " " + way3 );

            boolean p = true;
            boolean q = false;

            print_boolean(p,q);

            long year1 = 201l;
            int year2 = (int) year1;
            System.out.println(year2);


            int aa = 7;
            long bb = aa;

            widely_cast_int_to_long(bb);

            int myInt  = 7;
            double myDouble = myInt;

            widely_cast_int_to_double(myDouble);

            double dd = 9.78d;
            int ii = (int) dd;

            narrowly_cast_double_to_int(ii);

            int ff = 9999;
            byte gg = (byte) ff;

            narrowly_cast_int_to_byte(gg);

            long max = 3123456789l;
            double d = 1000.00;
            char i = 'i';
            char j = 'j';
            char ij = (char) (i + j);
            int a7 = 8;
            long h = 20;
            h = h  + 8;
            int n; int m = 11;
            n = 30;
            m = n;
            System.out.println(max + " " + d);
            System.out.println(i + " " + j + " " + ij);
            System.out.println(a7);
            System.out.println(h + " " + n + " " + m);

            print_max_min_values_of_float_double();


        }

                                        //G R O U P   I N T E G E R

    //1․ Ստեղծել 2 փոփոխական(byte a և byte b ),  վերագրել կամայական արժեքներ և տպել
    // console -ում․

    /**
     * this method is used to print values of byte a and byte b
     * @param byte o
     * @param byte p
     */

    public static void byte_print(byte o, byte t) {
        System.out.println(o);
        System.out.println(t);

    }
    //2․ Ստեղծել 2 փոփոխական(short c և short d ),
    // վերագրել կամայական արժեքներ և տպել console -ում․

    /**
     * this method is used to print values of short c and d variables
     * @param x
     * @param y
     */

    public static void short_print(short x, short y){
        System.out.println(x);
        System.out.println(y);

    }
    //3․ Ստեղծել 2 փոփոխական(int e և int f ),  վերագրել կամայական արժեքներ և տպել console -ում․

    /**
     * this method is used to print values of int e int f
     * @param m
     * @param n
     */

    public static void int_print(int m, int n){

        System.out.println(m);
        System.out.println(n);

    }
    //4. Ստեղծել 2 փոփոխական(long g և long h ),  վերագրել կամայական արժեքներ և տպել console -ում

    /**
     * this method is used to print values of long g and long h
     * @param j
     * @param v
     */

    public static void long_print(long j,long v){
        System.out.println(j);
        System.out.println(v);
    }

    //5. Տպել  byte, short, int և long  Max & Min  արժեքները;

    /**
     * this method is used to print max and min values of byte, short, int and long
     * @param maxb
     * @param minb
     * @param maxs
     * @param mins
     * @param maxi
     * @param mini
     * @param maxl
     * @param minl
     */

    public static void print_max_min_values_of_primitive_types(byte maxb, byte minb, short maxs, short mins, int maxi, int mini, long maxl, long minl){
        System.out.println(maxb);
        System.out.println(minb);
        System.out.println(maxs);
        System.out.println(mins);
        System.out.println(maxi);
        System.out.println(mini);
        System.out.println(maxl);
        System.out.println(minl);
    }

    // 6. Ստեղծել 2  փոփոխական (byte և int ) , վերագրել կամայական արժեքներ 2-ական տեսքով  և տպել   console -ում

    /**
     * this method is used to print binary code of byte and int
     * @param binary_num1
     * @param binary_num2
     */

    public static void print_binary(byte binary_num1, int binary_num2){
        System.out.println(binary_num1);
        System.out.println(binary_num2);

    }

                                // G R O U P   F L O U T I N G  P O I N T  N U M B E R

// 6․ Ստեղծել 2 փոփոխական(float j և float k ),  վերագրել կամայական արժեքներ և տպել console -ում

    /**
     * this method is used to print the values of float j and float k
     * @param q
     * @param s
     */

    public static void print_float(float q, float s){
        System.out.println(q);
        System.out.println(s);
    }


    //7. Ստեղծել 2 փոփոխական(double l և double m ),
    //վերագրել կամայական արժեքներ և տպել console -ում․

    /**
     * this method is used to print values of double l and double m variables
     * @param ee
     * @param ff
     */

    public static void print_double(double ee, double ff ){
        System.out.println(ee);
        System.out.println(ff);
    }

    //8. Տպել float և double  Max & Min  արժեքները;

    /**
     * this method is used to print  max and min values of float and double
     * @param maxf
     * @param minf
     * @param maxd
     * @param mind
     */

    public static void print_max_min_values_of_float_double(){

        System.out.println(Float.MAX_VALUE);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);





    }

    //9. Հետևյալ արժեքներից ո՞րը կարելի է վերագրել float տիպի փոփոխականին,
    //    իսկ ո՞րը double-ին: 34.567839023, 12.345, 8923.1234857,  3456.091?


    /*
    * Տրվածներից բոլորն էլ կարանք համ float-ին վերագրենք համ էլ double-ին, որովհետև
    * float-ի rang-ը -1․17549435 * 10-ի մինուս 38 աստիճանից մինչև 3․4 * 10-ի 38 աստիճանն ա
    * իսկ double-ինը -2.2250738585... * 10-ի մինուս -308 աստիճանից մինչև 1․797693134․․․ * 10-ի 308 աստիճանն ա
    * ու սրանք էնքան մեծ թվեր են որ տրվածները պատկանում են տրվածները պատկանում են իրանց range-ին
     */

                           // G R O U P    C H A R A C T E R

    //10. Ստեղծել 2 փոփոխական(char n և char o ),
    // վերագրել կամայական արժեքներ և տպել   console -ում․

    /**
     * this method is used to print the values of char n and char o variables
     * @param hh
     * @param gg
     */

    public static void print_char(char hh, char gg){

        System.out.println(hh);
        System.out.println(gg);



    }

    //   11.1 Տպել char s = 77;  և char w = 109;  արժեքները;

    // it is written in main method




    //11.2 Տպել ՛K՛ symbolը  բոլոր հնարավոր տարբերակներով

    //it is written in main method

                                          // Group (Boolean)



    //12. Ստեղծել 2 փոփոխական(boolean p և boolean q ),
    //      վերագրել կամայական արժեքներ և տպել console -ում

    /**
     * this method is used to print the values of boolean p and boolean q
     * @param value1
     * @param value2
     */

    public static void print_boolean(boolean value1, boolean value2){
        System.out.println(value1);
        System.out.println(value2);
    }

    //13. Ի՞նչ կտպի կոդի այս հատվածը և ինչու՞։
    //     int year = 201l;
    //     System.out.print (year);

    // error կտա, որովհետև էդ կոդում արված ա widening casting, բայց պետքա անենք narowing casting, որովհետև long-ը int-ից մեծ ա
    // իսկ եթե ուզում ենք մեծ data type-ը վերագրենք իրենից ավելի փոքր data type-ի ուրեմն պետքա անենք narowing casting, սենց
    // long year1 = 201
    // int year2 = (int) year1
    // System.out.print(year2)
    // էս կոդը main method-ում գրել եմ



                                     //Java Type Casting

    //14. Ստեղծել int aa  = 7 և long bb փոփոխականներ,
    //    կատարել Cast գործողություն  aa -> bbb  և տպել console -ում․

    /**
     * this method is used to do widening casting, it converts the value of int aa to long data type
     * @param bb
     */

    public static void widely_cast_int_to_long(long bb){
        System.out.println(bb);

    }

    //15. Ստեղծել int myInt  = 7 և double myDouble փոփոխականներ,
    //     կատարել Cast գործողություն  myInt -> myDouble  և տպել console -ում․

    /**
     * this method is used to do widening casting, it converts the value of int myInt to double data type
     * @param i
     */


    public static void widely_cast_int_to_double(double i){
        System.out.println(i);
    }

    //16. Ստեղծել double dd = 9.78d և int ii փոփոխականներ,
    //կատարել Cast գործողություն  dd -> ii  և տպել console -ում․

    /**
     * this method is used to do narrowing casting, it converts the value of double dd to int data type
     * @param v1
     */

    public static void narrowly_cast_double_to_int(int v1){
        System.out.println(v1);

    }

    //17. Ստեղծել int ff = 9999 և byte gg փոփոխականներ,
    //      կատարել Cast գործողություն  ff -> gg  և տպել console -ում․

    /**
     * this method is used to do narrowing castin, it convverts the value of int ff to byte data type
     * @param tt
     */

    public static void narrowly_cast_int_to_byte(byte tt){
        System.out.println(tt);

    }
    /* 18․ Գտնել սխալը , ուղղել և տպել․

    long max = 3123456789;
    double d = 1000_.00;
    char i =’i’;
    char j=’j’;
    char ij = i + j;
    int 7a = 8;
    long h = h  + 8;
    int n,m = 11; m = n;

    Էս արել եմ main method-ում

     */

}







