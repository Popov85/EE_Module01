package com.goit.g2popov.ee01;

import java.util.Arrays;
import java.util.Collection;

/**
 * Set is a collection that contains NO duplicate elements!
 */
public abstract class AnalysisAbstractSet implements SpeedometerSet {

        protected Object[] sourceArr;
        protected int length;
        protected Collection<Object> collection;
        protected Object specimen;

        protected AnalysisAbstractSet(Object sourceArr[], Object specimen) {
                if (sourceArr.length==0 || sourceArr==null) throw new IllegalArgumentException();
                this.sourceArr = sourceArr.clone();
                this.length = sourceArr.length;
                this.specimen = specimen;
        }

        @Override
        public long populateTimeCalculate() {
                long startTime = System.nanoTime();
                collection.addAll(Arrays.asList(sourceArr));
                long finishTime = System.nanoTime();
                return finishTime-startTime;
        }

        @Override
        public long addTimeCalculate() {
                long startTime = System.nanoTime();
                collection.add(new Integer(92));
                long finishTime = System.nanoTime();
                return finishTime-startTime;
        }

        @Override
        public long removeTimeCalculate() {
                long startTime = System.nanoTime();
                collection.remove(new Integer(92));
                long finishTime = System.nanoTime();
                return finishTime-startTime;
        }

        @Override
        public long containsTimeCalculate() {
                long startTime = System.nanoTime();
                collection.contains(specimen);
                long finishTime = System.nanoTime();
                return finishTime-startTime;
        }
}
