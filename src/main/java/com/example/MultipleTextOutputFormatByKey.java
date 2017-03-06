package com.example;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.mapred.lib.MultipleTextOutputFormat;

/**
 * Created by igor on 06.03.17.
 */
public class MultipleTextOutputFormatByKey<K, V> extends MultipleTextOutputFormat<K, V> {

    @Override
    protected String generateFileNameForKeyValue(K key, V value, String name) {
        return new Path(key.toString(), name).toString();
    }

    @Override
    protected K generateActualKey(K key, V value) {
        return null;
    }
}
