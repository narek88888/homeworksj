package homework12;

/*

Exercise 8
Create an enum SubscriptionPlan with values: FREE, BASIC, PREMIUM, ENTERPRISE.
Each plan should have a monthly cost as a field.
 Then:
1.Write a method to compare two plans and print which one is higher tier.

2.Use a switch statement to print the benefits of each plan.
 */

enum SubscriptionPlan{
    FREE(0),
    BASIC(5),
    PREMIUM(25),
    ENTERPRISE(65);

    private int monthlyCost;

    private SubscriptionPlan(int monthlyCost){
        this.monthlyCost = monthlyCost;
    }

    public int getMonthlyCost() {
        return monthlyCost;
    }

    public void check(SubscriptionPlan a, SubscriptionPlan b){
        if(a.getMonthlyCost() > b.getMonthlyCost()){
            System.out.println(a + " is higher than " + b);
        } else if (a.getMonthlyCost() < b.getMonthlyCost() ) {
            System.out.println(a + " is less than " + b);
        } else {
            System.out.println(a + " equals " + b);
        }
    }

    public void printBenefits(){
        switch (this) {
            case FREE:
                System.out.println("Free: Daily 2 hours access, ads included");
                break;
            case BASIC:
                System.out.println("Basic: access to standard features, no ads");
                break;
            case PREMIUM:
                System.out.println("Premium; access to all features, limited support");
                break;

            case ENTERPRISE:
                System.out.println("Enterprise: enterprise support, multi-user access");
                break;
        }
    }

}


public class Task8 {
    public static void main(String[] args){
        SubscriptionPlan.FREE.check(SubscriptionPlan.PREMIUM, SubscriptionPlan.PREMIUM);
        SubscriptionPlan.FREE.check(SubscriptionPlan.PREMIUM, SubscriptionPlan.FREE);
        SubscriptionPlan.FREE.check(SubscriptionPlan.PREMIUM, SubscriptionPlan.ENTERPRISE);

        SubscriptionPlan.FREE.printBenefits();
        SubscriptionPlan.BASIC.printBenefits();
        SubscriptionPlan.PREMIUM.printBenefits();
        SubscriptionPlan.ENTERPRISE.printBenefits();
    }

}
