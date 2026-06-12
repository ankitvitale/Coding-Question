package QuestionAnsARRAYS;

public class ArraysSum {
    public static void main(String[] args) {
        int a[]={10,5,21,84,6,4};

        int sum=0;
        int avg=0;
        for (int i=0;i< a.length;i++){
             sum=sum+a[i];
        }
        System.out.println(sum);

        avg=sum/a.length ;
        System.out.println(avg);
    }
}
