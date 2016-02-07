import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
public class SizeFile extends Thread{
	
	
	public SizeFile(String emplacement, String fichierNote) {
		super();
		this.emplacement = emplacement;
		this.fichierNote = fichierNote;
	}

	String emplacement;
	String fichierNote;
	int  FileSize;
	private String ligne;
	
	
			//lecture du fichier texte	
	public String getEmplacement() {
		return emplacement;
	}
	public void setEmplacement(String emplacement) {
		this.emplacement = emplacement;
	}
	public String getFichierNote() {
		return fichierNote;
	}
	public void setFichierNote(String fichierNote) {
		this.fichierNote = fichierNote;
	}
	public int getFileSize() {
		return FileSize;
	}
	public void setFileSize(int fileSize) {
		FileSize = fileSize;
	}
			
	public int getSize(){
		
	try{
				InputStream ips=new FileInputStream(fichierNote); 
				InputStreamReader ipsr=new InputStreamReader(ips);
				BufferedReader br=new BufferedReader(ipsr);
				
				while ((ligne=br.readLine())!=null){
				
				FileSize+=FileSize;
					 
				}
				
				br.close(); 
				
				
			}		
			catch (Exception e){
				System.out.println(e.toString());
			}
	
	
	return  FileSize;
	}
	
	public void  splitFile()
	{   
		int taille= getFileSize();
		int part1 = 0,part2=0,part3=0,part4=0;
		for(int i=0;i<taille;i++)
		{  if(i==Math.rint(taille/4))
			part1=i;
		   if(i==Math.rint(taille/2))
			   part2=i;
		   if(i==Math.rint(((3*taille/4))));
		   part3=i;
		}
		
		
        		
		TraiteTexte trait=new TraiteTexte(emplacement,0,part1);
		TraiteTexte trait1=new TraiteTexte(emplacement,part1,part2);
		TraiteTexte trait2=new TraiteTexte(emplacement,part2,part3);
		TraiteTexte trait3=new TraiteTexte(emplacement,part3,taille);
		
	}
	
	

}
