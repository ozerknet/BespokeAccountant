package LimitedCompany;

import LimitedCompany.Person;

public class PersonContactDetails extends Person {
    private String personEmail;
    private String personAddress;
    private long personMobile;

    public PersonContactDetails(String name, int age, char gender, int ninoNumber, int utrNumber, String personEmail, String personAddress, long personMobile) {
        super(name, age, gender, ninoNumber, utrNumber);
        this.personEmail = personEmail;
        this.personAddress = personAddress;
        this.personMobile = personMobile;
    }

    public PersonContactDetails() {
        super();
    }

    public String getPersonEmail() {
        return personEmail;
    }

    public void setPersonEmail(String personEmail) {
        this.personEmail = personEmail;
    }

    public String getPersonAddress() {
        return personAddress;
    }

    public void setPersonAddress(String personAddress) {
        this.personAddress = personAddress;
    }

    public long getPersonMobile() {
        return personMobile;
    }

    public void setPersonMobile(long personMobile) {
        this.personMobile = personMobile;
    }


    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                '}'+
                "PersonContactDetails{" +
                "personEmail='" + personEmail + '\'' +
                ", personAddress='" + personAddress + '\'' +
                ", personMobile=" + personMobile +
                '}';
    }
}
