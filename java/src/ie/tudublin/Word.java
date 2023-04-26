package ie.tudublin;

import java.util.ArrayList;
import java.util.Random;

import processing.core.PApplet;

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

    /**
     * Adds Follow to list of Follows
     * If it alredy exists, then increment its count
     */
    public void addFollows(String word) {
        Follow follow = findFollow(word);
        if (follow == null) {
            Follow newFollow = new Follow(word, 1);
            follows.add(newFollow);
        } else {
            follow.incCount();
        }
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
        String wordOut = word.equals("\n") ? "\\n" : word;
        String retString = wordOut + ":";
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
            if (follow.getWord().equals(word)) {
                return follow;
            }
        }
        return null;
    }

    /**
     * Returns a random Follow word
     * @return
     */
    public Follow nextFollow() {
        return follows.get((int) Math.round(Math.random() * (follows.size() - 1)));
    }

}
