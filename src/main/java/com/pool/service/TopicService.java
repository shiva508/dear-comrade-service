package com.pool.service;

import com.pool.domine.TopicEntity;
import com.pool.model.CommonResponse;

import java.util.List;

public interface TopicService {
    public TopicEntity save(TopicEntity topicEntity);

    public List<TopicEntity> getAll();

    public List<TopicEntity> findByTopicType(String topicType);

    public TopicEntity update(TopicEntity topicEntity);

    public CommonResponse delete(Integer topicId);
}
