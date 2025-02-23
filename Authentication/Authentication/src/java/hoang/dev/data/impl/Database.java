package hoang.dev.data.impl;

import hoang.dev.data.dao.CategoryDao;
import hoang.dev.data.dao.DatabaseDao;
import hoang.dev.data.dao.OrderDao;
import hoang.dev.data.dao.OrderItemDao;
import hoang.dev.data.dao.ProductDao;
import hoang.dev.data.dao.UserDao;

public class Database extends DatabaseDao {
    @Override
    public ProductDao getProductDao() {
        // TODO Auto-generated method stub
        return new ProductImpl();
    }
    @Override
    public CategoryDao getCategoryDao() {
        // TODO Auto-generated method stub
        return new CategoryImpl();
    }
    @Override
    public OrderItemDao getOrderItemDao() {
        // TODO Auto-generated method stub
        return new OrderItemImpl();
    }
    @Override
    public OrderDao getOrderDao() {
        // TODO Auto-generated method stub
        return new OrderImpl();
    }
    @Override
    public UserDao getUserDao() {
        // TODO Auto-generated method stub
        return new UserImpl();
    }
}
