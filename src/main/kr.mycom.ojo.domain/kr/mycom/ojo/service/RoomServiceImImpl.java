package kr.mycom.ojo.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.mycom.ojo.domain.Criteria;
import kr.mycom.ojo.domain.Room_infoVo;
import kr.mycom.ojo.domain.SearchCriteria;
import kr.mycom.ojo.persistence.StudyRoomDao;

@Service
public class RoomServiceImImpl implements RoomService {

	@Inject
	private StudyRoomDao dao;

	@Override
	public List<Room_infoVo> listAll() throws Exception {
		return dao.listAll();
	}

	@Override
	public List<Room_infoVo> listSearchCriteria(SearchCriteria cri) throws Exception {
		// TODO Auto-generated method stub
		return dao.listSearch(cri);
	}

	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception {
		return dao.listSearchCount(cri);
	}
}
