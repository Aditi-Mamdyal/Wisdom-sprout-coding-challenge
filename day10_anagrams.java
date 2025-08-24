import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class day10_anagrams {
    public static void main(String[] args) {
        String arr[]={"a"};
        System.out.println(listanags(arr));
    }

    public static List<List<String>> listanags(String[] arr){
        int i=0, j=0;
        boolean[] check=new boolean[arr.length];
        List<List<String>> outer=new ArrayList<>();
        for(i=0;i<arr.length;i++){
            if(!check[i]){
            ArrayList<String> listofone=new ArrayList<>();
            for(j=i;j<arr.length;j++){
                if(!check[j]){
                if(arr[i].length()==arr[j].length() && binary(permute("", arr[i]), arr[j])){
                    listofone.add(arr[j]);
                    check[j]=true;
                }
                }
            }
            outer.add(listofone);
        }
        }
        return outer;
    }
   public static boolean binary(ArrayList<String> list, String target){
        int start=0, end=list.size()-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(target.compareTo(list.get(mid))>0)
            start=mid+1;
            else if(target.compareTo(list.get(mid))<0)
            end=mid-1;
            else return true;
        }
        return false;
    }

    static ArrayList<String> permute(String p, String up){
        ArrayList<String> list=new ArrayList<>();
        if(up.isEmpty()){
        list.add(p);
        return list;
    }
        ArrayList<String> ans=new ArrayList<>();
        for(int i=0; i<=p.length(); i++){
            ans.addAll(permute((p.substring(0,i)+up.charAt(0)+p.substring(i,p.length())), up.substring(1)));
        }
        Collections.sort(ans);
        return ans;
    }
}
