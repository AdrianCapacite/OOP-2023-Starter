package ie.tudublin;

import java.util.ArrayList;

/**
 * Class represents a word in the model, it contains an ArrayList of what words
 * follow after this word.
 */
public class Word {
    private String word;
    private ArrayList<Follow> follows;

    public String getWord() {
        return word;
    }

    public ArrayList<Follow> getFollows() {
        return follows;
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
        String retString = word + ":";
        for (Follow follow : follows) {
            retString += " " + follow.toString();
        }
        return retString;
    }

    /**
     * Returns a Follow word that matches the word
     *
     * @return
     */
    public Follow findFollow(String word) {
        for (Follow follow : follows) {
            if (follow.getWord() == word) {
                return follow;
            }
        }
        return null;
    }

}
