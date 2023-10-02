public class Teacher extends People {
    private String subject;
    public Teacher(int id, String name, String sex, String subject){
        super(id, name, sex);
        this.subject = subject;
    }
    @Override
    public String toString(){
        return "Teacher: " + name + "(Subject: " + subject + ")";
    }
}
