package com.cg.forest.manager;
import com.cg.forest.bean.*;
import com.cg.forest.dao.ProductDAO;
import com.cg.forest.dao.ProductDAOImpl;

import java.util.Scanner;

public class ProductDAOManager {
	public static ProductDAO getProductDAO() {

		return new ProductDAOImpl();
	}
}