package LimitedCompany;

public class Company extends PersonContactDetails {


   //Company details
    private String companyName;
    private int companyNumber;
    private String companyAddress;
    private int companyUtr;
    private String companyAuthCode;

    //Company PAYE details
    private String companyPayeRef;
    private String companyPayeOfficeRef;

    //Company VAT details
    private int companyVatNumber;

    public Company(String name, int age, char gender, int ninoNumber, int utrNumber, String personEmail, String personAddress, long personMobile, String companyName, int companyNumber, String companyAddress, int companyUtr, String companyAuthCode, String companyPayeRef, String companyPayeOfficeRef, int companyVatNumber) {
        super(name, age, gender, ninoNumber, utrNumber, personEmail, personAddress, personMobile);
        this.companyName = companyName;
        this.companyNumber = companyNumber;
        this.companyAddress = companyAddress;
        this.companyUtr = companyUtr;
        this.companyAuthCode = companyAuthCode;
        this.companyPayeRef = companyPayeRef;
        this.companyPayeOfficeRef = companyPayeOfficeRef;
        this.companyVatNumber = companyVatNumber;
    }



    public Company() {
        super();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getCompanyNumber() {
        return companyNumber;
    }

    public void setCompanyNumber(int companyNumber) {
        this.companyNumber = companyNumber;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public int getCompanyUtr() {
        return companyUtr;
    }

    public void setCompanyUtr(int companyUtr) {
        this.companyUtr = companyUtr;
    }

    public String getCompanyAuthCode() {
        return companyAuthCode;
    }

    public void setCompanyAuthCode(String companyAuthCode) {
        this.companyAuthCode = companyAuthCode;
    }

    public String getCompanyPayeRef() {
        return companyPayeRef;
    }

    public void setCompanyPayeRef(String companyPayeRef) {
        this.companyPayeRef = companyPayeRef;
    }

    public String getCompanyPayeOfficeRef() {
        return companyPayeOfficeRef;
    }

    public void setCompanyPayeOfficeRef(String companyPayeOfficeRef) {
        this.companyPayeOfficeRef = companyPayeOfficeRef;
    }

    public int getCompanyVatNumber() {
        return companyVatNumber;
    }

    public void setCompanyVatNumber(int companyVatNumber) {
        this.companyVatNumber = companyVatNumber;
    }


    public String toString() {
        return "Person{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                '}'+  "\n" +


                "PersonContactDetails{" +
                "personEmail='" + getPersonEmail() + '\'' +
                ", personAddress='" + getPersonAddress() + '\'' +
                ", personMobile=" + getPersonMobile() +
                '}'+  "\n" +


                "Company{" +
                "companyName='" + companyName + '\'' +
                ", companyNumber=" + companyNumber +
                ", companyAddress='" + companyAddress + '\'' +
                ", companyUtr=" + companyUtr +
                ", companyAuthCode='" + companyAuthCode + '\'' +
                ", companyPayeRef='" + companyPayeRef + '\'' +
                ", companyPayeOfficeRef='" + companyPayeOfficeRef + '\'' +
                ", companyVatNumber=" + companyVatNumber +
                '}';
    }
}
