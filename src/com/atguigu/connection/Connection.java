package com.atguigu.connection;

import org.junit.Test;

import java.sql.Driver;
import java.sql.SQLException;
import java.util.Properties;

public class Connection {
    @Test
    public void testConnection1() throws SQLException {
        Driver dirver=null;
        String url=null;
        Properties info=null;
        java.sql.Connection conn= dirver.connect(url,info);
        System.out.println(conn);
    }
}
