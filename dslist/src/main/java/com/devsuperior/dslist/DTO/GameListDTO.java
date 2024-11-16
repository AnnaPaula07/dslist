package com.devsuperior.dslist.DTO;

import com.devsuperior.dslist.entities.GameList;
import lombok.Data;

@Data

public class GameListDTO {

    private Long id;
    private String name;

    public GameListDTO(GameList entity) {
        this.id = entity.getId();
        this.name = entity.getName();
    }
}
