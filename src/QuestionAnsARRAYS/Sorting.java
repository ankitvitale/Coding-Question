package QuestionAnsARRAYS;

public class Sorting {
    public static void main(String[] args) {
        int a[]={3,5,1,2,9,7,-5};
        int temp;
        for (int i=0;i<a.length;i++){

            for (int j=i+1;j<a.length;j++){

                if(a[i]>a[j]){
                    temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
            System.out.print(" "+a[i]);


        }

    }
}
