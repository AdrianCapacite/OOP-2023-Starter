package ie.tudublin;

/**
 * Represents a Word that follows after another word, contains the count of
 * how many times it follows after the previous word
 */
public class Follow {
    private String word;
    private int count; // How many times the word followed after

    public String getWord() {
        return word;
    }

    public int getCount() {
        return count;
    }

    /**
     * Increments count
     */
    public void incCount() {
        count++;
    }

    public Follow(String word, int count) {
        this.word = word;
        this.count = count;
    }

    /**
     * The word(count)
     */
    @Override
    public String toString() {
        return word + "(" + count + ")";
    }

}