import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random; 

/*
 * The shuffle objects has a list of numbers and a scanner
 * to receive the input of the user
 * It prompts the user for a positive integer and then displays 
 * all the numbers from 1 to the inputed number in random order
 * the user can enter 0 to quit the program
 */
public class Shuffle {
	
	//Arraylist for all the numbers
	ArrayList<Integer> listOfNums;
	//Scanner for reading user input
	Scanner input;
	
	//Constructor that creates new Arraylist and scanners
	public Shuffle() {
		input = new Scanner(System.in);
		listOfNums = new ArrayList<Integer>();
	}

	/*
	 * Starts the program and gets user input and fills array with 
	 * the numbers in the range
	 * Then shuffles and displays the numbers in a random order to user and 
	 * clears numbers in array 
	 */
	public void startShuffling() {
		int userInput;
		System.out.println("Welcome to the shuffler!");
		//Prompts user for positive integer number
		userInput = getUserInput();  
		//Runs until user inputs a 0
		while(userInput != 0) {
			//Fills array with numbers in that range
			fillArray(userInput);
			//Shuffles numbers in random order
			shuffleNumbers();
			//Displays numbers then clears array
			displayAndClearArray();
			//Starts again 
			userInput = getUserInput();
		}
		
		System.out.println("Thanks for using the shuffler, program shutting down!");
		//Close scanner
		input.close();
	}
	
	/*
	 * Shuffles the numbers in the Arraylist
	 */
	public void shuffleNumbers() {
		Random random = new Random();
		
		//starts at the end of the Arraylist and gets random index
		//value then swaps the value of the current index value with 
		// the value of the random index
		for(int i = listOfNums.size() - 1; i > 0; i--) {
			//gets random index
			int randIndex = random.nextInt(i+1);
			//gets value of current index
			int tempNum = listOfNums.get(i);
			//sets value of current index with value of random index
			listOfNums.set(i, listOfNums.get(randIndex));
			//sets value of random index with value of current index
			listOfNums.set(randIndex, tempNum);
		}
		
	}
	
	/*
	 * Gets user input and ensures that the user enters 
	 * a positive Integer
	 */
	public int getUserInput() {
		boolean isPostiveInteger = false;
		int userInput = 0;
		//Loops until user enters a positive integer
		while(isPostiveInteger == false) {
		//Prompts user to enter a positive integer
		System.out.println("Please enter a positive integer or 0 to"
					+ " stop the program");
		//Runs while the user hasn't entered a integer
		while(!input.hasNextInt()) {
			input.nextLine();
			System.out.println("Not a valid postive integer! Please enter a positive integer or 0 to" + 
					" stop the program");
		}
		//Gets the integer user entered
		userInput = input.nextInt();
		//If user didn't enter a positive integer clear the input and make user enter a positive integer
		if(userInput <= -1) {
			input.nextLine();
			System.out.print("Not a valid postive integer! ");
		} else {
			isPostiveInteger = true;
		}
		}
		return userInput;
	}
	
	/*
	 * Fills array with numbers between 1 and the number the user entered
	 */
	public void fillArray(int nums) {
		for(int i = 0; i  < nums; i++) {
			listOfNums.add(i+1);
		}
	}
	
	/*
	 * Displays all the numbers in the array and clears the array when done
	 */
	public void displayAndClearArray() {
		for(int i = 0; i < listOfNums.size(); i++) {
			System.out.println(listOfNums.get(i) + " ");
		}
		listOfNums.clear();
	}

}
