package com.seisoul.btob_ses.entity;

import lombok.Data;

@Data
public class JobCase {

    private Long id;  // 主键
    /**
     * 案件タイトル
     */
    private String jobCaseTitle;
    /**
     * 案件内容
     */
    private String jobCaseContent;
}
