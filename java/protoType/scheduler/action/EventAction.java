package protoType.scheduler.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import protoType.scheduler.Util.XmlFile;
import protoType.scheduler.action.base.BaseAction;
import protoType.scheduler.logic.EventLogic;

/**
 * show the detail of an event
 * 
 * @author ny
 *
 */
public class EventAction extends BaseAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6338673365966752919L;

	public String execute() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String actionId = request.getParameter("action");

		// TODO
		clearMessages();

		addActionMessage("execute() is started");
		
		//xml test start
		
		XmlFile xmlFile = new XmlFile();
		xmlFile.init();
		String str="C:/protoType.xml";
		xmlFile.createXml(str); 
		//xmlFile.parserXml(str);
		
		//xml test end
		
		EventLogic eventLogic = new EventLogic();
		
		eventLogic.loadEvent("12313");

		return SUCCESS;

	}

	public String create() throws Exception {
		setInfoLog("create() is started");
		HttpServletRequest request = ServletActionContext.getRequest();
		String eventId = request.getParameter("id");

		// TODO
		clearMessages();

		addActionMessage("create() is started");

		return SUCCESS;

	}

	public String edit() throws Exception {
		setInfoLog("edit（） is started");
		HttpServletRequest request = ServletActionContext.getRequest();
		String eventId = request.getParameter("id");

		// TODO
		clearMessages();

		addActionMessage("edit() is started");

		return SUCCESS;

	}

	public String select() throws Exception {
		setInfoLog("select（） is started");
		HttpServletRequest request = ServletActionContext.getRequest();
		String eventId = request.getParameter("id");

		// TODO
		clearMessages();

		addActionMessage("select() is started");

		return SUCCESS;

	}
}
