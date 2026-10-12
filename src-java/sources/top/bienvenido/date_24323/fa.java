package top.bienvenido.date_24323;

import android.os.UserHandle;
import android.os.storage.StorageVolume;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import top.bienvenido.mundo.blockade.sm.C0082;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/fa.class */
public final class fa extends C0082 {

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final fa f108 = new fa();

    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public static Function3 f109 = fa::m149;

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final Unit m148(u2 u2Var, StorageVolume storageVolume, StorageVolume[] storageVolumeArr, p0 p0Var) {
        String strMo278x4f52efc = p0Var.mo278x4f52efc(f4.f92);
        if (strMo278x4f52efc != null) {
            File file = new File(strMo278x4f52efc);
            file.mkdirs();
            Unit unit = Unit.INSTANCE;
            u2Var.mo394(storageVolume, file);
            f109 = (v1, v2, v3) -> {
                return m147(r0, v1, v2, v3);
            };
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final Object m149(Object obj, Method method, Object[] objArr) {
        u2 s2Var;
        r2 r2Var;
        Object objMo1 = super.mo1(obj, method, objArr);
        try {
            if (f4.f91 && (objMo1 instanceof Object[])) {
                StorageVolume[] storageVolumeArr = (StorageVolume[]) objMo1;
                if (storageVolumeArr.length == 0) {
                    return objMo1;
                }
                try {
                    Field declaredField = StorageVolume.class.getDeclaredField("mPath");
                    declaredField.setAccessible(true);
                    if ((declaredField.getModifiers() & 8) == 0 && !declaredField.getType().isPrimitive()) {
                        s2Var = new s2(ca.f51.objectFieldOffset(declaredField));
                    } else {
                        s2Var = r2Var;
                        r2Var = new r2(declaredField);
                    }
                } catch (Exception unused) {
                    s2Var = u2.f337;
                }
                for (StorageVolume storageVolume : storageVolumeArr) {
                    if (Intrinsics.areEqual(storageVolume.getState(), "mounted")) {
                        StorageVolume[] storageVolumeArr2 = new StorageVolume[1];
                        storageVolumeArr2[0] = storageVolume;
                        u2 u2Var = s2Var;
                        e5.f77xaa30c2c7.m222((v3) -> {
                            return m148(r2, r3, r4, v3);
                        });
                        return storageVolumeArr2;
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        return objMo1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static void m151(String str) {
        try {
            Object objAllocateInstance = ca.f51.allocateInstance(StorageVolume.class);
            File file = new File(str);
            t2.m483(StorageVolume.class, "mPath").mo394(objAllocateInstance, file);
            t2.m483(StorageVolume.class, "mInternalPath").mo394(objAllocateInstance, file);
            t2.m483(StorageVolume.class, "mDescription").mo394(objAllocateInstance, "external");
            t2.m483(StorageVolume.class, "mId").mo394(objAllocateInstance, "0");
            t2.m483(StorageVolume.class, "mState").mo394(objAllocateInstance, "mounted");
            t2.m483(StorageVolume.class, "mOwner").mo394(objAllocateInstance, UserHandle.getUserHandleForUid(0));
            StorageVolume[] storageVolumeArr = {objAllocateInstance};
            f109 = (v1, v2, v3) -> {
                return m146(r0, v1, v2, v3);
            };
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final StorageVolume[] m147(StorageVolume[] storageVolumeArr, Object obj, Method method, Object[] objArr) {
        return storageVolumeArr;
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final StorageVolume[] m146(StorageVolume[] storageVolumeArr, Object obj, Method method, Object[] objArr) {
        return storageVolumeArr;
    }

    @Override // top.bienvenido.mundo.blockade.sm.C0082, top.bienvenido.date_24323.n1, top.bienvenido.date_24323.d2
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final Object mo1(Object obj, Method method, Object[] objArr) {
        return f109.invoke(obj, method, objArr);
    }
}
