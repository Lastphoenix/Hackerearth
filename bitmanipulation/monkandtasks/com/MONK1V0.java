package monkandtasks.com;

//1 input AC --> other WA or TLE
import java.io.*;
import java.math.*;
import java.util.*;
import java.util.Map.Entry;

class MONK1V0 {

	public static boolean ASC = true;
	
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedReader br = new BufferedReader(new FileReader("C:/Users/Desenvolvedor/Desktop/Input.txt"));
		int tests = Integer.parseInt(br.readLine());

		while (tests-- > 0) {

			int n = Integer.parseInt(br.readLine());
			HashMap<BigInteger, Integer> hm = new HashMap<BigInteger, Integer>();
			String[] s = br.readLine().split(" ");

			for (int i = 0; i < n; i++) {
				BigInteger x = new BigInteger(s[i]);
				Integer y = countOnesBinary(x);
				hm.put(x,y);
			}
			
			Map<BigInteger, Integer> sortedMapAsc = sortByComparator(hm, ASC);
	        printMap(sortedMapAsc);
		}
		br.close();
	}

	private static Integer countOnesBinary(BigInteger x) {

		Integer count = 0;
		
		while(x.compareTo(new BigInteger("0")) > 0){
            count++;
            x = x.and(x.subtract(new BigInteger("1")));
        }
		return count;
	}
	
    private static Map<BigInteger, Integer> sortByComparator(Map<BigInteger, Integer> unsortMap, final boolean order) {

        List<Entry<BigInteger, Integer>> list = new LinkedList<Entry<BigInteger, Integer>>(unsortMap.entrySet());

        Collections.sort(list, new Comparator<Entry<BigInteger, Integer>>() {
            public int compare(Entry<BigInteger, Integer> o1,
                    Entry<BigInteger, Integer> o2) {
                if (order) {
                    return o1.getValue().compareTo(o2.getValue());
                } else {
                    return o2.getValue().compareTo(o1.getValue());
                }
            }
        });
        
        Map<BigInteger, Integer> sortedMap = new LinkedHashMap<BigInteger, Integer>();
        for (Entry<BigInteger, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
            System.out.println("Key" + entry.getKey() + "Value" + entry.getValue());
        }
        return sortedMap;
    }

    public static void printMap(Map<BigInteger, Integer> map) {
    	
    	StringBuilder stb = new StringBuilder();
        for (Entry<BigInteger, Integer> entry : map.entrySet()) {
            stb.append(entry.getKey() + " ");
        }
        System.out.println(stb);
    }
    
    public static void printList(List<Entry<BigInteger, Integer>> list) {
    	
    	StringBuilder stb = new StringBuilder();
        for (Entry<BigInteger, Integer> entry : list) {
            stb.append(entry.getKey() + " ");
        }
        System.out.println(stb);
    }
}