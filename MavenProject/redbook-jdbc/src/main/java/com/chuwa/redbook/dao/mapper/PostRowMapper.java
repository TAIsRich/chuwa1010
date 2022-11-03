package com.chuwa.redbook.dao.mapper;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PostRowMapper implements RowMapper {
    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        PostResultSetExtractor extractor = new PostResultSetExtractor();
        return extractor.extractData(rs);
    }
}
