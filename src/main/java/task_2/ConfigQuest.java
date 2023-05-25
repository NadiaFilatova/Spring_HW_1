package task_2;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import task_2.status.Running;

@Configuration
public class ConfigQuest {


    @Bean
    public Quest questRun(){
        return new Running();
    }

    @Bean
    public Knight Knight(@Qualifier("jump") Quest quest){
        return new Knight(quest);
    }

}
