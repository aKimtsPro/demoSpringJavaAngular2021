package bstorm.akimts.demoSpring.presentation;

import bstorm.akimts.demoSpring.dto.PersonneDTO;
import bstorm.akimts.demoSpring.metier.PersonneService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Component
public class InterfaceConsole implements InitializingBean {

//    @Autowired
//    @Qualifier("scanner")
    private final Scanner sc;
    private final PersonneService service;

    public InterfaceConsole(Scanner sc, PersonneService service) {
        this.sc = sc;
        this.service = service;
    }

    public void start(){

        // de facon repete (tant qu'on ne choisi pas de quitter)
        //   1 - afficher le menu
        //   2 - recupérer le choix de l'utilisateur
        //   3 - selon le choix faire telle ou telle action
        int choix = 0;
        while( choix != 3 ){
            showMenu();
            choix = getChoix();
            mapChoix(choix);
        }

    }

    public void showMenu(){
        System.out.println("MENU");
        System.out.println("1 - ajouter une personne");
        System.out.println("2 - afficher les personnes");
        System.out.println("3 - quitter");
    }

    public int getChoix(){
        System.out.println("Veuillez entrer votre choix : ");
        int choix = sc.nextInt();
        sc.nextLine();
        return choix;
    }

    public void mapChoix(int choix){
        switch (choix){
            case 1:
                ajouter();
                break;
            case 2:
                afficher();
                break;
            case 3:
                System.out.println("Au revoir!");
                break;
            default:
                System.out.println("choix invalide");
        }
    }

    public void ajouter(){
        String nom;
        int age;
        System.out.println("Quel est votre nom?");
        nom = sc.nextLine();
        System.out.println("Quel est votre age?");
        age = sc.nextInt();

        PersonneDTO p = PersonneDTO.builder()
                                .age(age)
                                .nom(nom)
                                .build();

        service.add( p );
    }

    public void afficher(){
        service.getAll().forEach(System.out::println);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        start();
    }
}
