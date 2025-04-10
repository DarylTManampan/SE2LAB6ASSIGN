import java.util.List;

public class TestProgram {
    public static void main(String[] args) {
        Library library = new Library();
        Student student = new Student("711", "Seeven Evelyn");
        Borrower borrower = new Borrower();

        List<NEULibrary> availableResources = library.getAvailableResources();
        for (NEULibrary resource : availableResources) {
            borrower.borrowResource(resource, student);
        }
    }
}