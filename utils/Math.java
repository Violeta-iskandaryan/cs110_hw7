package utils;
public class Math{
 public static int factorial(int num){
     if(num==0){
	 return 1;}
	return num * factorial(num-1);
 }
public static int factorialLoop(int num){
	int start=1;
	for(int i=num;i > 0;i--){
      start= start * i;
	}
	return start;
}
}