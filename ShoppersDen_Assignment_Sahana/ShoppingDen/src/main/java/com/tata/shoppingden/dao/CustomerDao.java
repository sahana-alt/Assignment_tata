package com.tata.shoppingden.dao;

import java.sql.SQLException;

public interface CustomerDao {
    public void addToCart(long pid, long cid) throws SQLException;
    public void removeFromCart(long pid,long cid) throws SQLException;
}
