package com.example.demo.greedyAlgorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MaximumMeetingOccurance {
    public static void main(String args[]){
        int startArray[] = {1,3,0,5,5,8};
        int endArray[] = {2,4,6,7,9,9};

        List<MeetingNode> list = new ArrayList<>();
        for(int i=0;i<startArray.length;i++){
            list.add(new MeetingNode(startArray[i],endArray[i]));
        }

        int c = noOfMeetings(list);
        System.out.println(c);

    }

    public static int noOfMeetings(List<MeetingNode> list){
        int i=0;
        int j=1;
        int n=1;
        Comparator<MeetingNode> comparator = Comparator.comparing(MeetingNode::getEndTime);
        Collections.sort(list,comparator);

        System.out.println(list);

       while(j<list.size()){
            if(list.get(i).getEndTime()<list.get(j).getStartTime()){
                i=j;
                j++;

                n++;

            }else{
                j++;
            }
        }

        return n;
    }

}
