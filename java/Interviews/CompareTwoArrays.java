import java.util.Arrays;

public class CompareTwoArrays {
	
		public static void main(String[] args) {
	        String [] stringArrayA = {"L", "E", "O", "N"};
	        String [] stringArrayB = {"N", "E", "L", "O"};
	        
	        orderedGuests(stringArrayA, stringArrayB);
	    }

	    public static void orderedGuests(String[] firstArray, String[] secondArray)
	    {
	        Arrays.sort(firstArray);
	        Arrays.sort(secondArray);

	        String result = (Arrays.toString(firstArray).equals(Arrays.toString(secondArray)))?"equals":"not equals";
	        
	        System.out.println("result :" + result);
	        System.out.println("values Arrays String :");
	        System.out.println(Arrays.toString(firstArray));
	        System.out.println(Arrays.toString(secondArray));
	        	        
	    }
}
