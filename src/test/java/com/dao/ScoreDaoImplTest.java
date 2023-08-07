package com.dao;

import com.bean.Score;
import com.configs.Config;
import com.configs.DataSourceConfig;
import junit.framework.TestCase;
import lombok.extern.log4j.Log4j2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Config.class, DataSourceConfig.class})
@Log4j2
public class ScoreDaoImplTest extends TestCase {
    @Autowired
    private ScoreDao scoreDao;

    @Test
    public void insert() {
        Score sc = new Score();
        sc.setSid(1);
        sc.setCid(1);
        sc.setScore(90);
        System.out.println(this.scoreDao.insert(sc));
    }
}