package com.pool.service.topictype;

import com.pool.domine.TopicTypeEntity;
import com.pool.model.CommonResponse;

import java.util.List;

public interface TopicTypeService {
    public TopicTypeEntity save(TopicTypeEntity topicTypeEntity);

    public List<TopicTypeEntity> getAll();

    public CommonResponse deleteByTopicTypeId(Integer topicTypeId);
}
