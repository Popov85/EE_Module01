package com.goit.g2popov.ee01.report;

import com.goit.g2popov.ee01.*;

/**
 * Created by Андрей on 12.08.2016.
 */
public class Table {

        public void print(int arraySize, int number) throws Exception {
                printTableHeader(arraySize, number);
                printFirstColumn();
                Integer data[] = new ArrayGenerator(arraySize).generate();
                printColumn(0, data);
                printColumn(1, data);
                printColumn(2, data);
                printColumn(3, data);
        }

        private void printTableHeader(int arraySize, int number) {
                System.out.println("Table #"+number+" (Capacity: " + arraySize+")");
        }

        private void printFirstColumn() {
                System.out.println(
                        "Populate\n"+
                        "Add\n"+
                        "Contains\n"+
                        "Remove\n"+
                        "Get\n"+
                        "IterAdd\n"+
                        "IterRemove\n"
                );
        }

        private void printColumn(int code, Integer data[]) throws Exception {
                AbstractAverageCalculator collection = getCollection(code, data);
                Column column = new Column(collection, collection.getType());
                column.printColumn();
        }

        private AbstractAverageCalculator getCollection(int code, Integer data[]) throws Exception {
                AbstractAverageCalculator collection = null;
                switch(code){
                        case 0:
                                collection = new AverageCalculatorSet(data,0, 90);
                                break;
                        case 1:
                                collection = new AverageCalculatorSet(data,1, 90);
                                break;
                        case 2:
                                collection = new AverageCalculatorList(data,0, 90);
                                break;
                        case 3:
                                collection = new AverageCalculatorList(data,1, 90);
                                break;
                        default:
                                throw new Exception("Wrong type!");
                }
                return collection;
        }
}
