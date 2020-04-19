package com.sushmita.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sushmita.DAO.LoginDAO;
import com.sushmita.DTO.LoginDTO;

@Service
public class LoginService {

	@Autowired
	LoginDAO loginDao;
    
    public void save(LoginDTO loginDTO) {
    	loginDao.save(loginDTO);
    }
     
    public List<LoginDTO> listAll() {
        return loginDao.findAll();
    }
     
    public LoginDTO get(String id) {
        return loginDao.findById(id).get();
    }
     
    public void delete(String id) {
    	loginDao.deleteById(id);
    }
}
