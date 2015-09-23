package protoType.scheduler.bean;

import protoType.scheduler.bean.base.AbstractObj;

public class Selection extends AbstractObj {

	private String eventId;

	private String optionId;

	private boolean isChosen;

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public String getOptionId() {
		return optionId;
	}

	public void setOptionId(String optionId) {
		this.optionId = optionId;
	}

	public boolean isChosen() {
		return isChosen;
	}

	public void setChosen(boolean isChosen) {
		this.isChosen = isChosen;
	}
}
