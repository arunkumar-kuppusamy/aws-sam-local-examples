package example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class GetAllBooks implements RequestHandler<Object, Response> {

    public Response handleRequest(Object name, Context context) {

        return fetchBooks();
    }

    private Response fetchBooks() {
        String bookResponse = "[{\"Name\": \"book1\"," +
                "\"Author\": \"Arvind\"}]";
        return Response.builder().statusCode(200).body(bookResponse).headers(Response.HEADERS_JSON).build();
    }
}