package com.example.ecommercemanagement.Global;

import com.example.ecommercemanagement.Model.Product;

import java.util.ArrayList;
import java.util.List;

public class GlobalData {
    public static List<Product> cart;
    static {
        cart=new ArrayList<Product>();
    }
}
