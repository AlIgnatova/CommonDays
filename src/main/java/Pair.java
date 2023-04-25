import java.util.ArrayList;
import java.util.List;

public class Pair {
    private String firstEmpl;
    private String secondEmpl;
    private List<Project> projects;
    private int workedDays;

    public Pair(String firstEmpl, String secondEmpl, int workedDays) {
        this.firstEmpl = firstEmpl;
        this.secondEmpl = secondEmpl;
        this.projects = new ArrayList<>();
        this.workedDays = workedDays;
    }

    public String getFirstEmpl() {
        return firstEmpl;
    }

    public String getSecondEmpl() {
        return secondEmpl;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public int getWorkedDays() {
        return workedDays;
    }

    private void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    private void setWorkedDays(int workedDays) {
        this.workedDays = workedDays;
    }

    public void updateDays (int workedDays){
        setWorkedDays(this.workedDays+workedDays);
    }

    public void updateProjectsList (Project project){
        List<Project> tempList = new ArrayList<>(this.projects);
        tempList.add(project);
        setProjects(tempList);
    }
}
