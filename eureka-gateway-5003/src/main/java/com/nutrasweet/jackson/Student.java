package com.nutrasweet.jackson;

import java.util.HashMap;
import java.util.Map;

public class Student {

    private String name;

    Map<String,String> attrMap = new HashMap<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public Map<String, String> getAttrMap() {
        return attrMap;
    }

    public void setAttrMap(Map<String, String> attrMap) {
        this.attrMap=attrMap;
    }
}
