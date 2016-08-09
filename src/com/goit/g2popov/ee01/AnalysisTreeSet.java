package com.goit.g2popov.ee01;

import java.util.TreeSet;

/**
 * Created by Андрей on 09.08.2016.
 */
public final class AnalysisTreeSet extends AnalysisAbstractSet {

        public AnalysisTreeSet(Object[] sourceArr, Object specimen) {
                super(sourceArr, specimen);
                this.set = new TreeSet<Object>();
        }
}
