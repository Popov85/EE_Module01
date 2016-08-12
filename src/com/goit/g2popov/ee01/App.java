package com.goit.g2popov.ee01;

import com.goit.g2popov.ee01.report.Header;
import com.goit.g2popov.ee01.report.Report;
import com.goit.g2popov.ee01.report.Table;

/**
 * Created by Андрей on 10.08.2016.
 */
public class App {
        public static void main(String[] args) throws Exception {
                Header header= new Header();
                Table table = new Table();
                Report report = new Report(header, table);
                report.print();
                /*
                ArrayGenerator generator = new ArrayGenerator(10000);
                Object[] data = generator.generate();
                System.out.println(generator);
                SpeedometerSet set = new AnalysisHashSet(data, 90);

                System.out.println("---------------------HashSet---------------------------------");
                System.out.println("Populate: "+(double)set.populateTimeCalculate()/1000000+" ms.");
                set = new AnalysisHashSet(new ArrayGenerator(10000).generate(), 90);
                System.out.println("Populate: "+(double)set.populateTimeCalculate()/1000000+" ms.");
                set = new AnalysisHashSet(new ArrayGenerator(10000).generate(), 90);
                System.out.println("Populate: "+(double)set.populateTimeCalculate()/1000000+" ms.");
                set = new AnalysisHashSet(new ArrayGenerator(10000).generate(), 90);
                System.out.println("Populate: "+(double)set.populateTimeCalculate()/1000000+" ms.");
                set = new AnalysisHashSet(new ArrayGenerator(10000).generate(), 90);
                System.out.println("Populate: "+(double)set.populateTimeCalculate()/1000000+" ms.");
                set = new AnalysisHashSet(new ArrayGenerator(10000).generate(), 90);
                System.out.println("Add: "+(double)set.addTimeCalculate()/1000000+" ms.");
                System.out.println("Contains: "+(double)set.containsTimeCalculate()/1000000+" ms.");
                System.out.println("Remove: "+(double)set.removeTimeCalculate()/1000000+" ms.");

                double suit[] = new AverageCalculatorSet(data,0, 90).avg();

                System.out.println("---------------------AVG_HashSet---------------------------------");
                System.out.println("Populate: "+suit[0]+" ms.");
                System.out.println("Add: "+suit[1]/1000000+" ms.");
                System.out.println("Contains: "+suit[2]/1000000+" ms.");
                System.out.println("Remove: "+suit[3]/1000000+" ms.");

                System.out.println("---------------------TreeSet---------------------------------");
                set = new AnalysisTreeSet(data, 90);
                System.out.println("Populate: "+(float)set.populateTimeCalculate()/1000000+" ms.");
                System.out.println("Add: "+(float)set.addTimeCalculate()/1000000+" ms.");
                System.out.println("Contains: "+(float)set.containsTimeCalculate()/1000000+" ms.");
                System.out.println("Remove: "+(float)set.removeTimeCalculate()/1000000+" ms.");

                System.out.println("---------------------ArrayList---------------------------------");
                SpeedometerList list = new AnalysisArrayList(data, 90, 5);
                System.out.println("Populate: "+(float)list.populateTimeCalculate()/1000000+" ms.");
                System.out.println("Add: "+(float)list.addTimeCalculate()/1000000+" ms.");
                System.out.println("Contains: "+(float)list.containsTimeCalculate()/1000000+" ms.");
                System.out.println("Remove: "+(float)list.removeTimeCalculate()/1000000+" ms.");
                System.out.println("Get: "+(float)list.getTimeCalculate()/1000000+" ms.");
                System.out.println("Iterator add: "+(float)list.addIteratorTimeCalculate()/1000000+" ms.");
                System.out.println("Iterator remove: "+(float)list.removeIteratorTimeCalculate()/1000000+" ms.");

                System.out.println("---------------------LinkedList---------------------------------");
                list = new AnalysisLinkedList(data, 90, 5);
                System.out.println("Populate: "+(float)list.populateTimeCalculate()/1000000+" ms.");
                System.out.println("Add: "+(float)list.addTimeCalculate()/1000000+" ms.");
                System.out.println("Contains: "+(float)list.containsTimeCalculate()/1000000+" ms.");
                System.out.println("Remove: "+(float)list.removeTimeCalculate()/1000000+" ms.");
                System.out.println("Get: "+(float)list.getTimeCalculate()/1000000+" ms.");
                System.out.println("Iterator add: "+(float)list.addIteratorTimeCalculate()/1000000+" ms.");
                System.out.println("Iterator remove: "+(float)list.removeIteratorTimeCalculate()/1000000+" ms.");
                */
        }

}
