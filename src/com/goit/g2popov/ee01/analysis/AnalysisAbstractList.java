package com.goit.g2popov.ee01.analysis;

import java.util.List;
import java.util.ListIterator;

/**
 * Created by Андрей on 10.08.2016.
 */
public abstract class AnalysisAbstractList extends AnalysisAbstractSet implements SpeedometerList {

        protected List<Object> list;
        protected int position;

        protected AnalysisAbstractList(Object[] sourceArr, Object specimen, int position) {
                super(sourceArr, specimen);
                this.list = (List)collection;
                this.position = position;
        }

        @Override
        public long getTimeCalculate() {
                long startTime = System.nanoTime();
                list.get(position);
                long finishTime = System.nanoTime();
                return finishTime-startTime;
        }

        @Override
        public long addIteratorTimeCalculate() {
                long startTime = System.nanoTime();
                ListIterator<Object> iterator = list.listIterator();
                iterator.add(specimen);
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
