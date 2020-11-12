package cn.itcast.domain;

import java.io.Serializable;

/**
 * @version 1.0
 * @ClassName Account
 * @Description TODO描述
 * @Author wangyue
 * @Date 2020/11/10 7:59
 **/
public class Account implements Serializable {
    private Integer id;
    private String username;
    private Double money;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + username + '\'' +
                ", money=" + money +
                '}';
    }
}
