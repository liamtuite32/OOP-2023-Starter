package ie.tudublin;

import java.util.ArrayList;

public class Word {
    private String word;
    private ArrayList<Follow> follows;
    public Word(String word) {
        this.word = word;
        this.follows = new ArrayList<>();
    }
    public String getWord() {
        return word;
    }
    public ArrayList<Follow> getFollows() {
        return follows;
    }
    public void addFollow(String word, int count) {
        follows.add(new Follow(word, count));
    }
    public String toString() {
        String word = "";
        for(Follow a : follows) {
            word += "," + a.toString();
        }
        return word;
      }
}