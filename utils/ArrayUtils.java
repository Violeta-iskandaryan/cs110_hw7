package utils;
public class ArrayUtils{
public static int[] reverse(int[] arr){
	int[] list = new int[arr.length];
	for(int i=0;i < arr.length; i++){
		list[i]=arr[arr.length-1-i];
		
	}
 return list;
 
}
public static String stringifyArray(int[] arr){
	String start="";
	
	for(int i=0;i < arr.length;i++){
		for(i=0;i < arr.length-1;i++){
		
	start=start+arr[i]+",";
	}
		if(i==arr.length-1){
			start=start+arr[i];
		}
	}
	return start;
}
}