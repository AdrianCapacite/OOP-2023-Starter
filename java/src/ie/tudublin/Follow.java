package ie.tudublin;

// TODO: Get rid of setter functions
/**
 * Represents a Word that follows after another word, contains the count of
 * how many times it follows after the previous word
 */
public class Follow {
    String word;
    int count; // How many times the word followed after

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Follow(String word, int count) {
        this.word = word;
        this.count = count;
    }

    @Override
    public String toString() {
        // TODO: Implement
        return "Follow [word=" + word + ", count=" + count + "]";
    }

}