package com.application.diploma.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.application.diploma.entity.Groups;
import com.application.diploma.service.GroupsService;

@RestController
public class GroupsController {

    private final GroupsService groupsService;

    public GroupsController(GroupsService groupsService) {
        this.groupsService = groupsService;
    }

    @GetMapping("/groups")
    public List<Groups> getAllGroups() {
        return groupsService.getAllGroups();
    }

    @PostMapping("/groups/add")
    public Boolean add(@RequestBody Groups group) {
        System.out.println("model is " + (group == null ? "nope " : group.getPk_group()));
        return groupsService.add(group);
    }
}
