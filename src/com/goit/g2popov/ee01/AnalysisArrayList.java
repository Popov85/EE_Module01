package com.goit.g2popov.ee01;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Андрей on 10.08.2016.
 */
public class AnalysisArrayList extends AnalysisAbstractSet implements SpeedometerList {

        protected List<Object> list;

        public AnalysisArrayList(Object[] sourceArr, Object specimen) {
                super(sourceArr, specimen, new ArrayList<Object>());
                this.list = (List)collection;
        }

        @Override
        public long getTimeCalculate() {
                long startTime = System.nanoTime();
                list.get(5);
                long finishTime = System.nanoTime();
                return finishTime-startTime;
        }

        @Override
        public long addIteratorTimeCalculate() {
                list.clear();
                long startTime = System.nanoTime();
                ListIterator<Object> iterator = list.listIterator();
                iterator.add(new Object());
                for (int j = 0; j < length; j++) {
                        iterator.add(sourceArr[j]);
                }
                long finishTime = System.nanoTime();
                return finishTime-startTime;
        }

        @Override
        public long removeIteratorTimeCalculate() {
                long startTime = System.nanoTime();
                for (ListIterator<Object> iter = list.listIterator(); iter.hasNext();) {
                        iter.next();
                        iter.remove();
                }
                long finishTime = System.nanoTime();
                //System.out.println("List size after deletion: "+list.size());
                return finishTime-startTime;
        }
}
