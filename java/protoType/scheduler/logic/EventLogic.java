package protoType.scheduler.logic;

import protoType.scheduler.Dto.EventDto;
import protoType.scheduler.Util.XmlFile;
import protoType.scheduler.bean.Event;
import protoType.scheduler.bean.Option;
import protoType.scheduler.bean.Selection;
import protoType.scheduler.logic.impl.UserInterface;

public class EventLogic implements UserInterface {

	@Override
	public Event loadEvent(String eventId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean createEvent(Event event) {
		// TODO Auto-generated method stub

		
		XmlFile xmlFile = new XmlFile();
		xmlFile.init();
		xmlFile.createXml(event); 

		
		
		return false;
	}

	@Override
	public boolean editEvent(Event event) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addOption(Option opt) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeOption(Option opt) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean select(Selection slt) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public EventDto showEventDetail(Event event) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
