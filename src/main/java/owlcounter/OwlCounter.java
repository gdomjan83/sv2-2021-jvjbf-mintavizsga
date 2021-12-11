package owlcounter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class OwlCounter {
    private List<String> owls = new ArrayList<>();

    public void readFromFile(Path path) {
        try {
            owls = Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.", ioe);
        }
    }

    public int getNumberOfOwls(String county) {
        for (String line : owls) {
            if (county.equals(extractOwlData(line).getCountyName())) {
                return extractOwlData(line).getOwlNumber();
            }
        }
        throw new IllegalArgumentException("No such county in Hungary!");
    }

    public int getNumberOfAllOwls() {
        int sum = 0;
        for (String line : owls) {
            sum += extractOwlData(line).getOwlNumber();
        }
        return sum;
    }

    private CountyOwlData extractOwlData(String line) {
        String[] data = line.split("=");
        return (new CountyOwlData(data[0], Integer.parseInt(data[1])));
    }
}
