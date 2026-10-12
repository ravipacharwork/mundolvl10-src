/*
 * Decompiled with CFR 0.152.
 */
package net_62v.external;

public interface IMundoProcessCallback {
    default public void onCreate(String string, String string2) {
    }

    default public void onCreate(String string, String string2, String string3) {
        this.onCreate(string, string2);
    }

    default public void onInitialized() {
    }

    default public boolean shouldInterpretFacebookBrowser() {
        return false;
    }
}

