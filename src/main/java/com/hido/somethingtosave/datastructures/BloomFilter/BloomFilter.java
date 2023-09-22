package com.hido.somethingtosave.datastructures.BloomFilter;

import java.util.BitSet;

public class BloomFilter<T> {

    private int numberOfHashFunctions;
    private BitSet bitArray;
    private Hash<T>[] hashFunctions;

    public BloomFilter(int numberOfHashFunctions, int n) {
        this.numberOfHashFunctions = numberOfHashFunctions;
        hashFunctions = new Hash[numberOfHashFunctions];
        bitArray = new BitSet(n);
        insertHash();
    }

    private void insertHash() {
        for (int i = 0; i < numberOfHashFunctions; i++) {
            hashFunctions[i] = new Hash(i);
        }
    }

    public void insert(T key) {
        for (Hash<T> hash : hashFunctions) {
            int position = hash.compute(key) % bitArray.size();
            bitArray.set(position);
        }
    }

    public boolean contains(T key) {
        for (Hash<T> hash : hashFunctions) {
            int position = hash.compute(key) % bitArray.size();
            if (!bitArray.get(position)) {
                return false;
            }
        }
        return true;
    }

    private class Hash<T> {

        int index;

        public Hash(int index) {
            this.index = index;
        }

        public int compute(T key) {
            return index * asciiString(String.valueOf(key));
        }

        private int asciiString(String word) {
            int number = 0;
            for (int i = 0; i < word.length(); i++) {
                number += word.charAt(i);
            }
            return number;
        }
    }


    public static void main(String[] args) {
        BloomFilter<Integer> bloomFilter = new BloomFilter<>(3, 30);
        bloomFilter.insert(3);
        bloomFilter.insert(10);

        System.out.println(bloomFilter.contains(3));//true
        System.out.println(bloomFilter.contains(17));//false

        BloomFilter<String> bloomFilter1 = new BloomFilter<>(4, 40);
        bloomFilter1.insert("vanhieu");
        bloomFilter1.insert("hido");

        System.out.println(bloomFilter1.contains("vanhieu"));//true
        System.out.println(bloomFilter1.contains("dohieu"));//false
    }
}
