package ie.tudublin;
    
    public class Follow {
    private String word;
    private int count;
    // Constructor
    public Follow(String word, int count) {
        this.word = word;
        this.count = count;
    }
    // Accessor
    public int getCount() {
        return count;
    }
    // Mutator
    public void setCount(int count) {
        this.count = count;
    }
    // Accessor
    public String getWord() {
        return word;
    }
    // Mutator
    public void setWord(String word) {
        this.word = word;
    }
    // Overriding the toString method
    @Override
    public String toString() {
        return word + " ("+ count +")";
    }
}
