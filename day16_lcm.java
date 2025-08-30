public class day16_lcm {
    /*public static void main(String[] args) {
        System.out.println(multiple(510, 92));
        
    }*/
    public static int multiple(int n1, int n2){
        for(int i=Math.max(n1, n2);i<=n1*n2;i=i+Math.max(n1, n2)){
            if(i%n1==0 && i%n2==0)
            return i;
        }
        return -1;
    } 
}
