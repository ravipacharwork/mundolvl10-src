package net_62v.external;

import java.io.File;
import top.bienvenido.date_24323.c6;
import top.bienvenido.date_24323.e5;
import top.bienvenido.date_24323.p0;
import top.bienvenido.date_24323.q1;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:net_62v/external/MetaStorageManager.class */
public final class MetaStorageManager {
    public static File obtainAppDataDir(String str, String str2) {
        File file = c6.f40;
        return q1.m428(c6.f40, str, str2);
    }

    public static String obtainAppExternalStorageDir(String str) {
        return ((p0) e5.f77xaa30c2c7.m221()).mo278x4f52efc(str);
    }

    @Deprecated
    public static void setExternalRootDirectory(String str) {
        ((p0) e5.f77xaa30c2c7.m221()).mo279(str);
    }

    public static File obtainAppDataDir(String str, int i) {
        return obtainAppDataDir(str, String.valueOf(i));
    }
}
