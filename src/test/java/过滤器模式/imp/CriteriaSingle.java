package 过滤器模式.imp;

import 过滤器模式.Person;
import 过滤器模式.api.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by WJW on 2019/6/26.
 */
public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
