package com.hzaucoi.spring6.tx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CheckoutServiceImpl implements CheckoutService {
    @Autowired
    private BookService bookService;

    @Override
//    @Transactional(propagation = Propagation.REQUIRED) //表示如果当前线程上有已经开启的事务可用，那么就在这个事务中运行
    @Transactional(propagation = Propagation.REQUIRES_NEW)//表示不管当前线程上是否有已经开启的事务，都要开启新事务
    public void checkout(Integer[] bookIds, Integer userId) {
        for (Integer bookId : bookIds) {
            bookService.buyBook(bookId, userId);
        }
    }
}
