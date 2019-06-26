package 过滤器模式.api;

import 过滤器模式.Person;

import java.util.List;

/**
 * Created by WJW on 2019/6/26.
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
