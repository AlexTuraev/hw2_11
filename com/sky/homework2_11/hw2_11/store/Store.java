package com.sky.homework2_11.hw2_11.store;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Repository
@SessionScope
public class Store {
    private Set<String> listIds;

    public Store() {
        this.listIds = new HashSet<>();
    }

    public void addId(String id) {
        listIds.add(id);
    }

    public List getAllId() {
        List<String> newIdList = new ArrayList<>();
        newIdList.addAll(listIds);
        return newIdList;
    }
}
