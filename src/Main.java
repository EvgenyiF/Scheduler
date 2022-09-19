import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    static int currentId = 0;

    public static void main(String[] args) throws IOException {
        ArrayList<Job> jobs = new ArrayList<>();


        Scanner in = new Scanner(System.in);
        ReadCsv readCsv = new ReadCsv();
        readCsv.read(jobs);
        if (jobs.isEmpty()) {
            System.out.println("Пока у нас пусто))): ");
            AddJob addJob = new AddJob();
            addJob.addJob(jobs, currentId, in);
        }
        currentId = jobs.get(jobs.size() - 1).getId();
        Menu menu = new Menu();
        menu.menu(jobs, in, currentId);
    }
}
