import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class AddJob {
    public void addJob(ArrayList<Job> jobs, int idcurrent, Scanner in) {

        System.out.println("Введите количество дел, которые хотите добавить: ");
        int size = in.nextInt();
        in.nextLine();
        for (int i = 0; i < size; i++) {
            idcurrent++;
            System.out.println("Поехали... ");
            System.out.print("Введите название: ");
            String jobName = in.nextLine();
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
            in.nextLine();
            System.out.print("Введите Фамилию: ");
            String FIO = in.nextLine();
            System.out.print("Введите дату начала в формате гггг-мм-дд: ");
            LocalDate startDate = LocalDate.parse(in.nextLine());
            System.out.print("Введите дату окончания в формате гггг-мм-дд: ");
            LocalDate endDay = LocalDate.parse(in.nextLine());

            Job job = new Job(idcurrent, jobName, resalt, startDate, FIO, endDay);
            jobs.add(job);
        }

    }
}

