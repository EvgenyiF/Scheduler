import java.io.Serializable;
import java.time.LocalDate;

public class Job implements Serializable {
    private int id;
    private String jobName;
    private JobPriority jobPriority;
    private LocalDate startDate;
    private String FIO;
    private LocalDate endDate;

    public Job(int id, String jobName, JobPriority jobPriority, LocalDate startDate, String FIO, LocalDate endDate) {
        this.id = id;
        this.jobName = jobName;
        this.jobPriority = jobPriority;
        this.startDate = startDate;
        this.FIO = FIO;
        this.endDate = endDate;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public JobPriority getJobPriority() {
        return jobPriority;
    }

    public void setJobPriority(JobPriority jobPriority) {
        this.jobPriority = jobPriority;
    }

    public LocalDate getLocalDate() {
        return startDate;
    }

    public void setLocalDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
