package monkandchamberofsecrets.com;

import java.util.*;

public class MONK {

	public static void main(String[] args) throws Exception{
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		Queue<Integer> q = new LinkedList<Integer>();
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++){
			arr[i] = sc.nextInt();
			q.add(i);
		}
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		for(int j = 1; j <= X; j++){
			int max = q.peek();
			a = new ArrayList<Integer>();
			
			for(int i = 0;i<X;i++){
				
				if(!q.isEmpty()){
					int k = q.poll();
					if(arr[k] > arr[max])
						max = k;
					a.add(k);
				}
				else
					break;
			}
			for(int i = 0; i < a.size(); i++){
				int f = a.get(i);
				if(f != max){
					q.add(f);
					arr[f] = arr[f] - (arr[f] == 0 ? 0 : 1);
				}
			}
			System.out.print((max + 1)+" ");
		}
		sc.close();
	}
}