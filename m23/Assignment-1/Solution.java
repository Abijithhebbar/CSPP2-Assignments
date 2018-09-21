import java.util.*;
import java.io.*;
class Solution {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			String input = sc.nextLine();
			File inpfile = new File(input);
			File[] filearr = inpfile.listFiles();
			System.out.print("\t"+"\t");
			sc.close();
			for (File file : filearr) {
				System.out.print(file.getName()+"\t");
			}
			System.out.println();
			for (int i = 0; i < filearr.length; i++) {
				System.out.print(filearr[i].getName()+"\t");
				for (int j = 0; j < filearr.length; j++) {
					Bagofwords bag = new Bagofwords();
					Scanner in = new Scanner(System.in);
					HashMap<String, Integer> map = new HashMap<>();
					String[] array;
					while (in.hasNext()) {
						String a = in.useDelimiter("\\A").next();
						array = a.toLowerCase().split(" ");
						map = Countfrequency(array);
						int countKeys = map.keySet().size();
					}
					in.close();
					Scanner inp = new Scanner(filearr[j]);
					HashMap<String, Integer> newmap = new HashMap<>();
					String[] array1;
					while (inp.hasNext()) {
						String b = in.useDelimiter("\\A").next();
						array1 = b.toLowerCase().split(" ");
						newmap = Countfrequency(array1);
					}
					inp.close();
					System.out.print(bag.plagerismChecker(map, newmap)+"\t\t");
				}
				System.out.println();
			}
		} catch (Exception e) {
			System.out.println("empty directory");
		}
	}
	public static  HashMap<String, Integer> Countfrequency(String[] array) {
		Bagofwords bag = new Bagofwords();
		for (int i = 0 ; i < array.length; i++) {
			int value = 1;
			if (bag.getdictionary().containsKey(array[i])) {
				value = bag.getdictionary().get(array[i]) + 1;
			}
			bag.getdictionary().put(array[i], value);
		}
		return bag.getdictionary();
	}
}
class Bagofwords {
	private HashMap<String, Integer> arraydictionary;
	Bagofwords() {
		arraydictionary = new HashMap<>();
	}
	public HashMap<String, Integer> getdictionary() {
		return arraydictionary;
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
		for (String key1 : map.keySet()) {
			sqr += Math.pow(map.get(key1), 2);

		}
		int sqr1 = 0;
		for (String key2 : newmap.keySet()) {
			sqr1 += Math.pow(newmap.get(key2), 2);

		}
		double den;
		den = Math.sqrt(sqr) * Math.sqrt(sqr1);

		double answer = (num / den) * 100;
		answer = Math.round(answer);
		return (long)(answer);
	}
}