package com.example.users.config;

import com.example.users.domain.repositoryPort.RolePersistentPort;
import com.example.users.domain.servicePort.RoleServicePort;
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
