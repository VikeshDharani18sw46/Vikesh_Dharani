import java.util.Arrays;
class Task1
{
	public static void main(String[] args)
	{
		int[] arr = new int[100];
		int count =0;
		int put=0;
		while(count<100)
		{
			arr[count]=put;
			count++;
			put=put+1;
		}
		System.out.println(Arrays.toString(arr));
	}
}