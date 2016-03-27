package model.roomModel;

import model.Factory.ActionButtonBuilder;

public interface Visitable {
	public void accept(ActionButtonBuilder actionBuilder);
}
