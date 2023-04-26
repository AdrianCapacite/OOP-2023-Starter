package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

// ! NOTE: To compare strings use String.equals(String)
public class DANI extends PApplet {

	String[] sonnet;
	ArrayList<Word> model;
	float off = 0;

	// Processing
	public void settings() {
		size(1000, 1000);
		// fullScreen(SPAN);
	}

	public void setup() {
		colorMode(HSB);

		loadFile("small.txt");

	}

	public void keyPressed() {
		// TODO: Generate space to create new sonnet
	}

	public void draw() {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
		textAlign(CENTER, CENTER);

	}

	// Dani
	/**
	 * Function loads a file into DANI's model
	 *
	 * @param filename
	 */
	public void loadFile(String filename) {
		// loadStrings("filename.txt"); // Load a text file into a String array
		// split(line, ' '); // Split a string into an array of words
		// w.replaceAll("[^\\w\\s]",""); // Remove punction characters
		// s.toLowerCase() // Convert a string to lower case

		model = new ArrayList<Word>();
		String[] lines = loadStrings(filename);
		ArrayList<String> words = new ArrayList<String>();

		// For each line, split it into word and append them to the Array list
		System.out.println("Loading Words");
		for (String line : lines) {
			for (String word : line.split(" ")) {
				words.add(word.toLowerCase());
			}
		}
		System.out.println(words);

		// For each word not in model, add it
		for (String word : words) {
			if (findWord(word) == null) {
				Word newWord = new Word(word, new ArrayList<Follow>());
				model.add(newWord);
			}
		}

		// BUG: it sees word on next line, solution, do operation for each line instead.
		// For each word, if not in previous word's follow list, add it
		String prevWord = null;
		for (String word : words) {
			if (prevWord != null) {
				// Check if previous word has word in Follow list, add it
				findWord(prevWord).addFollows(word);
				// Word modelWord = findWord(prevWord);
				// if (modelWord.findFollow(word) == null) {
				// 	modelWord.addFollows(word);
				// }
			}
			prevWord = word;
		}

		System.out.println("Loaded Model: ");
		printModel();
	}

	/**
	 * Finds a word in the model
	 *
	 * @param word
	 */
	public Word findWord(String word) {
		for (Word modelWord : model) {
			if (modelWord.getWord().equals(word)) {
				return modelWord;
			}
		}
		return null;
	}

	/**
	 * Displays model as list of words with their follow
	 * Displayed as:
	 * i: love(2)
	 * love: star(1) is(1) tu(1)
	 * star: trek(1)
	 * trek:
	 * is: love(1)
	 * tu: dublin(1)
	 * dublin:
	 */
	public void printModel() {
		for (Word modelWord : model) {
			System.out.println(modelWord.toString());
		}
	}

	/**
	 * Returns a 14 line sonnet
	 *
	 * @return
	 */
	public String[] writeSonnet() {
		return null;
	}

	/**
	 * Calls writeSonnet then displays it to screen and console
	 */
	public void createSonnet() {

	}
}
