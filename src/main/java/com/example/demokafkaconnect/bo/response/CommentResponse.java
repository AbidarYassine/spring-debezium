package com.example.demokafkaconnect.bo.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class CommentResponse {

    @Id
    private Long id;

    private String contenu;

    private Integer id_auteur;

    private Integer campaign_bo_id;
}
