package com.example.interceptor.config;


import com.example.interceptor.annotation.Auth;
import com.example.interceptor.interceptor.AuthInterceptor;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@RequiredArgsConstructor
public class MvcConfig implements WebMvcConfigurer {

    private final AuthInterceptor authInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        /**
            내가 원하는 Path에만 인터셉트를 동작시키려면 어떻게 해야할까?
        **/
        registry.addInterceptor(authInterceptor);
    }
}
