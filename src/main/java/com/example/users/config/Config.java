package com.example.users.config;

import com.example.users.domain.repository.RolePersistentPort;
import com.example.users.domain.service.RoleServicePort;
import com.example.users.domain.useCase.RoleUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public RoleServicePort RoleServicePort(RolePersistentPort roleRepository){
        return new RoleUseCase(roleRepository);
    }
}
