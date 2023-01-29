package projectbusan.gongda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projectbusan.gongda.domain.Group;
import projectbusan.gongda.service.GroupService;

@RestController
public class GroupController {
    private final GroupService groupService;

    @Autowired
    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }

    @PostMapping("/users/group-create")
    public ResponseEntity<Group> create(@RequestBody GroupCreateForm form){
        Group group =new Group();
        group.setName(form.getName());
        group.setPassword(form.getPassword());
        return ResponseEntity.ok(groupService.createGroup(group));
    }


    @GetMapping("/users/groups")
    public GroupListStr groups(){
        grouplist=groupService.
    }


}
