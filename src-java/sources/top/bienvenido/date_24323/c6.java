package top.bienvenido.date_24323;

import android.os.Build;
import java.io.File;
import java.util.Iterator;
import kotlin.io.FileTreeWalk;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.text.HexExtensionsKt;
import kotlin.text.HexFormat;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/c6.class */
public abstract class c6 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final File f40 = b3.f17.getDir(HexExtensionsKt.toHexString$default((b3.f18 + Build.MANUFACTURER + Build.MODEL + Build.BRAND).hashCode(), (HexFormat) null, 1, (Object) null), 0);

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m106(String str, String str2) {
        File fileM428 = (str2 == null || str2.length() == 0) ? q1.m428(f40, str) : q1.m428(f40, str, str2);
        if (fileM428.exists()) {
            FileTreeWalk fileTreeWalkWalkBottomUp = FilesKt.walkBottomUp(fileM428);
            Function1 function1 = k.f192;
            Iterator it = fileTreeWalkWalkBottomUp.iterator();
            while (it.hasNext()) {
                k.m230((File) it.next());
            }
            Function1 function2 = k.f192;
            k.m232(fileM428);
        }
    }
}
