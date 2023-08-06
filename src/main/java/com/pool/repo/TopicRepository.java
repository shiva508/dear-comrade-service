package com.pool.repo;

import com.pool.domine.TopicEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TopicRepository extends JpaRepository<TopicEntity,Integer> {
    public List<TopicEntity> findByTopicType(String topicType);
}
