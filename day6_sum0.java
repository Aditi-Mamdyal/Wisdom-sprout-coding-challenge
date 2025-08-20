import java.util.ArrayList;
import java.util.List;
public class day6_sum0 {
    /*public static void main(String[] args) {
        int[] arr={0, 0, 0};
        System.out.println(subarray(arr));
        
    }*/
    public List<List<Integer>> subarray(int[] arr){
    List<List<Integer>> outer=new ArrayList<>();
    int sum=0, i ,j;
    for(i=0;i<arr.length;i++){
        for(j=i;j<arr.length;j++){
            ArrayList<Integer> inner=new ArrayList<>();
            sum=sum+arr[j];
            if(sum==0){
                inner.add(i);
                inner.add(j);
                outer.add(inner);
            }
        }
        sum=0;
    }
    return outer;
    }    
}
