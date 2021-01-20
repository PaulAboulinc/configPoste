package entity;

import javax.persistence.*;

@Entity
@Table(name = "recipe")
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id = null;

    private long portions;

    @Column(length = 65535, columnDefinition = "TEXT")
    private String description;

    private String name;

    public Recipe(long portions, String description, String name) {
        this.portions = portions;
        this.description = description;
        this.name = name;
    }
}