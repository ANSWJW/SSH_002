package _08_过滤器模式.imp;

import _08_过滤器模式.Person;
import _08_过滤器模式.api.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by WJW on 2019/6/26.
 */
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
