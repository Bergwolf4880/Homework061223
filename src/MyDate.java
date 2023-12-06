public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int year, int month, int day) {

        this.year = year;
        this.month = month;
        this.day = day;

    }
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    private int getDaysForMonth(int year, int month) {

        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> isLeapYear(year) ? 29 : 28;
            default -> throw new RuntimeException("Invalid month");
        };
    }

    private int getCurrentMonthDays() {

        return getDaysForMonth(this.year, this.month);
    }

    private boolean isLeapYear(int year) {

        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

    }

    public String toString() {

        return this.day + "-" + this.month + "-" + this.year;
    }


}
