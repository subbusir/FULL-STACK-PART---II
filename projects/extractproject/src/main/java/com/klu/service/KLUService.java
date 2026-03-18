package com.klu.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.klu.model.Headphones;
import com.klu.model.Laptops;
import com.klu.model.Mobiles;
import com.klu.model.Login;
import com.klu.repo.LoginRepo;
import com.klu.repo.HeadphonesRepo;
import com.klu.repo.KLURepo;
import com.klu.repo.MobilesRepo;

@Service
public class KLUService 
{
  @Autowired
  private KLURepo repo;
  
  @Autowired
  private MobilesRepo mobileRepo;
  @Autowired
  private HeadphonesRepo headphoneRepo;
  @Autowired
  private LoginRepo loginRepo;
  
  
  public List<Laptops> getAllLaptops()
  {
    return repo.findAll();  
  }
  
  public List<Mobiles> getAllMobiles()
  {
    return mobileRepo.findAll();
    
  }
  public List<Headphones> getAllHeadphones()
  {
    return headphoneRepo.findAll();
    
  }
  
  
  //@GetMapping("/laptops/{pid}")
  public Optional<Laptops> getLaptopById(Long pid) {
    return repo.findById(pid);
  }
  
  //@GetMapping("/mobiles/{pid}")
  public Optional<Mobiles> getMobileById(Long pid) {
    return mobileRepo.findById(pid);
  }
  //@GetMapping("/headphones/{pid}")
  public Optional<Headphones> getHeadphonesById(Long pid) {
    return headphoneRepo.findById(pid);
  }
  
  

  
  public Login loginByUsername(String username) {
		return loginRepo.findByUsername(username);
	}
	

  
  
}