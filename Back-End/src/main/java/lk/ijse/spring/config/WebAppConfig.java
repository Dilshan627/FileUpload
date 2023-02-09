package lk.ijse.spring.config;

import lk.ijse.spring.advicer.AppWideExceptionHandler;
import lk.ijse.spring.controller.fileUploadController;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan(basePackageClasses = {fileUploadController.class, AppWideExceptionHandler.class})
@EnableWebMvc
public class WebAppConfig {

}
