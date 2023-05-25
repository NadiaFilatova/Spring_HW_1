package HW_1.task_4.Loosely_Coupled_Code;
//Клас UserAddress реалізує інтерфейс Address і надає конкретну реалізацію методу getFullAddress().
public class UserAddress implements Address {
    private final String street;
    private final String city;
    private final String country;

    public UserAddress(String street, String city, String country) {
        this.street = street;
        this.city = city;
        this.country = country;
    }

    @Override
    public String getFullAddress() {
        return street + ", " + city + ", " + country;
    }
}
