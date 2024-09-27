public class Address {
    private String Street;
    private String City;
    private String PostalCode;

    public Address(String street,String City,String PostalCode){
        this.Street=street;
        this.City=City;
        this.PostalCode=PostalCode;

    }

    public void setCity(String city) {
        this.City = City;
    }

    public void setPostalCode(String postalCode) {
        this.PostalCode = PostalCode;
    }

    public void setStreet(String street) {
       this.Street = Street;
    }

    public String getCity() {
        return City;
    }

    public String getPostalCode() {
        return PostalCode;
    }

    public String getStreet() {
        return Street;
    }
    public void displayAddress(){
        System.out.println("Street: "+Street);
        System.out.println("City: "+City);
        System.out.println("PostalCode: "+PostalCode);
    }
}

