package com.gyj.mvc.service.impl;

import com.gyj.mvc.dao.AccountDao;
import com.gyj.mvc.service.AccountService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Transactional中的的属性 propagation    :事务的传播行为
 * isolation		:事务的隔离级别
 * readOnly		:只读
 * rollbackFor	:发生哪些异常回滚
 * noRollbackFor	:发生哪些异常不回滚
 * rollbackForClassName 根据异常类名回滚
 * Created by Gao on 2018/4/6.
 */
@Service
@Transactional
public class AccountServiceImpl implements AccountService {

    //注入转账的DAO
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    /**
     * @param out   :转出账号
     * @param in    :转入账号
     * @param money :转账金额
     */
    @Override
    public void transfer(String out, String in, Double money) {

        accountDao.outMoney(out, money);
        //抛出异常，事务回滚，@Transactional注解
        int i = 1 / 0;
        accountDao.inMoney(in, money);
    }
}

