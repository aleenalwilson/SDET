/*
"An excel file name ""Exployee.xlsx"" with the sheet name - ""Employee"" is present with the following columns:

Emp Id, Emp Name, Emp Address, Emp Salary, Emp Age.

Create a Java Code that reads the excel and get the ""Emp Name"" of all employees whose Salary is greater than 5000.

Note: The candidate to create an excel file with the mentioned file name, sheet and the content as described above."
 */
package Day4.FileHandling;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;


public class Excel_FileHandling {


    public static void main(String[] args) throws IOException {

        String projectPath = System.getProperty("user.dir");
        FileInputStream file = new FileInputStream(new File(projectPath + "/src/main/resources/Employees.xlsx"));

        Workbook workbook = new XSSFWorkbook(file);

        Sheet sheet = workbook.getSheetAt(0);
        //workbook.getSheet("Employee");

        Map<Integer, List<String>> data = new HashMap<Integer, List<String>>();

        ArrayList<String> list=new ArrayList<String>();

        String[][] arr=new String[25][25];
        int i = 0;
        int j;
        for (Row row : sheet)
        {
            data.put(i, new ArrayList<String>());
            j=0;
            for (Cell cell : row)
            {
                switch (cell.getCellType())
                {
                    case STRING:
                        //System.out.println(cell.getRichStringCellValue());
                        data.get(new Integer(i)).add(cell.getRichStringCellValue().getString());
                        list.add(cell.getStringCellValue());
                        arr[i][j++]= String.valueOf(cell.getRichStringCellValue());
                        break;
                    case NUMERIC:
                        //System.out.println(cell.getNumericCellValue());
                        data.get(i).add(cell.getNumericCellValue() + "");
                        list.add(String.valueOf(cell.getNumericCellValue()));
                        arr[i][j++]= String.valueOf(cell.getNumericCellValue());
                        break;
                    default:
                        data.get(new Integer(i)).add(" ");
                }
            }
            i++;
        }




        for(Map.Entry m: data.entrySet())
        {
            System.out.println(m.getKey() + " " + m.getValue());

        }
        for(String st:list)
        {
            System.out.println(st);
        }

        for (String[] strings : arr) {
            for (int l = 0; l < arr.length; l++)
                System.out.println(strings[l]);
        }





    }
}
