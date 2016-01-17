import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;


public class ProportionMovie1 {

	
	public static void proportionMovie(){
		 long debut1 = System.currentTimeMillis();
	String emplacement= System.getProperty("user.dir") + "\\ml-100k\\ml-100k";
	System.out.println("Question 1 : fichier 100k ");
	
	String fichierNote = emplacement + "\\u.data";
	
	int un = 0;
	int deux = 0;
	int trois = 0;
	int quatre = 0;
	int cinq = 0;
	
	//lecture du fichier texte	
	try{
		InputStream ips=new FileInputStream(fichierNote); 
		InputStreamReader ipsr=new InputStreamReader(ips);
		BufferedReader br=new BufferedReader(ipsr);
		
		String ligne;
		
		while ((ligne=br.readLine())!=null){
			String colonne [] = ligne.split("\\s+");
			switch(Integer.parseInt(colonne[2])){
			case 1 : un++;
			break;
			case 2 : deux++;
			break;
			case 3 : trois++;
			break;
			case 4 : quatre++;
			break;
			case 5 : cinq++;
			break;
			default : System.out.println("Error line : " + ligne);
			break;
			}
		}
		
		br.close(); 
	}		
	catch (Exception e){
		System.out.println(e.toString());
	}		
	System.out.println("1 étoile : " + un);
	System.out.println("2 étoile : " + deux);
	System.out.println("3 étoile : " + trois);
	System.out.println("4 étoile : " + quatre);
	System.out.println("5 étoile : " + cinq);
	 System.out.println("Temps d'exécution 1:\t"+(System.currentTimeMillis()-debut1)/1000+"SECONDES");
}

}
