/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.tracker;

import com.test.bootstarter.annotations.EnableMicroservice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableMicroservice
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
