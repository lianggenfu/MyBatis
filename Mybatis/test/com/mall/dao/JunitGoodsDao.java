package com.mall.dao;


import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mall.entity.Goods;
import com.mall.utils.MyBatisSessionFactory;


public class JunitGoodsDao {
	
	private SqlSession session;
	//private static Logger logger = Logger.getLogger(JunitGoodsDao.class);
	
	
	@Before
	public void before(){
		session = MyBatisSessionFactory.getSession();
	}
	
	@After
	public void after(){
		MyBatisSessionFactory.closeSession();
	}
		
	@Test
	public void testFindById() throws IOException{
		Goods goods=session.getMapper(GoodsDao.class).findById(3);
		System.out.println(goods);		
	}
	
	@Test
	public void testFindAll() throws IOException{
		List<Goods> goodslist=session.getMapper(GoodsDao.class).findAll();
		for(Goods g:goodslist)	{
			System.out.println(g);
		}
	}
	
	@Test
	public void testAddGoods(){			
		String date=new SimpleDateFormat("yyyy-mm-dd  HH:mm:ss").format(new Date());
		Goods goods=new Goods(-1,"陈芝凯","食品",9.9,date);
		
		try {
			int rs=session.getMapper(GoodsDao.class).addGoods(goods);
			session.commit();
			if(rs>0) {
				System.out.println("添加成功！");
			}
			else {
				System.out.println("添加失败！");
			}
		} catch (Exception e) {
			// TODO: handle exception
			session.rollback();
			e.printStackTrace();
		}				
	}
	
	@Test
	public void testUpdateGoods(){
		Goods goods=session.getMapper(GoodsDao.class).findById(12);		
		goods.setType("家电");
		int rs=session.getMapper(GoodsDao.class).updateGoods(goods);
		session.commit();
		if(rs>0) {
			System.out.println("修改成功！");
		}
		else {
			System.out.println("修改失败！");
		}
	}
	
	@Test
	public void testDeleteGoods(){
		int rs=session.getMapper(GoodsDao.class).deleteGoods(11);
		session.commit();
		if(rs>0) {
			System.out.println("删除成功！");
		}
		else {
			System.out.println("删除失败！");
		}
	}

}
