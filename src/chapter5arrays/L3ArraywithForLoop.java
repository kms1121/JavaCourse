package chapter5arrays;

public class L3ArraywithForLoop {
    static void main(String[] args) {
        String[] subjects ={"NSC", "Web", "Mobile", "Eng", "AI"};

        for (String subject : subjects) {
            System.out.println(subject.toLowerCase());
        }
    }
}
