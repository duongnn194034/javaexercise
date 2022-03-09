import *;
public class Person {
    private String name;
    private int age;
    private String gender;

    public Person() {

    }
    public Person(String name) {
        this.name = name;
    }
    public Person(String name, int age, String gender) {
        this(name);
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public String getGender() {
        return this.gender;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNameAge(int age) {
        this.age = age;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
}