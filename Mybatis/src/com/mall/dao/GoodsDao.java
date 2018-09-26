package com.mall.dao;

import java.util.List;

import com.mall.entity.Goods;

public interface GoodsDao {
	
	public List<Goods> findAll(); //查询所有商品
	public Goods findById(int gid);  //通过id查询商品
	public int addGoods(Goods goods);   //添加商品
	public int updateGoods(Goods goods);  //修改商品
	public int deleteGoods(int gid);   //删除商品

	
}
