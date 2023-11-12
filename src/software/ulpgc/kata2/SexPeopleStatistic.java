package software.ulpgc.kata2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SexPeopleStatistic implements PeopleStatistic{
    @Override
    public Map<String, Integer> calculate(List<Person> personList) {
        Map<String, Integer> result = new HashMap<>();
        for (Person person: personList){
            String key = person.sex();
            result.put(key, result.getOrDefault(key, 0) + 1);
        }
        return result;
    }
}
