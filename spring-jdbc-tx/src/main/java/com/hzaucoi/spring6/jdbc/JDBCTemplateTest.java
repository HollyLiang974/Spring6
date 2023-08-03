package com.hzaucoi.spring6.jdbc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

@SpringJUnitConfig(locations = "classpath:beans.xml")
public class JDBCTemplateTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    //测试添加
    @Test
    public void testAdd(){
        String sql = "insert into t_emp values(null,?,?,?)";
        int update = jdbcTemplate.update(sql, "zhangsan", "23","女");
        System.out.println(update);
    }
    //测试修改
    @Test
    public void testUpdate(){
        String sql = "update t_emp set name=? where id=?";
        int update = jdbcTemplate.update(sql, "lisi", 1);
        System.out.println(update);
    }
    //测试删除
    @Test
    public void testDelete(){
        String sql = "delete from t_emp where id=?";
        int update = jdbcTemplate.update(sql, 1);
        System.out.println(update);
    }

    //查询返回对象
    @Test
    public void testSelectObject(){
        String sql = "select * from t_emp where id=?";
        Emp emp = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Emp.class), 2);
        System.out.println(emp);
    }

    //查询返回数据list集合
    @Test
    public void testSelectList(){
        String sql = "select * from t_emp";
        List<Emp> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Emp.class));
        System.out.println(list);
    }

    @Test
//查询单行单列的值
    public void selectCount(){
        String sql = "select count(id) from t_emp";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(count);
    }

}
