package com.principls.compositereuse.primeiro;

public class FileSystemException extends RuntimeException {
    public FileSystemException() {
        super();
    }

    public FileSystemException(String message) {
        super(message);
    }
}
