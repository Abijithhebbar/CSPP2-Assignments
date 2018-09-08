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
    public Set() {
    	list = new int[20];
    	size = 0;
    }

    public int size() {
    return size;
  }

    boolean contains(int item) {
    	for (int i = 0; i < size; i++) {
    		if (item == list[i]) {
    			return true;
    		}
    	}
    	return false;
    }

    void add(int item) {
    	list[size] = item;
    	size++;
    }

    void add(int[] newArray) {
    	for (int i = 0; i <newArray.length; i++) {
    		add(newArray[i]);
    	}

    }

    public String toString() {

    if (size == 0) {
      return "{}";
    }
    String str = "{";
    int i = 0;
    for (i = 0; i < size - 1; i++) {
      str = str + list[i] + ",";
    }
    str = str + list[i] + "}";
    return str;
  }


   Set retainAll(int[] newList) {
   	Set obj = new Set();
   	for (int item: list) {
   		for (int i = 0; i < newList.length; i++) {
   			if (item == newList[i]) {
   				obj.add(item);   	   			}
   		}

   	}
   	return obj;
   }


Set intersection(Set newList) {
   	Set obj = new Set();
   	for (int item: list) {
   		for (int i = 0; i < newList.size(); i++) {
   			if (item == newList.get(i)) {
   				obj.add(item);   	   			}
   		}

   	}
   	return obj;
   }


    public int get(final int index) {
    // if (index < 0 || index >= size) {
    //   return -1;
    // } else {
      return list[index];
    // }
  }

//    int[][] cartesianProduct(Set list1) {
// int a,b;
// Set obj = new Set();
// a = list.length;
// b = list1.size();
// if (a == 0 || b == 0) {
// 	return null;
//    } else {
//    	System.out.print("[");
//    	for ( int i = 0; i < a; i++) {
//    		for (int j = 0; j < b; j++) {
//    			int k = get(j);
//    			System.out.print("["+list[i]+","+k + "]");
//    		}
//    		// System.out.print("]");
//    	}
//    	System.out.print("]");
//    }
//    return null;
// }
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
            // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
                case "size":
                System.out.println(s.size());
                break;
                case "contains":
                System.out.println(s.contains(Integer.parseInt(tokens[1])));
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
                // System.out.println(Arrays.deepToString(s.cartesianProduct(t)));
                break;
                default:
                break;
            }
        }
    }
}