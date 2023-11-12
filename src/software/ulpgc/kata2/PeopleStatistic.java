package software.ulpgc.kata2;

import java.util.List;
import java.util.Map;

public interface PeopleStatistic {
    Map<String, Integer> calculate(List<Person> personList);
}
