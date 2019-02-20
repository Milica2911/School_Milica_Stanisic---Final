package course;

public class Course {

    private String name, codeName;
    private int numberOfClasses;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setNumberOfClasses(int numberOfClasses) {
        this.numberOfClasses = numberOfClasses;
    }

    public int getNumberOfClasses() {
        return this.numberOfClasses;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public String getCodeName() {
        return this.codeName;
    }

    public Course() {
        this("Software QA", "qa", 32);
    }

    public Course(String newName, String newCodeName, int newNumberOfClasses) {
        this.name = newName;
        this.codeName = newCodeName;
        this.numberOfClasses = newNumberOfClasses;
    }
}
