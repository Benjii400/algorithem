public class BinarySearchItrative {
 static int binarySearch(int []a,int item){

     int low = 0;
     int heigh = a.length;

      int mid = (low + heigh)/2;

        for(int i=0;i< a.length;i++){
        if(item<a[mid]) heigh = mid-1;
        else if(item>a[mid]) low = mid+1;
        else if(item==a[mid]) return (mid);
        mid = (low + heigh)/2;
    }
        return -1;
}
static int binarySearchRec(int []a,int item,int heigh,int low){
     if (heigh>=low){
        int mid = (low + heigh)/2;
         if(item<a[mid]) heigh = mid-1;
         else if(item>a[mid]) low = mid+1;
         else if(item==a[mid]) return (mid);
         return binarySearchRec(a,item,heigh,low);
     }
     else  return -1;
}
    public static void main(String[] args) {
        int[] a={1,2,5,6,8,9,11,12,20,1000};
        int item=6;
        int low = 0;
        int heigh = a.length;
       System.out.println(binarySearchRec(a,item,heigh,low));
    }

}