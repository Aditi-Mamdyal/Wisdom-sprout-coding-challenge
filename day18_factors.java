public class day18_factors {
    /*public static void main(String[] args) {
        //System.out.println(findfac(999999999));
        findfac(99999999);
    }*/
    public int findfac(int num){
        int count=2, i;
        for(i=2;i<=num/2;i++){
            if(num%i==0){
            count++;
            }
        }
        return count;
    }
}
