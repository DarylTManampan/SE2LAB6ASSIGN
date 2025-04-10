public class Journals implements NEULibrary {
    private String title;

    public Journals(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void borrow(Student student) {
        System.out.println("\nStudent " + student.getStudentNo() + "-" + student.getName() + " borrowed the " + title);
    }
}