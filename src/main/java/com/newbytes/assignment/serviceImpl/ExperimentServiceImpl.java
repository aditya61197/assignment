package com.newbytes.assignment.serviceImpl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.newbytes.assignment.service.ExperimentService;
@Service
public class ExperimentServiceImpl implements ExperimentService{

    @Override
    public Map<String, String> dicideVariant(Integer userId) {
        Map<String, String> map = new HashMap<String, String>();
        if (userId != null) {
            int range = Math.abs(userId.hashCode()) % 100;
            if(range<50){
                map.put("userId", String.valueOf(userId));
                map.put("variant", "Variant_A");
            }else{
                map.put("userId", String.valueOf(userId));
                map.put("variant", "Variant_B");
            }
        }
       
        return map;
    }

}
