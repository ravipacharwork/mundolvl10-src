package top.bienvenido.date_24323;

import android.app.ActivityThread;
import android.content.pm.IPackageManager;
import android.content.pm.PackageManager;
import android.content.pm.ParceledListSlice;
import android.os.Handler;
import android.permission.PermissionManager;
import java.lang.reflect.Field;
import java.util.Collections;
import kotlin.jvm.functions.Function1;
import top.bienvenido.mundo.blockade.sm.C0082;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/o8.class */
public final class o8 extends AbstractC0057 {

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final o8 f266 = new o8();

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final void m399(o8 o8Var, Object[] objArr) {
        o8Var.getClass();
        try {
            Object obj = objArr[1];
            if (((obj instanceof Number ? ((Number) obj).intValue() : 0) & 4194304) != 0) {
                if (obj instanceof Long) {
                    objArr[1] = Long.valueOf(((Number) obj).longValue() & (-4194305));
                } else if (obj instanceof Integer) {
                    objArr[1] = Integer.valueOf(((Number) obj).intValue() & (-4194305));
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // top.bienvenido.date_24323.AbstractC0057
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo10() {
        d1 d1VarM657;
        u2 s2Var;
        ParceledListSlice parceledListSlice;
        String str;
        r2 r2Var;
        this.f485 = u4.f340;
        IPackageManager packageManager = ActivityThread.getPackageManager();
        if (packageManager == null || (d1VarM657 = m657("package", packageManager)) == null) {
            return;
        }
        Object obj = d1VarM657.f57;
        try {
            Field declaredField = ActivityThread.class.getDeclaredField("sPackageManager");
            declaredField.setAccessible(true);
            if ((declaredField.getModifiers() & 8) != 0 || declaredField.getType().isPrimitive()) {
                s2Var = r2Var;
                r2Var = new r2(declaredField);
            } else {
                s2Var = new s2(ca.f51.objectFieldOffset(declaredField));
            }
        } catch (Exception unused) {
            s2Var = u2.f337;
        }
        s2Var.mo394((Object) null, obj);
        d1VarM657.f54.m386(686218487, C0046.f480);
        d1VarM657.f54.m386(871155123, new C0028(v7.f365));
        d1VarM657.f54.m386(1207111861, new C0028(b8.f28));
        d1VarM657.f54.m386(1326102014, new c8());
        d1VarM657.f54.m386(-1039974701, new C0028(d8.f63));
        d1VarM657.f54.m386(1725989837, new C0028(e8.f80));
        d1VarM657.f54.m386(1600494599, new j1(f8.f99));
        d1VarM657.f54.m386(-150905391, new j1(g8.f122));
        d1VarM657.f54.m386(268353758, new j8());
        n8 n8Var = n8Var;
        n8 n8Var2 = new n8();
        boolean z = AbstractC0065x6082d607.f513;
        Object pVar = n8Var;
        if (z && AbstractC0065x6082d607.f504xb7bf1d91 && !AbstractC0065x6082d607.f512) {
            pVar = n8Var;
            pVar = n8Var;
            pVar = new p(n8Var);
        }
        pVar = n8Var;
        pVar = n8Var;
        pVar = n8Var;
        d1VarM657.f54.m386(-1710913560, pVar);
        d1VarM657.f54.m386(-1550050946, new k8());
        d1VarM657.f54.m386(-432049674, new b7());
        d1VarM657.f54.m386(-59811990, new c7());
        C0082 c0082 = u4.f341;
        d1VarM657.m118(new int[]{263663077, 653544665, 1321112681, -125888630, -1017315255, 1036223380, -2055791732, -2120318040, 1647146784, 1762051604, 689134333, 1556563560, 1543304065}, c0082);
        d1VarM657.m118(new int[]{1051878911, 1784040466}, u4.f344);
        d1VarM657.m118(new int[]{125212131, -254077928, -1463700733}, u4.f342);
        if (AbstractC0065x6082d607.f498) {
            int[] iArr = {964371846, -1655019925};
            if (AbstractC0065x6082d607.f500) {
                Function1 function1 = g1.f114;
                parceledListSlice = j.f178;
            } else {
                parceledListSlice = Collections.EMPTY_LIST;
            }
            d1VarM657.m118(iArr, new t4(parceledListSlice));
            if (AbstractC0065x6082d607.f503) {
                d1VarM657.f54.m386(-2055791732, c0082);
                if (z) {
                    try {
                        h6.f130.getClass();
                        Object objMo393 = new p2("mPreloadHandler").f270.mo393(h6.f131);
                        if (objMo393 instanceof Handler) {
                            ((Handler) objMo393).sendEmptyMessage(0);
                        }
                    } catch (Exception unused2) {
                    }
                }
                if (AbstractC0065x6082d607.f505) {
                    d1VarM657.f54.m386(-1354875218, new d7());
                    try {
                        e6 e6Var = new e6();
                        e6Var.m133(PackageManager.class, "sPackageInfoCache");
                        e6Var.m133(PackageManager.class, "sApplicationInfoCache");
                        e6Var.m133(PermissionManager.class, "sPackageNamePermissionCache");
                        e6Var.m133(PermissionManager.class, "sPermissionCache");
                        if (AbstractC0065x6082d607.f5065) {
                            boolean z2 = AbstractC0065x6082d607.f510x541a43c1;
                            if (z2) {
                                e6Var.m133(PermissionManager.class, "sPermissionRequestStateCache");
                            }
                            Class<?> cls = b3.f17.getPackageManager().getClass();
                            if (z2) {
                                str = "sGetPackagesForUidCache";
                            } else {
                                str = "mGetPackagesForUidCache";
                            }
                            e6Var.m133(cls, str);
                        }
                    } catch (Exception unused3) {
                    }
                    if (AbstractC0065x6082d607.f5065) {
                        d1VarM657.f54.m386(-945173823, new e7());
                        d1VarM657.f54.m386(-132294875, u4.f343xaa30c2c7);
                        if (AbstractC0065x6082d607.f507) {
                            d1VarM657.f54.m386(-1854171575, new f7());
                        }
                    }
                }
            }
        }
        d1VarM657.f54.m386(-548994423, u4.f343xaa30c2c7);
        d1VarM657.f54.m386(-109758974, new i7());
        d1VarM657.f54.m386(-297395415, new l7());
        d1VarM657.f54.m386(1374193809, new o7());
        d1VarM657.f54.m386(-564624472, new r7());
        d1VarM657.f54.m386(1786110784, new u7());
        d1VarM657.f54.m386(-1530208819, new y7());
        d1VarM657.f54.m386(-1280559169, new z7());
        d1VarM657.f54.m386(1700882705, new a8());
        C0084B.f450.m603(d1VarM657);
    }
}
