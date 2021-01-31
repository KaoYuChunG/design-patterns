package com.principls.compositereuse.commons;

public class FileSystemException extends RuntimeException {
    public FileSystemException() {
        super();
    }

    public FileSystemException(String message) {
        super(message);
    }
}
