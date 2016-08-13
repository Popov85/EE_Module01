package com.goit.g2popov.ee01.analysis;

/**
 * Created by Андрей on 11.08.2016.
 */
public class AverageCalculatorList extends AbstractAverageCalculator {

        protected static final int DEFAULT_POSITION = 5000;

        /* Position at which we get element from a list*/
        private int position;

        public AverageCalculatorList(Object[] arr, int type, Object specimen) {
                super(arr, DEFAULT_OBSERVATIONS, type, specimen);
                this.position = DEFAULT_POSITION;
        }
        public AverageCalculatorList(Object[] arr, int type, Object specimen, int position) {
                super(arr, DEFAULT_OBSERVATIONS, type, specimen);
                this.position = position;
        }

        public AverageCalculatorList(Object[] arr, int observations, int type, Object specimen) {
                super(arr, observations, type, specimen);
        }

        @Override
        public double[] avg() throws Exception {
                SpeedometerList list;
                double populate = 0, add = 0, contains = 0, remove = 0, get = 0, iadd = 0, iremove = 0;
                for (int i = 0; i < observations; i++) {
                        list = getCollection(type);
                        populate += (double)list.populateTimeCalculate();
                        add += (double)list.addTimeCalculate();
                        contains += (double)list.containsTimeCalculate();
                        remove += (double)list.removeTimeCalculate();
                        get += (double)list.getTimeCalculate();
                        iadd += (double)list.addIteratorTimeCalculate();
                        iremove += (double)list.removeIteratorTimeCalculate();
                }
                double avgData[] = new double[7];
                avgData[0] = populate/observations;
                avgData[1] = add/observations;
                avgData[2] = contains/observations;
                avgData[3] = remove/observations;
                avgData[4] = get/observations;
                avgData[5] = iadd/observations;
                avgData[6] = iremove/observations;
                return avgData;
        }
        private SpeedometerList getCollection(int type) throws Exception {
                SpeedometerList list = null;
                switch(type){
                        case 0:
                                list = new AnalysisArrayList(arr, specimen, position);
                                break;
                        case 1:
                                list = new AnalysisLinkedList(arr, specimen, position);
                                break;
                        default:
                                throw new Exception("Wrong type!");
                }
                return list;
        }

        @Override
        public String getType() {
                return type==0 ? "ArrayList":"LinkedList";
        }
}
