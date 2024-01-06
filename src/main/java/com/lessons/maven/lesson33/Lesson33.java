package com.lessons.maven.lesson33;

public class Lesson33 {
    public static final String CONNECTION_STR =
            "jdbc:postgresql://localhost:5432/itmo";
    public static final String LOGIN = "postgres";
    public static final String PWD = "postgres";

    public static void main(String[] args) {
        AuthorQuery query = new AuthorQuery();
        NoteQuery noteQuery = new NoteQuery();
        query.createTable();
//        query.insertIntoTable();
        noteQuery.createTable();




    }
}
