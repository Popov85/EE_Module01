package com.goit.g2popov.ee01;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Андрей on 10.08.2016.
 */
public final class AnalysisArrayList extends AnalysisAbstractList {
        public AnalysisArrayList(Object[] sourceArr, Object specimen, int position) {
                super(sourceArr, specimen, position);
                this.collection = new ArrayList<Object>();
                this.list = (List)collection;
        }
}