package QuestionAnsARRAYS;

import java.util.HashSet;
import java.util.Set;

public class DuplicatedRemove {
    public static void main(String[] args) {

        int a[]={1,5,4,1,3,2,6,9,2};

        Set<Integer> num=new HashSet<>();
        for (int i:a){
            num.add(i);
        }
        System.out.println(num);
    }
}
