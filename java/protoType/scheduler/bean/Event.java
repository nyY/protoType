package protoType.scheduler.bean;

import java.util.LinkedList;
import java.util.List;

import protoType.scheduler.bean.base.AbstractObj;

public class Event extends AbstractObj {

	private long maxOptionId;

	private List<Option> OptionList = new LinkedList<Option>();

	private List<Selection> selectionList = new LinkedList<Selection>();

	public long getMaxOptionId() {
		return maxOptionId;
	}

	public void setMaxOptionId(long maxOptionId) {
		this.maxOptionId = maxOptionId;
	}

	public List<Option> getOptionList() {
		return OptionList;
	}

	public void setOptionList(List<Option> optionList) {
		OptionList = optionList;
	}
	
	public void addOption(Option option) {
		OptionList.add(option);
	}

	public List<Selection> getSelectionList() {
		return selectionList;
	}

	public void setSelectionList(List<Selection> selectionList) {
		this.selectionList = selectionList;
	}

	public void addSelection(Selection selection) {
		selectionList.add(selection);
	}
	
}
