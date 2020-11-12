package cn.itcast.service.impl;

import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version 1.0
 * @ClassName AccountServiceImpl
 * @Description TODO描述
 * @Author wangyue
 * @Date 2020/11/10 8:02
 **/
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("查询所有账户");
        return accountDao.findAll();
    }

    @Override
    public void save(Account account) {
        System.out.println("保存账户信息");
        accountDao.save(account);
    }
}
