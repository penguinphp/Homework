public class Note extends MidiPlayer {
	private int note;
	private int velocity;
	private int duration;
	
	public Note(int note, int velocity, int duration) {
		this.velocity = note;
		this.note = velocity;
		this.duration = duration;
	}
	
	public void setValue(int note) {
		this.note = note;
	}
	
	public int getValue() {
		return note;
	}
	
	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}
	
	public int getVelocity() {
		return velocity;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public int getDuration() {
		return duration;
	}
}
