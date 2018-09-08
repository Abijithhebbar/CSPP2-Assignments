import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;

/**
 * Class for set.
 * @author :
 */
class Set {
	//your code goes here...
	//Good luck :-)
	int[] list;
	int size;
	/**
	 constructor.
	 **/
	public Set() {
		list = new int[20];
		size = 0;
	}
/**
 * @return Size.
 **/
	public int size() {
		return size;
	}
/**
 * @param item int.
 * @return true or false.
 **/
	boolean contains(final int item) {
		for (int i = 0; i < size; i++) {
			if (item == list[i]) {
				return true;
			}
		}
		return false;
	}
/**
 * @param item int.
 **/
	void add(final int item) {
		list[size] = item;
		size++;
	}
/**
 * @param newArray int.
 **/
	void add(final int[] newArray) {
		for (int i = 0; i < newArray.length; i++) {
			add(newArray[i]);
		}

	}
/**
* @return String.
 **/
	public String toString() {

		if (size == 0) {
			return "{}";
		}
		String str = "{";
		int i = 0;
		for (i = 0; i < size - 1; i++) {
			str = str + list[i] + ", ";
		}
		str = str + list[i] + "}";
		return str;
	}
/**
 * @param newList int.
 * @return object.
 **/

	Set retainAll(final int[] newList) {
		Set obj = new Set();
		for (int item : list) {
			for (int i = 0; i < newList.length; i++) {
				if (item == newList[i]) {
					obj.add(item);
				}
			}

		}
		return obj;
	}
/**
 * @param newList set.
 * @return object.
 **/

	Set intersection(final Set newList) {
		Set obj = new Set();
		for (int item : list) {
			for (int i = 0; i < newList.size(); i++) {
				if (item == newList.get(i)) {
					obj.add(item);
				}
			}

		}
		return obj;
	}
/**
 * @param index int.
 * @return value.
 **/
	public int get(final int index) {
		// if (index < 0 || index >= size) {
		//   return -1;
		// } else {
		return list[index];
		// }
	}
/**
 * @param list1 set.
 * @return int array.
 */
	int[][] cartesianProduct(final Set list1) {
		int a, b;
		Set obj = new Set();
		a = size();
		int[] c = new int[list1.size()];
		int[][] newArr = new int[a][list1.size];
// b = list1.size();
// System.out.println(a);
		for (int j = 0; j < list1.size(); j++) {
			c[j] = list1.get(j);
		}
		if (a == 0 || list1.size() == 0) {
			return null;

		} else {
			for (int i = 0; i < a; i++) {
				for (int j = 0; j < list1.size; j++) {
					// System.out.println(c[j]);
					newArr[i][j] = list[i];
				}
			}
		}
		return newArr;
	}
}
/**
 * Solution class for code-eval.
 */
public final class Solution {
	/**
	 * Constructs the object.
	 */
	private Solution() {

	}
	/**
	 * helper function to convert string input to int array.
	 *
	 * @param      s     { string input from test case file }
	 *
	 * @return     { int array from the given string }
	 */
	public static int[] intArray(final String s) {
		String input = s;
		if (input.equals("[]")) {
			return new int[0];
		}
		if (s.contains("[")) {
			input = s.substring(1, s.length() - 1);
		}
		return Arrays.stream(input.split(","))
		       .mapToInt(Integer::parseInt)
		       .toArray();
	}
	/**
	 * main function to execute test cases.
	 *
	 * @param      args  The arguments
	 */
	public static void main(final String[] args) {
		// instantiate this set
		Set s = new Set();
		// code to read the test cases input file
		Scanner stdin = new Scanner(new BufferedInputStream(System.in));
		// check if there is one more line to process
		while (stdin.hasNext()) {
			// read the line
			String line = stdin.nextLine();
			// split the line using space
			String[] tokens = line.split(" ");
			// based on the list operation
			//invoke the corresponding method
			switch (tokens[0]) {
			case "size":
				System.out.println(s.size());
				break;
			case "contains":
				System.out.println(s.contains
					(Integer.parseInt(tokens[1])));
				break;
			case "print":
				System.out.println(s);
				break;
			case "add":
				int[] intArray = intArray(tokens[1]);
				if (intArray.length == 1) {
					s.add(intArray[0]);
				} else {
					s.add(intArray);
				}
				break;
			case "intersection":
				s = new Set();
				Set t = new Set();
				intArray = intArray(tokens[1]);
				s.add(intArray);
				intArray = intArray(tokens[2]);
				t.add(intArray);
				System.out.println(s.intersection(t));
				break;
			case "retainAll":
				s = new Set();
				intArray = intArray(tokens[1]);
				s.add(intArray);
				intArray = intArray(tokens[2]);
				System.out.println(s.retainAll(intArray));
				break;
			case "cartesianProduct":
				s = new Set();
				t = new Set();
				intArray = intArray(tokens[1]);
				s.add(intArray);
				intArray = intArray(tokens[2]);
				t.add(intArray);
				System.out.println(Arrays.deepToString
					(s.cartesianProduct(t)));
				break;
			default:
				break;
			}
		}
	}
}
