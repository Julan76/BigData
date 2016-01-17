import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.Map.Entry;


public class Bestmarker2 {

	
  static void bestMarker(){
		 
		Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
		
		 List<Integer> list = new ArrayList<>();
		
		  
	

		int frequence;
		 Integer a;
		
		 long debut2 = System.currentTimeMillis();
				String emplacement= System.getProperty("user.dir") + "\\ml-100k\\ml-100k";
				System.out.println("Question 2: fichier 100k");
				
				String fichierNote = emplacement +  "\\u.data";
			
				
				
				//lecture du fichier texte	
				try{
					InputStream ips=new FileInputStream(fichierNote); 
					InputStreamReader ipsr=new InputStreamReader(ips);
					BufferedReader br=new BufferedReader(ipsr);
					
					String ligne;
					
					while ((ligne=br.readLine())!=null){
					
						String str [] = ligne.split("\\s+");
						 a=(Integer.parseInt(str[0]));
						
						//	tab[lineNumber]=a;
						 list.add(a);
						
						
					
						 
					}
					
					br.close(); 
					
					
				}		
				catch (Exception e){
					System.out.println(e.toString());
				}		
				 for(int i = 0 ; i < list.size(); i++){
					 
					
						 frequence=	Collections.frequency(list,list.get(i));
						  ht.put(list.get(i), frequence);
					
	
				 }
				 int maxValueInSet = Collections.max(ht.values());
					
				 
				// maxValueInSet = Collections.max(ht.values());
				 for (Entry<Integer, Integer> entry : ht.entrySet()) {
			            if (entry.getValue().equals(maxValueInSet)) {
			                System.out.println("id de l'utilisateur qui a noté le plus de films:\t"+entry.getKey());
			            }
				 }
				 System.out.println("Temps d'exécution 2:\t"+(System.currentTimeMillis()-debut2)/1000+"SECONDES");
}

}
