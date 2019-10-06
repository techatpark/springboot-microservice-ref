package com.test.bootstarter.annotations;

import com.test.bootstarter.config.SwaggerConfig;
import com.test.bootstarter.controller.BootStarterController;
import org.springframework.context.annotation.Import;
import springfox.documentation.swagger2.configuration.Swagger2DocumentationConfiguration;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import({BootStarterController.class, SwaggerConfig.class})
public @interface EnableMicroservice {

}

