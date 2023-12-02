import java.util.ArrayList;
import java.util.List;

public class Br3{
	public static void main(String[] args) {
        System.out.println("Hello it's the third branch");

        String[] devoirs = {"TP DEVOPS", "TP RESEAUX", "TP OS", "RAPPORT ALTERNANCE", "PPT ALTERNANCE", "TOEIC BLANC"};
        List<String> taches_a_effectuer = new ArrayList<>();

        for (String devoir : devoirs) {
            taches_a_effectuer.add(devoir);
        }
	
	String modifierNomTache = "TP OS 5";    
	taches_a_effectuer.set(3, modifierNomTache);   
    }
}
