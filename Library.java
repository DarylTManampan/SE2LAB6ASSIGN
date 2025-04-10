import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<NEULibrary> resources;

    public Library() {
        resources = new ArrayList<>();
        resources.add(new Book("The Object-Oriented Thought Process by Matt Weisfeld"));
        resources.add(new Journals("Time Capsule Journal"));
        resources.add(new Theses("Introduction to Thesis 1"));
        resources.add(new Capstones("Capstone 1"));
        resources.add(new Internet());
        resources.add(new Newspaper("Philippine Star"));
    }

 
    public List<NEULibrary> getAvailableResources() {
        return resources;
    }
}