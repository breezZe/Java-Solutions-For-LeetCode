package my.first.test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.HashSet;

public class gcd {
	

	public static int my_GCD(int p, int q)
	{
		if(q==0) return p;
		int r= p%q;
		return my_GCD(q,r);
	}
	public static void hello()
	{
		System.out.println("good!");
	}
	
	public static int flip(int x)
	{
		if (x==1)
			return -1;
		else
			return 1;
	}
	public static void InsertionSort(int[] a,int length)
	{
		int i,j;
		int key;
		for(j=1;j<length;j++)
		{
			i=j-1;
			key = a[j];
			while(i>=0 && a[i]>key)
			{
				a[i+1] = a[i];
				i--;
			}
			a[i+1]=key;
		//	System.out.println(((double)j/length)*100 + "%");
		}
	}
	public static void InsertionSort(int[] a,int begin,int end)
	{
		int i,j;
		int key;
		for(j=begin+1;j<end;j++)
		{
			i=j-1;
			key = a[j];
			while(i>=begin && a[i]>key)
			{
				a[i+1] = a[i];
				i--;
			}
			a[i+1]=key;
		//	System.out.println(((double)j/length)*100 + "%");
		}
	}
	public static void InsertionSort(myNode[] a)
	{
		int i,j;
		myNode key;
		for(j = 1;j< a.length;j++)
		{
			i=j-1;
			key = a[j];
			while(i>=0 && a[i].b> key.b)
			{
				a[i+1] = a[i];
				i--;
			}
			a[i+1]=key;
		}
	}

	public static int BinarySearch(int key, int[] a)
	{
		int lo=0;
		int hi = a.length-1;
		while(lo<=hi)
		{
			int mid = lo + (hi-lo)/2;
			if(key > a[mid])    lo = mid+1;
			else if(key<a[mid]) hi = mid-1;
			else
				return mid;
		}
		return -1;
	}
	public static int BinarySearch(int key, int[] a, int start, int end)
	{
		int lo=start;
		int hi = end;
		while(lo<=hi)
		{
			int mid = lo + (hi-lo)/2;
			if(key > a[mid])    lo = mid+1;
			else if(key<a[mid]) hi = mid-1;
			else
				return mid;
		}
		return -1;
	}
	public static int BinarySearch(char key, char[] a)
	{
		int lo=0;
		int hi = a.length-1;
		while(lo<=hi)
		{
			int mid = lo + (hi-lo)/2;
			if(key > a[mid])    lo = mid+1;
			else if(key<a[mid]) hi = mid-1;
			else
				return mid;
		}
		return -1;
	}
	public static int BinarySearch(int key, myNode[] a)
	{
		int lo=0;
		int hi = a.length-1;
		while(lo<=hi)
		{
			int mid = lo + (hi-lo)/2;
			if(key > a[mid].b)    lo = mid+1;
			else if(key<a[mid].b) hi = mid-1;
			else
				return a[mid].a;
		}
		return -1;
		
	}
	
	public static void ShellSort(Comparable[] a)
	{
		int N=a.length;
		int h=1;
		while(h<N/3)
			h = 3*h+1;
		while(h>=1)
		{
			for(int i=h;i<N;i++)	
			{
				for(int j=i;j>=h && less(a[j],a[j-h]);j-=h)
					exch(a,j,j-h);
			}
			h=h/3;
		}
	
	}
	public static boolean isMatch(String s, String p) {
		
	       
	        return true;
	    }
	public static int maxArea(int[] height) {
		
		return 1;
	    
	}
	public static List<String> getCombinations(String[] numstr,String digits)
	{
		List<String> str = new ArrayList<String>();
		if(digits.isEmpty()) return str;
		char num = digits.charAt(0);
		int digit = ((int)(num) - (int)('0'));
		for(char c:numstr[digit].toCharArray()) {
			str.addAll(getCombinations(numstr,digits.substring(1, digits.length())));
		}
		return str;
	}
	public static List<String> letterCombinations(String digits) {
	
	
    LinkedList<String> ans = new LinkedList<String>();
    if(digits.isEmpty()) return ans;
    String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    ans.add("");
    for(int i =0; i<digits.length();i++){
        int x = Character.getNumericValue(digits.charAt(i));
        while(ans.peek().length()==i){
            String t = ans.remove();
            for(char s : mapping[x].toCharArray())
                ans.add(t+s);
        }
    }
    return ans;
}


	private static void exch(Comparable[] a,int i,int j)
	{
		Comparable t = a[i];
		a[i]=a[j];
		a[j]=t;
	}

	private static boolean less(Comparable v, Comparable w)
	{
		return v.compareTo(w)<0;
	}
	public static double F(int N)
	{
		int n;
		double[] fibonacci =new double[200];
		fibonacci[0]=1;
		fibonacci[1]=1;
		for(n=2;n<=N;n++)
		{
			fibonacci[n]=fibonacci[n-1]+fibonacci[n-2];
		}
		return fibonacci[N];
		
	}
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        int i,j,k;
	        float[] nums3 = new float[nums2.length+nums1.length];
	        i = j = k =0;
	        while(i<nums1.length && j < nums2.length){
	            if(nums1[i]<nums2[j]) nums3[k++] = nums1[i++];
	            else nums3[k++] = nums2[j++];
	            
	        }
	        while(i<nums1.length) nums3[k++] = nums1[i++];
	        while(j<nums2.length) nums3[k++] = nums2[j++];
	        
