package model.roomModel;

import model.Factory.ActionBuilder;

public interface Visitable {
	public void accept(ActionBuilder actionBuilder);
}
