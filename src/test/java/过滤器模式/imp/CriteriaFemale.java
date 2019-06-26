package 过滤器模式.imp;

import 过滤器模式.Person;
import 过滤器模式.api.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by WJW on 2019/6/26.
 */
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> feMalePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("FEMALE")){
                feMalePersons.add(person);
            }
        }
        return feMalePersons;
    }
}
