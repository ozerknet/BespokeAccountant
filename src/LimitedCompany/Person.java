package LimitedCompany;

public class Person {

    private String name;
    private int age;
    private char gender;
    private int NinoNumber;
    private int UtrNumber;

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            System.out.println("Invalid age entered, please change it.");
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getNinoNumber() {
        return NinoNumber;
    }

    public void setNinoNumber(int ninoNumber) {
        NinoNumber = ninoNumber;
    }

    public int getUtrNumber() {
        return UtrNumber;
    }

    public void setUtrNumber(int utrNumber) {
        UtrNumber = utrNumber;
    }

    public Person(String name, int age, char gender, int ninoNumber, int utrNumber) {
        setName(name);
        setAge(age);
        setGender(gender);
        setNinoNumber(ninoNumber);
        setUtrNumber(utrNumber);
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void drink() {
        System.out.println(name + " is drinking");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

}


