package model.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.domain.BasketDTO;
import model.domain.MemberDTO;
import model.domain.ProductDTO;

import org.apache.ibatis.session.SqlSession;

import util.DBUtil;


public class MemberDAO {
	//윤지 언니
	public static ArrayList<MemberDTO> selectMemberAll() throws SQLException {
		SqlSession session= null;
		ArrayList<MemberDTO> mList = null;
		
		try{
			session = DBUtil.getSqlSession();
			mList = (ArrayList)session.selectList("MEMBER.selectMemAll");
		}finally{
			session.close();
		}
		
		return mList;
	}
	
	public static MemberDTO selectMemOne(String id) throws SQLException{
		SqlSession session = null;
		MemberDTO mem = null;
		try{
			session = DBUtil.getSqlSession();
			mem = session.selectOne("MEMBER.selectMemOne", id);
		}finally{
			session.close();
		}
		return mem;
	}
	
	public static int insertMember(String name, String id, String pw, String addr, String phone){
		SqlSession session = null;
		int result = 0;
		try{
			session = DBUtil.getSqlSession(true);
			result = session.insert("MEMBER.insertMember", new MemberDTO(name, id, pw, addr, phone));
		}finally{
			session.close();
		}
		return result;
	}
	
	public static int deleteMember(String id){
		SqlSession session = null;
		int result = 0;
		try{
			session = DBUtil.getSqlSession(true);
			result = session.delete("MEMBER.deleteMember", id);
		}finally{
			session.close();
		}
		return result;
	}
	
	public static int updateMember(String id, String pw, String addr, String phone){
		SqlSession session = null;
		int result = 0;
		try{
			session = DBUtil.getSqlSession(true);
			result = session.update("MEMBER.updateMember", new MemberDTO(id, pw, addr, phone));
		}finally{
			session.close();
		}
		return result;
	}
	
	//내꺼
	
	public static ArrayList searchAllProducts() throws SQLException{
		SqlSession session = null;
		ArrayList products = null;
		try{
			session = DBUtil.getSqlSession();
			products = (ArrayList)session.selectList("product.selectAllProducts");
		}finally{
			session.close();
		}
		return products;
	}
	public static ProductDTO searchOneProduct(int pno) throws SQLException{
		SqlSession session = null;
		ProductDTO product = null;
		try{
			session = DBUtil.getSqlSession();
			product = (ProductDTO)session.selectOne("product.selectOneProduct", pno);
		}finally{
			session.close();
		}
		return product;
	}
	public static void insertProduct(ProductDTO product) throws SQLException{
		SqlSession session = null;
		try{
			session = DBUtil.getSqlSession(true);
			session.insert("product.insertProduct", product);
		}finally{
			session.close();
		}
	}
	public static void updateProduct(ProductDTO product) throws SQLException{
		SqlSession session = null;
		try{
			session = DBUtil.getSqlSession(true);
			session.insert("product.updateProduct", product);
		}finally{
			session.close();
		}
	}
	public static void deleteProduct(int pno) throws SQLException{
		SqlSession session = null;
		try{
			session = DBUtil.getSqlSession(true);
			session.insert("product.deleteProduct", pno);
		}finally{
			session.close();
		}
	}
	
	
	//재환오빠
	
	public static List selectAllBasket() throws SQLException {
		SqlSession session = null;
		List selectAll = null;
		try {
			session = DBUtil.getSqlSession();
			selectAll = (List)session.selectList("Basket.selectAllBasket");
		} finally {
			session.close();
		}
		return selectAll;
	}

	public static BasketDTO selectBasketByNo(int mno) throws SQLException {
		SqlSession session = DBUtil.getSqlSession();
		BasketDTO account = null;
		try {
			account = (BasketDTO)session.selectOne("Basket.selectBasketByNo", new Integer(mno));
		} finally {
			session.close();
		}
		return account;
	}

	 public static void insertBasket (BasketDTO basket) throws SQLException {
		 SqlSession session = DBUtil.getSqlSession(true);
		 try{
			 session.insert("Basket.insertBasket", basket);			 
		 } finally{
			session.close();
		 }
	 }
	 
	
	 public static void updateBasket (int mno, int pno, int quantity) throws SQLException {
		 SqlSession session = DBUtil.getSqlSession(true);
		 try{
			 session.update("Basket.updateBasket", new BasketDTO(mno, pno, quantity));
		 }finally{
			 session.close();
		 }
	 }
	 
	
	 public static void deleteBasket (int mno, int pno) throws SQLException {
		 SqlSession session = DBUtil.getSqlSession(true);
		 try{
			 session.delete("Basket.deleteBasketByNo", new BasketDTO(mno, pno)); 
		 }finally{
			 session.close();
		 }
	 }
	 
	 public static void main(String [] agrs){
		 try {
//			 insertBasket(new BasketDTO(10000005, 14726122));
//			 updateBasket(10000005, 14726122, 50);
//			 System.out.println(selectBasketByNo(10000005)); //error
//			 System.out.println(selectAllBasket());
			 deleteBasket(10000005, 14726122);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	 }
}
