package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SabanaResearch {

    private List<Group> groups;
    private List<Summary> summaries;

    public SabanaResearch(List<Group> groups) {
        this.groups = groups;
        this.summaries = new ArrayList<>();
    }

    public int countOfGroups() {
        return this.groups.size();
    }

    public int countOfSummaries() {
        return this.summaries.size();
    }

    /**
     * Create a summary entry in the current date.
     * - Calculate the count of active projects.
     *
     * @return The new Summary entry.
     */
    public Summary createSummaryEntry() {
        int i = 0, ap = 0;

        for(i = 0; i < groups.size(); i++) {
            if(groups.get(i).countActiveProjects() > 0) {
                ap += groups.get(i).countActiveProjects();
            }
        }

        Summary summary = new Summary(LocalDate.now(), ap);
        return summary;
    }
}
