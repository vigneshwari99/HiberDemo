package com.ecommerce.project;

import com.model.Product;
import com.model.ProductDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ProductDao pd = new ProductDao();
       Product p = new Product();
       p.setPname("cycle");
       p.setPcost(566);
       pd.insertProduct(p);
       System.out.println("succ");
    }
}
