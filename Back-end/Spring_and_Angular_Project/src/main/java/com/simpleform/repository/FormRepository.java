package com.simpleform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simpleform.entity.FormEntity;

public interface FormRepository extends JpaRepository<FormEntity, Integer> {

}
