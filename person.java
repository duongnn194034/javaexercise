import *;
public class Person {
    private String name;
    private String gender;
    private MyDate birthday;

    public Person() {

    }
    public Person(String name) {
        this.name = name;
    }
    public Person(String name, String gender) {
        this(name);
        this.gender = gender;
    }
    public Person(String name, MyDate birthday) {
        this(name);
        this.birthday = new MyDate(birthday);
    }

    public String getName() {
        return this.name;
    }
    public String getGender() {
        return this.gender;
    }
    public MyDate getBirthday() {
        return new MyDate(this.birthday);
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setBirthday(MyDate date) {
        this.birthday = new MyDate(date);
    }

    public String toString() {
        return this.getName + ", " + this.getGender;
    }
}