package javaInterview;


// Find The Duplicate Number in Array
public class FindDuplicateElements {
	
	 private static int findDup(int nums[]) {  // method
	        int n = nums.length;
	        
	        for (int i = 0; i < n; i++) {
	            // For every element check if it is repeated in the elements ahead of it
	            for (int j = i + 1; j < n; j++) {
	                // If repeated, this is the duplicate element
	                if (nums[j] == nums[i])
	                    return nums[i];       // print duplicate element
	                   //return nums[j];      // print duplicate element
	            }
	        }
	        return -1;  // No duplicate found
	    }
	 
	    public static void main(String[] args) {
	        // Example 1
	        int nums[] = new int[]{9, 1, 3, 4, 6, 6,};
	        System.out.println(findDup(nums));     // 6
	        // Example 2
	        nums = new int[]{3, 1, 3, 4, 2, 7};
	        System.out.println(findDup(nums));     // 3
   }
/*  // How To Find Duplicates In Array Using Java 8 method Streams?
  
 private static void findDuplicates(int[] ar) {  
  
    Set<Integer> uniqueElements = new HashSet<>();
         
    Set<Integer> duplicateElements =  Arrays.stream(ar).filter(i -> !uniqueElements.add(i))
                                            .boxed().collect(Collectors.toSet());
         
    System.out.println(duplicateElements);
}
	    
 */
}