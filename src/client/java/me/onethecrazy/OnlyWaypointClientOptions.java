package me.onethecrazy;

public class OnlyWaypointClientOptions {
    public boolean onlyLastDeathWaypoint;
    public long dontRenderAfterDistance;

    public OnlyWaypointClientOptions(){
        this.onlyLastDeathWaypoint = true;
        this.dontRenderAfterDistance = Long.MAX_VALUE;
    }
}
