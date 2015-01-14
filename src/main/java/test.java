import java.sql.SQLException;

import model.dao.MemberDAO;


public class test {

	public static void main(String[] args) {
		//System.out.println(MemberDAO.selectMemberAll());
		//System.out.println(MemberDAO.selectMemOne("dhdbdwl90"));
		//System.out.println(MemberDAO.insertMember("지영주", "flqpffldhs", "2031", "오목리", "01074115913"));
		System.out.println(MemberDAO.deleteMember("flqpffldhs"));
		//System.out.println(MemberDAO.updateMember("flqpffldhs", "2031", "백석동", "0105553215"));
	}

}
