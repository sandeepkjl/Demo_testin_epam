package com.example.demo.greedyAlgorithm;

public class MeetingNode {
    int startTime;
    int endTime;

    public MeetingNode(int startTime, int endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }


    @Override
    public String toString() {
        return "MeetingNode{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
