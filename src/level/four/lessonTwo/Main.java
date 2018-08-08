package level.four.lessonTwo;

public class Main {
    public static void main(String[] args){
        byte[] sequence = {48,49,50,51,52,53,54,55};
        AsciiCharSequence asciiCharSequence = new AsciiCharSequence(sequence);

        System.out.println(asciiCharSequence.subSequence(0,3));
    }
}
