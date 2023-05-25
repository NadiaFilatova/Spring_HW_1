package task_4.Tightly_Coupled_Code;
//У цьому прикладі створюється об'єкт Address, передається як параметр при створенні об'єкта User,
// а потім викликається метод displayInfo(), щоб вивести інформацію про користувача на екран.
public class Main {
    public static void main(String[] args) {
        User.Address address = new User.Address("вул. Якась", "Київ", "Україна");
        User user = new User("Саня", 25, address);
        user.displayInfo();
    }
}
