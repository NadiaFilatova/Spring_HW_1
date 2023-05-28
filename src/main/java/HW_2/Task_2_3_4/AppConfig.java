package HW_2.Task_2_3_4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//У цьому прикладі анотації @Configurationпоказано, що клас AppConfigє конфігураційним класом Spring.
// Метод chemistryBean()використовує анотацію @Beanдля визначення біна з назвою chemistryBean.
// Метод інстанціює об'єкт Chemistry, встановлює значення "Element Name"через конструктор та значення 42 з
// а допомогою методу налаштування setAtomicNumber().
// Метод initMethod = "init"вказує, що метод init()класу Chemistry буде викликаний після створення об'єкта.
@Configuration
public class AppConfig {

    @Bean
    public Chemistry calcium_oxide() {
        Chemistry chemistry = new Chemistry("CaO");
        chemistry.setMolarMass(56);
        return chemistry;
    }

    @Bean
    public Chemistry name1() {
        Chemistry chemistry = new Chemistry("Element Name2");
        chemistry.setMolarMass(15);
        return chemistry;
    }


}

