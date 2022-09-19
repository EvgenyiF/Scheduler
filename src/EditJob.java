import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class EditJob {
    public void editJob(ArrayList<Job> jobs, Scanner in) {
        System.out.println("Выберите какое дело хотите поменять: ");
        for (Job job : jobs) {
            System.out.println(job.getId() + " " + job.getJobName() + " " + job.getJobPriority() + " " + job.getFIO() + " " + job.getLocalDate() + " " + job.getEndDate());
        }
        int numJob = in.nextInt();
        in.nextLine();
        System.out.println("Выберите что хотите поменять: ");
        System.out.println("1 - Название дела");
        System.out.println("2 - Приоритет");
        System.out.println("3 - ФИО");
        System.out.println("4 - Дата начала");
        System.out.println("5 - Дата завершения");
        int num = in.nextInt();

        switch (num) {
            case 1 -> {
                in.nextLine();
                System.out.print("Введите название дела: ");
                jobs.get(numJob-1).setJobName(in.nextLine());
            }
            case 2 -> {
                System.out.println("Выбирите приоритет:");
                System.out.println("1 - Низкий");
                System.out.println("2 - Средний");
                System.out.println("3 - Высокий");
                int prioritet = in.nextInt();
                JobPriority resalt = switch (prioritet) {
                    case 1 -> JobPriority.LOW;
                    case 2 -> JobPriority.MEDIUM;
                    case 3 -> JobPriority.HiGH;
                    default -> throw new IllegalStateException("Unexpected value: " + prioritet);
                };
                jobs.get(numJob-1).setJobPriority(resalt);
            }
            case 3 -> {
                in.nextLine();
                System.out.print("Введите Фамилию: ");
                jobs.get(numJob-1).setFIO(in.nextLine());
            }
            case 4 -> {
                System.out.print("Введите дату начала в формате гггг-мм-дд: ");
                LocalDate startDate = LocalDate.parse(in.nextLine());
                jobs.get(numJob-1).setLocalDate(startDate);
            }
            case 5 -> {
                System.out.print("Введите дату окончания в формате гггг-мм-дд: ");
                LocalDate endDay = LocalDate.parse(in.nextLine());
                jobs.get(numJob-1).setEndDate(endDay);
            }
        }

    }
}
