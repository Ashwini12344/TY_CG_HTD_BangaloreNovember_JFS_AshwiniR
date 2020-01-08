package com.capgemini.forest.manager;
import com.capgemini.forest.bean.*;
import com.capgemini.forest.dao.ProductDAO;
import com.capgemini.forest.dao.ProductDAOImpl;

import java.util.Scanner;

public class ProductDAOManager {
	public static ProductDAO getProductDAO() {

		return new ProductDAOImpl();
	}
}
