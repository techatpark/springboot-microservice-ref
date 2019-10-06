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
public class ObjectNotFoundException extends BusinessObjectException{
    
    public ObjectNotFoundException(String message, Throwable err)
    {
        super(message, err);
    }
    
}
