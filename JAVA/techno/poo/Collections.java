import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedList;

public class Collections {
    public static void main(String[] args) {
        arrayList();
        set();
        map();
        linkedList();
    }


    static void arrayList() {
        List<String> fruits = new ArrayList<>();
        fruits.add("banane");
        fruits.add("pomme");
        fruits.add("poire");

        System.out.println("parcourir avec une boucle for");
        // parcourir ma liste avec une boucle for
        for(int i = 0; i < fruits.size(); i++){
            System.out.println(fruits.get(i));
        }

        System.out.println("parcourir avec une boucle foreach");
        for(String fruit : fruits){
            System.out.println(fruit);
        }
        fruits.add("banane");
        System.out.println("parcourir avec une boucle foreach");
        for(String fruit : fruits){
            System.out.println(fruit);
        }

        //retirer un objet de ma liste
        System.out.println("retirer un objet de la liste");
        fruits.remove("banane");
        for(String fruit : fruits){
            System.out.println(fruit);
        }
        System.out.println("retirer un objet de la liste via l'index");
        fruits.remove(1);
        for(String fruit : fruits){
            System.out.println(fruit);
        }

        // vérifier la présence d'un objet dans ma liste
        if(!fruits.contains("voiture")){
            System.out.println("normal je suis une liste de fruits");
        }else{
            System.out.println("drole de liste");
        }
    }

    static void set() {
        System.out.println("HashSet");

        Set<String> fruits = new HashSet<>();
        fruits.add("banane");
        fruits.add("pomme");
        fruits.add("poire");

        System.out.println("vérifier la présence d'une valeur dans le set");
        if(!fruits.contains("batman")){
            System.out.println(" les fruits, c'est super ... Mais pas à ce point là ");
        }else{
            System.out.println("drole de liste ...");
        }

        System.out.println("Retirer un objet de mon set");
        fruits.remove("banane");

        for(String fruit : fruits){
            System.out.println(fruit);
        }

        System.out.println("rajouter la banane");
        fruits.add("banane");
        for(String fruit : fruits){
            System.out.println(fruit);
        }

        System.out.println("rajoute une deuxieme banane");
        fruits.add("banane");
        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }

    static void map() {
        Map<String, Integer> ageMap = new HashMap<>();

        // ajouter des valeurs dans ma map
        ageMap.put("toto",25);
        ageMap.put("titi",26);
        ageMap.put("tata",27);
        ageMap.put("tutu",28);

        // accéder à l'age de toto
        int ageToto = ageMap.get("toto");
        System.out.println(ageToto);

        // vérifier la présence d'une clef
        System.out.println("vérifier la présence d'une clé dans ma map");
        System.out.println("contient la clef baba ? " + (ageMap.containsKey("baba") ? "oui" : "non"));

        // supprimer un objet
        System.out.println("supprimer un objet");
        ageMap.remove("toto");

        // afficher les données de la map
        // on va venir parcourir la map via l'ensemble des clefs
        System.out.println("parcourir la map via l'ensemble des clefs");
        for(String key : ageMap.keySet()){
            System.out.println(key + " a " + ageMap.get(key) + "ans");
        }

        //parcourir la map via l'ensemble des valeurs
        System.out.println("via l'ensemble des valeurs");
        for(int age : ageMap.values()){
            System.out.println(age);
        }

        //parcourir l'ensemble via les paires clefs valeurs
        System.out.println("parcourir l'ensemble via les paires clefs valeurs");
        for(Map.Entry<String, Integer> entry : ageMap.entrySet()){
            System.out.println(entry.getKey() + " a " + entry.getValue() + "ans");
        }

        // Autres opérations utiles
        System.out.println(ageMap.size());
        System.out.println(ageMap.isEmpty());
    }

    static void linkedList() {
        LinkedList<String> fruits = new LinkedList<>();

        fruits.addFirst("banane");
        fruits.addLast("pomme");
        fruits.add(1, "poire");

        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }

}