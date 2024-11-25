package designPattern.LLD.behavioural.visitor;

/**
 * <Class Name>: Image
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 20/11/24
 */
public class Image implements DocumentElement {
    private String url;

    public Image(String url) {
        this.url = url;
    }

    @Override
    public void accept(DocumentVisitor documentVisitor) {
        documentVisitor.visit(this);
    }

    public String getUrl() {
        return url;
    }
}
