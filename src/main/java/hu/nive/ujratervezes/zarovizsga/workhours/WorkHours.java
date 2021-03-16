package hu.nive.ujratervezes.zarovizsga.workhours;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class WorkHours {

    public String minWork(String file) {
        List<String> minWorkS = new ArrayList<>();
        List<Worker> workerList = new ArrayList<>();
        Set<String> workersSet=new HashSet();
        Path file1 = Path.of(file);
        try (BufferedReader reader = Files.newBufferedReader(file1)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String lineArr[] = line.split(",");
                workerList.add(new Worker(lineArr[0],Integer.parseInt(lineArr[1]),lineArr[2]));
            }

            Collections.sort(workerList, new Comparator<Worker>() {
                @Override
                public int compare(Worker o1, Worker o2) {
                    return  o1.getWorkHours()-o2.getWorkHours();
                }
            });
            return workerList.get(0).getName()+": "+workerList.get(0).getWorkDay();

        } catch ( IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    //return null;
    }


}
