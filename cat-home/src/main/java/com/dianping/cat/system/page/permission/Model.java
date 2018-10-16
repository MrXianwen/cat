package com.dianping.cat.system.page.permission;

import org.unidal.web.mvc.ViewModel;

import com.dianping.cat.system.SystemPage;

public class Model extends ViewModel<SystemPage, Action, Context> {

	public static final String SUCCESS = "Success";

	public static final String FAIL = "Fail";

	private String m_content;

	private String m_opState = SUCCESS;

	public Model(Context ctx) {
		super(ctx);
	}

	@Override
	public Action getDefaultAction() {
		return Action.USER;
	}

	public String getContent() {
		return m_content;
	}

	public void setContent(String content) {
		m_content = content;
	}

	public String getOpState() {
		return m_opState;
	}

	public void setOpState(boolean result) {
		if (result) {
			m_opState = SUCCESS;
		} else {
			m_opState = FAIL;
		}
	}

	public String getDomain() {
		return "";
	}

	public String getIpAddress() {
		return "";
	}

	public String getDate() {
		return "";
	}

	public String getReportType() {
		return "";
	}
}
