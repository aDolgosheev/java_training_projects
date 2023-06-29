import deals.Deal;
import deals.Expenditure;
import deals.Sale;
import taxes.TaxEarnings;
import taxes.TaxEarningsMinusSpendings;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("ООО \"Рога и копыта\"", new TaxEarningsMinusSpendings());
//        company.shiftMoney(100);
//        company.payTaxes();
//        company.setTaxSystem(new TaxEarningsMinusSpendings());
//        company.shiftMoney(100);
//        company.payTaxes();
//        company.shiftMoney(-100);
//        company.payTaxes();

        Deal[] deals = {
                new Sale("Сметана", 56),
                new Sale("Йогурт", 40),
                new Expenditure("Витрина", 150),
                new Sale("Творог", 89)
        };

        company.applyDeals(deals);
    }
}