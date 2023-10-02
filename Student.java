public class Student extends People{
    private String selectedSubject;
    public Student(int id, String name, String sex){
        super(id,name,sex);
        this.selectedSubject = "";
    }
    
    public void selectSubject(String subject){
        this.selectedSubject = subject;
    }

    public String getSelectedSubject(){
        return selectedSubject;
    }

    @Override
    public String toString(){
        return "Student: " + name + " (Selected Subject: " + selectedSubject + ")";
    
    }

}
