/*
 * Decompiled with CFR 0.152.
 */
package top.bienvenido.date_24323;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public final class o9
extends ArrayList {
    public o9() {
    }

    public o9(int n10) {
        super(n10);
    }

    public o9(String string) {
        o9 o92 = this;
        super(1);
        super.add(string);
    }

    @Override
    public final boolean contains(Object object) {
        return this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(object) >= 0;
    }

    @Override
    public final boolean add(Object object) {
        int n10 = this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(object);
        if (n10 < 0) {
            this.add(~n10, object);
            return true;
        }
        return false;
    }

    @Override
    public final int lastIndexOf(Object object) {
        return this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(object);
    }

    @Override
    public final int indexOf(Object object) {
        return this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(object);
    }

    @Override
    public final boolean addAll(Collection collection) {
        boolean bl = false;
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (!this.add(iterator.next()) && !bl) {
                bl = false;
                continue;
            }
            bl = true;
        }
        return bl;
    }

    @Override
    public final boolean addAll(int n10, Collection collection) {
        return this.addAll(collection);
    }

    @Override
    public final boolean remove(Object object) {
        int n10 = this.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(object);
        if (n10 >= 0) {
            this.remove(n10);
            return true;
        }
        return false;
    }

    public final int \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(Object object) {
        int n10 = 0;
        int n11 = ((AbstractCollection)this).size() - 1;
        int n12 = object.hashCode();
        while (n10 <= n11) {
            int n13 = n10 + n11 >>> 1;
            int n14 = ((AbstractList)this).get(n13).hashCode();
            if (n14 < n12) {
                n10 = n13 + 1;
                continue;
            }
            if (n14 > n12) {
                n11 = n13 - 1;
                continue;
            }
            return n13;
        }
        return ~n10;
    }
}

