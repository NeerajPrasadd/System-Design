package designPattern.LLD.behavioural.cor;

/**
 * <Class Name>: SupportRequest
 * <p>
 * Description: This class is used for...
 * <p>
 * Created by: neeraj
 * Date: 06/11/24
 */
public class SupportRequest {
    private int severity;
    private String issue;

    public SupportRequest(String issue,int severity) {
        this.severity = severity;
        this.issue = issue;
    }

    public int getSeverity() {
        return severity;
    }

    public String getIssue() {
        return issue;
    }
}
