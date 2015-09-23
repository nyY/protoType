package protoType.scheduler.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import protoType.scheduler.action.base.BaseAction;
import protoType.scheduler.bean.Event;
import protoType.scheduler.bean.Option;
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
		

		
		EventLogic eventLogic = new EventLogic();
		eventLogic.loadEvent("12312");

		return SUCCESS;

	}

	public String create() throws Exception {
		setInfoLog("create() is started");
		HttpServletRequest request = ServletActionContext.getRequest();
		String eventId = request.getParameter("id");

		// TODO
		clearMessages();

		addActionMessage("create() is started");

		
		Event event = new Event();

		event.setId("A1");
		event.setName("name1111");
		event.setDetail("detail1111");
		
		Option opt1 = new Option();
		opt1.setId("Opt1");
		opt1.setName("Opt1Name");
		opt1.setDetail("Opt1Detail");
		
		event.addOption(opt1);
		
		Option opt2 = new Option();
		opt2.setId("Opt2");
		opt2.setName("Opt2Name");
		event.addOption(opt2);
		
		EventLogic eventLogic = new EventLogic();
		eventLogic.createEvent(event);
		
		
		
		return SUCCESS;

	}

	public String edit() throws Exception {
		setInfoLog("edit（） is started");
		HttpServletRequest request = ServletActionContext.getRequest();
		String eventId = request.getParameter("id");

		// TODO
		clearMessages();

		addActionMessage("edit() is started");
		
		
		Event event = new Event();
		EventLogic eventLogic = new EventLogic();
		eventLogic.editEvent(event);
		
		
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
