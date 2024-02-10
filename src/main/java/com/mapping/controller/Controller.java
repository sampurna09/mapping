package com.mapping.controller;

import com.mapping.ParentReposioty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @Autowired
    private ParentReposioty parentReposioty;
    @PostMapping(value = "/save")
    public String save(@RequestBody Parent parent){
    if (parent.getId()==0){
        parent.setName("new");
        for (Child child : parent.getChildren()) {
            child.setParent(parent);
        }
        parentReposioty.save(parent);
        return "successfully created";
    }else{
        parent.setName("old");
        for (Child child : parent.getChildren()) {
            child.setParent(parent);
        }
        parentReposioty.save(parent);
        return "successfully saved";
    }
    }
}
