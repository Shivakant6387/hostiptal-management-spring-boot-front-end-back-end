package com.example.hospitalmanagementsystemspringbootrestapi.config;
import com.example.hospitalmanagementsystemspringbootrestapi.HospitalManagementSystemSpringBootRestApiApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(HospitalManagementSystemSpringBootRestApiApplication.class);
    }

}
