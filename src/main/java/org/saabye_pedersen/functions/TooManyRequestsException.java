package org.saabye_pedersen.functions;

class TooManyRequestsException extends  RuntimeException {

     TooManyRequestsException(String message) {
        super(message);
    }
}
