package designPattern.LLD.behavioural.visitor;

/**
 * <Class Name>: Table
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 20/11/24
 */
public class Table implements DocumentElement {
    private String data;

    public Table(String data) {
        this.data = data;
    }

    @Override
    public void accept(DocumentVisitor documentVisitor) {
        documentVisitor.visit(this);
    }

    public String getData() {
        return data;
    }
}
