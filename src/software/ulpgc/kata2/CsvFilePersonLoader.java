package software.ulpgc.kata2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CsvFilePersonLoader implements PersonLoader{

    private final File file;

    public static PersonLoader with(File file){
        return new CsvFilePersonLoader(file);
    }

    private CsvFilePersonLoader(File file){
        this.file = file;
    }

    @Override
    public List<Person> load() {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            return load(reader);

        }catch (IOException e){
            return Collections.emptyList()
        }
    }

    private List<Person> load(BufferedReader reader)  throws IOException{
        List<Person> result = new ArrayList<>();
        reader.readLine();
        while (true){
            String line = reader.readLine();
            if (line == null) return result;
            result.add(toPerson(line));
        }
    }

    private Person toPerson(String line) {
        return toPerson(line.split(","));
    }

    private Person toPerson(String[] split) {
        return new Person(
                Integer.parseInt(split[0]),
                split[1],
                split[2],
                split[3],
                split[4],
                split[5],
                split[6],
                split[7],
                split[8]
        );
    }
}
