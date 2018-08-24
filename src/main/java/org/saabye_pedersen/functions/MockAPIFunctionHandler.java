package org.saabye_pedersen.functions;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

/**
 * Handler for requests to Lambda function.
 */
public class MockAPIFunctionHandler implements RequestHandler<MockAPIFunctionInput, String> {

    public String handleRequest(MockAPIFunctionInput mockAPIFunctionInput, Context context) {
        switch (mockAPIFunctionInput.getStatuscode()) {
            case "429":
                throw new TooManyRequestsException("429 Too Many Requests");
            case "503":
                throw new ServerUnavailableException("503 Server Unavailable");
            case "200":
                return "200 OK";
            default:
                throw new UnknownException("Unknown error");
        }
    }
}
