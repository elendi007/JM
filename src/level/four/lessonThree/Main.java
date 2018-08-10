package level.four.lessonThree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст:");
        String text = scanner.nextLine();

        String[] keywords = {"плохой", "хороший", "злой"};

        TextAnalyzer[] textAnalyzers = {new SpamAnalyzer(keywords), new NegativeTextAnalyzer(),
                new TooLongTextAnalyzer(30)};

        Process process = new Process();

        System.out.println(process.checkLabels(text, textAnalyzers));
    }
}
