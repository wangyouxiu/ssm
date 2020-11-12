package cn.itcast.controller;

import cn.itcast.domain.Account;
import cn.itcast.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @version 1.0
 * @ClassName AccountController
 * @Description TODO描述
 * @Author wangyue
 * @Date 2020/11/10 8:03
 **/
@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/findAll")
    public String findAll(Model model) {
        System.out.println("表现层生效");
        //调业务层
        List<Account> list = accountService.findAll();
        model.addAttribute("list", list);
        return "list";
    }


    @RequestMapping("/save")
    public void save(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("表现层生效");
        accountService.save(account);
        response.sendRedirect(request.getContextPath() + "/account/findAll");
    }


}
