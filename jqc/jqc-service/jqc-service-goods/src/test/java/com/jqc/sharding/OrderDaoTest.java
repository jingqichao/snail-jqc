//package com.jqc.sharding;
//
//import com.jqc.sharding.dao.OrderDao;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.math.BigDecimal;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = {TestShardingJdbcApplication.class})
//public class OrderDaoTest {
//
//    @Autowired
//    OrderDao orderDao;
//
//    @Test
//    public void testInsertOrder(){
//        orderDao.insertOrder(new BigDecimal(11),1L,"SUCCESS");
//    }
//}
