class Task5{
	public static int secondLargestElement(int[] arr)
	{
		int lar=arr[0];
		int seclargest = lar;
		for(int i=0;i<arr.length;i++)
		{
			if(lar<arr[i])
			{
				seclargest=lar;
				lar=arr[i];
			}
		}
		return seclargest;
	}
	public static void main(String[] args)
	{
		int[] myArray = {2,4,6,8,10};
		System.out.println("Second Largest Element : "+secondLargestElement(myArray));
	}
}
