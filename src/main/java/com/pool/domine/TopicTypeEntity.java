package com.pool.domine;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TopicTypeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer topicTypeId;
    private String topicTypeName;
}
