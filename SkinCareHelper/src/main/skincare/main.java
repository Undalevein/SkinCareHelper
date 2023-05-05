/**
* Project: Skin Care
* Names: Natasha Cordova-Diba, Jeron Alford, A'kaia Phelps, Hannah Holden, Wesley Ng
* Collaborators: None
* Description: After asking questions about skin care, the program will recommend the product the
* user asked for.
*/


package main.skincare;

import java.util.*;

class Main {
  public static void main(String[] args) {
    SkinCareHashmap myHashmap = new SkinCareHashmap();
    //scanner declaration
    Scanner in = new Scanner(System.in);
    String q1 = "Do you have Dry, Oily, or Combination Skin";
    String q2 = "What skin problems would you like to focus on? \t1. Discoloration? \t2. Aging? \t3. Large Pores?";
    String q3 = "What would you like to fix? Dullness, Redness, or Texture";
    String ans1, ans2, ans3;
      

    // Interrogate the user... make them confess
    //Question 1
    System.out.println("%s".formatted(q1));
    do {
      ans1 = in.nextLine();
      if (ans1.equalsIgnoreCase("dry")){
        ans1 = "Dry Skin";
        break;
      } else if (ans1.equalsIgnoreCase("oily")) {
        ans1 = "Oily Skin";
        break;
      } else if (ans1.equalsIgnoreCase("combination skin")) {
        ans1 = "Combination";
        break;
      }
    } while(true);

    //Question 2
    System.out.println("%s".formatted(q2));
    do {
      ans2 = in.nextLine();
      if (ans2.equalsIgnoreCase("discoloration")){
        ans2 = "Discoloration";
        break;
      } else if (ans2.equalsIgnoreCase("aging")) {
        ans2 = "Aging";
        break;
      } else if (ans2.equalsIgnoreCase("large pores")) {
        ans2 = "Large Pores";
        break;
      }
    } while(true);
    
    // Question 3 
    System.out.println("%s".formatted(q3));
    do {
      ans3 = in.nextLine();
      if (ans3.equalsIgnoreCase("dullness")){
        ans3 = "Dullness";
        break;
      } else if (ans3.equalsIgnoreCase("redness")) {
        ans3 = "Redness";
        break;
      } else if (ans3.equalsIgnoreCase("texture")) {
        ans3 = "Texture";
        break;
      }
    } while(true);


    /*
    // Time to utilize the answers:
    SkinCareHashmap layerOneHashmap = new SkinCareHashmap();
    layerOneHashmap.search(ans1);
    
    SkinCareHashmap layerTwoHashmap = new SkinCareHashmap();
    layerTwoHashmap.search(ans2);

    SkinCareHashmap layerThreeHashmap = new SkinCareHashmap();
    layerThreeHashmap.search(ans3);
    
    */

    // Prints out the answer
    System.out.println("For " + ans1 + ", we recommend trying " + myHashmap.search(ans1) + ".");
    System.out.println("For " + ans2 + ", we recommend trying " + myHashmap.search(ans2) + ".");
    System.out.println("For " + ans3 + ", we recommend trying " + myHashmap.search(ans3) + ".");
    
    in.close();
  }

  
}


