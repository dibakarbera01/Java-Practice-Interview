/*
Array Question
 Given an array of size N and integer target. Fins the indices (i,j) of two numbers such that their sum is to target. (i!=j).
 sample input:-
 N=5
 arr = {7,6,3,8,2}
 target=14
 sample output :- 1 3

*/
package Arrays;
import java.util.*;
public class TwoSum {
    public static void main(String[] args) {
        int[] arr={11,3,7,9,14,21};
        int target=17;
        int[] ans=new int[2];
        HashMap<Integer, Integer>map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int sno=target-arr[i];
            if(map.containsKey(sno)){
                ans[0]=map.get(sno);
                ans[1]=i;
                break;
            }
            map.put(arr[i], i);
        }
        System.out.println(ans[0]+" "+ans[1]);
    }

}