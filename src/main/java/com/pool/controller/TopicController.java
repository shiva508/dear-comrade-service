package com.pool.controller;

import com.pool.domine.TopicEntity;
import com.pool.model.CommonResponse;
import com.pool.service.TopicService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/topic")
public class TopicController {
    private final TopicService topicService;

    public TopicController(TopicService topicService) {
        this.topicService = topicService;
    }

    @PostMapping("/save")
    public TopicEntity save(@RequestBody TopicEntity topicEntity){
        return  topicService.save(topicEntity);
    }

    @GetMapping("/all")
    public ResponseEntity<List<TopicEntity>>  getAll(){
        List<TopicEntity> entityList = topicService.getAll();
        return new ResponseEntity<>(entityList, HttpStatus.OK);
    }

    @GetMapping("/topictype/{topicType}")
    public List<TopicEntity> findByTopicType(@PathVariable("topicType") String topicType){
        return topicService.findByTopicType(topicType);
    }

    @PutMapping("/update")
    public TopicEntity update(TopicEntity topicEntity){
        return topicService.update(topicEntity);
    }

    @DeleteMapping("/delete")
    public CommonResponse delete(@RequestParam("topicId") Integer topicId){
        return topicService.delete(topicId);
    }
}
