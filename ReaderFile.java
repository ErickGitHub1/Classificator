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
			
			
            // Always close files.
            bufferedReader.close();
            
            // Getting index in Array list
            System.out.println(lines.get(0));
            
            // Number of rows
            int nRows = strArr.length;
            System.out.println("Number of rows" + nRows);        
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
