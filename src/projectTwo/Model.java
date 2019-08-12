package projectTwo;
/**@author Chandler Hiatt
 * @version last updated 10-16-16
 * @class Model
 */
public class Model {
	private String input;
	private String reversed;
	/**
	 * @author Chandler Hiatt
	 * @param _input
	 * Set input
	 */
	public void setInput(String _input){
		this.input = _input;
	}
		/**
		 * @author Chandler Hiatt
		 * @return returns input
		 */
		public String getInput(){
			return this.input;
		}
	/**
	 * @author Chandler Hiatt
	 * @param _reversed
	 * set reversed
	 */
	public void setReversed(String _reversed){
		this.reversed = _reversed;
	}
		/**
		 * @author Chandler Hiatt
		 * @return returns reversed string
		 */
		public String getReversed(){
			return this.reversed;
		}
}
