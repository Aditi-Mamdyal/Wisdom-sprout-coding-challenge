

public class day8_reversestr {
    /*public static void main(String[] args) {
        String str="The  Ksy    is  blue";
        rev(str);  
    }*/
    public String rev(String str){
        int wh;
        String newstr = "";
        str=str.trim();
        while(str!=""){
            wh=(" "+str.trim()).lastIndexOf(" ");
            newstr=newstr+(str.substring(wh, str.length())).trim()+" ";
            str=str.substring(0, wh);
        }
        return newstr.trim();
    }
}
