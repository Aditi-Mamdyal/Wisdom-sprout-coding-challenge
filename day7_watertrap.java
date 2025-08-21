public class day7_watertrap {
    /*public static void main(String[] args) {
        int[] arr={1, 2, 3};
        System.out.println(totwater(arr));
    }*/
    public int totwater(int[] arr){
        int j, i, sum=0, k, maxr, maxl;
        for(i=1;i<arr.length-1;i++){
            maxl=maxr=i;
            for(j=i-1;j>=0;j--){
            if(arr[j]>arr[j+1]){
            if(arr[j]>arr[maxl])
            maxl=j;
            }
            //else 
            //break;
            }
            for(k=i+1;k<arr.length;k++){
            if(arr[k]>arr[k-1]){
                if(arr[k]>arr[maxr])
                maxr=k;
            }
            //else
            //break;
            }
            sum=sum+Math.min(arr[maxl],arr[maxr])-arr[i];
        }
        return sum;
    }
}
