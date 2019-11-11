class Task4{
   
   public static float returnAvg(int[] arr){
    float avg=0; 
    float sum=0; 
    for(int i=0; i<arr.length; i++){
     sum+=arr[i];

   }
   avg=sum/arr.length;
   return avg;
}

 

   public static void main(String[] arga){
   
   int arr1[]={2,4,6,8,10};
   System.out.println(returnAvg(arr1));
    
     
   }

}
