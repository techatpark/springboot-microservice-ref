/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.bootstarter.exception;

/**
 *
 * @author senthilkumar
 */
public class DatabaseNotAvailableException extends SystemException{
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public DatabaseNotAvailableException(String message, Throwable err)
    {
        super(message,err);
    }
    
}