	        return (nums3.length%2==0? ((nums3[nums3.length/2]+nums3[nums3.length/2-1])/2):nums3[nums3.length/2]);
	    }
	  
	public static String convert(String s, int numRows) {
	        char[] out = s.toCharArray();
	        char[][] temp = new char[numRows][s.length()];
	        int dir = 1;
	        if(numRows == 1) return s;
	        for(int p=0,i=0,j=0;p<s.length();p++)
	        {
	        		temp[i][j] = s.charAt(p);
	        		if(i==0 && dir == -1) {
	        			dir = flip(dir);
	        			j++;
	        		}
	        		if( (i+1) % numRows == 0 )
	        		{	
	        			dir = flip(dir);
	        			j++;
	        		}
	        		i+=dir;	
	        }
	        int cnt = 0;
	        for(int i=0;i<numRows;i++)
	        {
	        		for(int j=0;j<s.length();j++)
	        		{
	        			if(temp[i][j]!='\0')
	        			{
	        				out[cnt++] = temp[i][j];
	        			}
	        		}
	        }
	        //System.out.println(out);
	        return new String(out);
	    }
	public static String convert2(String s, int nRows) {
		    char[] c = s.toCharArray();
		    int len = c.length;
		    StringBuffer[] sb = new StringBuffer[nRows];
		    for (int i = 0; i < sb.length; i++) sb[i] = new StringBuffer();
		    
		    int i = 0;
		    while (i < len) {
		        for (int idx = 0; idx < nRows && i < len; idx++) // vertically down
		            sb[idx].append(c[i++]);
		        for (int idx = nRows-2; idx >= 1 && i < len; idx--) // obliquely up
		            sb[idx].append(c[i++]);
		    }
		    for (int idx = 1; idx < sb.length; idx++)
		        sb[0].append(sb[idx]);
		    return sb[0].toString();
		}
	public static boolean isPalindrome(int x)
  {

	    if (x<0 || (x!=0 && x%10==0)) return false;
	    int rev = 0;
	    while (x>rev){
	    	rev = rev*10 + x%10;
	    	x = x/10;
	    }
	    return (x==rev || x==rev/10);

  }
  	public static int[] anagramMappings(int[] A, int[] B) {
	  
      int[] p = new int[A.length];
      int[] isIndexed = new int[A.length];
      for(int i=0;i<A.length;i++) isIndexed[i] = 0;
      
      for(int i=0;i<A.length;i++)
      {
          for(int j=0;j<B.length;j++)
          {
             // if(isIndexed[j] == 1) continue;
              if(A[i] == B[j])
              {
                  isIndexed[j]=1;
                  p[i] = j;
              }
          }
      }
      
      return p;
  }

     public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
	         
	         if(t1 == null) return t1;
	         if(t2 == null) return t2;
	         
	         TreeNode n = new TreeNode(t1.val + t2.val);
	         n.left = mergeTrees(t1.left,t2.left);
	         n.right= mergeTrees(t2.right,t2.right);
	         return n;
	 }
     public static boolean isSelf_Dividing(int x)
     {
         while(x>0) {
             if(x%(x%10) == 0){
                 x = x/10;
             }
             else return false;
         }
         return true;
     }
     public static List<Integer> selfDividingNumbers(int left, int right) {
         List<Integer> n = new ArrayList<Integer>();
         for(int pivot = left;pivot <right;pivot++)
         {
             if(isSelf_Dividing(pivot)) n.add(pivot); 
         }
         return n;
     }
     public static  int findComplement(int num) {
         int r=0,j=0;
         while(num>0){
        	 r += (1<<j++) * (num%2 == 0 ? 1:0);
             num = num>>1;
         }
         return r;
     }
     public static String reverseString(String s) {
         int i=0,j=s.length()-1;
         char c[] = s.toCharArray();
         for(;i<j;i++,j--)
         {
             char temp = c[i];
             c[i]= c[j];
             c[j] = temp;
         }
         return String.valueOf(c);
     }
     public static String[] findWords(String[] words) {
         Map row1 = new HashMap();
         Map row2 = new HashMap();
         Map row3 = new HashMap();
         String r1 = "qwertyuiop";
         String r2 = "asdfghjkl";
         String r3 = "zxcvbnm";
         char[] rr1 = r1.toCharArray();
         char[] rr2 = r2.toCharArray();
         char[] rr3 = r3.toCharArray();
         for(int i=0;i<rr1.length;i++) row1.put(rr1[i], i);
         for(int i=0;i<rr2.length;i++) row2.put(rr2[i], i);
         for(int i=0;i<rr3.length;i++) row3.put(rr3[i], i);
         
         List<String> list = new ArrayList<String>();
         String s[] = new String[words.length];
         for(int i=0,j=0;i<words.length;i++)
         {
        	 	char[] c=words[i].toLowerCase().toCharArray();
        	 	if(judgeSingleLine(c,row1) 
        	 			||judgeSingleLine(c,row2)
        	 			||judgeSingleLine(c,row3))
        	 	{
        	 		list.add(words[i]);
        	 	}
         }
         return list.toArray(new String[list.size()]);
 
     }
     public static boolean judgeSingleLine(char[] c,Map m)
     {
    	 for(char cc:c) {
 	 		if(m.containsKey(cc)) {
 	 			continue;
 	 		}	
 	 		else
 	 			return false;
 	 		
 	 	}
    	 	return true;
     }
     public static int islandPerimeter(int[][] grid) {
    	 
    	 int m = grid.length;
    	 int n = grid[0].length;
    	 int[][] newgrid = new int[m+2][n+2];
    	 for(int i=0;i<m+2;i++) {
    		 newgrid[i][0]=0;
    	 }   
    	 for(int i=0;i<n+2;i++) {
    		 newgrid[0][i]=0;
    	 }
    	 for(int i=1;i<m+1;i++) {
    		 for(int j=1;j<n+1;j++) {
    			 newgrid[i][j] = grid[i-1][j-1];
    		 }
    	 }
    	 int sum=0;
    	 int a,b,c,d;
     for(int i=1;i<m+1;i++) {
    		 for(int j=1;j<n+1;j++) {
    			 if(newgrid[i][j] ==0) continue;
    			  a = newgrid[i-1][j]==1?0:1;
    			 b = newgrid[i][j-1]==1?0:1;
    			 c = newgrid[i][j+1]==1?0:1;
    			 d = newgrid[i+1][j]==1?0:1;
    			 sum +=a+b+c+d;
    		 }
    	 }
     return sum;
    	 
    }
     // 682: Baseball game
     public static int calPoints(String[] ops) {
    	 int sum=0;
         int i=0;
         List<Integer> list = new ArrayList<Integer>();
         String c= new String();
         for(int j=0;j<ops.length;j++)
         {
             c=ops[j];
        	 	if(c.charAt(0) == 'C')
        	 	{
        	 		list.remove(i-1);
        	 		i--;
        	 	}
        	 	else if(c.charAt(0) == 'D')
        	 	{
        	 		list.add((list.get(i-1)*2));
        	 		i++;
        	 	}
        	 	else if(c.charAt(0) == '+')
        	 	{
        	 		list.add(list.get(i-1)+list.get(i-2));
        	 		i++;
        	 	}
        	 	else
        	 	{	
        	 		list.add(Integer.parseInt(c));
        	 		i++;
        	 	}
        	 		
         }
         for(int j=0;j<list.size();j++)
        	 	sum+=list.get(j);
	 return sum; 
     }
     // 575:Distribute Candies
     public static int distributeCandies(int[] candies) {
         int max=0;
         int diffnum=1;
         Arrays.sort(candies);
         for(int i=1;i<candies.length;i++)
         {
        	 	if(candies[i]!=candies[i-1]) diffnum++;
         }
         if(diffnum >= candies.length / 2) return candies.length/2;
         
         return diffnum;
     }
     
     public static String toLowerCase(String str) {
    	 return str.toLowerCase();
     }
     //804:Unique Morse Words
     public static int uniqueMorseRepresentations(String[] words) 
     {
    	 final String[] morse = {
     
             ".-",
             "-...",
             "-.-.",
             "-..",
             ".",
             "..-.",
             "--.",
             "....",
             "..",
             ".---",
             "-.-",
             ".-..",
             "--",
             "-.",
             "---",
             ".--.",
             "--.-",
             ".-.",
             "...",
             "-",
             "..-",
             "...-",
             ".--",
             "-..-",
             "-.--",
             "--.."
     };

     Set<String> codes = new HashSet<>();

     for (String word : words) {
         StringBuilder sb = new StringBuilder();
         for (int i = 0; i < word.length(); i++)
             sb.append(morse[word.charAt(i) - 'a']);

         codes.add(sb.toString());
     }
     return codes.size();
     }
     //832  Flipping an Image
     public int[][] flipAndInvertImage(int[][] A) {
         int len = A.length;
         int[][] B=new int[len][len];
         for(int i=0;i<len;i++)
         {
        	 	for(int j=0;j<len;j++)
        	 	{    
        	 	    B[i][j]=A[i][len-1-j]+1;
        	 	    B[i][j] = 2-B[i][j];
        	 	}
         }
    	 return B;
     }
     //852 Peak Index in a Mountain Array
    public static int peakIndexInMountainArray(int[] A) {
    		int lo=0;
		int hi = A.length-1;
		while(lo<=hi)
		{
			int mid = lo + (hi-lo)/2;
			if( A[mid] < A[mid+1])    lo = mid+1;
			else if(A[mid-1]>A[mid] ) hi = mid-1;
			else
				return mid;
		}
		return -1;
        
    }
    //349 Intersection
 public static int[] intersection(int[] nums1, int[] nums2) {
	 List<Integer> ldst = new ArrayList<Integer>();
	 Arrays.sort(nums1);
	 Arrays.sort(nums2);
	 
	 for(int i=0;i<nums1.length;i++)
	 {
		 int key = nums1[i];
		 if(BinarySearch(key, nums2)!=-1)
		 {
			 if(ldst.isEmpty()) 
				 ldst.add(key);
			 else if(key != ldst.get(ldst.size()-1))
				 ldst.add(key);
		 }
	 }
	 int[] dst =new int[ldst.size()];
	 for(int i=0;i<ldst.size();i++)
	 {
		 dst[i]=ldst.get(i);
	 }
	 return dst;
 
    }
 //167. Two Sum II - Input array is sorted
 public static int[] twoSum(int[] numbers, int target) {
	 int[] dst = new int[2];
	 int j;
     for(int i=0;i<numbers.length;i++)
     {
    	 	int key = target-numbers[i];
    	 	int lo=i+1;
    		int hi = numbers.length-1;
    		while(lo<=hi)
    		{
    			int mid = lo + (hi-lo)/2;
    			if(key > numbers[mid])    lo = mid+1;
    			else if(key<numbers[mid]) hi = mid-1;
    			else
    			{
    				j = mid;
    				dst[0] = i+1;
    	    	 	dst[1] = j+1;
    	    	 	return dst;
    				
    			}
    		}
     }
     return dst;
 }
 //454. 4Sum II
 public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
     int sum=0;

     Map<Integer,Integer> mapAB = new HashMap<>();
     Map<Integer,Integer> mapCD = new HashMap<>();

     for(int i=0;i<A.length;i++)
     {
    	 	for(int j=0;j<B.length;j++)
    	 	{
    	 		mapAB.put(A[i]+B[j],mapAB.getOrDefault(A[i]+B[j], 0)+1);
    	 		mapAB.put(C[i]+D[j],mapCD.getOrDefault(C[i]+D[j], 0)+1);
    	 	}
     }
     for(Integer Key:mapAB.keySet())
     {
    	 	if(mapCD.containsKey(-Key))
    	 		sum+= mapAB.get(Key) * mapCD.get(-Key);
     }
	 return sum;
 }
 //230. Kth Smallest Element in a BST
 public static int kthSmallest(TreeNode root, int k) {
     ArrayList<Integer> ai = new ArrayList<Integer>();
     searchTree(ai,root);
     int[] dst =new int[ai.size()];
	 for(int i=0;i<ai.size();i++)
	 {
		 dst[i]=ai.get(i);
	 }
     Arrays.sort(dst);
     return dst[k];

 }
 public static void searchTree(ArrayList<Integer> ai ,TreeNode root)
 {
	 ai.add(root.val);
	 if(root.left!=null) searchTree(ai,root.left);
	 if(root.right!=null) searchTree(ai,root.right);
 }
 //378. Kth Smallest Element in a Sorted Matrix
 public static int kthSmallest(int[][] matrix, int k) {
	 int len=matrix.length;
     int[] src = new int[len*len];
     for(int i=0;i<len;i++) 
     {
         for(int j=0;j<len;j++)
         {
             src[i*len+j]=matrix[i][j];
         }
     }
     Arrays.sort(src);
     return src[k-1];
 }
 public static int guessNumber(int n) {
     int lo = 1;int hi = n;
     return mGuess(1,n);
 }
 public static int mGuess(int lo,int hi)
 {
     while(lo <= hi) {
     int mid = lo + (hi-lo)/2 ;
     if(guess(mid) ==1) lo = mid+1;
     else if(guess(mid) == -1) hi=mid-1;
     else if(guess(mid) == 0)
         return mid;
     }
  return -1;
 }
 public static int guess(int num) {
	 if(num>45) return -1;
	 else if(num<45) return 1;
	 else return 0;
 }
 //475: Heaters
 public static int findRadius(int[] houses, int[] heaters) {
     return 0;
 }
 
 //15: 3Sum
 public static List<List<Integer>> threeSum(int[] nums) {
	 Arrays.sort(nums);
	    // Map<Integer,Integer> map = new HashMap<>();
     List<List<Integer>>  dst = new ArrayList<List<Integer>>();
     //printArray(nums);
     for(int i=0;i<nums.length-2;i++)
     {
    	 if(i>0 && nums[i] == nums[i-1]) continue;
    	 	int a= nums[i];
    	 	for(int j=i+1;j<nums.length-1;)
    	 	{
    	 		int b = nums[j];
    	 		if(BinarySearch(-a-b,nums,j+1,nums.length-1)!=-1)
    	 		{
    	 		    List<Integer> lst1 = new ArrayList<Integer>();
    	 		 	lst1.add(a);
    	 			lst1.add(b);
    	 			lst1.add(-a-b);
    	 			dst.add(lst1);
    	 		}
                j++;
                while(j<nums.length-1 && nums[j] == nums[j-1]) j++; // remove duplicate values	
    	 	}
     }
     return dst;
 }
 public static List<List<Integer>> threeSum1(int[] nums) // Two pointers solution
 {
	 Arrays.sort(nums);
     List<List<Integer>>  dst = new ArrayList<List<Integer>>();
     for(int i=0;i<nums.length-2;i++)
     {
    	 	if(i>0 && nums[i] == nums[i-1]) continue;
    	 	int a= nums[i];
    	 	int target = -a;
    	 	int j = i+1;
    	 	int k = nums.length-1;
    	 	while(j<k) {
    	 		if(nums[j]+nums[k] == target)
    	 		{
    	 			dst.add(Arrays.asList(a,nums[j],nums[k]));
    	 			j++;
    	 			k--;
    	 			while(j<k && nums[j] == nums[j-1]) j++;
    	 			while(j<k && nums[k] == nums[k+1]) k--;
    	 		}
    	 		else if(nums[j] + nums[k] < target) j++;
    	 		else k--;
    	 		
    	 	}
     }
    	 	return dst;
 }
