package kz.thquiet.Now;

public class Calendar {
    public static void main(String[] args) {

        Month month = Month.JULY;
        System.out.println(month.getDayOfMonth());
        System.out.println(month.name());
        Month[] values = Month.values();
        for(Month m : values) {
            System.out.println(m.getDayOfMonth());
        }
    }
}
