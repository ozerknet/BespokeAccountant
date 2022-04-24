package LimitedCompany;

public class SoleTrader extends PersonContactDetails{
    //SolTrader details
    private String soleTraderName;
    private String soleTraderAddress;
    //Company PAYE details
    private String soleTraderPayeRef;
    private String soleTraderPayeOfficeRef;
    //Company VAT details
    private int soleTraderVatNumber;

    public SoleTrader(String name, int age, char gender, int ninoNumber, int utrNumber, String personEmail, String personAddress, long personMobile, String soleTraderName, String soleTraderAddress, String soleTraderPayeRef, String soleTraderPayeOfficeRef, int soleTraderVatNumber) {
        super(name, age, gender, ninoNumber, utrNumber, personEmail, personAddress, personMobile);
        this.soleTraderName = soleTraderName;
        this.soleTraderAddress = soleTraderAddress;
        this.soleTraderPayeRef = soleTraderPayeRef;
        this.soleTraderPayeOfficeRef = soleTraderPayeOfficeRef;
        this.soleTraderVatNumber = soleTraderVatNumber;
    }

    public SoleTrader() {

    }

    public String getSoleTraderName() {
        return soleTraderName;
    }

    public void setSoleTraderName(String soleTraderName) {
        this.soleTraderName = soleTraderName;
    }

    public String getSoleTraderAddress() {
        return soleTraderAddress;
    }

    public void setSoleTraderAddress(String soleTraderAddress) {
        this.soleTraderAddress = soleTraderAddress;
    }

    public String getSoleTraderPayeRef() {
        return soleTraderPayeRef;
    }

    public void setSoleTraderPayeRef(String soleTraderPayeRef) {
        this.soleTraderPayeRef = soleTraderPayeRef;
    }

    public String getSoleTraderPayeOfficeRef() {
        return soleTraderPayeOfficeRef;
    }

    public void setSoleTraderPayeOfficeRef(String soleTraderPayeOfficeRef) {
        this.soleTraderPayeOfficeRef = soleTraderPayeOfficeRef;
    }

    public int getSoleTraderVatNumber() {
        return soleTraderVatNumber;
    }

    public void setSoleTraderVatNumber(int soleTraderVatNumber) {
        this.soleTraderVatNumber = soleTraderVatNumber;
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


                "SoleTrader{" +
                "soleTraderName='" + soleTraderName + '\'' +
                ", soleTraderAddress='" + soleTraderAddress + '\'' +
                ", soleTraderPayeRef='" + soleTraderPayeRef + '\'' +
                ", soleTraderPayeOfficeRef='" + soleTraderPayeOfficeRef + '\'' +
                ", soleTraderVatNumber=" + soleTraderVatNumber +
                '}';
    }
}
