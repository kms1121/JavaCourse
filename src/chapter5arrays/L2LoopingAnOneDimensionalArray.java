package chapter5arrays;

import java.util.Arrays;

public class L2LoopingAnOneDimensionalArray {
    static void main(String[] args) {
        String[] subjects ={"NSC", "Web", "Mobile", "Eng", "AI"};
//        subjects[0] = subjects[0].toUpperCase();
//        subjects[1] = subjects[1].toUpperCase();
//
//        System.out.println(Arrays.toString(subjects));


//        [While loop]**
//
//        int startpoint = 0;
//        while (startpoint<subjects.length) {
//            subjects[startpoint] = subjects[startpoint].toUpperCase();
//            startpoint++;
//        }
//
//        System.out.println(Arrays.toString(subjects));


        
//        [For i loop] **
//        for (int i = 0; i < subjects.length; i++) {
//            subjects[i] = subjects[i].toUpperCase();
//            System.out.println(subjects[i]);
//        }

//        [For r loop]**
        for (int i = subjects.length - 1; i >= 0; i--) {
            subjects[i] = subjects[i].toUpperCase();
            System.out.println(subjects[i]);
        }
    }
}
