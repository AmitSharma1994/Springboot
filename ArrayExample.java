import java.util.HashMap;
import java.util.Map;

public class ArrayExample {

	
	public static void main(String[] args) {
		
		/*int arr[]= {1,2,4};
		int arr1[]= {3,5,6};*/
		
		
		String  str ="acbadeffg";
		
		char arr[]=str.toCharArray();
		
		int count=1;
		
		HashMap<Character, Integer> map=new HashMap<>();

		for(int i=0;i<arr.length;i++) {

			if(map.containsKey(arr[i])) {
				int count1=map.get(arr[i]);
			 	map.put(arr[i], ++count1);
			}	
			else {
				map.put(arr[i],count);
				
			}
			
			
		}
		
		System.out.println(map.size());
		for(Map.Entry<Character, Integer> map1:map.entrySet()) {
			
			System.out.println(map1.getKey()+"\t"+map1.getValue());
		}
		
		}
		
		
		
		
		
/*		
	int n=arr.length+arr.length;
		
	int[] arr2=new int[n];
	
		//{1,2,3,4,5,6}
		
		for(int i=0;i<n;i++) {
			
			for(int j=i;j<arr1.length;j++) {
				
				if(arr[i]<arr1[j]&&arr[i]<arr[i+1]) {
					
					arr2[i]=arr[i];	
				}
				
				
				else {
					arr2[i]=arr1[j];
				}
				
				
			}
			
		}
		
		for(int k=0;k<arr2.length;k++) {

			System.out.print(arr2[k]);		
		}
		
	}*/
}
