import java.util.ArrayList;
import java.util.List;

public class Main{
	public static void main(String[] args)
	{
		System.out.println("Hello it's the main branch");
		
		String[] devoirs = {"TP DEVOPS", "TP RESEAUX", "TP OS", "RAPPORT ALTERNANCE", "PPT ALTERNANCE", "TOEIC BLANC"};
        	List<String> taches_a_effectuer = new ArrayList<>();
		
        	for (String devoir : devoirs) {
            		taches_a_effectuer.add(devoir);
        	}

		for (String element : taches_a_effectuer) {
            		System.out.println(" " + element);
        	}
		
	}
}
