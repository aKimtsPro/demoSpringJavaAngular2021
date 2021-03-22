package bstorm.akimts.demoSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Scanner;

@Configuration
public class AppConfig {

//    @Bean
//    public InterfaceConsole interfaceConsole(){
//        return new InterfaceConsole( scanner() );
//    }

    @Bean
    public Scanner scanner(){
        return new Scanner(System.in);
    }

//    @Bean
//    @Primary
//    public Scanner scanner2(){
//        return new Scanner(System.in);
//    }

}
