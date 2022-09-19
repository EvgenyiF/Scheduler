import java.util.ArrayList;

public class DelJob {
    public void delJob(int del, ArrayList<Job> jobs) {
        jobs.remove(del - 1);
        for (int i = del - 1; i < jobs.size(); i++) {
            if (jobs.get(i).getId() != i + 1) {
                jobs.get(i).setId(i + 1);
            }
        }
    }
}
