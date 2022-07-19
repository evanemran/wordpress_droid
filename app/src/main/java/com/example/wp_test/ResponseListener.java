package com.example.wp_test;

public interface ResponseListener<T> {
    void didFetch(T response, String message);
    void didError(String message);
}
