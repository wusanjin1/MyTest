package com.dao;

import com.bean.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.PreparedStatement;

@Repository
public class ScoreDaoImpl implements ScoreDao{
    private JdbcTemplate jdbcTemplate;

    @Autowired
    public void init(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    @Override
    public int insert(Score s) {
        KeyHolder keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> {
            PreparedStatement ps = connection.prepareStatement("insert into score(sid,cid,score) values(?,?,?)", new String[] { "scid" });
            ps.setInt(1, s.getSid());
            ps.setInt(2, s.getCid());
            ps.setInt(3, s.getScore());
            return ps;
        }, keyHolder);
        return keyHolder.getKey().intValue();
    }
}
