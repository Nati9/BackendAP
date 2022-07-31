package com.backendap.argentinaprograma.Service;

import com.backendap.argentinaprograma.Entity.Skills;
import com.backendap.argentinaprograma.Interface.ISkills;
import com.backendap.argentinaprograma.Repository.RSkills;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SSkills implements ISkills{
    @Autowired
    RSkills rSkills;
    
    
    @Override
    public List<Skills> getSkills(){
        return rSkills.findAll();
    }
    
    @Override
    public Skills findSkills(Long id){
       Skills skills = rSkills.findById(id).orElse(null);
        return skills;
    }
   
   @Override
   public void saveSkills(Skills skills){
       rSkills.save(skills);
   }
   
   @Override
   public void deleteSkills(Long id){
       rSkills.deleteById(id);
   }
  
   
 
}
