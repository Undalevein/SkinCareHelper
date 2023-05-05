package main.skincare;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class SkinCareHashmap {
  // Create a HashMap object called 
  public HashMap<String, String[]> skincareProducts;

  // Constructor
  public SkinCareHashmap(){
    skincareProducts = new HashMap<String, String[]>();

    // Reads the files and adds them to the hashmap
    try {
      File file = new File("products.txt");
      Scanner reader = new Scanner(file);
      ArrayList<String> placeholder = new ArrayList<String>();
      String line = new String();
      String key = new String();
      String[] allProducts = new String[0];
      System.out.println("Running File Reader...");
      
      while (reader.hasNextLine()){
        //System.out.println("Reading...");
        line = reader.nextLine();

        // If a line has an exclamation mark at the beginning, it is the key
        if (line.charAt(0) == '!'){
          if (!key.isEmpty()){
            allProducts = new String[placeholder.size()];
            int i = 0;
            for (String item : placeholder){
              allProducts[i] = item;
              i++;
            }
            //System.out.println("adding key: " + key);
            skincareProducts.put(key,allProducts);
            placeholder = new ArrayList<String>();
          }
          key = line.substring(1,line.length());
        } else {
          placeholder.add(line);
        }
      } 
      skincareProducts.put(key,allProducts);
      reader.close();
    } catch (FileNotFoundException e){
        e.printStackTrace();
    } 
    
    
  }
//NEED TO ADD THE OTHER 6 CATEGORIES HERE

  public String search(String skinCondition){
    // Prints Skin Condition to search
    //System.out.println(skinCondition);

    // variable products = value linked to the key that is put in the search (skinCondition).
    String[] products = skincareProducts.get(skinCondition);
    //if the input does not correspond to any key/value pair: -->
    if (products == null) {
      throw new NullPointerException();
    }
    //if this case passes: --> take a random index and use it to get a single random product -->  then we return the random product
    int randomProductValue = ((int)(Math.random() * products.length));
    String res = products[randomProductValue];

    return res;

  }

}