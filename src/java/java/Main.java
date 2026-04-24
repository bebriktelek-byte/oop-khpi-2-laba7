public class Main {
    public static void main(String[] args) {
        EnrollmentCertificate cert = new EnrollmentCertificate("Тимур", "Осінь 2026");

        Printable[] documentsToPrint = {
                cert,
                new InternshipLetter("TechCorp")
        };

        Archivable[] documentsToArchive = {
                cert,
                new TranscriptRequest("ID-98765")
        };

        System.out.println("=== Друк документів ===");
        for (Printable doc : documentsToPrint) {
            System.out.println(doc.printDocument());
        }

        System.out.println("\n=== Архівування документів ===");
        for (Archivable doc : documentsToArchive) {
            System.out.println(doc.archiveDocument());
        }
    }
}