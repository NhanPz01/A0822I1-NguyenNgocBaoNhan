package com.example.thimodule04.repository;

import com.example.thimodule04.model.QuestionContent;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionContentRepository extends JpaRepository<QuestionContent, Integer> {
    @Query(value = "select * from question_content join question_type on question_content.id_question_type = questione_type.id where title like :keyword or content like :keyword or answer like :keyword" +
            " or status like :keyword or date_create like :keyword or question_type.name like :keyword", nativeQuery = true)
    public Page<QuestionContent> findByKeyWord(@Param("keyword") String keyword, Pageable pageable);
}
