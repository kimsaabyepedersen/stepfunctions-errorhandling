package org.saabye_pedersen.functions;

class ServerUnavailableException extends RuntimeException {

    ServerUnavailableException(String message) {
        super(message);
    }
}
