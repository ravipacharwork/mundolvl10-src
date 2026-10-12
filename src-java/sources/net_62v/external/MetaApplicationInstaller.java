package net_62v.external;

import top.bienvenido.date_24323.e5;
import top.bienvenido.date_24323.p0;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:net_62v/external/MetaApplicationInstaller.class */
public final class MetaApplicationInstaller {
    public static int cloneApp(String str, String str2) {
        e5 e5Var = e5.f77xaa30c2c7;
        int iMo285 = ((p0) e5Var.m221()).mo285(str, 2);
        ((p0) e5Var.m221()).mo286(str, str2);
        return iMo285;
    }

    public static int installAppByPath(String str) {
        return ((p0) e5.f77xaa30c2c7.m221()).mo285(str, 0);
    }

    public static int installAppByPathAndMove(String str) {
        return ((p0) e5.f77xaa30c2c7.m221()).mo285(str, 3);
    }

    public static int installAppsByPath(String str) {
        return ((p0) e5.f77xaa30c2c7.m221()).mo285(str, 1);
    }

    public static int installAppsByPathAndMove(String str) {
        return ((p0) e5.f77xaa30c2c7.m221()).mo285(str, 4);
    }

    public static String convertResultToString(int i) {
        return "Not Support.";
    }

    public static int cloneApp(String str) {
        return cloneApp(str, "0");
    }
}
