package entities;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private String name;
    private List<Project> projects;

    public Group(String name) {
        this.name = name;
        this.projects = new ArrayList<>();
    }

    public void addProject(Project plan) {
        this.projects.add(plan);
    }

    /**
     * Count one if project is true.
     *
     * @return number of projects opens or if the dateEnd is after the system date.
     */

    public int countActiveProjects(){
        int n = 0, i = 0;

        for(i = 0; i < projects.size(); i++) {
            if(projects.get(i).isActive()) {
                n++;
            }
        }

        return n;
    }
}
