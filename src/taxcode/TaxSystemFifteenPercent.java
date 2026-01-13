package taxcode;

public class TaxSystemFifteenPercent extends TaxSystem {
    @Override
    public int calcTaxFor(int debit, int credit) {
        int debitMinusCredit = debit - credit;

        return debitMinusCredit < 0 ? 0 : ((debitMinusCredit/100) * 15);
    }
}
