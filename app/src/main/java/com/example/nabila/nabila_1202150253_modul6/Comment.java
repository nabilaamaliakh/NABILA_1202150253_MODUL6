package com.example.nabila.nabila_1202150253_modul6;

public class Comment {
    String id;
    String username;
    String comment;

    public Comment(){
    }

    public Comment(String id, String username, String comment){
        this.id = id;
        this.username = username;
        this.comment = comment;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getComment() {
        return comment;
    }
}
