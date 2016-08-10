package com.goit.g2popov.ee01;

/**
 * Created by Андрей on 10.08.2016.
 */
public class App {
        public static void main(String[] args) {
                Integer data[] = {10,20,30,40,50,60,71,80,90,91};
                SpeedometerSet set = new AnalysisHashSet(data, 90);

                System.out.println("---------------------HashSet---------------------------------");
                System.out.println("Populate: "+(float)set.populateTimeCalculate()/1000+" ms.");
                System.out.println("Add: "+(float)set.addTimeCalculate()/1000+" ms.");
                System.out.println("Contains: "+(float)set.containsTimeCalculate()/1000+" ms.");
                System.out.println("Remove: "+(float)set.removeTimeCalculate()/1000+" ms.");

                System.out.println("---------------------TreeSet---------------------------------");
                set = new AnalysisTreeSet(data, 90);
                System.out.println("Populate: "+(float)set.populateTimeCalculate()/1000+" ms.");
                System.out.println("Add: "+(float)set.addTimeCalculate()/1000+" ms.");
                System.out.println("Contains: "+(float)set.containsTimeCalculate()/1000+" ms.");
                System.out.println("Remove: "+(float)set.removeTimeCalculate()/1000+" ms.");

                System.out.println("---------------------ArrayList---------------------------------");
                SpeedometerList list = new AnalysisArrayList(data, 90);
                System.out.println("Populate: "+(float)list.populateTimeCalculate()/1000+" ms.");
                System.out.println("Add: "+(float)list.addTimeCalculate()/1000+" ms.");
                System.out.println("Contains: "+(float)list.containsTimeCalculate()/1000+" ms.");
                System.out.println("Remove: "+(float)list.removeTimeCalculate()/1000+" ms.");
                System.out.println("Get: "+(float)list.getTimeCalculate()/1000+" ms.");
                System.out.println("Iterator add: "+(float)list.addIteratorTimeCalculate()/1000+" ms.");
                System.out.println("Iterator remove: "+(float)list.removeIteratorTimeCalculate()/1000+" ms.");

                System.out.println("---------------------LinkedList---------------------------------");
                list = new AnalysisLinkedList(data, 90);
                System.out.println("Populate: "+(float)list.populateTimeCalculate()/1000+" ms.");
                System.out.println("Add: "+(float)list.addTimeCalculate()/1000+" ms.");
                System.out.println("Contains: "+(float)list.containsTimeCalculate()/1000+" ms.");
                System.out.println("Remove: "+(float)list.removeTimeCalculate()/1000+" ms.");
                System.out.println("Get: "+(float)list.getTimeCalculate()/1000+" ms.");
                System.out.println("Iterator add: "+(float)list.addIteratorTimeCalculate()/1000+" ms.");
                System.out.println("Iterator remove: "+(float)list.removeIteratorTimeCalculate()/1000+" ms.");
        }
}
