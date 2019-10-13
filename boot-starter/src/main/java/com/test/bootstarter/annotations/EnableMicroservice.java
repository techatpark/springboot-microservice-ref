package com.test.bootstarter.annotations;

import com.test.bootstarter.config.SwaggerConfig;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import({SwaggerConfig.class})
public @interface EnableMicroservice {

}

