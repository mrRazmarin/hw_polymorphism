package maincode;

import taxcode.TaxSystem;

public class Company {

    private String title;

    private Integer debit = 0;

    private Integer credit = 0;

    private TaxSystem taxSystem;

    public Company(String title, TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
        this.title = title;
    }

    public void shiftMoney(int amount) {

        if (amount > 0)
            this.increaseDebit(amount);

        if (amount < 0)
            this.increaseCredit(amount);

    }

    public void increaseDebit(int increaser) {
        this.debit += increaser;
    }

    public void increaseCredit(int increaser) {
        this.credit += Math.abs(increaser);
    }

    public void setTaxSystem(TaxSystem taxSystem) {
        this.taxSystem = taxSystem;
    }

    public void payTaxes() {
        System.out.println();
        System.out.printf("Компания %s уплатила налог в размере: %d руб. ", this.title, this.taxSystem.calcTaxFor(
                this.debit,
                this.credit
        ));
    }
}
