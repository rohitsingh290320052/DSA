public class recursion_array {
    public static void main(String[] args) {
        int[] arr={10,1,2,3,5,8};
        int end=arr.length-1;
        int start=0;
        int last=arr.length-1;
        int target=10;
        System.out.println(lastoccur(arr,target,last));
        /* arr=reverse(arr,start,end);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println(sorted(arr,0));*/

    }

    /*static boolean sorted(int arr[], int index){
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && sorted(arr,index+1);
    }*/
   /* static int[] reverse(int arr[],int start,int end){
        if(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            reverse(arr,++start,--end);
        }
        return arr;


    }*/
    static int lastoccur(int arr[], int target, int last){
        if(last<0){
            return -1;
        }
        if(target==arr[last])
            return last;
        return lastoccur(arr,target,last-1);
    }

    }









