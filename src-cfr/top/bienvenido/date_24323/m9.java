/*
 * Decompiled with CFR 0.152.
 */
package top.bienvenido.date_24323;

public abstract class m9 {
    public static int[] \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070(int[] nArray, int n10, int n11, int n12) {
        if (n10 + 1 <= nArray.length) {
            int[] nArray2 = nArray;
            int n13 = n10;
            n10 = n11 + 1;
            int n14 = n13 - n11;
            System.arraycopy(nArray2, n11, nArray, n10, n14);
            nArray2[n11] = n12;
            return nArray;
        }
        int[] nArray3 = new int[(n10 | 1) << 1];
        int n15 = n11;
        System.arraycopy(nArray, 0, nArray3, 0, n11);
        nArray3[n11] = n12;
        int n16 = n11 + 1;
        n11 = nArray.length - n11;
        System.arraycopy(nArray, n15, nArray3, n16, n11);
        return nArray3;
    }
}

