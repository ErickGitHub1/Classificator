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
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }   

            // Always close files.
            bufferedReader.close();         
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

