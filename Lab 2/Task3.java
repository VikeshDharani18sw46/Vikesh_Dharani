import java.util.Arrays;
class Task3
{
	public static void main(String args[])
	{
		int[] intArray = { 1, 2, 3, 4, 5 };
       String intArrayString = Arrays.toString(intArray);
       // print directly will print reference value
       System.out.println(intArray);
       System.out.println(intArrayString);
	   String[] stringArray = { "a", "b", "c", "d", "e" };
       ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
       System.out.println(arrayList);
       // [a, b, c, d, e]


       String[] stringArray = { "a", "b", "c", "d", "e" };
       boolean b = Arrays.asList(stringArray).contains("a");
       System.out.println(b);


        int[] intArray = { 1, 2, 3, 4, 5 };
int[] intArray2 = { 6, 7, 8, 9, 10 };
int[] combinedIntArray = ArrayUtils.addAll(intArray, intArray2);


method(new String[]{"a", "b", "c", "d", "e"});

String j = StringUtils.join(new String[] { "a", "b", "c" }, ", ");
System.out.println(j);
// a, b, c


String[] stringArray = { "a", "b", "c", "d", "e" };
ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
String[] stringArr = new String[arrayList.size()];
arrayList.toArray(stringArr);
for (String s : stringArr)
	System.out.println(s);


Set<String> set = new HashSet<String>(Arrays.asList(stringArray));
System.out.println(set);
//[d, e, b, c, a]

int[] intArray = { 1, 2, 3, 4, 5 };
ArrayUtils.reverse(intArray);
System.out.println(Arrays.toString(intArray));
//[5, 4, 3, 2, 1]


int[] intArray = { 1, 2, 3, 4, 5 };
int[] removed = ArrayUtils.removeElement(intArray, 3);//create a new array
System.out.println(Arrays.toString(removed));


byte[] bytes = ByteBuffer.allocate(4).putInt(8).array();
 
for (byte t : bytes) {
   System.out.format("0x%x ", t);
}
	}
}
