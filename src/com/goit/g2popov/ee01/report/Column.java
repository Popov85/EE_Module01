package com.goit.g2popov.ee01.report;

import com.goit.g2popov.ee01.AbstractAverageCalculator;

/**
 * Created by Андрей on 12.08.2016.
 */
public class Column {

        private AbstractAverageCalculator avgCalculator;
        private String collectionName;

        public Column(AbstractAverageCalculator avgCalculator, String collectionName) {
                this.avgCalculator = avgCalculator;
                this.collectionName = collectionName;
        }

        public void printColumn() throws Exception {
                double suit[] = avgCalculator.avg();
                System.out.println("---------------------"+this.collectionName+"---------------------------------");
                for(Double avg : suit){
                        System.out.println(avg/1000000+" ms");
                }
        }

}
