package com.student.service.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import com.student.service.model.Student;

@Configuration
@EnableConfigurationProperties({ Student.class })
public class AppConfiguration {

}