// 16. 3Sum Closest
 public static int threeSumClosest(int[] nums, int target) {
     Arrays.sort(nums);
     int distance = Integer.MAX_VALUE;
     int temp,temp2=0;
     int dst = 0;
     for(int i=0;i<nums.length;i++)
     {
    	 	//if(i>0 && nums[i] == nums[i-1]) continue;
    	 	for(int j = i+1;j<nums.length;j++)
    	 	{
    	 		for(int k = j+1;k<nums.length;k++)
    	 		{
    	 			temp = nums[i] + nums[j] + nums[k];
    	 			temp2 = Math.abs(temp-target);
    	 			if(temp2< distance) 
 				{
    	 				distance = temp2;
    	 				dst = temp;
 				}
    	 		}
    	 	}
     }
     return dst;
 }
 //16:3Sum Second Solution
 public static int threeSumClosest1(int[] nums, int target) {
     Arrays.sort(nums);
     int dst=0;
     int a,b,c;
     dst = nums[0]+nums[1]+nums[2];
     for(int i=0;i<nums.length-2;i++)
     {
    	 	if(i>0 && nums[i] == nums[i-1]) continue;
    	 	a = nums[i];
    	 	int j = i+1;
    	 	int k = nums.length-1;
    	 	
    	 	while(j<k)
    	 	{
    	 		b = nums[j];c= nums[k];
    	 		if(a + b + c == target ) return target;
    	 		else if(a+b+c > target) {
    	 			if(a+b+c - target < Math.abs(dst- target)) 
    	 				dst = a+b+c;
    	 			k--;
    	 		}
    	 		else {
    	 			if(target -(a+b+c) < Math.abs(dst-target)) 
    	 				dst = a+b+c;
    	 			j++;
    	 		}
    	 	}
     }
     return dst;
 }
 //18. 4Sum
 public static List<List<Integer>> fourSum(int[] nums, int tar) {	 
	 Arrays.sort(nums);
     List<List<Integer>>  dst = new ArrayList<List<Integer>>();
     for(int m=0;m<nums.length-3;m++)
     {
    	 if(m>0 && nums[m] == nums[m-1]) continue;
	     for(int i=m+1;i<nums.length-2;i++)
	     {
	    	 	if(i>m+1 && nums[i] == nums[i-1]) continue;
	    	 	int a= nums[m];
	    	 	int b = nums[i];
	    	 	int target = tar-a-b;
	    	 	int j = i+1;
	    	 	int k = nums.length-1;
	    	 	while(j<k) {
	    	 		if(nums[j]+nums[k] == target)
	    	 		{
	    	 			dst.add(Arrays.asList(a,b,nums[j],nums[k]));
	    	 			j++;
	    	 			k--;
	    	 			while(j<k && nums[j] == nums[j-1]) j++;
	    	 			while(j<k && nums[k] == nums[k+1]) k--;
	    	 		}
	    	 		else if(nums[j] + nums[k] < target) j++;
	    	 		else k--;	    	 		
	    	 	}
	     }	
     }
    	 	return dst;
 }
 // kSum 
 public static ArrayList<List<Integer>> kSum(int[] nums, int target, int k, int index) {	 
	 ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
     if(index >= nums.length) {
         return res;
     }
     if(k == 2) {
     	int i = index, j = nums.length - 1;
     	while(i < j) {
             //find a pair
     	    if(target - nums[i] == nums[j]) {
     	    	List<Integer> temp = new ArrayList<>();
             	temp.add(nums[i]);
             	temp.add(target-nums[i]);
                 res.add(temp);
                 //skip duplication
                 while(i<j && nums[i]==nums[i+1]) i++;
                 while(i<j && nums[j-1]==nums[j]) j--;
                 i++;
                 j--;
             //move left bound
     	    } else if (target - nums[i] > nums[j]) {
     	        i++;
             //move right bound
     	    } else {
     	        j--;
     	    }
     	}
     } else{
         for (int i = index; i < nums.length - k + 1; i++) {
             //use current number to reduce ksum into k-1sum
             ArrayList<List<Integer>> temp = kSum(nums, target - nums[i], k-1, i+1);
             if(temp != null){
                 //add previous results
                 for (List<Integer> t : temp) {
                     t.add(0, nums[i]);
                 }
                 res.addAll(temp);
             }
             while (i < nums.length-1 && nums[i] == nums[i+1]) {
                 //skip duplicated numbers
                 i++;
             }
         }
     }
     return res;
 }
 //19. Remove Nth Node From End of List
 public static ListNode removeNthFromEnd(ListNode head, int n) {
	 ListNode  mHead = new ListNode(0);
	 mHead.next = head;
	 ListNode  miterator = mHead.next;
	 ListNode  last = new ListNode(0);
	 int len = 1;
	 while(miterator.next != null) {
		 miterator = miterator.next;
		 len++;
	 }
	 if(n > len) return null;
	 
	 int i=0;
	 miterator = mHead;
	 while(i <= len - n)
	 {
		 last = miterator;
		 miterator = miterator.next;
		 i++;
	 }
	 last.next = miterator.next;
	 return mHead.next;
 }
