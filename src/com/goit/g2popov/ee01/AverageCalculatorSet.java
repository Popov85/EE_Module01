package com.goit.g2popov.ee01;

/**
 * Created by Андрей on 11.08.2016.
 */
public class AverageCalculatorSet extends AbstractAverageCalculator {

        public AverageCalculatorSet(Object[] arr, int type, Object specimen) {
                super(arr, DEFAULT_OBSERVATIONS, type, specimen);
        }

        public AverageCalculatorSet(Object[] arr, int observations, int type, Object specimen) {
                super(arr, observations, type, specimen);
        }

        @Override
        public double[] avg() throws Exception {
                SpeedometerSet set;
                float populate = 0, add = 0, contains = 0, remove = 0;
                for (int i = 0; i < observations; i++) {
                        set = getCollection(type);
                        populate += (double)set.populateTimeCalculate();
                        add += (double)set.addTimeCalculate();
                        contains += (double)set.containsTimeCalculate();
                        remove += (double)set.removeTimeCalculate();
                }
                double avgData[] = new double[4];
                avgData[0] = populate/observations;
                avgData[1] = add/observations;
                avgData[2] = contains/observations;
                avgData[3] = remove/observations;
                return avgData;
        }

        private SpeedometerSet getCollection(int type) throws Exception {
                SpeedometerSet set = null;
                switch(type){
                        case 0:
                                set = new AnalysisHashSet(arr, specimen);
                                break;
                        case 1:
                                set = new AnalysisTreeSet(arr, specimen);
                                break;
                        default:
                                throw new Exception("Wrong type!");
                        }
                return set;
        }
}

