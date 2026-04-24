public class EnrollmentCertificate implements Printable, Archivable {
    private final String studentName;
    private final String term;

    public EnrollmentCertificate(String studentName, String term) {
        this.studentName = studentName;
        this.term = term;
    }

    @Override
    public String printDocument() {
        return "Printing enrollment certificate for " + studentName + " (" + term + ")";
    }

    @Override
    public String archiveDocument() {
        return "Archiving enrollment record for " + studentName;
    }
}