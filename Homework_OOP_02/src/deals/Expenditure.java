package deals;

public class Expenditure extends Deal {

    public Expenditure(String productName, int price) {
        this.creditChange = price;
        this.debitChange = 0;
        this.comment = "Покупка " + productName + " на " + price + " руб.";
        System.out.println(this.comment);
    }
}
