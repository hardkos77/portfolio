package monportfolio.portfoliobackend.repository;

import monportfolio.portfoliobackend.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, Long> {
}
