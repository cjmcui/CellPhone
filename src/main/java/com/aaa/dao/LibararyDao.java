package com.aaa.dao;

import java.util.List;
import java.util.Map;

public interface LibararyDao {

	public List<Map<String, Object>> query(Integer parentlibid);
// ��ѯָ����ɫ��ȫ���б�
	public List<Map<String, Object>> queryByRid(Integer parentlibid, Integer rid);
}
