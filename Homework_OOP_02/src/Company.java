import deals.Deal;
import taxes.TaxSystem;

public class Company {
    private String title;
    private int debit;
    private int credit;
    private TaxSystem taxSystem;
    private Deal[] deals;

    public Company(String title, TaxSystem taxSystem) {
        this.title = title;
        this.taxSystem = taxSystem;
    }

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    public void shiftMoney(int amount) {
        if (amount > 0) {
            debit += amount;
        } else if (amount < 0) {
            credit += Math.abs(amount);
        }
    }

    public void payTaxes() {
        payTaxesComment();
        debit = 0;
        credit = 0;
    }

    public int applyDeals(Deal[] deals) {
        for (Deal deal : deals) {
            debit += deal.getDebitChange();
            credit += deal.getCreditChange();
        }
        System.out.println("Разница доходов и расходов составила : " + (debit - credit) + " руб.");
        payTaxesComment();
        return debit - credit;
    }

    public void payTaxesComment() {
        System.out.printf("Компания %s уплатила налог в размере: %d руб.%n", title, taxSystem.calcTaxFor(debit, credit));
    }
}
