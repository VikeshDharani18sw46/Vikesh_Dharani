  
import java.util.Arrays;
class Task6{
	public static void main(String[] args)
	{
		int[][] Arr = {{4,2,6},{10,14,8}};
		for(int i=0;i<Arr.length;i++)
		{
			Arrays.sort(Arr[i]);
		}
		printArray(Arr);
	}
	public static void printArray(int args[][])
	{
		for(int j=0;j<args.length;j++){
			for(int i=0;i<args[j].length;i++)
			{
			System.out.print(args[j][i]+" ");
			}
			System.out.println("");
		}
	}
}