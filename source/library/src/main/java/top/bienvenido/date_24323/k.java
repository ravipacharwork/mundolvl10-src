package top.bienvenido.date_24323;

import android.system.Os;
import java.io.File;
import java.nio.file.Files;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/k.class */
public final class k {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Function1 f192;

    /* JADX INFO: renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public static final boolean m227(File file) {
        return Files.isSymbolicLink(file.toPath()) ? file.delete() : m232(file);
    }

    /* JADX INFO: renamed from: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机, reason: contains not printable characters */
    public static final boolean m228xaa30c2c7(File file) {
        if (Intrinsics.areEqual(file.getCanonicalPath(), file.getAbsolutePath())) {
            return m232(file);
        }
        return file.delete() || m232(file.getCanonicalFile());
    }

    static {
        f192 = AbstractC0065x6082d607.f502xaa30c2c7 ? k::m227 : k::m228xaa30c2c7;
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m230(File file) {
        try {
            Os.chmod(file.getAbsolutePath(), 493);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static void m231(File file) {
        try {
            if (file.exists() && file.isDirectory()) {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles == null) {
                    return;
                }
                for (File file2 : fileArrListFiles) {
                    if (file2.isFile()) {
                        file2.delete();
                    } else {
                        m232(file2);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public static boolean m232(File file) {
        try {
            if (!file.exists()) {
                return true;
            }
            if (!file.isDirectory()) {
                return file.delete();
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                for (File file2 : fileArrListFiles) {
                    if (file2.isFile()) {
                        if (!file2.delete()) {
                            String str = "Delete file " + file2 + " failed.";
                            return false;
                        }
                    } else if (!file2.isDirectory()) {
                        String str2 = "File " + file2 + " is not file, wtf?";
                        file2.delete();
                    } else if (!((Boolean) f192.invoke(file2)).booleanValue()) {
                        String str3 = "Delete directory " + file2 + " failed.";
                        return false;
                    }
                }
            }
            return file.delete();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static boolean m226(String str, String str2) {
        try {
            Os.symlink(str, str2);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
