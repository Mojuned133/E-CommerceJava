package com.avisoft.ecommerce.repository;

import com.avisoft.ecommerce.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CategoryRepository extends JpaRepository<Category,Long> {

    public Category findByName(String name);

    @Query("SELECT c From Category v WHERE c.name=:")
    public Category findByNameAndParant(@Param("name") String name, @Param("parantCategoryName")String parantCategoryName);

}
