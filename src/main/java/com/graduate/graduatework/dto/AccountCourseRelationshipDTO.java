package com.graduate.graduatework.dto;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class AccountCourseRelationshipDTO {
    private Long accountId;
    private Long courseId;
    private Timestamp createdAt;
}
