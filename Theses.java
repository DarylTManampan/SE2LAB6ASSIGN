public class Theses implements NEULibrary{
    private String title;

    public Theses(String title) {
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void borrow(Student student) {
        System.out.println("\n" +  title + " is borrowed by student " + student.getStudentNo() + "-" + student.getName());
    }
}