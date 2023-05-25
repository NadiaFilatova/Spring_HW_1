package HW_1.task_4.Loosely_Coupled_Code;
//У цьому прикладі об'єкт UserAddress створюється як реалізація Address і передається як параметр при створенні об'єкта User.
// Використання інтерфейсу Address дозволяє замінити реалізацію адреси без необхідності змінювати клас User
public class Main {
    public static void main(String[] args) {
        Address address = new UserAddress("вул. Якась", "Київ", "Україна");
        User user = new User("Іван", 45, address);
        user.displayInfo();
    }
}
