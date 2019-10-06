/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.bootstarter;

import com.test.bootstarter.controller.BootStarterController;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author senthilkumar
 */
@Configuration
@ConditionalOnClass(BootStarterController.class)
public class BootStarterAutoConfiguration {
    @Bean
    @ConditionalOnMissingBean
    public BootStarterController getController(){

        return new BootStarterController();
    }
}
