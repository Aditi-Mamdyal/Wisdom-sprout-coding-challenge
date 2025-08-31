import java.util.ArrayList;
public class day17_primefac {
    public static void main(String[] args) {
        System.out.println(factors(123456));
    }
    public static ArrayList<Integer> factors(int num){
        ArrayList<Integer> list=new ArrayList<>();
        int i=2;
        while(num>1){
            if(prime(i)){
            while(num%i==0){
                list.add(i);
                num=num/i;
            }
            }
            i++;
        }
        return list;
    }
    public static boolean prime(int n){
        for(int i=2; i<n; i++){
            if(n%i==0)
            return false;
        }
        return true;
    }

}
