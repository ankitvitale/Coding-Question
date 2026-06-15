package QuestionAnsARRAYS;

public class SecondLargeElement {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8};
        int large=Integer.MIN_VALUE;
        int secondLarge=Integer.MIN_VALUE;

        for (int i=0;i<a.length;i++){
            if(a[i]>large){
               secondLarge=large;
               large=a[i];
               

            } else if (a[i]>secondLarge && a[i]!=large) {
                secondLarge=a[i];

                
            }
        }
        System.out.println(secondLarge);
    }
}
