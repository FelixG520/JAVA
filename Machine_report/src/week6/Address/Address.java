package week6.Address;

public class Address {
    private String Country;
    private String Province;
    private String City;
    private String Street;
    private String Code;


    public Address() {
    }

    public Address(String Country, String Province, String City, String Street, String Code) {
        this.Country = Country;
        this.Province = Province;
        this.City = City;
        this.Street = Street;
        this.Code = Code;
    }


    public String getCountry() {
        return Country;
    }

    public void setCountry(String Country) {
        this.Country = Country;
    }

    public String getProvince() {
        return Province;
    }

    public void setProvince(String Province) {
        this.Province = Province;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public void show(){
        System.out.println("地址信息为："+Country+Province+City+Street+" "+"邮政编号："+Code);
    }
}
