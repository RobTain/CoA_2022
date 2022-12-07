package day_03;

import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

import util.CoA_Interface;

// A for Rock, B for Paper, and C for Scissors
// X for Rock, Y for Paper, and Z for Scissors
public class Day03 implements CoA_Interface {
	
	
	public static void main(String[] args) throws Exception {
		
		Day03 day03 = new Day03();
		LinkedList<String> input = new LinkedList<String>();

		day03.readInput(input);
		
		System.out.println("Solution - Part 1: " + day03.result01(input));
		System.out.println("Solution - Part 2: " + day03.result02(input));
		
	}

	public void readInput(LinkedList<String> input) throws Exception {
		Scanner in = new Scanner(new File("src/" + this.getClass().getPackageName() + "/" + this.getClass().getSimpleName() + "_input.txt")); 
		while(in.hasNextLine()) {
			input.add((String) in.nextLine());
		}
	}

	public String result01(LinkedList<String> input) {
		return null;
	}

	public String result02(LinkedList<String> input) {
		return null;
	}
}
