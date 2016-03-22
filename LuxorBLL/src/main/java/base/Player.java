package base;

import java.util.UUID;

public class Player {

	private UUID PlayerID; 
	private String PlayerName; 
	private int PlayerScore;
	
	public Player(UUID playerID, String playerName, int playerScore) {
		super();
		PlayerID = playerID;
		PlayerName = playerName;
		PlayerScore = playerScore;
	}
	
	public UUID getPlayerID() {
		return PlayerID;
	}
	public void setPlayerID(UUID playerID) {
		PlayerID = playerID;
	}
	public String getPlayerName() {
		return PlayerName;
	}
	public void setPlayerName(String playerName) {
		PlayerName = playerName;
	}
	public int getPlayerScore() {
		return PlayerScore;
	}
	public void setPlayerScore(int playerScore) {
		PlayerScore = playerScore;
	}
	
	
}
