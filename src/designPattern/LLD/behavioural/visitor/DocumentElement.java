package designPattern.LLD.behavioural.visitor;

public interface DocumentElement {
    void accept(DocumentVisitor documentVisitor);
}
