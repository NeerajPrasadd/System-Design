package designPattern.LLD.behavioural.cor;

public interface SupportHandler {
    void handleRequest(SupportRequest supportRequest);
    void nextHandler(SupportHandler supportHandler);
}
