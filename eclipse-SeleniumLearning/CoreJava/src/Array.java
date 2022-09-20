import java.util.ArrayList;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[5];
		arr[0]=5;
		arr[1]=7;
		arr[2]=20;
		arr[3]=9;
		arr[4]=10;
		int arr2 []= {3,4,5,2,7};
		for(int i=0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		String [] name = {"Atik", "Borhan", "Jayuti", "Meherun", "Doora"};
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]);
		}
		
		for(String a :name) {
			System.out.println(a);
		}
		
		System.out.println("---------------------------------------");
		
		int [] arr3 = {1,2,3,4,5,6,7,8,9,10,11,12};
		// for loop
		for(int i=0; i<arr3.length; i++) {
			if(arr3[i]%2==0) {
			System.out.println(arr3[i]);
			}
			else {
				System.out.println(arr3[i]+" : are not multiplied by 2");
			}
		}
		
		System.out.println("---------------------------------------");
		
		// enhanched for loop
		for(int i: arr3) {
			if(i%2==0) {
			System.out.println(i);
			}
			else {
				System.out.println(i+" : are not multiplied by 2");
			}
		}
		
		System.out.println("---------------------------------------");
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Atik");
		a.add("Rocky");
		a.add("Jayuti");
		a.add("Meherun");
		a.add("Nion");
		System.out.println(a.get(2));
		
		
		String s = "This study is for test automation";
		String[] splittedString = s.split("study");
		//System.out.println(splittedString[0]);
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim());
		//System.out.println(splittedString[3]);
//		for(int i=0; i<s.length();i++) {
//			System.out.println(s.charAt(i));
//		}
		
		for(int i=s.length()-1; i>=0;i--) {
			System.out.println(s.charAt(i));
		}

	}
	
	

}
