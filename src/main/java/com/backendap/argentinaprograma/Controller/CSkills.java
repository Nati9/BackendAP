package com.backendap.argentinaprograma.Controller;

import com.backendap.argentinaprograma.Entity.Skills;
import com.backendap.argentinaprograma.Service.SSkills;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/skills")
@CrossOrigin(origins = "https://nataliaespinosa-ap.web.app")
public class CSkills {
    @Autowired
    SSkills sSkills;
    
     @GetMapping("/lista")  
        public List<Skills> getSkills(){
            return sSkills.getSkills();
        }
    
    @PostMapping("/create")
        public String createSkills (@RequestBody Skills skills){
            sSkills.saveSkills(skills);
            return "La habilidad fue creada correctamente";
        }
    
     @DeleteMapping("/delete/{id}")
        public String deleteSkills (@PathVariable Long id){
            sSkills.deleteSkills(id);
            return "La habilidad fue eliminada correctamente";
        }
        
     @PutMapping("/update/{id}")    
        public Skills skills (@PathVariable Long id,
                                        @RequestParam("nombreSkills") String nuevoNombreSkills,
                                        @RequestParam("percent") int nuevoPercent,
                                        @RequestParam("img") String nuevoImgSkills){
            Skills skills = sSkills.findSkills(id);
            skills.setNombreSkills(nuevoNombreSkills);
            skills.setPercent(nuevoPercent);
            skills.setImg(nuevoImgSkills);
                        
            sSkills.saveSkills(skills);
            return skills;
        }
}
