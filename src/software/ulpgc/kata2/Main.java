package software.ulpgc.kata2;

import java.io.File;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        List<Person> people = CsvFilePersonLoader.with(new File("people-10000.csv")).load();

        PeopleStatistic statistic = new SexPeopleStatistic();

        Map<String, Integer> map = statistic.calculate(people);
        for (String key : map.keySet()) System.out.println("Total " + key + "s = " + map.get(key));
    }
}
