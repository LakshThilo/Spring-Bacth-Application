package com.lak.batch_api.batch;

import com.lak.batch_api.model.Person;
import org.springframework.batch.item.ItemProcessor;

import java.util.HashMap;
import java.util.Map;

public class PersonItemProcessor implements ItemProcessor<Person, Person> {

    private static final Map<String, String> DEPT_NAMES= new HashMap<>();

    public PersonItemProcessor() {

        DEPT_NAMES.put("001","Technology");
        DEPT_NAMES.put("002","Operation");
        DEPT_NAMES.put("003","Accounts");
    }

    @Override
    public Person process(Person person) throws Exception {

        String deptCode = person.getDept();
        String dept = DEPT_NAMES.get(deptCode);
        person.setDept(dept);
        System.out.println(String.format("Convert from [%s] to [%s]", deptCode,dept));
        return person;
    }
}
