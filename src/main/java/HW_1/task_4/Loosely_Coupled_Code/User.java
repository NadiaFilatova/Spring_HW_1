package HW_1.task_4.Loosely_Coupled_Code;
//У цьому прикладі User не прямо залежить від конкретної реалізації адреси. Замість цього,
// User має поле address, яке є типом Address, що є інтерфейсом.
// Клас User використовує метод getFullAddress() інтерфейсу Address для отримання повної адреси,
// без прив'язки до конкретної реалізації.
public class User {
    private final String name;
    private final int age;

    private final Address address;

    public User(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Ім'я: " + name);
        System.out.println("Вік: " + age);
        System.out.println("Адреса: " + address.getFullAddress());
    }
}
