package com.dao;

import com.bean.Student;
import com.configs.Config;
import com.configs.DataSourceConfig;
import junit.framework.TestCase;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Config.class, DataSourceConfig.class})
@Log4j2
public class StudentImplTest extends TestCase {
    @Autowired
    private StudentDao studentDao;

    @Test
    public void addStu() {
        int sid = studentDao.addStu("张三");
        log.info("新学生:" + sid);
        Assert.assertNotNull(sid);
    }
}
