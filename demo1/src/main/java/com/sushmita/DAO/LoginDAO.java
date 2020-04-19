package com.sushmita.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sushmita.DTO.LoginDTO;

@Repository
public interface LoginDAO extends JpaRepository<LoginDTO, String> {
	

}
