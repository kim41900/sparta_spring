package com.sparta.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Entity
public class Memo extends Timestamped {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String contents;

    public Memo(String username, String contents){
        this.username = username;
        this.contents = contents;
    }

    public Memo(MemoDto memoDto){
        this.username = memoDto.getUsername();
        this.contents = memoDto.getContents();
    }

    public void update(MemoDto memoDto){
       this.username = memoDto.getUsername();
        this.contents = memoDto.getContents();
   }





}
