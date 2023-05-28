package HW_2.Task_2_3_4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

//Завдання 2
//Створіть новий клас із будь-якої предметної області з кількома полями.
// Деякі поля мають бути задані за допомогою конструктора, деякі – за допомогою setter-методу,
// а деякі – за допомогою методу init, який ви маєте вказати під час оголошення біну в конфігурації.
//
//Завдання 3
//Переведіть конфігурацію XML із Завдання 2 у конфігурацію Java.
//
//Завдання 4
//За аналогією з List з уроку створіть у конфігурації XML бін Map.
public class Main {
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        XMLConfig(context);

        MapBean(context);

        JavaConfig();
    }

    public static void XMLConfig(ApplicationContext context) {
        System.out.println(ANSI_BLUE + "\nXML Config" + ANSI_BLUE);
        Chemistry_Interface candy1 = context.getBean("calcium_oxide", Chemistry.class);
        System.out.println(candy1);
        Chemistry_Interface candy2 = context.getBean("name1", Chemistry.class);
        System.out.println(candy2);

    }

    public static void MapBean(ApplicationContext context) {
        System.out.println(ANSI_CYAN + "\nMap Bean" + ANSI_CYAN);
        Map<Integer, Chemistry> myMap = context.getBean("ChemistryMap", Map.class);
        for (Map.Entry<Integer, Chemistry> entry : myMap.entrySet())
            System.out.println(entry.getKey() + " " + entry.getValue());
    }

    public static void JavaConfig() {
        System.out.println(ANSI_PURPLE + "\nJava Config" + ANSI_PURPLE);
        ApplicationContext contextJava = new AnnotationConfigApplicationContext(AppConfig.class);
        Map<String, Chemistry> candies = contextJava.getBeansOfType(Chemistry.class);
        for (Chemistry candy : candies.values())
            System.out.println(candy);
    }
}
