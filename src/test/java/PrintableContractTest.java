import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;

class PrintableContractTest {

    @Test
    void shouldSupportDifferentPrintableImplementations() {
        Printable[] printables = {
                new InternshipLetter("TechCorp"),
                new EnrollmentCertificate("Тимур", "Осінь 2026")
        };

        for (Printable p : printables) {
            assertFalse(p.printDocument().isBlank());
        }
    }
}