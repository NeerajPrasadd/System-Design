package designPattern.LLD.behavioural.visitor;

public interface DocumentVisitor {
    void visit(Paragraph paragraph);
    void visit(Table table);
    void visit(Image image);
}
