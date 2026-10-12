package top.bienvenido.date_24323;

import android.os.Process;
import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/c2.class */
public abstract class c2 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final boolean f33;

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final File f34;

    static {
        boolean zIs64Bit;
        try {
            zIs64Bit = AbstractC0065x6082d607.f499 ? Process.is64Bit() : ((Boolean) ea.f86xaa30c2c7.mo432(ea.f82, new Object[0])).booleanValue();
        } catch (Throwable unused) {
            zIs64Bit = true;
        }
        f33 = zIs64Bit;
        f34 = b3.f17.getDir("interior", 0);
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static File m98(String str) {
        File file = new File(b3.f17.getCodeCacheDir(), str);
        try {
            if (!file.exists()) {
                file.mkdir();
            }
            File[] fileArrListFiles = new File(f34, str).listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    if (file2.isFile() && StringsKt.endsWith$default(file2.getName(), ".apk", false, 2, (Object) null)) {
                        file2.renameTo(new File(file, file2.getName()));
                    }
                }
            }
        } catch (Exception unused) {
        }
        return file;
    }

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static File m99(String str) {
        File fileM428 = q1.m428(f34, str, "lib");
        fileM428.mkdirs();
        File file = new File(fileM428, f33 ? "arm64" : "arm");
        if (!file.exists()) {
            Function1 function1 = k.f192;
            if (!k.m226(fileM428.getAbsolutePath(), file.getAbsolutePath())) {
                return fileM428;
            }
        }
        return file;
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static File m100(boolean z) {
        File file = new File(b3.f17.getCodeCacheDir(), "apks");
        if (!z) {
            return file;
        }
        file.mkdirs();
        return file;
    }
}
