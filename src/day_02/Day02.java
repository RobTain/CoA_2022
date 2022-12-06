package day_02;

import java.io.File;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

import util.CoA_Interface;

public class Day02 implements CoA_Interface {
	
	
	public static void main(String[] args) throws Exception {
		
		Day02 day02 = new Day02();
		LinkedList<String> input = new LinkedList<String>();

		day02.readInput(input);
		
		System.out.println("Solution - Part 1: " + day02.result01(input));
		System.out.println("Solution - Part 2: " + day02.result02(input));
		
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
