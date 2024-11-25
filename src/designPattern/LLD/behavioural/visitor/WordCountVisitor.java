package designPattern.LLD.behavioural.visitor;

/**
 * <Class Name>: WordCountVisitor
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 20/11/24
 */
public class WordCountVisitor implements DocumentVisitor {
    private int wordCount=0;
    @Override
    public void visit(Paragraph paragraph) {
        wordCount += paragraph.getText().split(" ").length;

    }

    @Override
    public void visit(Table table) {
        wordCount += table.getData().split(" ").length;
    }

    @Override
    public void visit(Image image) {

    }

    public int getWordCount() {
        return wordCount;
    }
}
