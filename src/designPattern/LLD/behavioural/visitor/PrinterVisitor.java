package designPattern.LLD.behavioural.visitor;

/**
 * <Class Name>: PrinterVisitor
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 20/11/24
 */
public class PrinterVisitor implements DocumentVisitor {

    @Override
    public void visit(Paragraph paragraph) {
        System.out.println("Printing Paragraph: " + paragraph.getText());
    }

    @Override
    public void visit(Table table) {
        System.out.println("Printing Table: " + table.getData());
    }

    @Override
    public void visit(Image image) {
        System.out.println("Printing Image: " + image.getUrl());
    }
}
