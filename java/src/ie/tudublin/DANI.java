package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;

public class DANI extends PApplet {

	public void settings() {
		size(1000, 1000);
		//fullScreen(SPAN);
	}

	// array list 
	public ArrayList<Follow> follows = new ArrayList<Follow>();
	
	// load file
	public void loadFile()
    {
		String[] s = loadStrings("small.txt");// Load a text file into a String array

		for (int i = 0; i < s.length; i++) {
			s[i] = s[i].replaceAll("[^\\w\\s]",""); // Remove punction characters
			s[i] = s[i].toLowerCase(); // Convert a string to lower case 

			Follow f = new Follow(s[i], i);
			follows.add(f);
			println(s[i]);
		}

    }
    public void findWord(String str) {


    }

    String[] sonnet;

    public String[] writeSonnet()
    {
        return null;
    }

	public void setup() {
		colorMode(HSB);
		loadFile();
       
	}

	public void keyPressed() {

	}
	public void printModel(){
		 // Print out the contents of the file
		 System.out.println();
		 System.out.println();
		 System.out.println();
	}

	float off = 0;

	public void draw() 
    {
		background(0);
		fill(255);
		noStroke();
		textSize(20);
        textAlign(CENTER, CENTER);
        
	}
}