// 22. Generate Parentheses
 public static List<String> generateParenthesis(int n) {
	 List<String> list = new ArrayList<String>();
	 TreeNode node = new TreeNode(1);
	 generateTreeNode(node,1,1,2*n,n);
	 List<Integer> path = new ArrayList<Integer>();
	 getAllTreeLines(list,path,node);	
	 return list;
 }
 public static void generateTreeNode(TreeNode tree, int sum,int pCnt,int index, int n)
 {
	 if(index < 2) {
		 return;
	 }
	 if(sum > 0 && pCnt < n) 
	 {
		 TreeNode newNode1 = new TreeNode(1);
		 TreeNode newNode2 = new TreeNode(-1);
		 tree.left = newNode1; 
		 generateTreeNode(tree.left,sum+1,pCnt+1,index-1,n);
		 tree.right = newNode2;
		 generateTreeNode(tree.right,sum-1,pCnt,index-1,n);
	 }
	 else if(sum <=0)
	 {
		 TreeNode newNode = new TreeNode(1);
		 tree.left = newNode;
		 tree.right = null;
		 generateTreeNode(tree.left,sum+1,pCnt+1,index-1,n);
	 }
	 else
	 {
		 TreeNode newNode = new TreeNode(-1);
		 tree.left = null;
		 tree.right = newNode;
		 generateTreeNode(tree.right,sum-1,pCnt,index-1,n);
	 }
 } 
 public static void getAllTreeLines(List<String> list,List<Integer> path,TreeNode pRoot)
 {
	 if (pRoot== null)
		{
			return;
		}
		path.add(pRoot.val);
		if (pRoot.left == null && pRoot.right == null) 
		{
			//printPath(path);		
			StringBuffer s = new StringBuffer();
			for(int i=0;i<path.size();i++) 
			{
				s.append(path.get(i) == 1? '(':')');			    
			}
			list.add(s.toString());		
		}
		if (pRoot.left!= null)
		{
			getAllTreeLines(list, path, pRoot.left);
		}
		
		if (pRoot.right!= null)
		{
			getAllTreeLines(list, path, pRoot.right);
		}
		
		path.remove(path.size()-1);

 }
 
 public static List<String> generatParenthesis_BackTracking(int n)
 {
	 List<String> ans = new ArrayList<String>();
     backtrack(ans, "", 0, 0, n);
     return ans;
 }

 public static void backtrack(List<String> list, String str, int open, int close, int max){
       if(str.length() == max*2){
           list.add(str);
           return;
       }       
       if(open < max)
           backtrack(list, str+"(", open+1, close, max);
       if(close < open)
           backtrack(list, str+")", open, close+1, max);
   }

