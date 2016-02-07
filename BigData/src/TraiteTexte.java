import java.io.*;
public class TraiteTexte extends Thread{
	 public TraiteTexte(String fileName, int startLine, int endLine) {
		super();
		this.fileName = fileName;
		this.startLine = startLine;
		this.endLine = endLine;
	}
	String fileName;
	 int startLine;
	 int endLine;
	 int un, deux, trois, quatre,cinq;
 public void run() {
           String line = null;
           BufferedReader in = null;
           int currentLineNo = 0;
      
                try {
                  in = new BufferedReader (new FileReader(fileName));
                  //read to startLine
                  while(currentLineNo<startLine) {	
	                if (in.readLine()==null) {
	                    throw new IOException("File too small");
	                }
	                currentLineNo++;	
	            }
	    //read until endLine
            while(currentLineNo<=endLine) {
            	    line = in.readLine();
	                String colonne [] = line.split("\\s+");
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
	    			default : System.out.println("Error line : " + line);
	    			break;
	    			}
	                currentLineNo++;
	            }
	        } 
            catch (IOException ex) {
               System.out.println("Problem reading file.\n" + ex.getMessage());
	        } finally {
	           try { if (in!=null) in.close(); 
	                  } 
	            catch(IOException ignore) {}
	                }
	    }
	   
}