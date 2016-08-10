package com.goit.g2popov.ee01;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Андрей on 10.08.2016.
 */
public class AnalysisArrayList extends AnalysisAbstractList {
        public AnalysisArrayList(Object[] sourceArr, Object specimen) {
                super(sourceArr, specimen);
                this.collection = new ArrayList<Object>();
                this.list = (List)collection;
        }
}