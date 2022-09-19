import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;


public class ReadCsv {

    public void read(ArrayList<Job> a) {
        try {
            File file = new File("db.csv");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            System.out.println();
            while (line != null) {
                System.out.println(line);
                String[] b = line.split(" ");
                JobPriority resalt = switch (b[2]) {
                    case "LOW" -> JobPriority.LOW;
                    case "MEDIUM" -> JobPriority.MEDIUM;
                    case "HiGH" -> JobPriority.HiGH;
                    default -> null;
                };
                Job job = new Job(Integer.parseInt(b[0]), b[1], resalt, LocalDate.parse(b[4]), b[3], LocalDate.parse(b[5]));
                a.add(job);
                line = reader.readLine();
            }
            fr.close();
            System.out.println();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
