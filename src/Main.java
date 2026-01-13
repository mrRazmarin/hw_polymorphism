import maincode.Company;
import taxcode.TaxSystem;
import taxcode.TaxSystemFifteenPercent;
import taxcode.TaxSystemSixPercent;

public class Main {
    public static void main(String[] args) {
        TaxSystem taxSystem = new TaxSystemSixPercent();
        TaxSystem taxSystemZero = new TaxSystemFifteenPercent();

        Company company = new Company("\"ООО\" ГазПромТехИвент", taxSystem);
        Company companyZero = new Company("\"ООО\" НульБаланс", taxSystemZero);

        company.shiftMoney(10000);
        company.shiftMoney(-5000);
        company.shiftMoney(0);

        company.payTaxes(); // 600 = (10000 / 100) * 6

        company.setTaxSystem(new TaxSystemFifteenPercent());

        company.shiftMoney(10000);
        company.shiftMoney(-5000);
        company.shiftMoney(0);

        company.payTaxes(); // 750 = ((10000 - 5000) / 100) * 15

        System.out.println();

        companyZero.payTaxes();

        companyZero.setTaxSystem(new TaxSystemSixPercent());

        companyZero.payTaxes();
    }
}
