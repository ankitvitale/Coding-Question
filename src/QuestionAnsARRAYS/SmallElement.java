package QuestionAnsARRAYS;

public class SmallElement {
    public static void main(String[] args) {

        int a[]={5,4,9,3,4,8,2,6};
        int min=a[0];

        for (int i=0;i<a.length;i++){
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println(min);
    }
}
