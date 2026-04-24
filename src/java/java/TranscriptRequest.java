public class TranscriptRequest implements Archivable {
    private final String studentId;

    public TranscriptRequest(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String archiveDocument() {
        return "Archiving transcript request for student ID: " + studentId;
    }
}