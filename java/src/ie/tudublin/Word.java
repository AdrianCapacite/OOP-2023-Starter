package ie.tudublin;

import java.util.ArrayList;

/**
 * Class represents a word in the model, it contains an ArrayList of what words
 * follow after this word.
 */
public class Word {
    String word;
    ArrayList<Follow> follows;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public ArrayList<Follow> getFollows() {
        return follows;
    }

    public void setFollows(ArrayList<Follow> follows) {
        this.follows = follows;
    }

    public Word(String word, ArrayList<Follow> follows) {
        this.word = word;
        this.follows = follows;
    }

    /**
     * Returns word and Follow.word(Follow.count)
     */
    @Override
    public String toString() {
        // TODO: Implement loop through array list
        return "Word [word=" + word + ", follows=" + follows + "]";
    }

    /**
     * Returns a Follow word that matches the word
     * @return
     */
    public Follow findFollow(String word) {
        // TODO: Implement Loop through array list
        return null;
    }

}
