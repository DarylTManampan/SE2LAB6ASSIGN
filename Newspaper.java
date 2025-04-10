public class Newspaper implements NEULibrary {
    private String title;

    public Newspaper(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void borrow(Student student) {
        System.out.println("\nStudent " + student.getStudentNo() + "-" + student.getName() + " borrowed " + title + " newspaper");
    }
}