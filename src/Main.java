public class Main {
    public static void main(String[] args) {
        //Fake inputs
        double springCost = 562.65;
        double summerCost = 789.45;
        double fallCost = 356.83;
        double winterCost = 945.73;

        double totalCost = springCost + summerCost + fallCost + winterCost;

        System.out.println("With the cost of spring: " + springCost + " and the cost of summer: " + summerCost
            + " and the cost of fall: " + fallCost + " and the cost of winter: " + winterCost +
                ", the total yearly maintenance cost is " + totalCost);

    }
}