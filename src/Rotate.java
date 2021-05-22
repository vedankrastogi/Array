public class Rotate {
    public static void leftRotate(int arr[],int n,int d){

        for(int i=0;i<d;i++){
            int temp=arr[0];
            for(int j=0;j<n-1;j++){
                arr[j]=arr[j+1];

            }
            arr[n-1]=temp;
        }
    }
    public static void printArray(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        Rotate.leftRotate(arr,7,2);
        Rotate.printArray(arr,7);
    }
}
