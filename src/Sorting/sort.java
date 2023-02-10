package Sorting;

public class sort {
    public void buble(int []a){
        int temp;
       for(int i=0;i<a.length;i++){
           for(int j=0;j<a.length;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
           }
       }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    public void selection(int []a){
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<i;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
                System.out.println(a[i]);
            }
        }
        for (int i=0;i<a.length;i++){
            System.out.println("  "+a[i]);
        }
    }
    public void insertion(int []a){
        int temp;
        for(int i=1;i<a.length;i++){
            int j=i;
            while(j>0 && a[j-1]>a[j]) {
                temp = a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
                j=j-1;
            }
           // System.out.println(temp);
        }
        for (int i=0;i<a.length;i++){
          System.out.println("  "+a[i]);
        }
    }

    public void counting(int []a) {
        int max=0, min=0;

             max = a[0];
             min = a[0];
            for (int j =  1; j < a.length; j++) {
                if (min > a[j]) {
                    min = a[j];
                }
                else if (max < a[j]){
                    max = a[j];
                }
            }
            int []num=new int[max-min+1];
                for (int j:a){
                   num[j-min]++;
                  }
                int k=0;
                   for (int j=0;j<max-min+1;j++){
                       while (num[j]>0)
                       {
                            a[k]=j+min;
                            num[j]--;
                            k++;
                       }

                   }
        for(int i=0;i<num.length;i++){
               System.out.print(num[i]);
            }

    }
}
