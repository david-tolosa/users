package com.example.users.infrastructure.handler;

import com.example.users.domain.comun.CrudBase;
import com.example.users.domain.servicePort.RoleServicePort;
import com.example.users.infrastructure.dto.RoleDTO;
import com.example.users.infrastructure.mapper.MapperRoleDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class RoleHandler implements CrudBase<RoleDTO,Long> {

    private final MapperRoleDTO mapperRoleDTO;
    private final RoleServicePort roleService;


    @Override
    public RoleDTO findById(Long aLong) {
        return mapperRoleDTO.BToA(roleService.findById(aLong));
    }

    @Override
    public List<RoleDTO> findAll() {
        return mapperRoleDTO.BToA(roleService.findAll().stream()).collect(Collectors.toList());
    }

    @Override
    public RoleDTO save(RoleDTO entity) {
        System.out.println("----------");
        return mapperRoleDTO.BToA(roleService.save(mapperRoleDTO.AToB(entity)));
    }

    @Override
    public void update(RoleDTO entity) {
        roleService.update(mapperRoleDTO.AToB(entity));
    }

    @Override
    public void delete(RoleDTO entity) {
        roleService.delete(mapperRoleDTO.AToB(entity));
    }
}
