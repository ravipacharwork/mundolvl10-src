package net_62v.external;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:net_62v/external/IMundoProcessCallback.class */
public interface IMundoProcessCallback {
    default void onCreate(String str, String str2) {
    }

    default void onInitialized() {
    }

    default boolean shouldInterpretFacebookBrowser() {
        return false;
    }

    default void onCreate(String str, String str2, String str3) {
        onCreate(str, str2);
    }
}
