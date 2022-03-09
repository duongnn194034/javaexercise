import *;
public class MyDate {
    private int year, month, day;
    
    public MyDate() {

    }
    public MyDate(MyDate d) {
        this.year = d.getYear();
        this.month = d.getMonth();
        this.day = d.getDay();
    }
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getDay() {
        return this.day;
    }
    public int getMonth() {
        return this.month;
    }
    public int getYear() {
        return this.year;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public void dayOfWeek() {
        
    }
}