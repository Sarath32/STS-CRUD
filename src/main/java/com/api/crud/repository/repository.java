package com.api.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.crud.entity.staffdetails;

@Repository
public interface repository extends JpaRepository<staffdetails, Long>{

}
