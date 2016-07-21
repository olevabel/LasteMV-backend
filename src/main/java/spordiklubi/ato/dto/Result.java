package spordiklubi.ato.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by olevabel on 7/19/16.
 */
@Entity
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private long competitorId;
    private String sprint;
    private String longJump;
    private String ball;
    private String medicineBall;
    private String volleyball;
    private String bike;
    private String boxClimbing;
    private String basketball;
    private String football;
    private String running;

    protected Result() {}
    public Result(long competitorId, String sprint, String longJump, String ball, String medicineBall, String volleyball, String bike, String boxClimbing, String basketball, String football, String running) {
        this.competitorId = competitorId;
        this.sprint = sprint;
        this.longJump = longJump;
        this.ball = ball;
        this.medicineBall = medicineBall;
        this.volleyball = volleyball;
        this.bike = bike;
        this.boxClimbing = boxClimbing;
        this.basketball = basketball;
        this.football = football;
        this.running = running;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCompetitorId() {
        return competitorId;
    }

    public void setCompetitorId(long competitorId) {
        this.competitorId = competitorId;
    }

    public String getSprint() {
        return sprint;
    }

    public void setSprint(String sprint) {
        this.sprint = sprint;
    }

    public String getLongJump() {
        return longJump;
    }

    public void setLongJump(String longJump) {
        this.longJump = longJump;
    }

    public String getBall() {
        return ball;
    }

    public void setBall(String ball) {
        this.ball = ball;
    }

    public String getMedicineBall() {
        return medicineBall;
    }

    public void setMedicineBall(String medicineBall) {
        this.medicineBall = medicineBall;
    }

    public String getVolleyball() {
        return volleyball;
    }

    public void setVolleyball(String volleyball) {
        this.volleyball = volleyball;
    }

    public String getBike() {
        return bike;
    }

    public void setBike(String bike) {
        this.bike = bike;
    }

    public String getBoxClimbing() {
        return boxClimbing;
    }

    public void setBoxClimbing(String boxClimbing) {
        this.boxClimbing = boxClimbing;
    }

    public String getBasketball() {
        return basketball;
    }

    public void setBasketball(String basketball) {
        this.basketball = basketball;
    }

    public String getFootball() {
        return football;
    }

    public void setFootball(String football) {
        this.football = football;
    }

    public String getRunning() {
        return running;
    }

    public void setRunning(String running) {
        this.running = running;
    }

    @Override
    public String toString() {
        return "Result{" +
                "id=" + id +
                ", competitorId=" + competitorId +
                ", sprint='" + sprint + '\'' +
                ", longJump='" + longJump + '\'' +
                ", ball='" + ball + '\'' +
                ", medicineBall='" + medicineBall + '\'' +
                ", volleyball='" + volleyball + '\'' +
                ", bike='" + bike + '\'' +
                ", boxClimbing='" + boxClimbing + '\'' +
                ", basketball='" + basketball + '\'' +
                ", football='" + football + '\'' +
                ", running='" + running + '\'' +
                '}';
    }
}
