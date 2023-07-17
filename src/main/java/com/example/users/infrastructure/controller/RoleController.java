package com.example.users.infrastructure.controller;

import com.example.users.infrastructure.comun.CrudController;
import com.example.users.infrastructure.dto.RoleDTO;
import com.example.users.infrastructure.handler.RoleHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/roles")
public class RoleController implements CrudController<RoleDTO, Long> {
    private final RoleHandler roleHandler;

    @Override
    public ResponseEntity<RoleDTO> findById(Long aLong) {
        return new ResponseEntity<>(roleHandler.findById(aLong), HttpStatus.ACCEPTED);
    }

    @Override
    public ResponseEntity<List<RoleDTO>> findAll() {

        return new ResponseEntity<>(roleHandler.findAll(),HttpStatus.ACCEPTED);
    }

    @Override
    public ResponseEntity<RoleDTO> save(RoleDTO entity) {
        return new ResponseEntity<>(roleHandler.save(entity),HttpStatus.ACCEPTED);
    }

    @Override
    public ResponseEntity<Void> update(Long aLong, RoleDTO entity) {
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @Override
    public ResponseEntity<Void> delete(Long aLong) {
        return null;
    }
}
