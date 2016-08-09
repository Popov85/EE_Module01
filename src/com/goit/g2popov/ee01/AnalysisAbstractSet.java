package com.goit.g2popov.ee01;

import java.util.Arrays;
import java.util.Set;

/**
 * Created by Андрей on 09.08.2016.
 */
public abstract class AnalysisAbstractSet implements SpeedometerSet {

        protected Object[] sourceArr;
        protected int length;
        protected Set<Object> set;
        protected Object specimen;

        protected AnalysisAbstractSet(Object sourceArr[], Object specimen) {
                if (sourceArr.length==0 || sourceArr==null) throw new IllegalArgumentException();
                this.sourceArr = sourceArr.clone();
                this.length = sourceArr.length;
                this.set = null;
                this.specimen = specimen;
        }

        @Override
        public long populateTimeCalculate() {
                long startTime = System.nanoTime();
                set.addAll(Arrays.asList(sourceArr));
                long finishTime = System.nanoTime();
                return finishTime-startTime;
        }

        @Override
        public long addTimeCalculate() {
                long startTime = System.nanoTime();
                for (int i = 0; i < length; i++) {
                        set.add(sourceArr[i]);
                }
                long finishTime = System.nanoTime();
                return finishTime-startTime;
        }

        @Override
        public long removeTimeCalculate() {
                long startTime = System.nanoTime();
                for (int i = 0; i < length; i++) {
                        set.remove(i);
                }
                long finishTime = System.nanoTime();
                return finishTime-startTime;
        }

        @Override
        public long containsTimeCalculate() {
                long startTime = System.nanoTime();
                set.contains(specimen);
                long finishTime = System.nanoTime();
                return finishTime-startTime;
        }
}
