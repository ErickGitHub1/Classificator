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
			
			System.out.println(strArr[0]);
			// Table of information about number of classes, features and objects
			String[] informations = strArr[0].split(" ");
			
			System.out.println(informations[0]);
			
			// Casting type Strint to int - number of classes
			int number_classes = Integer.parseInt(informations[0]);		
		
			//Properly Array for calculation
			String[] goodArr = temp.toArray(new String[temp.size()]);
			
			// Closing files.
            bufferedReader.close();
                                   
            // Number of rows
            int nRows = goodArr.length;
            System.out.println("Number of rows " + nRows);
            
            // Number of cols
            int space = 0;
            
            for(int i = 0; i < goodArr[0].length(); i++){

				if(goodArr[0].charAt(i) == ' '){
					space++;
				}
			}
			
			int nCols = (goodArr[0].replace(" ","").length() - space);
            System.out.println("Number of rows " + nCols);
                       
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
