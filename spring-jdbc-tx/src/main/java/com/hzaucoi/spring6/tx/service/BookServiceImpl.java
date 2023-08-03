package com.hzaucoi.spring6.tx.service;

import com.hzaucoi.spring6.tx.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

//因为service层表示业务逻辑层，一个方法表示一个完成的功能，因此处理事务一般在service层处理
//
//  在BookServiceImpl的buybook()添加注解@Transactional
//观察结果 由于使用了Spring的声明式事务，更新库存和更新余额都没有执行
//@Transactional标识在方法上，则只会影响该方法
//
//@Transactional标识的类上，则会影响类中所有的方法
@Service
//@Transactional
@Transactional(propagation = Propagation.REQUIRES_NEW)//表示不管当前线程上是否有已经开启的事务，都要开启新事务
//@Transactional(propagation = Propagation.REQUIRES_NEW)//表示不管当前线程上是否有已经开启的事务，都要开启新事务
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;
    @Override
    public void buyBook(Integer bookId, Integer userId) {
        //查询图书的价格
        Integer price = bookDao.getPriceByBookId(bookId);
        //更新图书的库存
        bookDao.updateStock(bookId);
        //更新用户的余额
        bookDao.updateBalance(userId, price);
    }
}
