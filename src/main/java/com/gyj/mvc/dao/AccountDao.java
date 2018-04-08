package com.gyj.mvc.dao;

/**
 * Created by Gao on 2018/4/6.
 */
public interface AccountDao {

    /**
     * @param out   :转出账号
     * @param money :转账金额
     */
    public void outMoney(String out, Double money);

    /**
     * @param in    :转入账号
     * @param money :转账金额
     */
    public void inMoney(String in, Double money);
}

