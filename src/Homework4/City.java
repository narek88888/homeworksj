package Homework4;//4.Սահմանել City class : instance fields (char code , int  population ) .
//Ստեղծել  main method -ում  object ներ yerevan, moscow, new york , paris
// քաղաքները  համապատասխան  code - քաղաքի անվան առաջին տառ,
// population մարդաքանակով ։

// Homework lesson 4

public class City{
    char code;
    int population;

    public static void main(String[] args){
        City yerevan  = new City();
        City moscow = new City();
        City newYork = new City();
        City paris = new City();

        yerevan.code = 'Y';
        yerevan.population = 1136300;
        moscow.code = 'M';
        moscow.population = 13000000;
        newYork.code = 'N';
        newYork.population = 8000000;
        paris.code = 'P';
        paris.population = 2048472;

        System.out.println("Yerevan code = " + yerevan.code);
        System.out.println("Yerevan population = " + yerevan.population);
        System.out.println("Moscow code = " + moscow.code);
        System.out.println("Moscow population = " + moscow.population);
        System.out.println("New York code = " + newYork.code);
        System.out.println("New York population = " + newYork.population);
        System.out.println("Paris code = " + paris.code);
        System.out.println("Paris population = " + paris.population);
        
    }
}