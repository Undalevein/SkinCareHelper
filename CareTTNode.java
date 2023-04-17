import java.util.*;

public class CareTTNode{
    boolean wordEnd;
    char letter;
    TTNode left, mid, right;
            
    /**
     * Constructs a new TTNode containing the given character
     * and whether or not it represents a word-end, which can
     * then be added to the existing tree.
     * @param letter Letter to store at this node
     * @param wordEnd Whether or not this is a word-ending letter
     */
    TTNode (char letter, boolean wordEnd) {
        this.letter  = letter;
        this.wordEnd = wordEnd;
                
    }


    /** 
     * 
     * 
     * 
     */
    public void insert(String str){
        TTNode current = null;
        for (char c : str.toCharArray()){
            
        }
    }


    /**
     * @Override The ultimate 
     * 
     * @param Target
     */

    public boolean containsString(String target){

    return false;
    }


    /**
     * @Override When writing a few letters, the autocomplete method will 
     * output 5 possible words at most that user can choose to complete 
     * the method.
     * @param prefix 
    */
    public String[] getPossibleWords(String prefix){
        for (char c : prefix.toCharArray()){
            
        }
    }

}