package protoType.scheduler.action.base;

import protoType.scheduler.Util.LogUtil;

import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport {


	public void setInfoLog(String logStr) {
		LogUtil.setInfoLog(logStr);
	}

	public void setErrorLog(String logStr) {
		LogUtil.setErrorLog(logStr);
	}
}
