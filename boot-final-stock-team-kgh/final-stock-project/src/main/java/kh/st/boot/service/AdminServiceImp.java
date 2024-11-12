package kh.st.boot.service;

import java.util.List;

import kh.st.boot.dao.AdminDAO;
import kh.st.boot.model.vo.AdminVO;

public class AdminServiceImp implements AdminService{

	private AdminDAO adminDao;

	public List<AdminVO> getAdminList() {
		
		return adminDao.selectAdminList();
	}
}