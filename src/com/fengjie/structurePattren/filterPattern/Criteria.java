package com.fengjie.structurePattren.filterPattern;

import java.util.List;
 
public interface Criteria {
   public List<Person> meetCriteria(List<Person> persons);
}