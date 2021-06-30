package at.gepaplexx;

import javax.inject.Singleton;

@Singleton
public class State {

    boolean liveness = true;

    boolean readiness = true;

    public void livenesstoggle() {
        liveness = !(liveness);
    }

    public void readinesstoggle() {
        readiness = !(readiness);
    }

}
