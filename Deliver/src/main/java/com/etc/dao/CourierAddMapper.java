package com.etc.dao;

import java.util.List;
import java.util.Map;

public interface CourierAddMapper {
	List<Map<String,Object>> courierDeliveryList();
	List<Map<String,Object>> courierAddDelivery(int cuId);
	List<Map<String,Object>> userorders(int userId);
}