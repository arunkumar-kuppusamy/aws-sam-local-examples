package example;

import lombok.Builder;
import lombok.Value;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Value
@Builder
public class Response {

    private String body;
    private int statusCode;
    private Map<String, String> headers;
    public static final Map<String, String> HEADERS_JSON = Collections.unmodifiableMap(new HashMap<String, String>() {
        {
            put("Content-Type", "application/json");
        }
    });


}