package com.backendap.argentinaprograma.Repository;

import com.backendap.argentinaprograma.Entity.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RSkills extends JpaRepository<Skills, Long> {
   
}
