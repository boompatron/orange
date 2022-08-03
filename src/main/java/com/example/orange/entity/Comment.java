package com.example.orange.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "comment")
@NoArgsConstructor
@Getter
public class Comment extends BaseTimeEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column(length = 255)
    private String content;

    @ManyToOne(cascade = CascadeType.ALL)   // Many = comment, one = user// 한 명의 유저가 다수의 댓글을 쓸 수 있다.
    @JoinColumn(name = "user_id")           // 외부 키
    private User user;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "item_id")
    private Item item;
}
