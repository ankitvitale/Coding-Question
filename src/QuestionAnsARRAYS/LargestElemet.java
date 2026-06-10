package QuestionAnsARRAYS;

public class LargestElemet {
    public static void main(String[] args) {
        int a[] = {1, 5, 9, 2, 6, 5};
        int max = a[0];

        for (int i = 0; i < a.length; i++) {
           if(a[i]>max){
               max=a[i];
           }
        }
        System.out.println(max);

    }
}