package project.capstone.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.capstone.EntityModels.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, String>{

}
