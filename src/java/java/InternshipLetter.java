public class InternshipLetter implements Printable {
    private final String companyName;

    public InternshipLetter(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String printDocument() {
        return "Printing internship letter for company: " + companyName;
    }
}