package com.pool.service.topictype;

import com.pool.domine.TopicTypeEntity;
import com.pool.model.CommonResponse;
import com.pool.model.exception.RecordNotFoundException;
import com.pool.repo.TopicTypeRepository;
import com.pool.utils.DcConstants;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Date;
import java.util.List;

@Service
public class TopicTypeServiceImpl implements TopicTypeService{
    private final TopicTypeRepository topicTypeRepository;

    public TopicTypeServiceImpl(TopicTypeRepository topicTypeRepository) {
        this.topicTypeRepository = topicTypeRepository;
    }

    @Override
    @Transactional
    public TopicTypeEntity save(TopicTypeEntity topicTypeEntity) {
        return topicTypeRepository.saveAndFlush(topicTypeEntity);
    }

    @Override
    @Transactional
    public List<TopicTypeEntity> getAll() {
        return topicTypeRepository.findAll();
    }

    @Override
    public CommonResponse deleteByTopicTypeId(Integer topicTypeId) {
        topicTypeRepository.findById(topicTypeId).ifPresentOrElse(topicTypeRepository::delete,()-> {throw new RecordNotFoundException(DcConstants.TOPIC_TYPE_NOT_FOUND);});
        return  CommonResponse.builder().message(DcConstants.TOPIC_TYPE_DELETED).statusCode(204).timeStamp(new Date()).build();
    }
}
