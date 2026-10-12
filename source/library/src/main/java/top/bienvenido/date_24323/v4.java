package top.bienvenido.date_24323;

import android.content.Context;
import android.os.Build;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.HexExtensionsKt;
import kotlin.text.HexFormat;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/v4.class */
public abstract class v4 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static File f361;

    static {
        Context context = b3.f17;
        File obbDir = context.getObbDir();
        File codeCacheDir = obbDir;
        if (obbDir == null) {
            codeCacheDir = context.getCodeCacheDir();
        }
        f361 = new File(codeCacheDir, HexExtensionsKt.toHexString$default((b3.f18 + "c1st" + Build.MANUFACTURER + Build.MODEL + Build.BRAND).hashCode(), (HexFormat) null, 1, (Object) null));
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m524() {
        u2 u2Var;
        Iterator<StorageVolume> it;
        q2 q2Var;
        u2 s2Var;
        r2 r2Var;
        try {
            Context context = b3.f17;
            StorageManager storageManager = (StorageManager) context.getSystemService("storage");
            File[] obbDirs = context.getObbDirs();
            if (AbstractC0065x6082d607.f500) {
                it = storageManager.getStorageVolumes().iterator();
            } else {
                try {
                    Method declaredMethod = StorageManager.class.getDeclaredMethod("getVolumeList", i.f159);
                    declaredMethod.setAccessible(true);
                    u2Var = q2Var;
                    q2Var = new q2(declaredMethod);
                } catch (Exception unused) {
                    u2Var = u2.f337;
                }
                it = ArrayIteratorKt.iterator((StorageVolume[]) u2Var.mo432((Object) storageManager, new Object[0]));
            }
            Iterator<StorageVolume> it2 = it;
            try {
                Field declaredField = StorageVolume.class.getDeclaredField("mPath");
                declaredField.setAccessible(true);
                if ((declaredField.getModifiers() & 8) == 0 && !declaredField.getType().isPrimitive()) {
                    s2Var = new s2(ca.f51.objectFieldOffset(declaredField));
                } else {
                    s2Var = r2Var;
                    r2Var = new r2(declaredField);
                }
            } catch (Exception unused2) {
                s2Var = u2.f337;
            }
            while (it2.hasNext()) {
                StorageVolume next = it2.next();
                if (next.isRemovable() && Intrinsics.areEqual(next.getState(), "mounted")) {
                    File file = (File) s2Var.mo393(next);
                    if (file == null) {
                        continue;
                    } else {
                        for (File file2 : obbDirs) {
                            if (StringsKt.startsWith$default(file2.getAbsolutePath(), file.getAbsolutePath(), false, 2, (Object) null)) {
                                f361 = new File(file2, HexExtensionsKt.toHexString$default((b3.f18 + "c1st" + Build.MANUFACTURER + Build.MODEL + Build.BRAND).hashCode(), (HexFormat) null, 1, (Object) null));
                                return;
                            }
                        }
                    }
                }
            }
        } catch (Exception unused3) {
        }
    }
}
