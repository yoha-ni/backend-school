package org.example.annotation.general.suppersswarnings;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "rawtypes", "unused"})
public class SuppressWarningsExample {

    public void something(){
        List list = new ArrayList();
        list.add("data");
        System.out.println(list.get(0));
    }
}
