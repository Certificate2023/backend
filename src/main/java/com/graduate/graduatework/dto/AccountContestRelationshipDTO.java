package com.graduate.graduatework.dto;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class AccountContestRelationshipDTO  {
    private Long accountId;
    private Long contestId;
    private Timestamp createdAt;
}
