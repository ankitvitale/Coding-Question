package QuestionAnsARRAYS;

public class ShiftZero {
    public static void main(String[] args) {
        int a[]={1,2,0,1,2,0,1};

        int index=0;
        for (int i=0;i<a.length;i++){
            if(a[i]!=0){
                int temp=a[i];
                a[i]=a[index];
                a[index]=temp;
                index++;
            }
        }
        for (int i:a){
            System.out.println(i);
        }
    }
}
