package com.devsuperior.dslist.DTO;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity

public class GameMinDTO {

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;
}
