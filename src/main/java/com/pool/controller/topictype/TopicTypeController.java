package com.pool.controller.topictype;

import com.pool.domine.TopicTypeEntity;
import com.pool.model.CommonResponse;
import com.pool.service.topictype.TopicTypeService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/topictype")
public class TopicTypeController {

    private final TopicTypeService topicTypeService;

    public TopicTypeController(TopicTypeService topicTypeService) {
        this.topicTypeService = topicTypeService;
    }

    @PostMapping("/save")
    public TopicTypeEntity save(@RequestBody TopicTypeEntity topicTypeEntity){
        return topicTypeService.save(topicTypeEntity);
    }

    @GetMapping("/all")
    public List<TopicTypeEntity> getAll(){
        return topicTypeService.getAll();
    }

    @DeleteMapping("/delete/{topicTypeId}")
    public CommonResponse deleteByTopicTypeId(@PathVariable("topicTypeId") Integer topicTypeId){
        return topicTypeService.deleteByTopicTypeId(topicTypeId);
    }
}
