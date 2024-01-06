package com.lessons.maven.lesson33;

import java.sql.*;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;


public class NoteQuery {
    public boolean createTable(){
        String createSql="CREATE TABLE IF NOT EXISTS tb_notes("+
                "id SERIAL PRIMARY KEY, " +" tittle VARCHAR(100) NOT NULL, " +"note_text TEXT " +
                "NOT NULL, " +"created_at  timestamptz,"+ " author_unique_name VARCHAR(60) NOT NULL, "
                +"CONSTRAINT fk_author_notes "+"FOREIGN KEY (author_unique_name)" +
                " REFERENCES tb_authors (unique_name) )";

        try (Connection conn =C3p0ConnectionsPool.getConnectionFromPool()){
            try ( Statement st = conn.createStatement()){
                st.executeUpdate(createSql);
                return true;
            }

        }catch ( SQLException e ){
            throw new RuntimeException(e);
        }
    }
    public Note insertToTable(Note note){

        String sql = "INSERT INTO tb_notes(tittle,note_text,created_at,author_unique_name) Values(?,?,?,?)";
        try(PreparedStatement statement = C3p0ConnectionsPool.getConnectionFromPool().prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)){
           statement.setString(1,note.getTitle());
           statement.setString(2,note.getText());
           statement.setObject(3,note.getCreatedAt());
           statement.setString(4,note.getAuthor().getUniqueName());
           statement.executeUpdate();
            try( ResultSet rs = statement.getGeneratedKeys()){
                if(!rs.next())throw new RuntimeException("Key error");
                note.setId(rs.getInt(1));
            }
        } catch (
                SQLException e) {
            throw new RuntimeException(e);
        }
        return  note;

    }
    public List<Note> getNotesByAuthor(String title){
        String sql = "SELECT tb_notes.* ,tb_authors.* " +
                "From tb_notes,tb_authors"+
                "WHERE tb_authors.unique_name=tb_notes.author_unique_name"+
                "and tb_tittle ILIKE ? "+
                "Order by tb_notes.created_at Desc";
        List<Note> notes =new ArrayList<>();
        try(PreparedStatement ps = C3p0ConnectionsPool.getConnectionFromPool().prepareStatement(sql)){
            ps.setString(1, "%"+title+"%");
            try(ResultSet resultSet = ps.executeQuery();){
                resultSet.setFetchSize(2);
            while(resultSet.next()) {
                Note note = new Note();
                Author author = new Author(resultSet.getString("unique_name"),
                        resultSet.getObject("registered_at", LocalDate.class),
                        resultSet.getBoolean("isActive"));
                note.setTitle(resultSet.getString("title"));
                note.setText(resultSet.getString("text"));
                note.setCreatedAt(resultSet.getObject("created_at", OffsetDateTime.class));
                note.setAuthor(author);
                notes.add(note);
            }
            }

           } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return notes;
    }
    }

