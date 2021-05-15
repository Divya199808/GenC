 //import necessary packages
 import java.io.*;
 @SuppressWarnings("unchecked")//Do not delete this line
 public class FileManager 
 {
    
    static public File createFile()
    {
        File file = new File("visitors.txt");
        try {
            boolean isFileCreate = file.createNewFile();
            return file;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
    static public void writeFile(File f, String record)
	{
	    try{
	        PrintWriter printWriter = new PrintWriter(new FileOutputStream(f, true));
            printWriter.write(record);
            printWriter.flush();
            printWriter.close();
        } 
        catch (IOException e) {
            e.printStackTrace();
	    }
	    
	} 
	static public String[] readFile(File f)
	{
	    try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(f));
            String records = bufferedReader.readLine();
            return records.split(";");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
	}
 }
