package com.example.demokafkaconnect.dao.impl;

import com.example.demokafkaconnect.bo.CommentBo;
import com.example.demokafkaconnect.bo.response.CommentResponse;
import com.example.demokafkaconnect.dao.CommentRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Component
public class CommentDaoImpl implements CommentRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<CommentResponse> findAll() {
        Query query = em.createNativeQuery("SELECT * FROM comments_view;", CommentResponse.class);
        return (List<CommentResponse>) query.getResultList();
    }
}
