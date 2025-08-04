package homework7;

public class StringUtil {
    public static void main(String[] args) {
        System.out.println(do_String_concatenation1("hello", "world"));
        System.out.println(do_String_concatenation2(1, 2, "hello"));
        System.out.println((do_String_concatenation3("1", 2, "hello")));
        System.out.println((do_String_concatenation4("hello", 1, 2, "world")));

        System.out.println(do_split_split("We are living in"));
        System.out.println((do_split_split("J A V A ")));

        System.out.println(do_reverse(new StringBuilder(("sample"))));


        System.out.println(do_uppercase1("armenia"));
        System.out.println(do_uppercase2("usa"));

        System.out.println(do_fill_in("java"));

        System.out.println(delete_a_letter_from_String("We are living in an yellow submarine. We don't  have anything"));
        System.out.println(delete_a_letter_from_StringBuilder("We are living in an yellow submarine. We don't  have anything"));

        System.out.println(replace_a_with_asterisk("We are living in an yellow submarine. We don't  have anything"));

        System.out.println(find_the_longest_word(" We are living in an yellow submarine. We don't  have anything"));

        System.out.println(find_first_symbol("We are living in an yellow submarine. We don't  have anything"));


        printSubLine1("Java is popular", 8);
        printSubLine2(new StringBuilder("Java is very popular"), 10);

        System.out.println(check_null_or_empty("Java"));
        System.out.println(check_null_or_empty(null));
        System.out.println(check_null_or_empty(""));

        System.out.println(find_the_longest_word_with_comma("java is a programming programming"));

        System.out.println(countSubString("We are living in an yellow submarine. We don't  have anything", "in"));
    }


    /*
1․  Գրել method,  որը  կատարում է String concatenation  տվյալ պարամետրով․

   1.1     “hello” , “world”
   1.2     1 , 2 , “hello”
   1.3     “1” , 2 , “hello”
   1.4     “hello”, 1 ,2, “world”

     */

    /**
     * this method is used to do concatenation
     *
     * @param a
     * @param b
     * @return The concatenated string
     */
    public static String do_String_concatenation1(String a, String b) {
        return a + b;
    }

    /**
     * this method is used to do concatenation
     *
     * @param a
     * @param b
     * @param c
     * @return the concatenated string
     */

    public static String do_String_concatenation2(int a, int b, String c) {
        return a + b + c;
    }

    /**
     * this method is used to do concatenation
     *
     * @param a
     * @param b
     * @param c
     * @return the concatenated string
     */

    public static String do_String_concatenation3(String a, int b, String c) {
        return a + b + c;
    }

    /**
     * *
     * * this method is used to do concatenation
     *
     * @param a
     * @param b
     * @param c
     * @param d
     * @return the concatenated string
     */

    public static String do_String_concatenation4(String a, int b, int c, String d) {
        return a + b + c + d;
    }

    /*
    2․  Գրել method,  որը  ստանում է String պարամետր և տպում է ամեն
    դատարկ  սիվոլից նոր տողում օգտագործելով  String Literal ( \t, \b ….)․

actual:  “We are living in”
result:  We
           are
           living
           in
     */

    /**
     * this method is used to do spliting
     *
     * @param x
     * @return the splited String
     */

    public static String do_split_split(String x) {
        return x.replace(" ", "\n");
    }

    /*
3․ Գրել method (reverse), որը  շուռ է տալիս String.
    actual:   “sample”
    result:  “elpmas”

     */

    /**
     * this method is used to do reverse
     *
     * @param x
     * @return
     */

    public static StringBuilder do_reverse(StringBuilder x) {

        return x.reverse();
    }

    /* 4. Գրել method, որը ստուգում է թե քանի անգամ է տրված տեքստում հանդիպել token
    ենթատողը.

   int countSubString(String line, String token)
   token = “in”  ,    line =  “We are living in an yellow submarine. We don't  have anything”
   4 անգամ
*/
    public static int countSubString(String line, String token){
        int count = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.startsWith(token, i)) {
                count++;
            }
        }
        return count;

    }





/*5․  Գրել method, որը  տեքստը սարքում է մեծատառերով գրված, օգտագործելով String.
    Նույնը  խնդիրը   StringBuilder-ով.

actual:   “hello world”
result:  “HELLO WOLRD”

 */

    /**
     * This method is used to convert a string to uppercase
     *
     * @param x
     * @return uppercase of String
     */

    public static String do_uppercase1(String x) {

        return x.toUpperCase();
    }

    /**
     * This method is used to convert a StringBuilder to uppercase
     *
     * @param y
     * @return uppercase of StringBuilder
     */

    public static StringBuilder do_uppercase2(String y) {
        String x = y.toUpperCase();
        return (new StringBuilder(x));
    }


