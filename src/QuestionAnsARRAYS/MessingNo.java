package QuestionAnsARRAYS;

public class MessingNo {
    public static void main(String[] args) {

        int no[]={1,2,3,4,6,8,10};


        for (int i=0;i<no.length-1;i++){

            int current=no[i];
            int next=no[i+1];

            while (next-current>1){
                current++;
                System.out.println(current);
            }
        }
    }
}
