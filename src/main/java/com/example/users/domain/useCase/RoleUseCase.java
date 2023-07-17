package com.example.users.domain.useCase;

import com.example.users.domain.model.Role;
import com.example.users.domain.repositoryPort.RolePersistentPort;
import com.example.users.domain.servicePort.RoleServicePort;
import lombok.RequiredArgsConstructor;

import java.util.List;
@RequiredArgsConstructor
public class RoleUseCase implements RoleServicePort {

    private final RolePersistentPort roleRepository;
    @Override
    public Role findById(Long aLong) {
        return roleRepository.findById(aLong);
    }

    @Override
    public List<Role> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public Role save(Role entity) {
        return roleRepository.save(entity);
    }

    @Override
    public void update(Role entity) {
        if(roleRepository.findById(entity.getId())!=null){
            roleRepository.save(entity);
        }
    }

    @Override
    public void delete(Role entity) {
        roleRepository.delete(entity);
    }
}