/*
6․ Գրել method, որը console-ից կարդում է 20 երկարությամբ սիմվոլների տող ,
 տպում այն եթե տողի   երկարությունը պակաս է 20 ից ապա պետք է տողը լռացնենք պակաս
 սիմվոլների փոխարեն գրելով «*» սիմվոլը.

actual:   “Armenia”
result:  “Armenia*************”
 */

    /**
     * this method is used to add '*' if the given string less than 20
     *
     * @param x
     * @return String added '*' or not added
     */
    public static String do_fill_in(String x) {
        if (x.length() <= 20) {
            while (x.length() <= 20) {
                x += '*';
            }
            return x;
        } else {
            return "given string is more than 20, give maximum  20 length String";
        }


    }

    /*
    7. Գրել method, որը տրված տեքստից հեռացնում է բոլոր « a »  սիմվոլները.
    Նույնը խնդիրը  StringBuilder-ով.
    actual:  “We are living in an yellow submarine. We don't  have anything”
    result:  “We re living in n yellow submrine. We don't  hve nything”
     */

    /**
     * this method is used to remove "a" letter from String
     *
     * @param text
     * @return text without 'a' letter
     */

    public static String delete_a_letter_from_String(String text) {

        if (text.contains("a")) {
            return text.replace("a", "");

        } else {
            return "there is not 'a' letter";
        }

    }

    /**
     * this method is used to remove "a" letter from StringBuilder
     *
     * @param text
     * @return text without 'a' letter
     */

    public static StringBuilder delete_a_letter_from_StringBuilder(String text) {
        String x = text.replace("a", "");
        return new StringBuilder(x);

    }

    /*8. Գրել method, որը տրված տեքստում բոլոր « a »  սիմվոլները փոխարինում է « * » , օգտագործելով String.
    actual:  “We are living in an yellow submarine. We don't  have anything”
    result:  “We *re living in *n yellow subm*rine. We don't  h*ve *nything”
     */


    /**
     * this method is used to replace "a" with "*"
     *
     * @param x
     * @return text in which "a" is replaced with "*"
     */

    public static String replace_a_with_asterisk(String x) {
        return x.replace("a", "*");
    }

    /* 9. Գրել method, որը գտնում է տեքստում ամենաերկար բառը, տեքստում բառերը անջատված են իրարից պռոբելով.
    actual:  “We are living in an yellow submarine. We don't  have anything”
    result:  submarine
     */

    /**
     * this method is used to find the longest word in the text
     *
     * @param text
     * @return the longest word in the text
     */
    public static String find_the_longest_word(String text) {
        String thelongestword = "";
        String thecurrentword = "";

        for (int i = 0; i < text.length(); i++) {
            char u = text.charAt(i);
            if (u == ' ') {
                if (thecurrentword.length() > thelongestword.length()) {

                    thelongestword = thecurrentword;
                }
                thecurrentword = "";

            } else {
                thecurrentword += u;
            }

        }

        if (thecurrentword.length() > thelongestword.length()) {
            thelongestword = thecurrentword;
        }
        return thelongestword;


    }

    /*
    10․ Գրել method, որը գտնում է թե, որերորդ ինդեքսում է առաջին անգամ հանդիպել String c  սիմվոլը.
    actual:  String c = “a”  ,  “We are living in an yellow submarine. We don't  have anything”
    result:  index 3
     */

    /**
     * this method is used to find the first "a" int the text
     *
     * @param x
     * @return first "a" in the text
     */

    public static int find_first_symbol(String x) {
        String c = "a";
        return x.indexOf(c);

    }

    /*
    11․ Գրել method, որը գտնում և տպում է տրված տողի սկզբից մինչև n-րդ ինդեքսը պարունակող ենթատողը, օգտագործելով String. Նույնը խնդիրը  StringBuilder-ով.
    void printSubLine(String line, int n)
    void printSubLine(StringBuilder line, int n)

     */

    /**
     * this method is used to print the given String from 0 to n
     *
     * @param line
     * @param n
     */
    public static void printSubLine1(String line, int n) {


        if (n <= line.length()) {
            for (int i = 0; i <= n && i <= line.length(); i++) {
                System.out.print(line.charAt(i));

            }
            System.out.println();
        } else {
            System.out.println("You have given number that greater than the line ");

        }
    }

    /**
     * this method is used to print the given StringBuilder from 0 to n
     *
     * @param line
     * @param n
     */

    public static void printSubLine2(StringBuilder line, int n) {

        if (n <= line.length()) {
            for (int i = 0; i <= n && i <= line.length(); i++) {
                System.out.print(line.charAt(i));
            }
            System.out.println();
        } else {
            System.out.println("You have given number that greater than the line ");
        }

    }

    // 12. Գրել method, որը ստուգում է թե արդյոք  տրված  String պարամետրը  դատարկ և null չէ․

    /**
     * this method is used to check if the given String not null or empty
     *
     * @param x
     * @return the checked value
     */
    public static String check_null_or_empty(String x) {
        if (x == null) {
            return "it is null";
        } else if (x == "") {
            return "it is empty";
        } else {
            return "it is neither null nor empty";
        }
    }

    // 13. Գրել method, որը տրոհում է նախադսությունը ըստ  ‘,’   և գտում ամեներկար բառը ․
    // actual:  “We, are, living, in an, yellow, submarine, We don't,  have anything”
    // result:    have anything

    /**
     * this method is used to add comma to String and find the longest word in String
     * @param x
     * @return the longest word in String
     */


    public static String find_the_longest_word_with_comma(String x) {
        String y = x.replace(" ", ",");

        String currentword = "";
        String thelongestword = "";


        for (int i = 0; i < y.length(); i++) {
            char t = y.charAt(i);
            if (t == ',') {
                if (currentword.length() > thelongestword.length()) {
                    thelongestword = currentword;
                }
                currentword = "";

            } else {
                currentword += t;
            }
        }
            if (currentword.length() > thelongestword.length()) {
                thelongestword = currentword;
            }
            return thelongestword;
    }
}








