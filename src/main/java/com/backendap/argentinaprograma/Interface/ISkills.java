package com.backendap.argentinaprograma.Interface;

import com.backendap.argentinaprograma.Entity.Skills;
import java.util.List;


public interface ISkills {
    
    public List<Skills> getSkills();
     
    public void saveSkills(Skills skills);
     
    public void deleteSkills(Long id);
     
    public Skills findSkills(Long id);
}
