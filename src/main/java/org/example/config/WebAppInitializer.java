package org.example.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class WebAppInitializer implements WebApplicationInitializer {

    private static final String DISPATCHER_SERVLET_NAME = "dispatcher";

    @Override
    public void onStartup(javax.servlet.ServletContext servletContext) throws ServletException {

        // Create the Spring Application Context
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(WebConfig.class);

        // Create the Dispatcher Servlet
        DispatcherServlet dispatcherServlet = new DispatcherServlet(context);

        // Register and configure the Dispatcher Servlet
        ServletRegistration.Dynamic registration = servletContext.addServlet(DISPATCHER_SERVLET_NAME, dispatcherServlet);

        registration.setLoadOnStartup(1);
        registration.addMapping("/");



    }
}
