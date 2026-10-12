package top.bienvenido.date_24323;

import android.content.pm.ResolveInfo;
import java.io.File;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/q1.class */
public abstract class q1 {
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final boolean m427(int i, int i2) {
        return (i & i2) == i2;
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final File m428(File file, String... strArr) {
        int i = 0;
        int length = strArr.length;
        while (i < length) {
            String str = strArr[i];
            i++;
            file = new File(file, str);
        }
        return file;
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final List m429(List list) {
        Function2 function2 = q1::m430;
        CollectionsKt.sortWith(list, (v1, v2) -> {
            return m431(r2, v1, v2);
        });
        return list;
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final int m431(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final int m430(ResolveInfo resolveInfo, ResolveInfo resolveInfo2) {
        int i = resolveInfo.priority;
        int i2 = resolveInfo2.priority;
        if (i != i2) {
            return i > i2 ? -1 : 1;
        }
        boolean z = resolveInfo.isDefault;
        if (z != resolveInfo2.isDefault) {
            return z ? -1 : 1;
        }
        return 0;
    }
}
