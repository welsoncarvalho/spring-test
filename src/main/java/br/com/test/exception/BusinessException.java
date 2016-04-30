package br.com.test.exception;

/**
 * Created by welson on 30/04/16.
 */
public class BusinessException extends RuntimeException {

    public BusinessException(String message) {
        super(message);
    }

}
