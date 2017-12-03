import animals.Puppy;
import utils.Math;
import utils.ArrayUtils;
public class Driver{
	
	public static void main(String[] args){
		Puppy Joey= new Puppy("Joey");
		Puppy Chandler=new Puppy("Chandler");
		Puppy Ross=new Puppy("Ross");
		
		System.out.println(Joey.getName());
		System.out.println(Chandler.getName());
		System.out.println(Ross.getName());
		
	
	int[] array=new int[]{9, 20, 3, 44, 88, 300};
	 int[] array_2=ArrayUtils.reverse(array);
	 System.out.println(ArrayUtils.stringifyArray(array_2));
	 
	 
	 double number=15.4;
	 
	 System.out.println(Math.factorial((int)number));
	}
}