//24. Swap nodes in pairs
 public static ListNode swapPairs(ListNode head) {
	 if(head == null || head.next == null)
	 {
		 return head;
	 }
	 ListNode A =  head;
	 ListNode B = A.next;
	 ListNode C = B.next;
	 ListNode tempNode = new ListNode(0);
	 ListNode mHead = head.next;
	 while(A!=null && A.next != null )
	 {
		 B = A.next;
		 C = B.next;
		 tempNode.next = B;
		 B.next = A;
		 A.next = C;
		 tempNode = A;
		 A = C; 
	 }
	 return mHead;
 }
 //25. Reverse Nodes in k-Group
 public static ListNode reverseKGroup(ListNode head, int k) {
	 
	 if (head==null||head.next==null||k<2) return head;
	    
     ListNode mHead = new ListNode(0);
     mHead.next = head;
     ListNode prev = mHead,tail = mHead,temp;
    
     while(true)
     {
    	 	int cnt = k;
    	 	while(cnt>0 && tail!=null)
    	 	{
    	 		k--;
        	 	tail = tail.next;
    	 	}
    	 	if(tail == null) break;
    	 	
    	 	head = prev.next;
    	 	while(prev.next!=tail)
    	 	{
    	 		temp=prev.next;
    	 		prev.next=temp.next;
    	 		
    	 		temp.next = tail.next;
    	 		tail.next = temp;
    	 	}
    	 	tail = head;
    	 	prev = head;
     }
     
	 return mHead;
 }
 //46. Permutations
 public static List<List<Integer>> permute(int[] nums) {
	 List<List<Integer>> dst = new ArrayList<List<Integer>>();
	 int[] visited = new int[nums.length];
	 List<Integer>  solution = new ArrayList<Integer>();
	 permutation_helper(nums,visited,dst,solution);
	 return dst;
	 
 }
 public static void permutation_helper(int[] nums,int[] visited,List<List<Integer>> list,List<Integer> tar)
 {
	 if(tar.size() == nums.length) {
		 list.add(new ArrayList<Integer>(tar));
		 return;
	 }
	 for(int i=0;i<nums.length;i++)
	 {
		 if(visited[i] == 0)
		 {
			 tar.add(nums[i]);
			 visited[i] =1;
			 permutation_helper(nums,visited,list,tar);
			 tar.remove(tar.size()-1);
			 visited[i]=0;
		 } 
	 }
 }
 //47 Permutations II
 public static List<List<Integer>> permuteUnique(int[] nums) {
	 List<List<Integer>> dst = new ArrayList<List<Integer>>();
	 int[] visited = new int[nums.length];
	 Arrays.sort(nums);
	 List<Integer>  solution = new ArrayList<Integer>();
	 permutationUniqueHelper(nums,visited,dst,solution);
	 return dst;
 }
 public static void permutationUniqueHelper(int[] nums,int[] visited,List<List<Integer>> list,List<Integer> tar)
 {
	 if(tar.size() == nums.length) {
		 list.add(new ArrayList<Integer>(tar));
		 return;
	 }
	 for(int i=0;i<nums.length;i++)
	 {
		 if(visited[i] == 0)
		 {
			 if(i>0 && nums[i] == nums[i-1] && visited[i-1] ==0)
			 {
				 continue;
			 }
			 tar.add(nums[i]);
			 visited[i] =1;
			 permutationUniqueHelper(nums,visited,list,tar);
			 tar.remove(tar.size()-1);
			 visited[i]=0;
		 } 
	 }
 }
 //31. Next Permutation
 public static void nextPermutation(int[] nums) {
     int begin=0,end=0,pos=0;
     int valid  = 0;
	 for(int i=nums.length-1;i>0;i--)
	 {
		 if(nums[i-1] < nums[i])
		 {
			 pos = i-1;
			 valid =1;
			 break;
		 }
	 }
	 if(pos<=0 && valid==0) 
		 {
		 Arrays.sort(nums);
		 return;
		 }
	 for(int i=nums.length-1;i>pos;i--)
	 {
		 if(nums[i]>nums[pos]) 
		 {
			end = i;
			int temp = nums[end];
			nums[end] = nums[pos];
			nums[pos]=temp;
			break;
		 }	
	 }
	 InsertionSort(nums,pos+1,nums.length);
	 
 }
 //34. Find First and Last Position of Element in Sorted Array
 public static int[] searchRange(int[] nums, int target) {
     int[] dst = {-1,-1};
     int pos = BinarySearch(target,nums);
    
     if(pos == -1) 
     {
    	 	return dst;
     }
     for(int i=pos;i>=0;i--)
     {
    	 	if(nums[i] != nums[pos])
    	 	{
    	 		break;
    	 	}
    	 	else
    	 	{
    	 		dst[0]= i;
    	 	}
     }
     for(int i=pos;i<nums.length;i++)
     {
    	 	if(nums[i] != nums[pos])
    	 	{
    	 		break;
    	 	}
    	 	else
    	 	{
    	 		dst[1] = i;
    	 	}
     }
     
     return dst;
 }
