package top.bienvenido.date_24323;

import android.content.pm.ApplicationInfo;
import android.content.pm.SharedLibraryInfo;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/p.class */
public final class p extends d2 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final n8 f267;

    public p(n8 n8Var) {
        this.f267 = n8Var;
    }

    @Override // top.bienvenido.date_24323.d2
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo1(Object obj, Method method, Object[] objArr) {
        Object objMo1 = this.f267.mo1(obj, method, objArr);
        try {
            if ((objMo1 instanceof ApplicationInfo) && Intrinsics.areEqual(((ApplicationInfo) objMo1).packageName, f4.f92) && !f4.f96) {
                List list = (List) f9.f100.f270.mo393(objMo1);
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.areEqual("com.huawei.easygo", ((SharedLibraryInfo) it.next()).getName())) {
                            it.remove();
                        }
                    }
                }
                String[] strArr = ((ApplicationInfo) objMo1).sharedLibraryFiles;
                if (strArr == null || strArr.length == 0) {
                    return objMo1;
                }
                ArrayList arrayList = new ArrayList(strArr.length);
                for (String str : strArr) {
                    if (!StringsKt.endsWith$default(str, "HwEasyGo.apk", false, 2, (Object) null)) {
                        arrayList.add(str);
                    }
                }
                if (strArr.length != arrayList.size()) {
                    ((ApplicationInfo) objMo1).sharedLibraryFiles = (String[]) arrayList.toArray(i.f161);
                    return objMo1;
                }
            }
        } catch (Exception unused) {
        }
        return objMo1;
    }
}
