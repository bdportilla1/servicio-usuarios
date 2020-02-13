package com.formacionbdi.springboot.app.usuarios.models.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.formacionbdi.springboot.app.usuarios.models.entity.Rol;


@RepositoryRestResource(path="roles")
public interface RolDao extends PagingAndSortingRepository<Rol, Long>  {

}
