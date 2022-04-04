package com.kodilla.collections.sets.homework;

import com.kodilla.collections.sets.Order;

import java.util.Objects;

public class Stamp {
    private String name;
    private String size;
    private boolean isStamped;

    public Stamp (String name, String size, boolean isStamped) {
        this.name = name;
        this.size = size;
        this.isStamped = isStamped;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public boolean geiIsStamped() {
        return isStamped;
    }

    @Override public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Stamp stamp = (Stamp) o;
        return Boolean.compare(stamp.isStamped, isStamped) == 0
                && this.name.equals(stamp.name)
                && this.size.equals(stamp.size);
    }

    @Override public int hashCode() {
        return Objects.hash(name, size, isStamped);
    }

    public String toString() {
        return "Stamp{" + "stamp name='" + name + '\'' + ", stamp size='"
                + size + '\'' + ", is stamped " + isStamped + '}';
    }
}
