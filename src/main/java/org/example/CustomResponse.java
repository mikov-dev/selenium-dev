package org.example;

import org.testng.internal.collections.Pair;

public class CustomResponse <K, V> extends Pair<K, V> {

    public CustomResponse(K first, V second) {
        super(first, second);
    }

}
