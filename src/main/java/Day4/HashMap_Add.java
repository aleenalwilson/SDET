/*
"Create an Hashmap with the following values:
	One:1, Two:2, Three:3

	Add one more item only if the key does not already exist. Or else specify that the key is already present."
 */
package Day4;

import java.util.HashMap;
import java.util.Scanner;

public class HashMap_Add {
    public static void main(String[] args)
    {
        HashMap<String,Integer> map=new HashMap<String, Integer>();
        map.put("One",1);
        map.put("Two",2);
        map.put("Three",3);

        Scanner s=new Scanner(System.in);
        System.out.println("Enter a new key: ");
        String key=s.next();

        if(map.containsKey(key))
            System.out.println("Key is already present.");
        else
        {
            System.out.println("Enter the value for "+key+" : ");
            int value=s.nextInt();
            map.put(key,value);
            System.out.println("Key:Value Pair added");
        }

    }
}
