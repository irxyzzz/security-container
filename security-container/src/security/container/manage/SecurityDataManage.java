package security.container.manage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import security.container.model.SecurityData;

public class SecurityDataManage {
	private Map<Integer, SecurityData> datas;

	public SecurityDataManage() {
		initialize();
	}

	private void initialize() {
		datas = new HashMap<Integer, SecurityData>();
	}

	public SecurityData getSecurityData(int id) {
		return datas.get(id);
	}

	public List<SecurityData> getSecurityDatas() {
		List<SecurityData> all = new ArrayList<SecurityData>();
		Set<Integer> keys = datas.keySet();
		for (Integer key : keys) {
			all.add(datas.get(key));
		}
		return all;
	}
	
	public boolean addSecurityData(SecurityData sData) {
		if(sData != null) {
			datas.put(sData.getId(), sData);
			return true;
		}
		return false;
	}
	
	public boolean updateSecurityData(SecurityData sData) {
		if (sData != null) {
			datas.remove(sData.getId());
			datas.put(sData.getId(), sData);
			return true;
		}
		return false;
	}
}
