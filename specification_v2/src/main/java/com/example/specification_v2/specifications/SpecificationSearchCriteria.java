package com.example.specification_v2.specifications;

import lombok.Data;

@Data
public class SpecificationSearchCriteria {
    private String key;
    private SearchOperation searchOperation;
    private Object value;
    private boolean orPredicate;
}
