public class day13_longpalin {
    /*public static void main(String[] args) {
        String str="abab";
        System.out.println(longest(str));
        
    }*/
    public String longest(String str){
        str=str+" ";
        int maxi=0, maxj=0, max=0;
        for(int i=0;i<str.length();i++){
            int j=str.length()-1;
            while(i<=j){
                if(palin(str.substring(i, j))){
                    if(str.substring(i, j).length()>max){
                        max=str.substring(i, j).length();
                        maxi=i;
                        maxj=j;
                    }
                }
                j--;
            }
        }
        return str.substring(maxi, maxj);
    }
    public boolean palin(String str){
        int i=0, j=str.length()-1;
        while(i<=j){
            boolean check=false;
            if(str.charAt(i)==str.charAt(j))
            check=true;
            i++;
            j--;
            if(!check)
            return check;
        }
        return true;
    }

}
