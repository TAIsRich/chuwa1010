package com.chuwa.redbook.dao;

import com.chuwa.redbook.entity.Post;

import java.sql.*;

public class JDBC {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/redbook";
    private static final String USERNAME = "springstudent";
    private static final String PASSWORD = "springstudent";

    public Post getPostById(long id) throws Exception {
        Post post = new Post();
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            String sql = "SELECT * FROM posts WHERE ID = " + id;
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                post.setTitle(rs.getString("title"));
                post.setDescription(rs.getString("description"));
                post.setContent(rs.getString("content"));
            }
            rs.close();
            stmt.close();
            conn.close();
            return post;
        } catch (SQLException e) {
        }
        return null;
    }
}
