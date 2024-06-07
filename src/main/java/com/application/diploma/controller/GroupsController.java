package com.application.diploma.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
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

    @DeleteMapping("/groups/delete")
    public Boolean delete(@RequestBody Groups group) {
        System.out.println("Deleting is group: " + group.getPk_group());
        return groupsService.delete(group);
    }
}
