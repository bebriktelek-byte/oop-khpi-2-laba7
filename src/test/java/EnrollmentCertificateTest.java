import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class EnrollmentCertificateTest {

    @Test
    void shouldImplementBothInterfacesCorrectly() {
        EnrollmentCertificate cert = new EnrollmentCertificate("Тимур", "Осінь 2026");

        assertTrue(cert.printDocument().contains("Тимур"));
        assertTrue(cert.archiveDocument().contains("Тимур"));
    }
}