class Advisor extends Person {
    public Advisor(String fullname, String email) {
        super(fullname, email);
    }
    @Override
    public String toString() {
        return String.format("Advisor[%s, Email: %s]", fullname, email);
    }
}
