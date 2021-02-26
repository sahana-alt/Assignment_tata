package com.tata.shoppingden.dao;

import com.tata.shoppingden.models.Cart;

import java.sql.SQLException;
import java.util.List;

public interface CartDao {
    public List<Cart> displayCart(long uid) throws SQLException;
}
