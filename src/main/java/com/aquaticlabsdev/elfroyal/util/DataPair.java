package com.aquaticlabsdev.elfroyal.util;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DataPair<K, V> {

  private K key;
  private V value;

  public DataPair(K key, V value) {
    this.key = key;
    this.value = value;
  }

}