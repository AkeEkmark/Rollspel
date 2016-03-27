package model.roomModel;

import view.ActionButtonBuilder;

public interface Visitable {
	public void accept(ActionButtonBuilder actionBuilder);
}
