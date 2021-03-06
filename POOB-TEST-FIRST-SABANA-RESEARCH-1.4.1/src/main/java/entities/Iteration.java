package entities;

import java.util.ArrayList;
import java.util.List;

public class Iteration {

    private String goal;
    private Project project;
    private List<Activity> activities;

    public Iteration(String goal, Project project) {
        this.goal = goal;
        this.project = project;
        this.activities = new ArrayList<>();

        project.addIteration(this);
    }

    public void addActivity(Activity activity) {
        this.activities.add(activity);
    }

    /**
     * Count one if activity is true.
     *
     * @return number of activities opens or pendings.
     */

    public boolean countOpenActivities() {
        boolean result = false;
        int i = 0;

        for(i = 0; i < activities.size(); i++) {
            if(activities.get(i).isActive()) {
                result = true;
            }
        }

        return result;
    }

}
