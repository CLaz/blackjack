package drexel.edu.blackjack.server.commands;

import drexel.edu.blackjack.server.game.User;

public class UsernameCommand extends BlackjackCommand {
	
	private static final String COMMAND_WORD = "USERNAME";

	@Override
	public String processCommand(User user, CommandMetadata cm) {
		// We need to implement something here....
		return super.processCommand(user, cm);
	}

	@Override
	public String getCommandWord() {
		return COMMAND_WORD;
	}

}
