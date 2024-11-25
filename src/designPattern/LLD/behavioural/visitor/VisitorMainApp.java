package designPattern.LLD.behavioural.visitor;

import java.util.Arrays;

/**
 * <Class Name>: VisitorMainApp
 * <p>
 * Description: refer visitor.md file
 * <p>
 * Created by: neeraj
 * Date: 20/11/24
 */
public class VisitorMainApp {
    public static void main(String[] args) {
        DocumentElement[] elements = {
                new Paragraph("This is the first paragraph."),
                new Table("Table data goes here."),
                new Image("image.jpg")
        };

        DocumentVisitor printVisitor = new PrinterVisitor();
        DocumentVisitor wordCountVisitor = new WordCountVisitor();

        Arrays.asList(elements).forEach(documentElement -> {
            documentElement.accept(printVisitor);
            documentElement.accept(wordCountVisitor);
        });

        System.out.println( ((WordCountVisitor) wordCountVisitor).getWordCount());

    }
}
