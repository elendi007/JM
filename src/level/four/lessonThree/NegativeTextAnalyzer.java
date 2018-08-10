package level.four.lessonThree;

public class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {
    public NegativeTextAnalyzer() {
    }

    @Override
    protected String[] getKeywords() {
        return new String[]{":(", "=(", ":|"};
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
