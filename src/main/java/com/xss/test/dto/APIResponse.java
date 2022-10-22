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
    T response;


 public APIResponse(int recordCount,T response){
     this.recordCount=recordCount;
     this.response=response;
 }

    public APIResponse(String providerName, int recordCount,T response) {
     this.providerName=providerName;
        this.recordCount=recordCount;
        this.response=response;
    }
}
