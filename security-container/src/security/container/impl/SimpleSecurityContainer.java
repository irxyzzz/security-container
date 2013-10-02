package security.container.impl;

import security.container.manage.SecurityDataManage;

public class SimpleSecurityContainer {
	private SecurityDataManage securityDatas;
	private String targetSrc;
	
	public SimpleSecurityContainer() {
		initialize();
	}
	public SimpleSecurityContainer(String targetSrc) {
		this.targetSrc = targetSrc;
		initialize();
	}
	
	private void initialize() {
		securityDatas = new SecurityDataManage();
	}
}
