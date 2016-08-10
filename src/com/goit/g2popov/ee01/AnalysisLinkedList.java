package com.goit.g2popov.ee01;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Андрей on 10.08.2016.
 */
public class AnalysisLinkedList extends AnalysisAbstractList {
        public AnalysisLinkedList(Object[] sourceArr, Object specimen) {
                super(sourceArr, specimen);
                this.collection = new LinkedList<Object>();
                this.list = (List)collection;
        }
}
