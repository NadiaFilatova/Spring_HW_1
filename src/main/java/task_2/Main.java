package task_2;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import task_2.status.Jumps;
import task_2.status.Running;
import task_2.status.Stand;

/*
Задание 2
Создать интерфейс Quest и несколько его реализаций, а также класс Knight.
Рыцарь может принимать любую реализацию интерфейса Quest и выполнять этот Quest успешно.
При выполнении задания использовать новые знания о POJO, DI & IoC.
 */
public class Main {


    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
        System.out.println("_____start_1");
        Knight knight_1 = applicationContext.getBean("knight", Knight.class);

        knight_1.setQuest(new Running());
        knight_1.getQuest().myQuest();

        knight_1.setQuest(applicationContext.getBean("jump", Jumps.class));
        knight_1.getQuest().myQuest();
        System.out.println("____________2_________");


        Knight knight_2 = applicationContext.getBean("knight", Knight.class);
        knight_2.setQuest(applicationContext.getBean("runway", Running.class));
        knight_2.getQuest().myQuest();
        System.out.println("_______3_____");
        // Внедрение зависимости в коде
        Knight knight_3 = applicationContext.getBean("knight", Knight.class);
        knight_3.setQuest(applicationContext.getBean("stand", Stand.class));
        knight_3.getQuest().myQuest();
        System.out.println("________4________________");

        // Внедрение зависимости в контейнере
        Knight knight_04 = applicationContext.getBean("knight_2", Knight.class);
        knight_04.getQuest().myQuest();
        System.out.println("_________5______");

        // Внедрение зависимости используя конструктор
        Knight knight_05 = applicationContext.getBean("knight_3", Knight.class);
        knight_05.getQuest().myQuest();
        System.out.println("__________6________");

    }


}
