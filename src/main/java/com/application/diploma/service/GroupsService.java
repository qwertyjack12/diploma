package com.application.diploma.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.application.diploma.entity.Groups;
import com.application.diploma.repository.GroupsRepository;

@Service
public class GroupsService {
    private final GroupsRepository groupsRepository;

    public GroupsService(GroupsRepository groupsRepository) {
        this.groupsRepository = groupsRepository;
    }

    public List<Groups> getAllGroups() {
        return groupsRepository.findAll();
    }

    public Boolean add(Groups group) {
        try {
            groupsRepository.save(group);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public Boolean delete(Groups group) {
        try {
            groupsRepository.delete(group);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
