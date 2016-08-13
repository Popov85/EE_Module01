package com.goit.g2popov.ee01.analysis;

import java.util.Random;

/**
 * Created by Андрей on 11.08.2016.
 */
public class ArrayGenerator {

        private int capacity;
        private Integer[] arr;

        public ArrayGenerator(int capacity) {
                this.capacity = capacity;
        }

        public Integer[] generate() {
                Random random = new Random();
                Integer[] arr = new Integer[capacity];
                for (int i = 0; i < capacity ; i++) {
                       arr[i] = random.nextInt(capacity);
                }
                this.arr = arr;
                return arr;
        }

        @Override
        public String toString() {
                String str = "TOP 100: [";
                for (int i = 0; i < 100 ; i++) {
                        str+=this.arr[i]+" ;";
                }
                return str+"]";
        }
}
