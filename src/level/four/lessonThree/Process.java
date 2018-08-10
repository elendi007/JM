package level.four.lessonThree;

public class Process {

    public Label checkLabels(String text, TextAnalyzer[] analyzers){
        for (TextAnalyzer analyzer: analyzers) {
            if(analyzer.processText(text) != Label.OK) return analyzer.processText(text);
        }
        return Label.OK;
    }
}
