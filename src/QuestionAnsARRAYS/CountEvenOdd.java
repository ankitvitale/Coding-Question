package QuestionAnsARRAYS;

public class CountEvenOdd {
    public static void main(String[] args) {

        int a[]={1,2,3,4,5,6,7};
        int odd=0,even=0;

        for (int i=0;i<a.length;i++){
            if(i%2==0){
                odd++;
            }else {
                even++;
            }
        }
        System.out.println("Odd no :-"+odd);
        System.out.println("Even no :-"+even);
    }

}
