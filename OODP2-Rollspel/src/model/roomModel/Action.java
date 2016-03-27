package model.roomModel;

import controller.Command.LootCommand;
import controller.Command.MoveCommand;
import model.Factory.ActionButtonBuilder;
import model.characterModel.CharacterIsDeadException;
import model.entitiesModel.MonsterIsDeadException;

public enum Action implements Visitable, Executable {

	Fight("Fight!") {

		@Override
		public void accept(ActionButtonBuilder actionBuilder) {

		}

		@Override
		public void execute() {

		}
		
	}, goNorth("Go North") {
		

		@Override
		public void accept(ActionButtonBuilder actionBuilder) {
			actionBuilder.visit(this);
			
		}
		
		public void execute() {
			MoveCommand move = new MoveCommand();
			move.goNorth();
		}
		
		
	}, goEast("Go East") {

		@Override
		public void accept(ActionButtonBuilder actionBuilder) {
			actionBuilder.visit(this);
			
		}

		@Override
		public void execute() {
			MoveCommand move = new MoveCommand();
			move.goEast();
			
		}
		
	}, goWest("Go West") {

		@Override
		public void accept(ActionButtonBuilder actionBuilder) {
			actionBuilder.visit(this);
			
		}

		@Override
		public void execute() {
			MoveCommand move = new MoveCommand();
			move.goWest();
			
		}
		
	}, goSouth("Go South") {

		@Override
		public void accept(ActionButtonBuilder actionBuilder) {
			actionBuilder.visit(this);
			
		}

		@Override
		public void execute() {

		}
		
	}, loot("Loot") {

		@Override
		public void accept(ActionButtonBuilder actionBuilder) {
			actionBuilder.visit(this);
			
		}

		@Override
		public void execute()  {
			LootCommand loot = new LootCommand();
			loot.execute();
			
		}
	}, Trap("Trap"){
		@Override
		public void accept(ActionButtonBuilder actionBuilder) {
	
		}

		@Override
		public void execute() {
	
		}
		
	}, Quest("quest"){
		@Override
		public void accept(ActionButtonBuilder actionBuilder) {
	
		}

		@Override
		public void execute() {
		}
		
	};
	
	private final String description;
	
	Action(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}



	
}
