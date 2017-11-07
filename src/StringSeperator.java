/*Here the task is to split the sentence and then arrange the characters of the words
 * in alphabetical order. I have made use of split method to split the sentence.
 * After that using Linked List i am converting it to array of strings and then sorting*/



import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StringSeperator { //class name

	public static void main(String[] args) { //main method
		
		Scanner sc = new Scanner(System.in);  //scanner object
		String s = sc.nextLine();   //inputing string
		String[] arr = s.split(" ");  //using split method splitting the sentence
		 System.out.println("Splitting the Sentence : "); 
		 for ( String ss : arr) {
		       System.out.print(ss+", "); //printing the splitted sentence
		  }
		 
		 List<String> list = new LinkedList<>();  //implementing a linked list
	        for (String ss : arr) {
	            char c[] = ss.toCharArray();  //converting string to array of characters
	            Arrays.sort(c); //sorting by using default sort function
	            list.add(String.valueOf(c));
	        }
	        System.out.println("\n\nSorting Each word of Sentence : ");
	        System.out.println(String.join(" ", list)); //printing finally
		

	}

}
