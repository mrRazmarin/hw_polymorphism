public class Company {

    private String title;

    private Integer debit = 0;

    private Integer credit = 0;

    private Integer taxSystem;

    public void shiftMoney(int amount) {

        if (amount > 0)
            this.increaseDebit(amount);

        if (amount < 0)
            this.increaseCredit(amount);

    }

    public Integer getDebit() {
        return debit;
    }

    public void setDebit(Integer debit) {
        this.debit = debit;
    }

    public void increaseDebit(int increaser) {
        this.debit += increaser;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    public void increaseCredit(int increaser) {
        this.credit += Math.abs(increaser);
    }
}
