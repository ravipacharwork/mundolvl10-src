package top.bienvenido.date_24323;

import android.app.servertransaction.LaunchActivityItem;
import android.os.IBinder;
import java.lang.reflect.Field;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* JADX INFO: renamed from: top.bienvenido.date_24323.你是粪坑里无性繁殖来的一只蛆靠老子施舍的大粪苟活一时你爹因为操你瞎妈装逼不戴套鸡巴当时就切除了你婊子妈太脏了, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/你是粪坑里无性繁殖来的一只蛆靠老子施舍的大粪苟活一时你爹因为操你瞎妈装逼不戴套鸡巴当时就切除了你婊子妈太脏了.class */
public final class C0022 implements Function2 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final u2 f460;

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final /* synthetic */ Ref.ObjectRef f461;

    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public final /* synthetic */ s3 f462;

    public C0022(Ref.ObjectRef objectRef, s3 s3Var) {
        u2 s2Var;
        r2 r2Var;
        this.f461 = objectRef;
        this.f462 = s3Var;
        try {
            Field declaredField = LaunchActivityItem.class.getDeclaredField("mActivityClientController");
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
        this.f460 = s2Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        Ref.ObjectRef objectRef = this.f461;
        s3 s3Var = this.f462;
        objectRef.element = s3Var;
        s3Var.m476(obj, (IBinder) obj2);
        Unit unit = Unit.INSTANCE;
        u2 u2Var = this.f460;
        Object objMo393 = u2Var.mo393(obj);
        if (objMo393 == null) {
            return unit;
        }
        d1 d1Var = new d1(objMo393, u4.f340);
        d1Var.f54.m386(463520714, new C0033());
        d1Var.f54.m386(1293072352, new C0014());
        d1Var.f54.m386(-1666360360, AbstractC0019.f456);
        d1Var.f54.m386(1770569149, AbstractC0019.f457);
        d1Var.f54.m386(1349683719, new C0086b());
        d1Var.f54.m386(1985825802, new C0039());
        d1Var.f54.m386(-1111243300, z6.f442);
        u2Var.mo394(obj, d1Var.f57);
        return unit;
    }
}
