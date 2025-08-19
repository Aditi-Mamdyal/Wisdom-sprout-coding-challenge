import java.util.ArrayList;
public class day5_leader {
    /*public static void main(String args[]){
        int arr[]={7, 6, 5};
        System.out.println(leader(arr));
    }*/
    static ArrayList<Integer> leader(int[] arr){
        ArrayList<Integer> list=new ArrayList<>();
        int i, j;
        boolean check;
        for(i=0;i<arr.length;i++){
            check=true;
            for(j=i;j<arr.length;j++){
                if(arr[j]>=arr[i] && j>i){
                    check=false;
                    break;
                }
            }
            if(check)
            list.add(arr[i]);
        }
        return list;
    }

}
