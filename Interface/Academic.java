public class Academic implements IWorker{

    private String nameSurname, faculty, duties; 

    @Override
    public void enter(){
        System.out.println("Entered!");
    }
    @Override
    public void leave(){
        System.out.println("Leaved!");
    }
    @Override
    public void dinner(int hour){
        System.out.println("Dinner Time!");
    }
    public String getDuties() {
        return duties;
    }
    public String getFaculty() {
        return faculty;
    }
    public String getNameSurname() {
        return nameSurname;
    }
    public void setDuties(String duties) {
        this.duties = duties;
    }
    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    } 
}
