package com.goit.g2popov.ee01.analysis;

/**
 * Created by Андрей on 09.08.2016.
 */
public interface SpeedometerList extends SpeedometerSet {

        long getTimeCalculate();

        long addIteratorTimeCalculate();

        long removeIteratorTimeCalculate();

}
