package kr.mycom.ojo.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.mycom.ojo.domain.Room_infoVo;

@Repository
public class StudyRoomDaoImpl implements StudyRoomDao {
	@Inject
	private SqlSession session;

	private static String namespace = "kr.mycom.ojo.RoomMapper";

	@Override
	public List<Room_infoVo> listAll() throws Exception {
		return session.selectList(namespace + ".listAll");
	}

}
