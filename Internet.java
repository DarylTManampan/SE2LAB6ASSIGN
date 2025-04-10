public class Internet implements NEULibrary {
    @Override
    public String getTitle() {
        return "Internet Access";
    }

    @Override
    public void borrow(Student student) {
        System.out.println("\nGranting internet access to student: " + student.getStudentNo() + "-" + student.getName());
    }
}