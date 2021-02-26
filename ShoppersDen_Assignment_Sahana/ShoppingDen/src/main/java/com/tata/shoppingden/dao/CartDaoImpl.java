package com.tata.shoppingden.dao;

import com.tata.shoppingden.helper.PostgresConnHelper;
import com.tata.shoppingden.models.Cart;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class CartDaoImpl implements CartDao {
    private Connection conn;
    private ResourceBundle resourceBundle;
    private ResultSet resultSet;
    private Statement statement;

    public CartDaoImpl(){
        conn= PostgresConnHelper.getConnection();
        if(conn!=null)
            System.out.println("Connection ready...");
        else
            System.out.println("Connection has issue...");
        resourceBundle= ResourceBundle.getBundle("db");
    }

    @Override
    public List<Cart> displayCart(long userId) throws SQLException {
        List<Cart> cartList =new ArrayList<>();
        String query=resourceBundle.getString("viewcartsinglecustomer");
        PreparedStatement viewCart = conn.prepareStatement(query);
        viewCart.setLong(1, userId);
        statement= conn.createStatement();
        resultSet=statement.executeQuery(query);
        while(resultSet.next()){
            Cart cart =new Cart();
            cart.setCustomerId(resultSet.getLong(1));
            cart.setProductId(resultSet.getLong(2));
            cart.setQuantity(resultSet.getInt(3));
            cartList.add(cart);
        }
        return cartList;
    }
}
