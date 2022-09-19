import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public void menu(ArrayList<Job> job, Scanner in, int currentId) {
        while (true) {
            System.out.println("Выберите действие: ");
            System.out.println("1 - Добавить дело");
            System.out.println("2 - Удалить дело");
            System.out.println("3 - Редактировть");
            System.out.println("4 - Звершить работу");
            int num = in.nextInt();

            switch (num) {
                case 1 -> {
                    System.out.println("Ну что ж начнем: ");
                    AddJob addJob = new AddJob();
                    addJob.addJob(job, currentId, in);
                    SafeCsv safeCsv = new SafeCsv();
                    safeCsv.safe(job);
                    System.out.println();
                    for (Job jobs : job) {
                        System.out.println(jobs.getId() + " " + jobs.getJobName() + " " + jobs.getJobPriority() + " " + jobs.getFIO() + " " + jobs.getLocalDate() + " " + jobs.getEndDate());
                    }
                    System.out.println();
                    break;
                }
                case 2 -> {
                    System.out.println("Введите номер дела: ");
                    num = in.nextInt();
                    DelJob delJob = new DelJob();
                    delJob.delJob(num, job);
                    SafeCsv safeCsv = new SafeCsv();
                    safeCsv.safe(job);
                    System.out.println();
                    for (Job jobs : job) {
                        System.out.println(jobs.getId() + " " + jobs.getJobName() + " " + jobs.getJobPriority() + " " + jobs.getFIO() + " " + jobs.getLocalDate() + " " + jobs.getEndDate());
                    }
                    System.out.println();
                    break;
                }
                case 3 -> {
                    System.out.println("Введите номер дела для редактирвания: ");
                    EditJob editJob = new EditJob();
                    editJob.editJob(job, in);
                    SafeCsv safeCsv = new SafeCsv();
                    safeCsv.safe(job);
                    System.out.println();
                    for (Job jobs : job) {
                        System.out.println(jobs.getId() + " " + jobs.getJobName() + " " + jobs.getJobPriority() + " " + jobs.getFIO() + " " + jobs.getLocalDate() + " " + jobs.getEndDate());
                    }
                    System.out.println();
                    break;
                }
                case 4 -> {
                    System.out.println("С вами приятно было поработать");
                    System.exit(0);
                }
            }

        }
    }
}
