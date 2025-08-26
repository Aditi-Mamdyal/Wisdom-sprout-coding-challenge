public class day12_parenthese {
    /*public static void main(String[] args) {
        String s="(]";
        System.out.println(check(s));
    }*/
    public boolean check(String str){
        int i=0, j=str.length()-1;
        if(str.length()%2!=0)
        return false;
        while(i<=j){
            boolean check=false;
            if(str.charAt(i)=='('){
                if(str.charAt(j)==')'){
                    check=true;
                    i++;
                    j--;
                }
                else if(str.charAt(i+1)==')' && i<str.length()-2){
                    check=true;
                    i=i+2;
                }
            }
            if(str.charAt(i)=='{'){
                if(str.charAt(j)=='}'){
                    check=true;
                    i++;
                    j--;
                }
                else if(str.charAt(i+1)=='}' && i<str.length()-2){
                    check=true;
                    i=i+2;
                }
            }
            if(str.charAt(i)=='['){
                if(str.charAt(j)==']'){
                    check=true;
                    i++;
                    j--;
                }
                else if(str.charAt(i+1)==']' && i<str.length()-2){
                    check=true;
                    i=i+2;
                }
            }
            if(!check)
            return check;
        }
        return true;
    }

}
