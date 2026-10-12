package top.bienvenido.date_24323;

import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/o2.class */
public final class o2 extends u2 {

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final /* synthetic */ String f259;

    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public final /* synthetic */ p2 f260;

    public o2(String str, p2 p2Var) {
        this.f259 = str;
        this.f260 = p2Var;
    }

    @Override // top.bienvenido.date_24323.u2
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final Object mo393(Object obj) {
        u2 u2VarM395 = m395(obj);
        if (u2VarM395 != null) {
            return u2VarM395.mo393(obj);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0037 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x0039 A[Catch: all -> 0x0077, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0077, blocks: (B:6:0x0006, B:7:0x000c, B:8:0x0010, B:10:0x0019, B:12:0x0020, B:22:0x0039, B:26:0x0046, B:31:0x005c, B:32:0x0064, B:34:0x0069, B:35:0x006d, B:28:0x0050, B:30:0x0055, B:14:0x0028), top: B:39:0x0006, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0050 A[Catch: all -> 0x0077, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0077, blocks: (B:6:0x0006, B:7:0x000c, B:8:0x0010, B:10:0x0019, B:12:0x0020, B:22:0x0039, B:26:0x0046, B:31:0x005c, B:32:0x0064, B:34:0x0069, B:35:0x006d, B:28:0x0050, B:30:0x0055, B:14:0x0028), top: B:39:0x0006, inners: #1 }] */
    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final u2 m395(Object obj) {
        Field field;
        r2 r2Var;
        u2 u2Var;
        s2 s2Var;
        if (obj == null) {
            return null;
        }
        try {
            String str = this.f259;
            Class<?> cls = obj.getClass();
            while (true) {
                if (!Intrinsics.areEqual(cls, Object.class)) {
                    try {
                        Field declaredField = cls.getDeclaredField(str);
                        field = declaredField;
                        declaredField.setAccessible(true);
                        break;
                    } catch (Exception unused) {
                        Class<? super Object> superclass = cls.getSuperclass();
                        cls = superclass;
                        if (superclass == null) {
                            field = null;
                            if (field == null) {
                                return null;
                            }
                            if ((field.getModifiers() & 8) == 0) {
                                u2Var = r2Var;
                                r2Var = new r2(field);
                            } else {
                                u2Var = s2Var;
                                s2Var = new s2(ca.f51.objectFieldOffset(field));
                            }
                            u2 u2Var2 = u2Var;
                            this.f260.f270 = u2Var;
                            return u2Var2;
                        }
                    }
                }
                field = null;
            }
            if (field == null) {
                return null;
            }
            if ((field.getModifiers() & 8) == 0 || field.getType().isPrimitive()) {
                u2Var = r2Var;
                r2Var = new r2(field);
            } else {
                u2Var = s2Var;
                s2Var = new s2(ca.f51.objectFieldOffset(field));
            }
            u2 u2Var3 = u2Var;
            this.f260.f270 = u2Var;
            return u2Var3;
        } catch (Throwable unused2) {
            return null;
        }
    }

    @Override // top.bienvenido.date_24323.u2
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void mo394(Object obj, Object obj2) {
        u2 u2VarM395 = m395(obj);
        if (u2VarM395 == null) {
            return;
        }
        u2VarM395.mo394(obj, obj2);
    }
}
