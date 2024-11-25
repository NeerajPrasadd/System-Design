package designPattern.LLD.behavioural.visitor;

/**
 * <Class Name>: Paragraph
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 20/11/24
 */
public class Paragraph implements DocumentElement {
    private String text;

    public Paragraph(String text) {
        this.text = text;
    }

    @Override
    public void accept(DocumentVisitor documentVisitor) {
        documentVisitor.visit(this);
    }

    public String getText() {
        return text;
    }
}
