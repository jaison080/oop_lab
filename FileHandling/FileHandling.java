import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.io.Reader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileHandling 
{
    public static void main(String[] args) 
    {
        final String path = "Output.txt";

        Reader reader = null;
        Writer writer = null;

        try 
        {
            reader = new FileReader(path);
            String data = "";
            int ch = reader.read();
            while( ch != -1) 
            {
                data += (char)ch;
                ch = reader.read();
            }
            if(data != "")
                System.out.println("String Read from file: " + data);
            else  
                System.out.println(path + " is Empty.");
        }
        catch(FileNotFoundException e) 
        {
            System.out.println(path + " does not already exist.");
        }
        catch(IOException e) 
        {
            System.out.println(e);
        }
        finally 
        {
            try 
            {
                if(reader != null)
                    reader.close();
            }
            catch(IOException e) 
            {
                System.out.println(e);
            }
        }

        Scanner sc = null;
        try 
        {
            sc = new Scanner(System.in);
            writer = new FileWriter(path);
            System.out.print("Enter a string to save in file: ");
            String data = sc.nextLine();
            writer.write(data);
            System.out.print( "\"" + data + "\"" + " written to " + "\"" + path + "\"" + "\n");
        }
        catch( IOException e) 
        {
            System.out.println(e);
        }
        finally 
        {
            if(sc != null)
                sc.close();
            try 
            {
                if(writer != null)
                    writer.close();
            }
            catch( IOException e)
            {
                System.out.println(e);
            }
        }
    }
}