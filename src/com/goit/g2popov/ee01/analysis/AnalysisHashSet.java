package com.goit.g2popov.ee01.analysis;

import java.util.HashSet;

/**
 * Created by Андрей on 09.08.2016.
 */
public final class AnalysisHashSet extends AnalysisAbstractSet {

        public AnalysisHashSet(Object sourceArr[], Object specimen) throws IllegalArgumentException {
                super(sourceArr, specimen);
                this.collection = new HashSet<Object>(length);
        }
}
