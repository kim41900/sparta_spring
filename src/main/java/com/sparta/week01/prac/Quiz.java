package com.sparta.week01.prac;

public class Quiz {
    public static void main(String[] args){
        String name = "김지호";
        int bio = 3;
        Tutor tutor = new Tutor();
        tutor.setName(name);
        tutor.setBio(bio);
        System.out.println(tutor.getName());
        System.out.println(tutor.getBio());
    }
}
