/*
"Create a Program to read the 4 different files.
Four file name need to be supplied as a CLA (Command line argument).Read all the four files in a sequence and create a new file ( Name of the file , need to be enter as a CLA).
Read all the file's content and write in the new file."
 */
package Day4.FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling_Commandline
{
    static Scanner myReader;

    public static void main(String[] args) throws IOException {

        String projectPath = System.getProperty("user.dir");

        for(int i=0;i<4;i++)

        {
            String filename=args[i];
            File file = new File(projectPath + "/src/main/resources/"+filename);

            System.out.println("File name: " + file.getName());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Writeable: " + file.canWrite());
            System.out.println("Readable: " + file.canRead());
            System.out.println("File size in bytes: " + file.length());

            readAllLines(file);
        }

        myReader.close();
    }

    public static void readAllLines(File file) throws IOException
    {
        myReader=new Scanner(file);
        while (myReader.hasNextLine())
        {
            String data = myReader.nextLine();
            writeAllLines(data);
            System.out.println(data);
        }
    }

    public static void writeAllLines(String data) throws IOException {
        FileWriter myWriter = new FileWriter("demo.txt");
        myWriter.write(data);
        //myWriter.close();
    }
}