//39. Combination Sum
 public static List<List<Integer>> combinationSum(int[] candidates, int target) {
     List<List<Integer>> dst = new ArrayList<List<Integer>>();
     List<Integer>  tempList = new ArrayList<Integer>();
     int st = 0;
     int rest = target;
     combinationSumHelper(dst,tempList,candidates,target,st,rest);
     return dst;
 }
 public static void combinationSumHelper(List<List<Integer>> list,List<Integer> tList,int[] nums, int target,int start,int remain)
 {
	if(remain <0) return;
	if(remain ==0) list.add(new ArrayList<Integer>(tList));
	else
	{
		for(int i=start;i<nums.length;i++)
		{
			tList.add(nums[i]);
			combinationSumHelper(list,tList,nums,target,i,remain-nums[i]);
			tList.remove(tList.size()-1);
		}
	}
	 return; 
 }
 public static int sum(int[] nums)
 {
	 int sum=0;
	 for(int i=0;i<nums.length;i++) sum+=nums[i];
	 return sum;
 }
 public static int sum(List<Integer> lst)
 {
	 int sum=0;
	 for(int i=0;i<lst.size();i++) sum+=lst.get(i);
	 return sum;
 }
 //40. Combination Sum II
 public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
	 List<List<Integer>> dst = new ArrayList<List<Integer>>();
     List<Integer>  tempList = new ArrayList<Integer>();
     Arrays.sort(candidates);
     int st = 0;
     int rest = target;
     combinationSumHelper2(dst,tempList,candidates,target,st,rest);
     return dst;
 }
 public static void combinationSumHelper2(List<List<Integer>> list,List<Integer> tList,int[] nums, int target,int start,int remain)
 {
	if(remain <0) return;
	if(remain ==0) list.add(new ArrayList<Integer>(tList));
	else
	{
		for(int i=start;i<nums.length;i++)
		{
			if(i>start && nums[i]==nums[i-1]) continue;
			tList.add(nums[i]);
			combinationSumHelper2(list,tList,nums,target,i+1,remain-nums[i]);
			tList.remove(tList.size()-1);
		}
	}
	 return; 
 }
