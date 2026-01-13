package taxcode;

public class TaxSystemSixPercent extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        return (debit / 100) * 6;
    }
}
