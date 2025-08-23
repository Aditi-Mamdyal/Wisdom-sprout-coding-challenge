public class day9_prefix {
    /*public static void main(String[] args) {
        String arr[]={"flow", "wer", "forget"};
        System.out.println(findpre(arr));
    }*/
    public String findpre(String[] arr){
        boolean check=true;
        int i=0, j=0, min=0;
        for(i=0;i<arr.length;i++){
        if(arr[min].length()>arr[i].length())
        min=i;
        }
        i=0;
        while(check){
            char ch=arr[min].charAt(i);
            if(ch!=arr[j].charAt(i))
            check=false;
            j++;
            if(j==arr.length && i<arr[min].length() && check==true){
                j=0;
                i++;
            }
        }
        return arr[min].substring(0, i);
    }
}
