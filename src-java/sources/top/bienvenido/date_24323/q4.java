package top.bienvenido.date_24323;

import android.database.IContentObserver;
import android.net.Uri;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.ArrayList;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/q4.class */
public final class q4 extends h0 {

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final q4 f280 = new q4();

    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public static final x6 f281 = new x6("");

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Throwable, top.bienvenido.date_24323.x6] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // top.bienvenido.date_24323.i0
    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃 */
    public final void mo153(Uri uri, IBinder iBinder, boolean z) {
        if (iBinder == null || uri == null) {
            return;
        }
        try {
            ?? r0 = f281;
            synchronized (r0) {
                try {
                    r0.m564(uri, 0, iBinder, z);
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw r0;
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable, top.bienvenido.date_24323.x6] */
    @Override // top.bienvenido.date_24323.i0
    /* JADX INFO: renamed from: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机 */
    public final void mo154xaa30c2c7(IBinder iBinder) {
        if (iBinder == null) {
            return;
        }
        try {
            ?? r0 = f281;
            synchronized (r0) {
                try {
                    r0.m562(iBinder);
                } catch (Throwable th) {
                    throw r0;
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Throwable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Throwable, top.bienvenido.date_24323.v6] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // top.bienvenido.date_24323.i0
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo155(Uri uri, IBinder iBinder, boolean z) {
        try {
            ?? arrayList = new ArrayList();
            x6 x6Var = f281;
            synchronized (x6Var) {
                try {
                    x6Var.m563(uri, 0, iBinder, z, arrayList);
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw arrayList;
                }
            }
            for (?? r0 : arrayList) {
                try {
                    IContentObserver iContentObserverAsInterface = IContentObserver.Stub.asInterface(r0.f363);
                    boolean z2 = AbstractC0065x6082d607.f505;
                    boolean z3 = r0.f364;
                    if (z2) {
                        Uri[] uriArr = new Uri[1];
                        uriArr[0] = uri;
                        iContentObserverAsInterface.onChangeEtc(z3, uriArr, 0, b3.f20);
                    } else {
                        iContentObserverAsInterface.onChange(z3, uri, b3.f20);
                    }
                } catch (RemoteException unused) {
                    synchronized (f281) {
                        try {
                            IBinder iBinder2 = r0.f363;
                            ArrayList arrayList2 = r0.f362.f412;
                            int size = arrayList2.size();
                            int i = 0;
                            while (i < size) {
                                if (((w6) arrayList2.get(i)).f385 == iBinder2) {
                                    arrayList2.remove(i);
                                    i--;
                                    size--;
                                }
                                i++;
                            }
                            Unit unit2 = Unit.INSTANCE;
                        } catch (Throwable unused2) {
                            throw r0;
                        }
                    }
                }
            }
        } catch (Throwable unused3) {
        }
    }
}
