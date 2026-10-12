package top.bienvenido.date_24323;

import android.app.ActivityThread;
import android.content.ContentResolver;
import android.provider.Settings;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/e9.class */
public final class e9 extends AbstractC0057 {

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final e9 f81 = new e9();

    /* JADX WARN: Code duplicated, block: B:105:0x021c A[Catch: Exception -> 0x0248, TRY_ENTER, TryCatch #4 {Exception -> 0x0248, blocks: (B:75:0x01a3, B:100:0x020a, B:103:0x0216, B:105:0x021c, B:106:0x0221, B:107:0x0226, B:111:0x0236, B:112:0x023c, B:99:0x0205, B:82:0x01b6, B:84:0x01bf, B:88:0x01cf, B:93:0x01e8, B:94:0x01f2, B:96:0x01f8, B:90:0x01da, B:92:0x01e0), top: B:142:0x01a3, inners: #5 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x029e A[Catch: Exception -> 0x02c0, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x02c0, blocks: (B:115:0x027e, B:117:0x0284, B:121:0x0294, B:126:0x02aa, B:127:0x02b2, B:129:0x02b7, B:123:0x029e, B:125:0x02a3), top: B:135:0x027e }] */
    /* JADX WARN: Code duplicated, block: B:150:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:151:0x0236 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x0190 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x0190 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x0122 A[Catch: Exception -> 0x0119, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x0119, blocks: (B:4:0x0043, B:6:0x0053, B:7:0x0057, B:10:0x0060, B:29:0x00a9, B:33:0x00b7, B:35:0x00bf, B:36:0x00d7, B:38:0x00df, B:39:0x00ef, B:52:0x0122, B:45:0x010a, B:28:0x00a5, B:55:0x0132, B:57:0x0139, B:67:0x0162, B:69:0x0169, B:65:0x015b, B:59:0x0144, B:61:0x014a, B:63:0x0153, B:41:0x00f8, B:43:0x0102, B:13:0x0066, B:17:0x0076, B:22:0x008c, B:23:0x0094, B:25:0x009a, B:19:0x0080, B:21:0x0085), top: B:141:0x0043, inners: #1, #2, #6 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0199  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:80:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:90:0x01da A[Catch: Exception -> 0x0204, TRY_ENTER, TRY_LEAVE, TryCatch #5 {Exception -> 0x0204, blocks: (B:82:0x01b6, B:84:0x01bf, B:88:0x01cf, B:93:0x01e8, B:94:0x01f2, B:96:0x01f8, B:90:0x01da, B:92:0x01e0), top: B:144:0x01b6, outer: #4 }] */
    @Override // top.bienvenido.date_24323.AbstractC0057
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo10() {
        u2 u2Var;
        q2 q2Var;
        u2 s2Var;
        Method method;
        r2 r2Var;
        p2 p2Var;
        d9 d9Var;
        u2 s2Var2;
        Field declaredField;
        r2 r2Var2;
        String str;
        u2 s2Var3;
        Object objMo393;
        Object objMo394;
        Field declaredField2;
        r2 r2Var3;
        ArrayList<Class> arrayList = new ArrayList(4);
        ContentResolver contentResolver = b3.f17.getContentResolver();
        Settings.Global.getInt(contentResolver, "debug_app", 0);
        arrayList.add(Settings.Global.class);
        Settings.System.getInt(contentResolver, "font_scale", 0);
        arrayList.add(Settings.System.class);
        Settings.Secure.getInt(contentResolver, "accessibility_enabled", 0);
        arrayList.add(Settings.Secure.class);
        if (AbstractC0065x6082d607.f504xb7bf1d91) {
            try {
                Class<?> cls = Class.forName(Settings.class.getName() + "$Config");
                arrayList.add(cls);
                if (AbstractC0065x6082d607.f508) {
                    try {
                        Field declaredField3 = cls.getDeclaredField("sNameValueCache");
                        declaredField3.setAccessible(true);
                        if ((declaredField3.getModifiers() & 8) == 0 && !declaredField3.getType().isPrimitive()) {
                            s2Var = new s2(ca.f51.objectFieldOffset(declaredField3));
                        } else {
                            s2Var = r2Var;
                            r2Var = new r2(declaredField3);
                        }
                    } catch (Exception unused) {
                        s2Var = u2.f337;
                    }
                    Object objMo395 = s2Var.mo393(null);
                    if (objMo395 != null) {
                        Class<?>[] clsArr = new Class[3];
                        clsArr[0] = ContentResolver.class;
                        clsArr[1] = String.class;
                        clsArr[2] = Integer.TYPE;
                        Integer numValueOf = Integer.valueOf(b3.f20);
                        Object[] objArr = new Object[3];
                        objArr[0] = contentResolver;
                        objArr[1] = "mimi";
                        objArr[2] = numValueOf;
                        Class<?> cls2 = objMo395.getClass();
                        while (true) {
                            if (!Intrinsics.areEqual(cls2, Object.class)) {
                                try {
                                    Method declaredMethod = cls2.getDeclaredMethod("getStringForUser", clsArr);
                                    method = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                    break;
                                } catch (Exception unused2) {
                                    Class<? super Object> superclass = cls2.getSuperclass();
                                    cls2 = superclass;
                                    if (superclass == null) {
                                        method = null;
                                        if (method != null) {
                                            method.invoke(objMo395, objArr);
                                        }
                                        p2Var = new p2("mContentProvider");
                                        d9Var = new d9();
                                        for (Class cls3 : arrayList) {
                                            try {
                                                if (AbstractC0065x6082d607.f502xaa30c2c7) {
                                                    str = "sProviderHolder";
                                                } else {
                                                    str = "sNameValueCache";
                                                }
                                                try {
                                                    declaredField2 = cls3.getDeclaredField(str);
                                                    declaredField2.setAccessible(true);
                                                    if ((declaredField2.getModifiers() & 8) == 0) {
                                                        s2Var3 = r2Var3;
                                                        r2Var3 = new r2(declaredField2);
                                                    } else {
                                                        s2Var3 = new s2(ca.f51.objectFieldOffset(declaredField2));
                                                    }
                                                } catch (Exception unused3) {
                                                    s2Var3 = u2.f337;
                                                }
                                                objMo393 = s2Var3.mo393(null);
                                                if (objMo393 == null) {
                                                    if (AbstractC0065x6082d607.f5065) {
                                                        d9Var.m125(cls3);
                                                    }
                                                    x xVar = x.f391;
                                                    objMo394 = p2Var.f270.mo393(objMo393);
                                                    if (objMo394 == null) {
                                                        p2Var.f270.mo394(objMo393, x.m554(objMo394));
                                                    }
                                                }
                                            } catch (Exception unused4) {
                                            }
                                        }
                                        h6 h6Var = h6.f130;
                                        Map map = h6.f154x4b3a412e;
                                        h6Var.getClass();
                                        map.remove(h6.f153.newInstance("settings", Integer.valueOf(b3.f20)));
                                        declaredField = ActivityThread.class.getDeclaredField("mProviderRefCountMap");
                                        declaredField.setAccessible(true);
                                        if ((declaredField.getModifiers() & 8) == 0) {
                                            s2Var2 = r2Var2;
                                            r2Var2 = new r2(declaredField);
                                        } else {
                                            s2Var2 = new s2(ca.f51.objectFieldOffset(declaredField));
                                        }
                                        ((Map) s2Var2.mo393(h6.f131)).clear();
                                    }
                                }
                            }
                            method = null;
                        }
                        if (method != null) {
                            method.invoke(objMo395, objArr);
                        }
                    }
                } else {
                    Class<?>[] clsArr2 = new Class[2];
                    clsArr2[0] = ContentResolver.class;
                    clsArr2[1] = String.class;
                    try {
                        Method declaredMethod2 = cls.getDeclaredMethod("getString", clsArr2);
                        declaredMethod2.setAccessible(true);
                        u2Var = q2Var;
                        q2Var = new q2(declaredMethod2);
                    } catch (Exception unused5) {
                        u2Var = u2.f337;
                    }
                    u2 u2Var2 = u2Var;
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = contentResolver;
                    objArr2[1] = "mimi";
                    u2Var2.mo432((Object) null, objArr2);
                }
            } catch (Exception unused6) {
            }
        }
        p2Var = new p2("mContentProvider");
        d9Var = new d9();
        while (r0.hasNext()) {
            if (AbstractC0065x6082d607.f502xaa30c2c7) {
                str = "sProviderHolder";
            } else {
                str = "sNameValueCache";
            }
            declaredField2 = cls3.getDeclaredField(str);
            declaredField2.setAccessible(true);
            if ((declaredField2.getModifiers() & 8) == 0 || declaredField2.getType().isPrimitive()) {
                s2Var3 = r2Var3;
                r2Var3 = new r2(declaredField2);
            } else {
                s2Var3 = new s2(ca.f51.objectFieldOffset(declaredField2));
            }
            objMo393 = s2Var3.mo393(null);
            if (objMo393 == null) {
                if (AbstractC0065x6082d607.f5065) {
                    d9Var.m125(cls3);
                }
                x xVar2 = x.f391;
                objMo394 = p2Var.f270.mo393(objMo393);
                if (objMo394 == null) {
                    p2Var.f270.mo394(objMo393, x.m554(objMo394));
                }
            }
        }
        h6 h6Var2 = h6.f130;
        Map map2 = h6.f154x4b3a412e;
        h6Var2.getClass();
        map2.remove(h6.f153.newInstance("settings", Integer.valueOf(b3.f20)));
        try {
            declaredField = ActivityThread.class.getDeclaredField("mProviderRefCountMap");
            declaredField.setAccessible(true);
            if ((declaredField.getModifiers() & 8) == 0 || declaredField.getType().isPrimitive()) {
                s2Var2 = r2Var2;
                r2Var2 = new r2(declaredField);
            } else {
                s2Var2 = new s2(ca.f51.objectFieldOffset(declaredField));
            }
        } catch (Exception unused7) {
            s2Var2 = u2.f337;
        }
        ((Map) s2Var2.mo393(h6.f131)).clear();
    }
}