//33. Search in Rotated Sorted Array
 public static int search(int[] nums, int target) {
     for(int i=0;i<nums.length;i++)
         if(nums[i]==target) return i;
      return -1;
  }
 //41. First Missing Positive
 public static int firstMissingPositive(int[] nums) {
	     Arrays.sort(nums);
	     if(nums.length ==0) return 1;
	     else if(nums[0]>1) return 1;
	     for(int i=0;i<nums.length;i++)
	     {
	    	 	if(nums[i]<=1) continue;
	    	 	if(i>0 &&(nums[i] - nums[i-1])>1) 
	    	 	{
	    	 		if(nums[i-1]<=0) 
	    	 			return 1;
	    	 		else
	    	 			return nums[i-1]+1;
	    	 	}
	     }
	     return nums[nums.length-1]+1;
 }
 //42. Trapping Rain Water
 //This seems to be a "()" matching problem. A decline means a "(",and a ascend means a ")".
 //Using two pointers
 public static int trap(int[] height) {
	 int left=0,right = height.length-1;
	 int left_max=0,right_max=0;
	 int dst=0;
	 while(left<right)
	 {
		 if(height[left]<height[right])
		 {
			 if(height[left]>=left_max )
				left_max = height[left];
			else
				dst += (left_max - height[left]);
	           
			++left;
		 }
		 else
		 {
			 if(height[right]>=right_max )
					right_max = height[right];
				else
					dst += (right_max - height[right]);
		           
				--right; 
		 }
	 }
	 return dst;
 }
 //55.Jump Game
 //Comment. It's a little bit confusing firstly I saw this problem. I couldn't figure out what the index means. 
 //And it means, if you are at index 3, and nums[3] = 5, then your max reach point should be 3+5 =8. If nums[10] =8, ok, it's true, 
 //because after you jump 5 steps, the next 7 round, you could jump 0 step.
 public static boolean canJump(int[] nums) {
     int n = nums.length, reach = 0;
     for (int i = 0; i < n; ++i) {
         if (i > reach || reach >= n - 1) break;
         reach = Math.max(reach, i + nums[i]);
     }
     return reach >= n - 1;
 }
 //45. Jump Game II
 public static int Jump(int[] nums) {
     int res = 0, n = nums.length, last = 0, cur = 0;
     for (int i = 0; i < n - 1; ++i) {
         cur = Math.max(cur, i + nums[i]);
         if (i == last) {
             last = cur;
             ++res;
             if (cur >= n - 1) break;
         }
     }
     return res;
 }
