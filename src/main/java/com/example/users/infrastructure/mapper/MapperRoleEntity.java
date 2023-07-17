package com.example.users.infrastructure.mapper;

import com.example.users.domain.model.Role;
import com.example.users.infrastructure.comun.MapperBase;
import com.example.users.infrastructure.persistence.entity.RoleEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapperRoleEntity extends MapperBase<RoleEntity, Role> {
}
