class Student extends Person {
    private String ID;

    public Student(String fullname, String ID, String email) {
        super(fullname, email);
        this.ID = ID;
    }

    public String getID() { return ID; }

    @Override
    public String toString() {
        return String.format("Student[%s, ID: %s, Email: %s]", fullname, ID, email);
    }
}