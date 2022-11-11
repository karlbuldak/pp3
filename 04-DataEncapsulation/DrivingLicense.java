public class DrivingLicense {
    private String driversName;
    private String driversSurname;
    private String adress;
    private String postalCode;
    private String city;
    private String licenseNumber;
    private int year;
    private String category;

    //getters

    String getDriversName(){
        return driversName;
    }

    String getDriversSurname(){
        return driversSurname;
    }

    String getAdress(){
        return adress;
    }

    String getPostalCode(){
        return postalCode;
    }

    String getCity(){
        return city;
    }

    String getLicenseNumbers(){
        return licenseNumber;
    }

    int getYear(){
        return year;
    }

    String getCategory(){
        return category;
    }

    //setters

    void setDriversName(String name){
        name = name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();
        this.driversName = name;
    }

    void setDriversSurname(String surname){
        this.driversSurname = surname;
    }

    void setAdress(String adress){
        this.adress = adress;
    }

    void setPostalcode(String code){
        this.postalCode = code;
    }

    void setCity(String city){
        this.city = city;
    }

    void setLicenseNumber(String number){
        this.licenseNumber = number;
    }

    void setYear(int year){
        this.year = year;
    }

    void setCategory(String category){
        this.category = category;
    }
    public String toString(){
        return(getDriversName()+"\n"+getDriversSurname()+"\n"+getAdress()+"\n"+getPostalCode()+"\n"+getCity()+"\n"+getLicenseNumbers()+"\n"+getYear()+"\n"+getCategory());
    }
    public static void main(String[] args) {
        DrivingLicense d1 = new DrivingLicense();
        d1.setDriversName("kAROL");
        d1.setDriversSurname("Marek");
        System.out.println(d1);
    }
}
