import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

public class SafeCsv {
    public void safe(ArrayList<Job> a) {
        try {

            FileWriter fw = new FileWriter("db.csv",false);
            for (Job job : a) {
                fw.write(job.getId() + " " + job.getJobName() + " " + job.getJobPriority() + " " + job.getFIO() + " " + job.getLocalDate() + " " + job.getEndDate() + "\n");
            }
            fw.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "I cannot create that file");
        }
    }
}
