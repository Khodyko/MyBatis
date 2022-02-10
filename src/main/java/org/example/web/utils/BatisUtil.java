package org.example.web.utils;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

public class BatisUtil {
    private static SqlSessionFactory factory;

    static {
        InputStream reader = BatisUtil.class.getClassLoader()
                                      .getResourceAsStream("configuration.xml");
        factory = new SqlSessionFactoryBuilder().build(reader);
    }

    public static SqlSessionFactory getSqlSessionFactory() {
        return factory;
    }

    public static SqlSession openSession() {
        return factory.openSession();
    }

}
