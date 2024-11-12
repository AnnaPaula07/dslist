package entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_game")

public class Game {

    @Id
    @GeneratedValue
    private Long id;

    private String title;

    @Column(name = "game_year")
    private Integer year;

    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;
}
