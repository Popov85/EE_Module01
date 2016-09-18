package ee01.analysis;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Андрей on 10.08.2016.
 */
public final class AnalysisLinkedList extends AnalysisAbstractList {
        public AnalysisLinkedList(Object[] sourceArr, Object specimen, int position) {
                super(sourceArr, specimen, position);
                this.collection = new LinkedList<Object>();
                this.list = (List)collection;
        }
}
