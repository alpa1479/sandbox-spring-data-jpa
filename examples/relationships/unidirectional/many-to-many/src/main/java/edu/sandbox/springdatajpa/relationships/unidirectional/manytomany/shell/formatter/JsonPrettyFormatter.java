package edu.sandbox.springdatajpa.relationships.unidirectional.manytomany.shell.formatter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

@Component
public class JsonPrettyFormatter {

    private final ObjectMapper mapper = new ObjectMapper();

    public <T> String format(T object) {
        try {
            return mapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
