public class day2_cyclicsort 
{
    /*public static void main(String[] args) {
        int[] arr={1};
        System.out.println(missing(arr));
    }*/
    static int missing(int[] arr){
        int index, i=0;
        while(i<arr.length){
            index=arr[i]-1;
            if(index<arr.length && arr[i]!=arr[index])
            swap(arr, i, index);
            else i++;
        }

        for(i=0;i<arr.length;i++){
            if(arr[i]-1!=i)
            return i+1;
        }
        return i+1;
    }

    private static void swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
