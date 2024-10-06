package com.seisoul.btob_ses.entity;

import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class JobForm {
    private String title;
    private String location;
    private String codingLanguages;
    private String unitPrice;
    private String tags;
    private String description;
    private ZonedDateTime jobUploadDateTime;
}