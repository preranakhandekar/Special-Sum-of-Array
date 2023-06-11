import java.util.* ;
import java.io.*; 
public class Solution{	
	public static int specialSum(ArrayList<Integer> arr, int n ){
		int sum=0;
		for(int i=0;i<n;i++){
			sum+=arr.get(i);
		}
		int m=findsum(sum);
		return m;
	}
	public static int findsum(int sum){
		int ans=0;
		while(sum>0){
			int rem=sum %10;
			ans=ans+rem;
			sum=sum/10;
		}
		if(ans<=9) return ans;
		return findsum(ans);
	} 
}

/*  8 7 0 1 2
    8+7+1+2=18;
    1+8=9
    Ans:- 9
*/
