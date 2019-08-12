package projectTwo;
/**@author Chandler Hiatt
 * @version last updated 10-16-16
 * @class Controller - Calculate the reverse string, and if string is a palindrome.
 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Controller {
	private String input;
	private String reversed;
	private View view;
	private Model model;
	private Character ch;
	
	public Controller(){
		this.view = new View(this);
	}
	/**
	 * @author Chandler Hiatt
	 * @param s The string to reverse
	 * Sets the reversed Jlabel in View to the strig reversed.
	 */
	public void reverse(String s){
		//Reverse The input and return it.
		reversed = "";
		this.input = s;
		Stack stack = new Stack();
		
		for(int i = 0; i < input.length(); i++){
			stack.push(input.charAt(i));
		}
		for(int j = 0; j < input.length(); j++){
			reversed = reversed + stack.pop();
		}
		
		view.setReversed(reversed);
	}
	/**
	 * @author Chandler Hiatt
	 * @return boolean if the string is a palindrome.
	 * 
	 * Take the spaces out of string, then push the 
	 * characters of the string onto a stack and a 
	 * queue. Compare them, and return whether or not 
	 * its a palindrome.
	 */
	public boolean isPalindrome(){
		Stack stack = new Stack();
		Queue<Character> q = new <Character>LinkedList();
		int count = 0;
		boolean isPal = true;
		for(int i = 0; i < input.length(); i++){
			
			ch = ch.toLowerCase(input.charAt(i));
			
			if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')){
				stack.push(ch);
				q.add(ch);
				count++;
			}
		}
		for(int i = 0; i < count; i++){
		
			if(stack.pop() != q.remove()){
				isPal = false;
			}
			
		}
		return isPal;
	}
	/**
	 * @author Chandler Hiatt
	 * @param s String to set input.
	 */
	public void setInput(String s){
		this.input = s;
	}
}
