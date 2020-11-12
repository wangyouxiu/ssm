package cn.itcast.service;

import cn.itcast.domain.Account;

import java.util.List;

/**
 * @version 1.0
 * @ClassName AccountService
 * @Description TODO描述
 * @Author wangyue
 * @Date 2020/11/10 8:01
 **/
public interface AccountService {

    /**
     * 查询所有
     * @return
     */
    public List<Account> findAll();

    /**
     * 保存账户信息
     */
    public void save(Account account);
}
