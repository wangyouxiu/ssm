package cn.itcast.test;

import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @version 1.0
 * @ClassName TestMybatis
 * @Description TODO描述
 * @Author wangyue
 * @Date 2020/11/10 8:46
 **/
public class TestMybatis {

    @Test
    public void test1() throws IOException {
        //加载配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //创建SqlSession对象
        SqlSession sqlSession = factory.openSession();
        //获取到代理对象
        AccountDao mapper = sqlSession.getMapper(AccountDao.class);
        //查询数据
        List<Account> all = mapper.findAll();
        System.out.println(all);

        //测试保存
        //Account account = all.get(0);
        //account.setId(3);
        //mapper.save(account);
        //
        //sqlSession.commit();

        //关闭资源
        sqlSession.close();
        resourceAsStream.close();
    }
}
