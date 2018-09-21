import java.util.*;
import java.io.*;
class Solution {

	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine();
			File inpfile = new File(input);
			File[] filearr = inpfile.listFiles();
			System.out.print("\t" + "\t");
			for (File file : filearr) {
				System.out.print(file.getName() + "\t");
			}
			System.out.println();
			for (int i = 0; i < filearr.length; i++) {
				System.out.print(filearr[i].getName() + "\t");
				for (int j = 0; j < filearr.length; j++) {
					Bagofwords bag = new Bagofwords();

					Scanner inp = new Scanner(filearr[i]);
					HashMap<String, Integer> map = new HashMap<>();
					String[] array;
					while (inp.hasNext()) {
						String a = inp.useDelimiter("\\A").next();
						array = a.toLowerCase().split(" ");
						map = CountFrequency(array);
						int  keyscount = map.keySet().size();

					}
					inp.close();
					Scanner inp1 = new Scanner(filearr[j]);
					HashMap<String, Integer> newmap = new HashMap<>();
					String[] array1;
					while (inp1.hasNext()) {
						String b = inp1.useDelimiter("\\A").next();
						array1 = b.toLowerCase().split(" ");
						newmap = CountFrequency(array1);
					}
					inp1.close();

					System.out.print(bag.plagerismChecker(map, newmap) + "\t\t");

				}
				System.out.println();
			}



		} catch (Exception e) {
			System.out.println("empty directory");
		}
	}
	public static  HashMap<String, Integer> CountFrequency(String[] array) {
		Bagofwords bag = new Bagofwords();
		for (int i = 0 ; i < array.length; i++) {
			int value = 1;
			if (bag.getDictionary().containsKey(array[i])) {
				value = bag.getDictionary().get(array[i]) + 1;
			}
			bag.getDictionary().put(array[i], value);
		}
		return bag.getDictionary();
	}
}
class Bagofwords {
	private  HashMap<String, Integer> dictionary;

	Bagofwords() {
		dictionary = new HashMap<>();
	}

	public HashMap<String, Integer> getDictionary() {
		return dictionary;
	}

	public long plagerismChecker(HashMap<String, Integer> map, HashMap<String, Integer> newmap) {
		int num = 0;
		for (String checkKey : map.keySet()) {
			for (String checkKey1 : newmap.keySet()) {
				if (checkKey.equals(checkKey1)) {
					num += (map.get(checkKey) * newmap.get(checkKey1));

				}
			}
		}

		int sqr = 0;
		for (String checkKey : map.keySet()) {
			sqr += Math.pow(map.get(checkKey), 2);

		}
		int sqr1 = 0;
		for (String checkKey1 : newmap.keySet()) {
			sqr1 += Math.pow(newmap.get(checkKey1), 2);

		}
		double den;
		den = Math.sqrt(sqr) * Math.sqrt(sqr1);

		double ans = (num / den) * 100;
		ans = Math.round(ans);
		return (long)(ans);
	}



}