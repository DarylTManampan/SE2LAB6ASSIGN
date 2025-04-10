public class Book implements NEULibrary {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void borrow(Student student) {
        System.out.println("\nStudent " + student.getStudentNo() + "-" + student.getName() + " borrowed the book '" + title + "'");
    }
}