//49. Group Anagrams
 public static List<List<String>> groupAnagrams(String[] strs) {
	 List<List<String>> dst = new ArrayList<List<String>>();
	 Map<Integer,List<String>> map = new HashMap<>();
	 
	 for(String str:strs)
	 {
		 int[] code = new int[26];
		 for(char ch : str.toCharArray())
		 {
			 code[ch-'a']++;
		 }
		 int temp = Arrays.hashCode(code);
		 if(map.containsKey(temp))
		 {
			 List<String> strList = map.get(temp);
			 strList.add(str);
			 map.put(temp, strList);
		 }
		 else
		 {
			 List<String> list = new ArrayList<>();
             list.add(str);
             map.put(temp,list);
		 }
	 }
	 for(int key:map.keySet())
	 {
		 dst.add(map.get(key));
	 }
	 return dst;
 }
 //54. Spiral Matrix
 public static List<Integer> spiralOrder(int[][] matrix) {
	 myNode direction = new myNode(0,1);
     List<Integer> dst = new ArrayList<Integer>();
     if(matrix.length==0) return dst;
     int cnt=0;
     int i=0,j=0,row_s=0,col_s=0;
     int size = matrix.length*matrix[0].length;
     int row=matrix.length;
     int col = matrix[0].length;
     while(cnt<size)
     {
    	 	if(j>=col-1 && direction.a==0 && direction.b==1) {
    	 		direction.set(1,0);
    	 		row_s++;
    	 	}
    	 	else if(i>=row-1 && direction.a==1 && direction.b==0)
    	 	{
    	 		direction.set(0,-1);
    	 		col--;
    	 	}
    	 	else if(j<=col_s && direction.a == 0 && direction.b == -1)
    	 	{
    	 		direction.set(-1,0);
    	 		row--;
    	 	}
    	 	else if(i<=row_s && direction.a == -1 && direction.b == 0)
    	 	{
    	 		direction.set(0, 1);
    	 		col_s++;
    	 	}
    	 	dst.add(matrix[i][j]);
    	 	i+=direction.a;
    	 	j+=direction.b;
    	 	cnt++;
     }
     return dst;
 }
 //59. Spiral Matrix II
 public static int[][] generateMatrix(int n) {
	 if(n<=0) return new int[0][0];
	 int[][] dst = new int[n][n];
	 int size = n*n;
	 int cnt=0;
	 int i=0,j=0,row_s=0,col_s=0;
	 myNode direction = new myNode(0,1);
	 int row=n,col=n;
	 
	 while(cnt<size)
     {
    	 	if(j>=col-1 && direction.a==0 && direction.b==1) {
    	 		direction.set(1,0);
    	 		row_s++;
    	 	}
    	 	else if(i>=row-1 && direction.a==1 && direction.b==0)
    	 	{
    	 		direction.set(0,-1);
    	 		col--;
    	 	}
    	 	else if(j<=col_s && direction.a == 0 && direction.b == -1)
    	 	{
    	 		direction.set(-1,0);
    	 		row--;
    	 	}
    	 	else if(i<=row_s && direction.a == -1 && direction.b == 0)
    	 	{
    	 		direction.set(0, 1);
    	 		col_s++;
    	 	}
    	 	dst[i][j] = cnt+1;
    	 	i+=direction.a;
    	 	j+=direction.b;
    	 	cnt++;
     }
	 return dst;
 }
// 77. Combinations
 public static List<List<Integer>> combine(int n, int k) {
     List<List<Integer>> dst = new ArrayList<List<Integer>>()	;
     return dst;
 }
//88， Merge Sorted Array
 public static void merge(int[] nums1, int m, int[] nums2, int n) {
     int i=m-1;
     int j=n-1;
     int k = m+n-1;
     while(i>=0  && j>=0)
     {
    	 	if(nums1[i] > nums2[j])
    	 	{
    	 		nums1[k--] = nums1[i--];
    	 	}
    	 	else
    	 	{
    	 		nums1[k--] = nums2[j--];
    	 	}
     }
     while(j>=0)
    	 {
    	 	nums1[k--] = nums2[j--];
    	 }
 }
 //242. Valid Anagrams
 public static boolean isAnagram(String s, String t) {
     int[] code1 = new int[26];
     int[] code2 = new int[26];
     if(s.length() !=t.length()) return false;
     for(char c:s.toCharArray()) 
     {
    	 	code1[c - 'a']++;
     }
     for(char c:t.toCharArray()) 
     {
    	 	code2[c - 'a']++;
     }
     int i=0;
     for( i=0;i<26;i++)
     {
    	 	if(code1[i] == code2[i]) continue;
    	 	else break;
     }
     if(i == 26)  return true;
     else return false;
 }
 // 867, Transpose Matrix
 public static int[][] transpose(int[][] A) {
     int M = A.length, N = A[0].length;
     int[][] B = new int[N][M];
     for (int j = 0; j < N; j++)
         for (int i = 0; i < M; i++)
             B[j][i] = A[i][j];
     return B;
 }
public static void main(String[] args)
{
	int[][] nums = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
    //System.out.println("len="+nums.length+","+nums[0].length);
   // spiralOrder(nums);
    generateMatrix(0);
   
}
 public static void printArray(int[] nums)
 {
	 for(int i=0;i<nums.length;i++)
	 {
		 System.out.print(nums[i]+",");
	 }
	 System.out.println("");
 }
	
}


  