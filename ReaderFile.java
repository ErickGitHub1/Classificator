import java.io.*;
import java.util.*;


public class ReaderFile
{
	public ReaderFile()
	{
        // This will reference one line at a time
        String line = null;

		// This is reference for file name
		String fileName;
		
		System.out.println("Enter file name?");
		Scanner fileNameReader = new Scanner(System.in);
		fileName =  fileNameReader.next();
		
        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);
                
			ArrayList<String> lines = new ArrayList<String>();
            while((line = bufferedReader.readLine()) != null) {				   
				   System.out.println(line);
				   
				   // Adding lines to ArrayList
				   lines.add(line);
            }   
            
			String[] strArr = lines.toArray(new String[lines.size()]);
			
			ArrayList<String> temp = new ArrayList<String>();
			
			for(int i = 1 ; i < strArr.length ; i++)
			{
					temp.add(strArr[i]);
			}
			
			
			//Properly Array for calculation
			String[] goodArr = temp.toArray(new String[temp.size()]);
			
			// Always close files.
            bufferedReader.close();
                                   
            // Number of rows
            int nRows = goodArr.length;
            System.out.println("Number of rows" + nRows);
            
            // Number of cols
            //int nCols = (goodArr[0].length()-goodArr[0].replace(" ", "").length())+1; 
            //System.out.println("Number of cols" + goodArr[0].length()); 
            //System.out.println(goodArr[0]);      
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
        
        }
    }

}
