package com.xss.test.dto;

import com.xss.test.entity.UserProvider;
import com.xss.test.entity.Users;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
//@AllArgsConstructor
@NoArgsConstructor

public class APIResponse<T>{
    String providerName;
    int recordCount;


}
