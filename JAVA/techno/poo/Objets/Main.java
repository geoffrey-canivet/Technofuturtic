package Objets;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Voiture voiture1 = new Voiture("Toyota", "rouge", 3);
        Voiture voiture2 = new Voiture("Renault", "bleu", 5);
        Voiture voiture3 = new Voiture("Audi", "vert", 3);
        
        Map<String, Voiture> voitureMap = new HashMap<>();
        voitureMap.put("Voiture1", voiture1);
        voitureMap.put("Voiture2", voiture2);
        voitureMap.put("Voiture3", voiture3);

        for(String key : voitureMap.keySet()){
            System.out.println(key + " ---> " + voitureMap.get(key));
        }

        voiture1.demarrer();
        voiture1.accelerer(9);
        voiture1.ralentir(4);

        for(String key : voitureMap.keySet()){
            System.out.println(key + " ---> " + voitureMap.get(key));
        }

    }
}