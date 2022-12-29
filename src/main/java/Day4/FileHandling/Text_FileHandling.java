/*
"Write a Program to read the text file and display the following
  A. Total number of words in the text file
  B. Total number of unique words in the file"
 */
package Day4.FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class Text_FileHandling {

    static Scanner myReader;

    public static void main(String[] args) throws FileNotFoundException {
        String projectPath = System.getProperty("user.dir");
        File file = new File(projectPath + "/src/main/resources/testfile.txt");

        System.out.println("File name: " + file.getName());
        System.out.println("Absolute path: " + file.getAbsolutePath());
        System.out.println("Writeable: " + file.canWrite());
        System.out.println("Readable: " + file.canRead());
        System.out.println("File size in bytes: " + file.length());


        //readAllLines(file);

        // A. Total number of words in the text file
        countWords(file);

        //B. Total number of unique words in the file
        countUniqueWords(file);

        myReader.close();
    }

    public static void readAllLines(File file) throws FileNotFoundException
    {
        myReader=new Scanner(file);
        while (myReader.hasNextLine())
        {
            String data = myReader.nextLine();
            System.out.println(data);
        }
    }

    public static void countWords(File file) throws FileNotFoundException
    {
        myReader=new Scanner(file);
        int count=0;
        while (myReader.hasNextLine())
        {
            String[] data = myReader.nextLine().split(" ");
            count+=data.length;

        }
        System.out.println("Number of words: "+count);
    }

    public static void countUniqueWords(File file) throws FileNotFoundException
    {
        myReader=new Scanner(file);
        HashSet<String> words=new HashSet<String>();
        while (myReader.hasNextLine())
        {
            String[] data = myReader.nextLine().split(" ");
            Collections.addAll(words, data);

        }
        System.out.println("Number of words: "+words.size());
        //System.out.println(words.toString());
    }

}
