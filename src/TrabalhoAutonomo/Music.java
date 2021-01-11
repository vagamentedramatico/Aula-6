package TrabalhoAutonomo;

import java.sql.Time;

public class Music {

    private String title;
    private int duration;

    public Music(String title, int duration){
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {return title;}
    public int getDuration() {return duration;}

    public void setTitle(String newTitle) {this.title = newTitle;}
    public void setDuration(int newDuration) {this.duration = newDuration;}

}
