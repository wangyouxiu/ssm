package cn.itcast.dao;

import cn.itcast.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @version 1.0
 * @ClassName AccountDao
 * @Description TODO描述
 * @Author wangyue
 * @Date 2020/11/10 8:00
 **/

@Repository
public interface AccountDao {

    /**
     * 查询所有
     * @return
     */
    @Select("select * from t_account")
    public List<Account> findAll();

    /**
     * 保存账户信息
     */
    @Insert("insert into t_account (id,username,money) values(#{id},#{username},#{money})")
    public void save(Account account);
}
