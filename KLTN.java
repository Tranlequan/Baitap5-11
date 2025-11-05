class KLTN<T extends Student, V extends Person> {
    private T student;
    private V advisor;
    private String topic;

    public KLTN(T student, V advisor, String topic) {
        this.student = student;
        this.advisor = advisor;
        this.topic = topic;
    }

    public T getStudent() { return student; }
    public V getAdvisor() { return advisor; }
    public String getTopic() { return topic; }

    @Override
    public String Topic() {
        return "KLTN: \"" + topic + "\"\n  " + student + "\n  Hướng dẫn: " + advisor + "\n";
    }
}