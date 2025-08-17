public class day3_duplicate
{
    /*public static void main(String[] args) {
        int[] arr={1, 1};
        System.out.println(findup(arr));
    }*/
    static int findup(int[] arr){
        int slow=0, fast=0;
        do { 
            slow=arr[slow];
            fast=arr[arr[fast]];
        } while (slow!=fast);
        slow=0;
        while(slow!=fast){
            slow=arr[slow];
            fast=arr[fast];
        }
        return slow;
    }

}
