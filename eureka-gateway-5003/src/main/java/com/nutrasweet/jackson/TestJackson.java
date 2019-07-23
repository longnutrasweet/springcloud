package com.nutrasweet.jackson;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class TestJackson {

    public static void main(String[] args) throws IOException {
        Teacher teacher = new Teacher();
        teacher.setName("aaa");
        Student student = new Student();
        student.setName("bbb");
        student.getAttrMap().put("age","11");
        teacher.getStudents().add(student);


        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(teacher);
        Map tragetTeacher = objectMapper.readValue(json, Map.class);


        //流式api
        JsonFactory jsonFactory = new JsonFactory();
        JsonGenerator generator=jsonFactory.createGenerator(new File("e://test.json"),JsonEncoding.UTF8);
        generator.writeStartObject();
        generator.writeStringField("name","333");
        generator.writeEndObject();
        generator.close();
    }
}
