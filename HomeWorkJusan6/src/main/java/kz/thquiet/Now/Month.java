package kz.thquiet.Now;

public class Month {
    JUNE(31), JULY(30), AUGUST(31);

    private int dayOfMonth;


    Month(int dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    public int getDayOfMonth() {
        return dayOfMonth;
    }
}
