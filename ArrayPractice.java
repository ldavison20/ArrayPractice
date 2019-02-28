import java.util.Random;
public class ArrayPractice 
{

	public static void main(String[] args) 
	{
		Random rand = new Random();
		int[] arr = new int[rand.nextInt(21) + 10]; //Mixed full line, first establishes variable, second creates array of length 20
		System.out.println(arr[2]); //prints value of element at index 2
		arr[4] = 5; //assigns 5 to the element at index 4
		
		//for loop to fill the array with random numbers from 0-5
		
		for(int i = 0; i < arr.length; i++) 
		{
			arr[i] = rand.nextInt(51);
		}
		
		
		//for loop to print teach element in the array, one per line
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}

		
		
		
		
		
		
		
		
	}

}
