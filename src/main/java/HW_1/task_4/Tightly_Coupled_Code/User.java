package HW_1.task_4.Tightly_Coupled_Code;

// Клас User і клас Address сильно зв'язані, оскільки клас User має посилання на об'єкт Address,
// і може отримувати доступ до його полів та методів.
//
public class User {
    private final String name;
    private final int age;

    private final Address address;

    public User(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    //Метод displayInfo() виводить на екран ім'я, вік та повну адресу користувача,
// використовуючи метод getFullAddress() класу Address.
    public void displayInfo() {
        System.out.println("Ім'я: " + name);
        System.out.println("Вік: " + age);
        System.out.println("Адреса: " + address.getFullAddress());
    }

    public static class Address {
        private final String street;
        private final String city;
        private final String country;

        public Address(String street, String city, String country) {
            this.street = street;
            this.city = city;
            this.country = country;
        }

        public String getFullAddress() {
            return street + ", " + city + ", " + country;
        }
    }
}

