package ee01.analysis;

/**
 * Created by Андрей on 11.08.2016.
 */
public abstract class AbstractAverageCalculator {

        protected static final int DEFAULT_OBSERVATIONS = 100;

        protected Object[] arr;
        protected int observations;
        protected int type;
        protected Object specimen;

        protected AbstractAverageCalculator(Object[] arr, int type, Object specimen) {
                this(arr, DEFAULT_OBSERVATIONS, type, specimen);
        }

        protected AbstractAverageCalculator(Object[] arr, int numberOfObservations, int type, Object specimen) {
                this.arr = arr.clone();
                this.observations = numberOfObservations;
                this.type = type;
                this.specimen = specimen;
        }

        public abstract double[] avg() throws Exception;

        public abstract String getType();
}
