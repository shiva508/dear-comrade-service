package com.pool.domine;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "TOPIC")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class TopicEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "TOPIC_ID")
    private Integer topicId;
    @Column(name = "TOPIC_NAME")
    private String topicName;
    @Column(name = "TOPIC_TYPE")
    private String topicType;
}
