package monkandtasks.com;

import java.util.*;
import java.util.Map.Entry;

public class Monk {

	public static boolean ASC = true;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();

		while (tests-- > 0) {

			int n = sc.nextInt();
			HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

			for (int i = 0; i < n; i++) {
				int x = sc.nextInt();
				int y = countOnesBinary(x);
				hm.put(x,y);
			}
			
			Map<Integer, Integer> sortedMapAsc = sortByComparator(hm, ASC);
	        printMap(sortedMapAsc);
		}
		sc.close();
	}

	private static Integer countOnesBinary(int x) {

		Integer count = 0;
		
		while(x > 0){
            count++;
            x &= x - 1;
        }
		return count;
	}
	
    private static Map<Integer, Integer> sortByComparator(Map<Integer, Integer> unsortMap, final boolean order) {

        List<Entry<Integer, Integer>> list = new LinkedList<Entry<Integer, Integer>>(unsortMap.entrySet());

        Collections.sort(list, new Comparator<Entry<Integer, Integer>>() {
            public int compare(Entry<Integer, Integer> o1,
                    Entry<Integer, Integer> o2) {
                if (order) {
                    return o1.getValue().compareTo(o2.getValue());
                } else {
                    return o2.getValue().compareTo(o1.getValue());
                }
            }
        });

        Map<Integer, Integer> sortedMap = new LinkedHashMap<Integer, Integer>();
        for (Entry<Integer, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }

    public static void printMap(Map<Integer, Integer> map) {
    	
    	StringBuilder stb = new StringBuilder();
        for (Entry<Integer, Integer> entry : map.entrySet()) {
            stb.append(entry.getKey() + " ");
        }
        System.out.println(stb);
    }
}