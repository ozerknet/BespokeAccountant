package LimitedCompany;

public class Company {
    // Company director general informations
    private String companyDirectorName = null;
    private String companyDirectorSurname = null;
    private String companyDirectorGender = null;
    private String companyDirectorNinoNumber = null;
    private String companyDirectorUtr = null;
    // Company director contact details
    private String companyDirectorEmail = null;
    private String companyDirectorAddress = null;
    private long companyDirectorMobile = 0;
    //Company details
    private String companyName = null;
    private int companyNumber = 0;
    private String companyAddress = null;
    private String companyUtr = null;
    private String companyAuthCode = null;
    //Company PAYE details
    private String companyPayeRef = null;
    private String companyPayeOfficeRef = null;
    //Company VAT details
    private int companyVatNumber = 0;

    public Company(String companyDirectorName, String companyDirectorSurname, String companyDirectorGender, String companyDirectorNinoNumber, String companyDirectorUtr, String companyDirectorEmail, String companyDirectorAddress, long companyDirectorMobile, String companyName, int companyNumber, String companyAddress, String companyUtr, String companyAuthCode, String companyPayeRef, String companyPayeOfficeRef, int companyVatNumber) {
        setCompanyDirectorName(companyDirectorName);
        setCompanyDirectorSurname(companyDirectorSurname);
        setCompanyDirectorGender(companyDirectorGender);
        setCompanyDirectorNinoNumber(companyDirectorNinoNumber);
        setCompanyDirectorUtr(companyDirectorUtr);
        setCompanyDirectorEmail(companyDirectorEmail);
        setCompanyDirectorAddress(companyDirectorAddress);
        setCompanyDirectorMobile(companyDirectorMobile);
        setCompanyName(companyName);
        setCompanyNumber(companyNumber);
        setCompanyAddress(companyAddress);
        setCompanyUtr(companyUtr);
        setCompanyAuthCode(companyAuthCode);
        setCompanyPayeRef(companyPayeRef);
        setCompanyPayeOfficeRef(companyPayeOfficeRef);
        setCompanyVatNumber(companyVatNumber);
    }

    Company() {

    }

    public String getCompanyDirectorName() {
        return companyDirectorName;
    }

    public void setCompanyDirectorName(String companyDirectorName) {
        this.companyDirectorName = companyDirectorName;
    }

    public String getCompanyDirectorSurname() {
        return companyDirectorSurname;
    }

    public void setCompanyDirectorSurname(String companyDirectorSurname) {
        this.companyDirectorSurname = companyDirectorSurname;
    }

    public String getCompanyDirectorGender() {
        return companyDirectorGender;
    }

    public void setCompanyDirectorGender(String companyDirectorGender) {
        this.companyDirectorGender = companyDirectorGender;
    }

    public String getCompanyDirectorNinoNumber() {
        return companyDirectorNinoNumber;
    }

    public void setCompanyDirectorNinoNumber(String companyDirectorNinoNumber) {
        this.companyDirectorNinoNumber = companyDirectorNinoNumber;
    }

    public String getCompanyDirectorUtr() {
        return companyDirectorUtr;
    }

    public void setCompanyDirectorUtr(String companyDirectorUtr) {
        this.companyDirectorUtr = companyDirectorUtr;
    }

    public String getCompanyDirectorEmail() {
        return companyDirectorEmail;
    }

    public void setCompanyDirectorEmail(String companyDirectorEmail) {
        this.companyDirectorEmail = companyDirectorEmail;
    }

    public String getCompanyDirectorAddress() {
        return companyDirectorAddress;
    }

    public void setCompanyDirectorAddress(String companyDirectorAddress) {
        this.companyDirectorAddress = companyDirectorAddress;
    }

    public long getCompanyDirectorMobile() {
        return companyDirectorMobile;
    }

    public void setCompanyDirectorMobile(long companyDirectorMobile) {
        this.companyDirectorMobile = companyDirectorMobile;
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

    public String getCompanyUtr() {
        return companyUtr;
    }

    public void setCompanyUtr(String companyUtr) {
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
        return "Company{" +
                "companyDirectorName='" + companyDirectorName + '\'' +
                ", companyDirectorSurname='" + companyDirectorSurname + '\'' +
                ", companyDirectorGender='" + companyDirectorGender + '\'' +
                ", companyDirectorNinoNumber='" + companyDirectorNinoNumber + '\'' +
                ", companyDirectorUtr='" + companyDirectorUtr + '\'' +
                ", companyDirectorEmail='" + companyDirectorEmail + '\'' +
                ", companyDirectorAddress='" + companyDirectorAddress + '\'' +
                ", companyDirectorMobile=" + companyDirectorMobile +
                ", companyName='" + companyName + '\'' +
                ", companyNumber=" + companyNumber +
                ", companyAddress='" + companyAddress + '\'' +
                ", companyUtr='" + companyUtr + '\'' +
                ", companyAuthCode='" + companyAuthCode + '\'' +
                ", companyPayeRef='" + companyPayeRef + '\'' +
                ", companyPayeOfficeRef='" + companyPayeOfficeRef + '\'' +
                ", companyVatNumber=" + companyVatNumber +
                '}';
    }
}
