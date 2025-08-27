package homework12;

/*
Exercise 5 (Currency)
Create an enum Currency with values like USD, EUR, JPY.
Each should have a symbol and country. Override toString() to return "USD - United States Dollar".
 */


    enum Currency{
        USD("USD", "United States Dollar"){

            public String toString() {
                return USD.getSymbol() + " - " + USD.getCountry() ;
            }
        },
        EUR("EUR", "Eurozone"){

            public String toString() {
                return EUR.getSymbol() + " - " + USD.getCountry();
            }
        },
        JPY("JPY", "Japanese Yen"){

            public String toString() {
                return JPY.getSymbol() + " - " + JPY.getCountry();
            }
        };

        private String symbol;
        private String country;

        private Currency(String symbol, String country){
            this.symbol = symbol;
            this.country = country;
        }

        public String getSymbol() {
            return symbol;
        }

        public String getCountry(){
            return country;
        }



        public abstract String toString();
    }


    public class Task5 {

        public static void main(String[] args) {
            System.out.println(Currency.USD.getCountry());
            System.out.println(Currency.USD.getSymbol());

            System.out.println(Currency.USD);
            System.out.println(Currency.EUR);
            System.out.println(Currency.JPY);
        }
    }


