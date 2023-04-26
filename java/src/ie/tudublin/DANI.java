package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {

	String[] sonnet;
	float off = 0;

	// Processing
	public void settings() {
		size(1000, 1000);
		// fullScreen(SPAN);
	}

	public void setup() {
		colorMode(HSB);

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
	 * @param filename
	 */
	public void loadFile(String filename) {
		// loadStrings("filename.txt"); // Load a text file into a String array
		// split(line, ' '); // Split a string into an array of words
		// w.replaceAll("[^\\w\\s]",""); // Remove punction characters
		// s.toLowerCase() // Convert a string to lower case
	}

	/**
	 * Finds a word in the model
	 * @param word
	 */
	public void findWord(String word) {

	}

	// TODO: Add findFollow to word class

	/**
	 * Displays model as list of words with their follow
	 * Displayed as:
	 * 		i: love(2)
	 * 		love: star(1) is(1) tu(1)
	 * 		star: trek(1)
	 * 		trek:
	 * 		is: love(1)
	 * 		tu: dublin(1)
	 * 		dublin:
	 */
	public void printModel() {
		// TODO: Implement
	}

	/**
	 * Returns a 14 line sonnet
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
