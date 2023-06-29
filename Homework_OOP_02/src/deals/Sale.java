package deals;

public class Sale extends Deal {

    public Sale(String productName, int price) {
        this.creditChange = 0;
        this.debitChange = price;
        this.comment = "Продажа " + productName + " на " + price + " руб.";
        System.out.println(this.comment);
    }
}
