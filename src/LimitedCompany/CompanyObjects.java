package LimitedCompany;

public class CompanyObjects extends Company {
    public CompanyObjects(String companyDirectorName, String companyDirectorSurname, String companyDirectorGender, String companyDirectorNinoNumber, String companyDirectorUtr, String companyDirectorEmail, String companyDirectorAddress, long companyDirectorMobile, String companyName, int companyNumber, String companyAddress, String companyUtr, String companyAuthCode, String companyPayeRef, String companyPayeOfficeRef, int companyVatNumber) {
        super(companyDirectorName, companyDirectorSurname, companyDirectorGender, companyDirectorNinoNumber, companyDirectorUtr, companyDirectorEmail, companyDirectorAddress, companyDirectorMobile, companyName, companyNumber, companyAddress, companyUtr, companyAuthCode, companyPayeRef, companyPayeOfficeRef, companyVatNumber);
    }

    public static void main(String[] args) {

        Company polipost = new Company();

        System.out.println(polipost);




    }


}