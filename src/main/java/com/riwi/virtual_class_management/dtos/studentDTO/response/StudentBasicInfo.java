package com.riwi.virtual_class_management.dtos.studentDTO.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class StudentBasicInfo {
    private String name;
    private String email;
    private List<String> classes;
}
