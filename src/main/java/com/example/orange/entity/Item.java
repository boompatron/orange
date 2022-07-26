package com.example.orange.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.util.Assert;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "item")
public class Item extends BaseTimeEntity{
    @Id @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private String description;

    @Column(nullable = false)
    private String status;

    @Column(nullable = false)
    private String title;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "location_id")
    private Location location;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id")
    private Category category;

    @Builder
    public Item(String description, String status, String title, User user, Location location, Category category){
        Assert.hasText(title, "title must not be empty");

        this.description = description;
        this.status = status;
        this.title = title;
        this.user = user;
        this.location = location;
        this.category = category;
    }
}
