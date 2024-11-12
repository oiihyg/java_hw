package kh.st.boot.dao;

import java.util.List;

import kh.st.boot.model.vo.AdminVO;

public interface AdminDAO {

	List<AdminVO> selectAdminList();

}
