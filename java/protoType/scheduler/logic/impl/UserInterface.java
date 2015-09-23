package protoType.scheduler.logic.impl;

import protoType.scheduler.Dto.EventDto;
import protoType.scheduler.bean.Event;
import protoType.scheduler.bean.Option;
import protoType.scheduler.bean.Selection;

public interface UserInterface {

	//Executor : every user
	public Event loadEvent(String eventId);
	
	//Executor : the creator of event
	public boolean createEvent(Event event);
	
	//Executor : the creator of event
	public boolean editEvent(Event event);
	
	//Executor : the creator of event
	public boolean addOption(Option opt);
	
	//Executor : the creator of event
	public boolean removeOption(Option opt);
	
	//Executor : every user
	public boolean select(Selection slt);
	
	//Executor : every user
	public EventDto showEventDetail(Event event);
}
