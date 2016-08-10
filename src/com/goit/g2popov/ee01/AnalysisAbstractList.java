package com.goit.g2popov.ee01;

import java.util.List;
import java.util.ListIterator;

/**
 * Created by Андрей on 10.08.2016.
 */
public abstract class AnalysisAbstractList extends AnalysisAbstractSet implements SpeedometerList {

        protected List<Object> list;

        protected AnalysisAbstractList(Object[] sourceArr, Object specimen) {
                super(sourceArr, specimen);
                this.list = (List)collection;
        }

        @Override
        public long getTimeCalculate() {
                long startTime = System.nanoTime();
                System.out.println(list.toString());
                list.get(5);
                long finishTime = System.nanoTime();
                return finishTime-startTime;
        }

        @Override
        public long addIteratorTimeCalculate() {
                long startTime = System.nanoTime();
                ListIterator<Object> iterator = list.listIterator();
                iterator.add(new Integer(93));
                long finishTime = System.nanoTime();
                return finishTime-startTime;
        }

        @Override
        public long removeIteratorTimeCalculate() {
                long startTime = System.nanoTime();
                ListIterator<Object> iterator = list.listIterator();
                iterator.next();
                iterator.remove();
                long finishTime = System.nanoTime();
                return finishTime-startTime;
        }
}
