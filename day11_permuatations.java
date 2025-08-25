import java.util.ArrayList;

public class day11_permuatations {
    /*public static void main(String[] args) {
        String str="abcde";
        System.out.println(permute("", str));
    }*/
    public ArrayList<String> permute(String p, String up){
        ArrayList<String> list=new ArrayList<>();
        if(up.isEmpty()){
        list.add(p);
        return list;
    }
        ArrayList<String> ans=new ArrayList<>();
        for(int i=0; i<=p.length(); i++){
            ans.addAll(permute((p.substring(0,i)+up.charAt(0)+p.substring(i,p.length())), up.substring(1)));
        }
        return ans;
    }
}
