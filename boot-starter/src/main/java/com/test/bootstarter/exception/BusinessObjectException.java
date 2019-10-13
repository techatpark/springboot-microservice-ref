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
public class BusinessObjectException extends Exception {
    
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public BusinessObjectException(String message, Throwable err)
    {
        super(message, err);
    }
}
