public class day4_mergearr{
    /*public static void main(String[] args) {
        int[] arr1={1, 3, 5, 7, 9};
        int[] arr2={2, 4, 6, 8, 10};
        merge(arr1, arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }*/
    static void merge(int[] arr1, int[] arr2){
        int i=0, j=0, m=arr1.length, n=arr2.length, gap=0, temp=0;
            gap=(int)Math.ceil((m+n)/2);
            while(gap>0){
                i=0;
                j=gap;
                while(j<(m+n)){
                if(i<m && j<m){
                    if(arr1[j]<arr1[i]){
                        temp=arr1[i];
                        arr1[i]=arr1[j];
                        arr1[j]=temp;
                    } 
                }
                else if(i<m && j>=m){
                    if(arr2[j-m]<arr1[i]){
                        temp=arr1[i];
                        arr1[i]=arr2[j-m];
                        arr2[j-m]=temp;}
                }
                else {
                    if(arr2[j-m]<arr2[i-m]){
                        temp=arr2[i-m];
                        arr2[i-m]=arr2[j-m];
                        arr2[j-m]=temp;}
                }
                i++; j++;
            }
                if((gap/2)<1)
                break;
                gap=(int)(Math.ceil(gap/2.0));
            }
        }
    }